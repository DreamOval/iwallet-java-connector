
package com.i_walletlive.paylive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="checkPaymentStatusResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "checkPaymentStatusResult"
})
@XmlRootElement(name = "checkPaymentStatusResponse")
public class CheckPaymentStatusResponse {

    protected String checkPaymentStatusResult;

    /**
     * Gets the value of the checkPaymentStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPaymentStatusResult() {
        return checkPaymentStatusResult;
    }

    /**
     * Sets the value of the checkPaymentStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPaymentStatusResult(String value) {
        this.checkPaymentStatusResult = value;
    }

}
