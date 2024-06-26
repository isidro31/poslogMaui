
package dtv.xcenter.poslog.ws.v21;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TaxExemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerExemptionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExemptTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExemptTaxableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *         &lt;element name="CertificateHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DiplomaticTitle"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Address1"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Address2"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Address3"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Address4"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}City"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Territory"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PostalCode"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Country"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxExemptionType", propOrder = {
    "customerExemptionID",
    "exemptTaxAmount",
    "exemptTaxableAmount",
    "reasonCode",
    "certificateNumber",
    "certificateHolderName",
    "diplomaticTitle",
    "address1",
    "address2",
    "address3",
    "address4",
    "city",
    "territory",
    "postalCode",
    "country"
})
public class TaxExemptionType {

    @XmlElement(name = "CustomerExemptionID", required = true)
    protected String customerExemptionID;
    @XmlElement(name = "ExemptTaxAmount", required = true)
    protected BigDecimal exemptTaxAmount;
    @XmlElement(name = "ExemptTaxableAmount")
    protected BigDecimal exemptTaxableAmount;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "CertificateNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String certificateNumber;
    @XmlElement(name = "CertificateHolderName", required = true)
    protected String certificateHolderName;
    @XmlElement(name = "DiplomaticTitle", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String diplomaticTitle;
    @XmlElement(name = "Address1", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String address1;
    @XmlElement(name = "Address2", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String address2;
    @XmlElement(name = "Address3", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String address3;
    @XmlElement(name = "Address4", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String address4;
    @XmlElement(name = "City", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String city;
    @XmlElement(name = "Territory", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String territory;
    @XmlElement(name = "PostalCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String postalCode;
    @XmlElement(name = "Country", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String country;

    /**
     * Gets the value of the customerExemptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerExemptionID() {
        return customerExemptionID;
    }

    /**
     * Sets the value of the customerExemptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerExemptionID(String value) {
        this.customerExemptionID = value;
    }

    /**
     * Gets the value of the exemptTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExemptTaxAmount() {
        return exemptTaxAmount;
    }

    /**
     * Sets the value of the exemptTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExemptTaxAmount(BigDecimal value) {
        this.exemptTaxAmount = value;
    }

    /**
     * Gets the value of the exemptTaxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExemptTaxableAmount() {
        return exemptTaxableAmount;
    }

    /**
     * Sets the value of the exemptTaxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExemptTaxableAmount(BigDecimal value) {
        this.exemptTaxableAmount = value;
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
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the certificateHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateHolderName() {
        return certificateHolderName;
    }

    /**
     * Sets the value of the certificateHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateHolderName(String value) {
        this.certificateHolderName = value;
    }

    /**
     * Gets the value of the diplomaticTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiplomaticTitle() {
        return diplomaticTitle;
    }

    /**
     * Sets the value of the diplomaticTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiplomaticTitle(String value) {
        this.diplomaticTitle = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory(String value) {
        this.territory = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
