
package com.i_walletlive.paylive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verifyMobilePaymentResult" type="{http://www.i-walletlive.com/payLIVE}OrderResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "verifyMobilePaymentResult"
})
@XmlRootElement(name = "verifyMobilePaymentResponse")
public class VerifyMobilePaymentResponse {

    @XmlElement(required = true)
    protected OrderResult verifyMobilePaymentResult;

    /**
     * Gets the value of the verifyMobilePaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResult }
     *     
     */
    public OrderResult getVerifyMobilePaymentResult() {
        return verifyMobilePaymentResult;
    }

    /**
     * Sets the value of the verifyMobilePaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResult }
     *     
     */
    public void setVerifyMobilePaymentResult(OrderResult value) {
        this.verifyMobilePaymentResult = value;
    }

}
