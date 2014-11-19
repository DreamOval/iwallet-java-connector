
package com.i_walletlive.paylive;

import java.math.BigDecimal;
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
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="comment1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderItems" type="{http://www.i-walletlive.com/payLIVE}ArrayOfOrderItem" minOccurs="0"/>
 *         &lt;element name="payerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "orderId",
    "subtotal",
    "shippingCost",
    "taxAmount",
    "total",
    "comment1",
    "comment2",
    "orderItems",
    "payerName",
    "payerMobile",
    "providerName",
    "providerType"
})
@XmlRootElement(name = "generatePaymentCode")
public class GeneratePaymentCode {

    protected String orderId;
    @XmlElement(required = true)
    protected BigDecimal subtotal;
    @XmlElement(required = true)
    protected BigDecimal shippingCost;
    @XmlElement(required = true)
    protected BigDecimal taxAmount;
    @XmlElement(required = true)
    protected BigDecimal total;
    protected String comment1;
    protected String comment2;
    protected ArrayOfOrderItem orderItems;
    protected String payerName;
    protected String payerMobile;
    protected String providerName;
    protected String providerType;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the subtotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    /**
     * Sets the value of the subtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubtotal(BigDecimal value) {
        this.subtotal = value;
    }

    /**
     * Gets the value of the shippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingCost(BigDecimal value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
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
     * Gets the value of the orderItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderItem }
     *     
     */
    public ArrayOfOrderItem getOrderItems() {
        return orderItems;
    }

    /**
     * Sets the value of the orderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderItem }
     *     
     */
    public void setOrderItems(ArrayOfOrderItem value) {
        this.orderItems = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerName(String value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerMobile() {
        return payerMobile;
    }

    /**
     * Sets the value of the payerMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerMobile(String value) {
        this.payerMobile = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the providerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * Sets the value of the providerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderType(String value) {
        this.providerType = value;
    }

}
