
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
 *         &lt;element name="ProcessOrderResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "processOrderResult"
})
@XmlRootElement(name = "ProcessOrderResponse")
public class ProcessOrderResponse {

    @XmlElement(name = "ProcessOrderResult")
    protected String processOrderResult;

    /**
     * Gets the value of the processOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessOrderResult() {
        return processOrderResult;
    }

    /**
     * Sets the value of the processOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessOrderResult(String value) {
        this.processOrderResult = value;
    }

}
