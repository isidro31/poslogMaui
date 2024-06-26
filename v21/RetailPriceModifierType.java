
package dtv.xcenter.poslog.ws.v21;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailPriceModifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailPriceModifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://v21.ws.poslog.xcenter.dtv/}AmountType"/>
 *         &lt;element name="PromotionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}SerialNumber" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DiscountReasonCode" minOccurs="0"/>
 *         &lt;element name="Coupon" type="{http://v21.ws.poslog.xcenter.dtv/}CouponType" minOccurs="0"/>
 *         &lt;element name="PreviousPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NewPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DiscountReasonCodeComment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MethodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VoidFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailPriceModifierType", propOrder = {
    "sequenceNumber",
    "amount",
    "promotionID",
    "reasonCode",
    "serialNumber",
    "discountReasonCode",
    "coupon",
    "previousPrice",
    "newPrice",
    "discountReasonCodeComment"
})
public class RetailPriceModifierType {

    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "PromotionID")
    protected String promotionID;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "SerialNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String serialNumber;
    @XmlElement(name = "DiscountReasonCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String discountReasonCode;
    @XmlElement(name = "Coupon")
    protected CouponType coupon;
    @XmlElement(name = "PreviousPrice")
    protected BigDecimal previousPrice;
    @XmlElement(name = "NewPrice")
    protected BigDecimal newPrice;
    @XmlElement(name = "DiscountReasonCodeComment", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String discountReasonCodeComment;
    @XmlAttribute(name = "MethodCode")
    protected String methodCode;
    @XmlAttribute(name = "VoidFlag")
    protected Boolean voidFlag;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the promotionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionID() {
        return promotionID;
    }

    /**
     * Sets the value of the promotionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionID(String value) {
        this.promotionID = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the discountReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountReasonCode() {
        return discountReasonCode;
    }

    /**
     * Sets the value of the discountReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountReasonCode(String value) {
        this.discountReasonCode = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link CouponType }
     *     
     */
    public CouponType getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponType }
     *     
     */
    public void setCoupon(CouponType value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the previousPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousPrice() {
        return previousPrice;
    }

    /**
     * Sets the value of the previousPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousPrice(BigDecimal value) {
        this.previousPrice = value;
    }

    /**
     * Gets the value of the newPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewPrice() {
        return newPrice;
    }

    /**
     * Sets the value of the newPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewPrice(BigDecimal value) {
        this.newPrice = value;
    }

    /**
     * Gets the value of the discountReasonCodeComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountReasonCodeComment() {
        return discountReasonCodeComment;
    }

    /**
     * Sets the value of the discountReasonCodeComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountReasonCodeComment(String value) {
        this.discountReasonCodeComment = value;
    }

    /**
     * Gets the value of the methodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodCode() {
        return methodCode;
    }

    /**
     * Sets the value of the methodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodCode(String value) {
        this.methodCode = value;
    }

    /**
     * Gets the value of the voidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidFlag() {
        return voidFlag;
    }

    /**
     * Sets the value of the voidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidFlag(Boolean value) {
        this.voidFlag = value;
    }

}
