
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
 *         &lt;element name="CancelTransactionResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cancelTransactionResult"
})
@XmlRootElement(name = "CancelTransactionResponse")
public class CancelTransactionResponse {

    @XmlElement(name = "CancelTransactionResult")
    protected int cancelTransactionResult;

    /**
     * Gets the value of the cancelTransactionResult property.
     * 
     */
    public int getCancelTransactionResult() {
        return cancelTransactionResult;
    }

    /**
     * Sets the value of the cancelTransactionResult property.
     * 
     */
    public void setCancelTransactionResult(int value) {
        this.cancelTransactionResult = value;
    }

}
