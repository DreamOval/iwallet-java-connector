
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
 *         &lt;element name="mobilePaymentOrderResult" type="{http://www.i-walletlive.com/payLIVE}OrderResult"/>
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
    "mobilePaymentOrderResult"
})
@XmlRootElement(name = "mobilePaymentOrderResponse")
public class MobilePaymentOrderResponse {

    @XmlElement(required = true)
    protected OrderResult mobilePaymentOrderResult;

    /**
     * Gets the value of the mobilePaymentOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResult }
     *     
     */
    public OrderResult getMobilePaymentOrderResult() {
        return mobilePaymentOrderResult;
    }

    /**
     * Sets the value of the mobilePaymentOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResult }
     *     
     */
    public void setMobilePaymentOrderResult(OrderResult value) {
        this.mobilePaymentOrderResult = value;
    }

}
