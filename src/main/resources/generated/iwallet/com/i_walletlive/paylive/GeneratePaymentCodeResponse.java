
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
 *         &lt;element name="generatePaymentCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "generatePaymentCodeResult"
})
@XmlRootElement(name = "generatePaymentCodeResponse")
public class GeneratePaymentCodeResponse {

    protected String generatePaymentCodeResult;

    /**
     * Gets the value of the generatePaymentCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratePaymentCodeResult() {
        return generatePaymentCodeResult;
    }

    /**
     * Sets the value of the generatePaymentCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratePaymentCodeResult(String value) {
        this.generatePaymentCodeResult = value;
    }

}
