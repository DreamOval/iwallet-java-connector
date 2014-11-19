
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
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useIntMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "amount",
    "custRef",
    "comment1",
    "comment2",
    "unitPrice",
    "quantity",
    "item",
    "useToken",
    "useIntMode"
})
@XmlRootElement(name = "ProcessOrder")
public class ProcessOrder {

    protected String amount;
    protected String custRef;
    protected String comment1;
    protected String comment2;
    protected String unitPrice;
    protected String quantity;
    protected String item;
    protected String useToken;
    protected String useIntMode;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the custRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustRef() {
        return custRef;
    }

    /**
     * Sets the value of the custRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustRef(String value) {
        this.custRef = value;
    }

    /**
     * Gets the value of the comment1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment1() {
        return comment1;
    }

    /**
     * Sets the value of the comment1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment1(String value) {
        this.comment1 = value;
    }

    /**
     * Gets the value of the comment2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment2() {
        return comment2;
    }

    /**
     * Sets the value of the comment2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment2(String value) {
        this.comment2 = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem(String value) {
        this.item = value;
    }

    /**
     * Gets the value of the useToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseToken() {
        return useToken;
    }

    /**
     * Sets the value of the useToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseToken(String value) {
        this.useToken = value;
    }

    /**
     * Gets the value of the useIntMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseIntMode() {
        return useIntMode;
    }

    /**
     * Sets the value of the useIntMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseIntMode(String value) {
        this.useIntMode = value;
    }

}
