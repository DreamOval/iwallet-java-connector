package com.dreamoval.iwallet.connector;

import java.math.BigDecimal;

import com.dreamoval.iwallet.connector.util.CancelAndConfirmResponse;
import com.i_walletlive.paylive.ArrayOfOrderItem;
import com.i_walletlive.paylive.OrderResult;
import com.i_walletlive.paylive.PaymentServiceSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component(value = "integrator")
public class Integrator{

	@Autowired
	@Qualifier("iwallet")
    PaymentServiceSoap paymentService;

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
     *
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
}
