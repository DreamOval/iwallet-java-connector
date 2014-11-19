
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
 *         &lt;element name="ConfirmTransactionResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "confirmTransactionResult"
})
@XmlRootElement(name = "ConfirmTransactionResponse")
public class ConfirmTransactionResponse {

    @XmlElement(name = "ConfirmTransactionResult")
    protected int confirmTransactionResult;

    /**
     * Gets the value of the confirmTransactionResult property.
     * 
     */
    public int getConfirmTransactionResult() {
        return confirmTransactionResult;
    }

    /**
     * Sets the value of the confirmTransactionResult property.
     * 
     */
    public void setConfirmTransactionResult(int value) {
        this.confirmTransactionResult = value;
    }

}
