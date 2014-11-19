
package com.i_walletlive.paylive;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for PaymentHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APIVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SvcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseIntMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentHeader", propOrder = {
    "apiVersion",
    "merchantKey",
    "merchantEmail",
    "svcType",
    "useIntMode"
})
public class PaymentHeader {

    @XmlElement(name = "APIVersion")
    protected String apiVersion;
    @XmlElement(name = "MerchantKey")
    protected String merchantKey;
    @XmlElement(name = "MerchantEmail")
    protected String merchantEmail;
    @XmlElement(name = "SvcType")
    protected String svcType;
    @XmlElement(name = "UseIntMode")
    protected boolean useIntMode;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPIVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPIVersion(String value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the merchantKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantKey() {
        return merchantKey;
    }

    /**
     * Sets the value of the merchantKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantKey(String value) {
        this.merchantKey = value;
    }

    /**
     * Gets the value of the merchantEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantEmail() {
        return merchantEmail;
    }

    /**
     * Sets the value of the merchantEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantEmail(String value) {
        this.merchantEmail = value;
    }

    /**
     * Gets the value of the svcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcType() {
        return svcType;
    }

    /**
     * Sets the value of the svcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcType(String value) {
        this.svcType = value;
    }

    /**
     * Gets the value of the useIntMode property.
     * 
     */
    public boolean isUseIntMode() {
        return useIntMode;
    }

    /**
     * Sets the value of the useIntMode property.
     * 
     */
    public void setUseIntMode(boolean value) {
        this.useIntMode = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
