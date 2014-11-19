
package com.i_walletlive.paylive;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.i_walletlive.paylive package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PaymentHeader_QNAME = new QName("http://www.i-walletlive.com/payLIVE", "PaymentHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.i_walletlive.paylive
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckPaymentStatus }
     * 
     */
    public CheckPaymentStatus createCheckPaymentStatus() {
        return new CheckPaymentStatus();
    }

    /**
     * Create an instance of {@link MobilePaymentOrder }
     * 
     */
    public MobilePaymentOrder createMobilePaymentOrder() {
        return new MobilePaymentOrder();
    }

    /**
     * Create an instance of {@link ArrayOfOrderItem }
     * 
     */
    public ArrayOfOrderItem createArrayOfOrderItem() {
        return new ArrayOfOrderItem();
    }

    /**
     * Create an instance of {@link PaymentHeader }
     * 
     */
    public PaymentHeader createPaymentHeader() {
        return new PaymentHeader();
    }

    /**
     * Create an instance of {@link GeneratePaymentCodeResponse }
     * 
     */
    public GeneratePaymentCodeResponse createGeneratePaymentCodeResponse() {
        return new GeneratePaymentCodeResponse();
    }

    /**
     * Create an instance of {@link ProcessOrderResponse }
     * 
     */
    public ProcessOrderResponse createProcessOrderResponse() {
        return new ProcessOrderResponse();
    }

    /**
     * Create an instance of {@link ProcessPaymentJSONResponse }
     * 
     */
    public ProcessPaymentJSONResponse createProcessPaymentJSONResponse() {
        return new ProcessPaymentJSONResponse();
    }

    /**
     * Create an instance of {@link VerifyMobilePaymentResponse }
     * 
     */
    public VerifyMobilePaymentResponse createVerifyMobilePaymentResponse() {
        return new VerifyMobilePaymentResponse();
    }

    /**
     * Create an instance of {@link OrderResult }
     * 
     */
    public OrderResult createOrderResult() {
        return new OrderResult();
    }

    /**
     * Create an instance of {@link VerifyMobilePayment }
     * 
     */
    public VerifyMobilePayment createVerifyMobilePayment() {
        return new VerifyMobilePayment();
    }

    /**
     * Create an instance of {@link MobilePaymentOrderResponse }
     * 
     */
    public MobilePaymentOrderResponse createMobilePaymentOrderResponse() {
        return new MobilePaymentOrderResponse();
    }

    /**
     * Create an instance of {@link GeneratePaymentCode }
     * 
     */
    public GeneratePaymentCode createGeneratePaymentCode() {
        return new GeneratePaymentCode();
    }

    /**
     * Create an instance of {@link ConfirmTransaction }
     * 
     */
    public ConfirmTransaction createConfirmTransaction() {
        return new ConfirmTransaction();
    }

    /**
     * Create an instance of {@link CancelTransaction }
     * 
     */
    public CancelTransaction createCancelTransaction() {
        return new CancelTransaction();
    }

    /**
     * Create an instance of {@link CancelTransactionResponse }
     * 
     */
    public CancelTransactionResponse createCancelTransactionResponse() {
        return new CancelTransactionResponse();
    }

    /**
     * Create an instance of {@link ProcessOrder }
     * 
     */
    public ProcessOrder createProcessOrder() {
        return new ProcessOrder();
    }

    /**
     * Create an instance of {@link ProcessPaymentOrder }
     * 
     */
    public ProcessPaymentOrder createProcessPaymentOrder() {
        return new ProcessPaymentOrder();
    }

    /**
     * Create an instance of {@link ProcessPaymentOrderResponse }
     * 
     */
    public ProcessPaymentOrderResponse createProcessPaymentOrderResponse() {
        return new ProcessPaymentOrderResponse();
    }

    /**
     * Create an instance of {@link CheckPaymentStatusResponse }
     * 
     */
    public CheckPaymentStatusResponse createCheckPaymentStatusResponse() {
        return new CheckPaymentStatusResponse();
    }

    /**
     * Create an instance of {@link ConfirmTransactionResponse }
     * 
     */
    public ConfirmTransactionResponse createConfirmTransactionResponse() {
        return new ConfirmTransactionResponse();
    }

    /**
     * Create an instance of {@link ProcessPaymentJSON }
     * 
     */
    public ProcessPaymentJSON createProcessPaymentJSON() {
        return new ProcessPaymentJSON();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i-walletlive.com/payLIVE", name = "PaymentHeader")
    public JAXBElement<PaymentHeader> createPaymentHeader(PaymentHeader value) {
        return new JAXBElement<PaymentHeader>(_PaymentHeader_QNAME, PaymentHeader.class, null, value);
    }

}
