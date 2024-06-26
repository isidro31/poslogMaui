
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


/**
 * <p>Java class for DiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rounding" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DiscountId"/>
 *         &lt;choice>
 *           &lt;element name="Amount" type="{http://v21.ws.poslog.xcenter.dtv/}AmountType"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PercentOff"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountType", propOrder = {
    "rounding",
    "discountId",
    "amount",
    "percentOff"
})
public class DiscountType {

    @XmlElement(name = "Rounding", required = true)
    protected BigInteger rounding;
    @XmlElement(name = "DiscountId", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String discountId;
    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "PercentOff", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigDecimal percentOff;

    /**
     * Gets the value of the rounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRounding(BigInteger value) {
        this.rounding = value;
    }

    /**
     * Gets the value of the discountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountId() {
        return discountId;
    }

    /**
     * Sets the value of the discountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountId(String value) {
        this.discountId = value;
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
     * Gets the value of the percentOff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentOff() {
        return percentOff;
    }

    /**
     * Sets the value of the percentOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentOff(BigDecimal value) {
        this.percentOff = value;
    }

}
