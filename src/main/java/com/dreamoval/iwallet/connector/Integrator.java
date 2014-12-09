package com.dreamoval.iwallet.connector;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import com.dreamoval.iwallet.connector.util.CancelAndConfirmResponse;
import com.i_walletlive.paylive.*;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

/**
 *
 */

public class Integrator{

    private static final Logger logger = LoggerFactory.getLogger(Integrator.class);

    private String apiVersion;
    private String wsdl ="https://i-walletlive.com/webservices/paymentservice.asmx?wsdl";
    private String namespace = "http://www.i-walletlive.com/payLIVE";
    private String serviceName = "PaymentService";
    private String merchantKey;
    private String merchantMail;
    private Boolean integrationMode;
    private String serviceType;
    PaymentServiceSoap paymentService;

    public Integrator(String merchantKey,String merchantMail,Boolean integrationMode,String serviceType,String apiVersion) {
        this.merchantKey = merchantKey;
        this.merchantMail = merchantMail;
        this.apiVersion = apiVersion;
        this.integrationMode = integrationMode;
        this.serviceType = serviceType;
        this.paymentService = getPaymentService();
        logger.debug("Integrator simple constructor with parameters: merchantKey: {}, merchantMail: {} ,integrationMode : {} ,serviceType: {}, apiVersion: {}",
                new Object[] {wsdl,namespace,serviceName,merchantKey,merchantMail,integrationMode, serviceType,apiVersion});
    }

    public Integrator(String wsdl, String namespace, String serviceName, String merchantKey,String merchantMail,Boolean integrationMode,String serviceType,String apiVersion) {
        this.wsdl = wsdl;
        this.namespace = namespace;
        this.serviceName = serviceName;
        this.merchantKey = merchantKey;
        this.merchantMail = merchantMail;
        this.integrationMode = integrationMode;
        this.apiVersion = apiVersion;
        this.serviceType = serviceType;
        this.paymentService = getPaymentService();
        logger.debug("Integrator full stack constructor with parameters: wsdl: {}, namespace: {}, serviceName: {}, merchantKey: {}, merchantMail: {} ,integrationMode : {} ,serviceType: {}, apiVersion: {}",
                new Object[]{wsdl, namespace, serviceName, merchantKey, merchantMail, integrationMode, serviceType, apiVersion});
    }

    /**
     * Method to make payment with extra features like QR code relevant for iwallet cruize app to complete payment
     * @param orderId Reference of the order passed to iwallet
     * @param subtotal Total of all items in the ArrayOfOrderItem. it's the sum of the product of each item price with its quantity excluding taxes etc
     * @param shippingCost If shipping model is supported by merchant, shippingcost is added to the total amount to be payed by the
     * @param taxAmount tax value if applicable of the transaction
     * @param total Total sum of subtotal amount,shipping cost , taxt amount to be passed to iwallet
     * @param comment1 general summary of the order
     * @param comment2 detail information about the order
     * @param orderItems List of OrderItems object describing each item and its properties
     * @return OrderResult object representing set of information about the call
     */
	public OrderResult mobilePaymentOrder(String orderId, BigDecimal subtotal,
			BigDecimal shippingCost, BigDecimal taxAmount, BigDecimal total,
			String comment1, String comment2, ArrayOfOrderItem orderItems) {
			OrderResult result = paymentService.mobilePaymentOrder(orderId, subtotal, shippingCost, taxAmount, total, comment1, comment2, orderItems);
		return result;
	}

    /**
     * Method to make payment to iwallet.
     * @param orderId Reference of the order passed to iwallet
     * @param subtotal Total of all items in the ArrayOfOrderItem. it's the sum of the product of each item price with its quantity excluding taxes etc
     * @param shippingCost If shipping model is supported by merchant, shippingcost is added to the total amount to be payed by the
     * @param taxAmount tax value if applicable of the transaction
     * @param total Total sum of subtotal amount,shipping cost , taxt amount to be passed to iwallet
     * @param comment1 general summary of the order
     * @param comment2 detail information about the order
     * @param orderItems List of OrderItems object describing each item and its properties
     * @return payment token if successful or error code and description if failure
     */
	public String processPaymentOrder(String orderId, BigDecimal subtotal,
			BigDecimal shippingCost, BigDecimal taxAmount, BigDecimal total,
			String comment1, String comment2, ArrayOfOrderItem orderItems) {
			String response = paymentService.processPaymentOrder(orderId, subtotal, shippingCost, taxAmount, total, comment1, comment2, orderItems);
		return response;
	}


    /**
     * Method to confirm the payment process after all operations have succeeded on both sides.
     * @param payToken returned payment token from any of the order process methods previously called
     * @param transactionId common id return in iwallet callback querystring
     * @return operation status code
     */
	public int confirmTransaction(String payToken, String transactionId) {
		int response = paymentService.confirmTransaction(payToken, transactionId);
		return response;
	}

