
package dtv.xcenter.poslog.ws.v21;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AuthorizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Ps2000" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Tax" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Discount" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Freight" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Duty" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}CardLevelIndicator" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}AdjudicationCode" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}ResponseCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationType", propOrder = {
    "requestedAmount",
    "authorizationCode",
    "referenceNumber",
    "authorizationDateTime",
    "ps2000",
    "tax",
    "discount",
    "freight",
    "duty",
    "cardLevelIndicator",
    "adjudicationCode",
    "responseCode"
})
public class AuthorizationType {

    @XmlElement(name = "RequestedAmount", required = true)
    protected BigDecimal requestedAmount;
    @XmlElement(name = "AuthorizationCode", required = true)
    protected String authorizationCode;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElement(name = "AuthorizationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationDateTime;
    @XmlElement(name = "Ps2000", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String ps2000;
    @XmlElement(name = "Tax", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigDecimal tax;
    @XmlElement(name = "Discount", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigDecimal discount;
    @XmlElement(name = "Freight", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigDecimal freight;
    @XmlElement(name = "Duty", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigDecimal duty;
    @XmlElement(name = "CardLevelIndicator", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String cardLevelIndicator;
    @XmlElement(name = "AdjudicationCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String adjudicationCode;
    @XmlElement(name = "ResponseCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigInteger responseCode;

    /**
     * Gets the value of the requestedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Sets the value of the requestedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedAmount(BigDecimal value) {
        this.requestedAmount = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the authorizationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDateTime() {
        return authorizationDateTime;
    }

    /**
     * Sets the value of the authorizationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDateTime(XMLGregorianCalendar value) {
        this.authorizationDateTime = value;
    }

    /**
     * Gets the value of the ps2000 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPs2000() {
        return ps2000;
    }

    /**
     * Sets the value of the ps2000 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPs2000(String value) {
        this.ps2000 = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreight(BigDecimal value) {
        this.freight = value;
    }

    /**
     * Gets the value of the duty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDuty() {
        return duty;
    }

    /**
     * Sets the value of the duty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDuty(BigDecimal value) {
        this.duty = value;
    }

    /**
     * Gets the value of the cardLevelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLevelIndicator() {
        return cardLevelIndicator;
    }

    /**
     * Sets the value of the cardLevelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLevelIndicator(String value) {
        this.cardLevelIndicator = value;
    }

    /**
     * Gets the value of the adjudicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjudicationCode() {
        return adjudicationCode;
    }

    /**
     * Sets the value of the adjudicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjudicationCode(String value) {
        this.adjudicationCode = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResponseCode(BigInteger value) {
        this.responseCode = value;
    }

}
