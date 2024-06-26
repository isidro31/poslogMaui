
package dtv.xcenter.poslog.ws.v21;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}RawTaxPercentage" minOccurs="0"/>
 *         &lt;element name="TaxExemption" type="{http://v21.ws.poslog.xcenter.dtv/}TaxExemptionType" minOccurs="0"/>
 *         &lt;element name="TaxOverride" type="{http://v21.ws.poslog.xcenter.dtv/}TaxOverrideType" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TaxLocationId" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TaxGroupId" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{http://v21.ws.poslog-ext.xcenter.dtv/}VoidFlag"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "taxAuthority",
    "taxableAmount",
    "amount",
    "percent",
    "rawTaxPercentage",
    "taxExemption",
    "taxOverride",
    "taxLocationId",
    "taxGroupId"
})
public class TaxType {

    @XmlElement(name = "TaxAuthority", required = true)
    protected String taxAuthority;
    @XmlElement(name = "TaxableAmount")
    protected BigDecimal taxableAmount;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    @XmlElement(name = "RawTaxPercentage", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigDecimal rawTaxPercentage;
    @XmlElement(name = "TaxExemption")
    protected TaxExemptionType taxExemption;
    @XmlElement(name = "TaxOverride")
    protected TaxOverrideType taxOverride;
    @XmlElement(name = "TaxLocationId", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String taxLocationId;
    @XmlElement(name = "TaxGroupId", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String taxGroupId;
    @XmlAttribute(name = "TaxType")
    protected String taxType;
    @XmlAttribute(name = "VoidFlag", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected Boolean voidFlag;

    /**
     * Gets the value of the taxAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAuthority() {
        return taxAuthority;
    }

    /**
     * Sets the value of the taxAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAuthority(String value) {
        this.taxAuthority = value;
    }

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableAmount(BigDecimal value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the rawTaxPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRawTaxPercentage() {
        return rawTaxPercentage;
    }

    /**
     * Sets the value of the rawTaxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRawTaxPercentage(BigDecimal value) {
        this.rawTaxPercentage = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionType }
     *     
     */
    public TaxExemptionType getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionType }
     *     
     */
    public void setTaxExemption(TaxExemptionType value) {
        this.taxExemption = value;
    }

    /**
     * Gets the value of the taxOverride property.
     * 
     * @return
     *     possible object is
     *     {@link TaxOverrideType }
     *     
     */
    public TaxOverrideType getTaxOverride() {
        return taxOverride;
    }

    /**
     * Sets the value of the taxOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxOverrideType }
     *     
     */
    public void setTaxOverride(TaxOverrideType value) {
        this.taxOverride = value;
    }

    /**
     * Gets the value of the taxLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLocationId() {
        return taxLocationId;
    }

    /**
     * Sets the value of the taxLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLocationId(String value) {
        this.taxLocationId = value;
    }

    /**
     * Gets the value of the taxGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGroupId() {
        return taxGroupId;
    }

    /**
     * Sets the value of the taxGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGroupId(String value) {
        this.taxGroupId = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
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
