
package dtv.xcenter.poslog.ws.v21;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxOverrideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxOverrideType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalTaxPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OriginalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NewTaxPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NewTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxOverrideType", propOrder = {
    "originalTaxPercent",
    "originalTaxAmount",
    "newTaxPercent",
    "newTaxAmount",
    "reasonCode"
})
public class TaxOverrideType {

    @XmlElement(name = "OriginalTaxPercent")
    protected BigDecimal originalTaxPercent;
    @XmlElement(name = "OriginalTaxAmount")
    protected BigDecimal originalTaxAmount;
    @XmlElement(name = "NewTaxPercent", required = true)
    protected BigDecimal newTaxPercent;
    @XmlElement(name = "NewTaxAmount", required = true)
    protected BigDecimal newTaxAmount;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;

    /**
     * Gets the value of the originalTaxPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalTaxPercent() {
        return originalTaxPercent;
    }

    /**
     * Sets the value of the originalTaxPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalTaxPercent(BigDecimal value) {
        this.originalTaxPercent = value;
    }

    /**
     * Gets the value of the originalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalTaxAmount() {
        return originalTaxAmount;
    }

    /**
     * Sets the value of the originalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalTaxAmount(BigDecimal value) {
        this.originalTaxAmount = value;
    }

    /**
     * Gets the value of the newTaxPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewTaxPercent() {
        return newTaxPercent;
    }

    /**
     * Sets the value of the newTaxPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewTaxPercent(BigDecimal value) {
        this.newTaxPercent = value;
    }

    /**
     * Gets the value of the newTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewTaxAmount() {
        return newTaxAmount;
    }

    /**
     * Sets the value of the newTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewTaxAmount(BigDecimal value) {
        this.newTaxAmount = value;
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

}