    /**
     * Method to make direct payment to third party without redirect of urls
     * @param orderId Reference of the order passed to iwallet
     * @param subtotal Total of all items in the ArrayOfOrderItem. it's the sum of the product of each item price with its quantity excluding taxes etc
     * @param shippingCost If shipping model is supported by merchant, shippingcost is added to the total amount to be payed by the
     * @param taxAmount tax value if applicable of the transaction
     * @param total Total sum of subtotal amount,shipping cost , taxt amount to be passed to iwallet
     * @param comment1 general summary of the order
     * @param comment2 detail information about the order
     * @param orderItems List of OrderItems object describing each item and its properties
     * @param payerName name of the end user making the payment
     * @param payerMobile mobile number of the end user making the payment
     * @param providerName Third party payment provider's name
     * @param providerType unused for the moment
     * @return the invoice number of the payment
     */
	public String generatePaymentCode(String orderId, BigDecimal subtotal,
			BigDecimal shippingCost, BigDecimal taxAmount, BigDecimal total,
			String comment1, String comment2, ArrayOfOrderItem orderItems,
			String payerName, String payerMobile, String providerName,
			String providerType) {
			String response = paymentService.generatePaymentCode(orderId, subtotal, shippingCost, taxAmount, total, comment1, comment2, orderItems, payerName, payerMobile, providerName, providerType);
		return response;
	}

    /**
     * Method meant for mobile payment to call iWallet in order to check on the status of a transaction.
     * This use case does is particular to QR code generated on merchant site for merchant end user to use iWallet Cruise
     * mobile app to scan and complete the payment process inside the mobile app. This type of mobile payment excludes the need
     * for redirect and callback.
     * @param orderId Reference of the order passed to iwallet
     * @return
     */
	public OrderResult verifyMobilePayment(String orderId) {
		OrderResult result = paymentService.verifyMobilePayment(orderId);
		return result;
	}

    /**
     * Method to cancel payment if your side of operation did not succeed. This initiates a refund proceed if iwallet was the payment channel
     * @param payToken returned payment token from any of the order process methods previously called
     * @param transactionId common id return in iwallet callback querystring
     * @return operation status code
     */
	public int cancelTransaction(String payToken, String transactionId) {
		int response = paymentService.cancelTransaction(payToken, transactionId);
		return response;
	}

    /**
     * Method to check status of payment made with third party payment channel line MTN etc.
     * @param orderId Reference of the order passed to iwallet
     * @param providerName Third party payment provider's name
     * @param providerType unused for the moment
     * @return the checked transaction's status
     */
	public String checkPaymentStatus(String orderId, String providerName,
			String providerType) {
		String response = paymentService.checkPaymentStatus(orderId, providerName, providerType);
		return response;
	}


    /**
     * Helper method for parsing returned error code during cancel of confirm transaction call.
     * @param response returned error code from cancel or confirm transaction call
     * @return Full text explanation of the error code
     */
    public String cancelAndConfirmTransactionResponseParser(int response){

        String status = "";
        switch (response){
            case -3:
                status = CancelAndConfirmResponse.VERIFICATION_FAILED;
                break;
            case -2:
                status = CancelAndConfirmResponse.MISSING_TRANS_ID;
                break;
            case -1:
                status = CancelAndConfirmResponse.MISSING_TOKEN;
                break;
            case 0:
                status = CancelAndConfirmResponse.INTERNAL_ERROR;
                break;
            case 1:
                status = CancelAndConfirmResponse.SUCCESS;
                break;
            default:
                status = CancelAndConfirmResponse.UNKNOWN;
        }

        return status;
    }


    /**
     * Helper method for getting properly configured payment service Object with required header as per specification
     * @return iWallet PaymentService port
     */
    private PaymentServiceSoap getPaymentService(){
        PaymentService iwalletService = null;
        PaymentServiceSoap paymentServiceSoap = null;
        try {
            iwalletService = new PaymentService(new URL(this.wsdl),new QName(this.namespace,this.serviceName));
            paymentServiceSoap = iwalletService.getPaymentServiceSoap();
            logger.debug("getPaymentService paymentServiceSoap object",paymentServiceSoap);

            List<Header> headersList = getHeaderList();
            logger.debug("getPaymentService header list",headersList);

            ((BindingProvider) paymentServiceSoap).getRequestContext().put(Header.HEADER_LIST,headersList);

        } catch (MalformedURLException e) {
            logger.info("MalformedURLException occurred", e);
        }
        logger.debug("getPaymentService iWallet Header enabled port", paymentServiceSoap);
        return paymentServiceSoap;
    }


    /**
     * Helper method for building list of PaymentHeader required by iWallet wdsl specification
     * @return List of apache cxf Header objects
     */
    private List<Header> getHeaderList() {
        List<Header> headersList = new ArrayList<Header>();

        PaymentHeader payHeader = new PaymentHeader();
        payHeader.setAPIVersion(apiVersion);
        payHeader.setUseIntMode(integrationMode);
        payHeader.setSvcType(serviceType);
        payHeader.setMerchantKey(merchantKey);
        payHeader.setMerchantEmail(merchantMail);

        Header paymentHeader = null;
        try {
            paymentHeader = new Header(new QName(namespace, "PaymentHeader"),payHeader, new JAXBDataBinding(PaymentHeader.class));
        } catch (JAXBException e) {
            logger.info("JAXBException occurred",e);
        }

        headersList.add(paymentHeader);
        return headersList;
    }
}
