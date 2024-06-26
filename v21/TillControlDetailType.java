
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
 * <p>Java class for TillControlDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TillControlDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffectedTenderRepositoryID" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="AffectedWorkstationID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="OldAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NewAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TillControlDetailType", propOrder = {
    "affectedTenderRepositoryID",
    "affectedWorkstationID",
    "oldAmount",
    "newAmount"
})
public class TillControlDetailType {

    @XmlElement(name = "AffectedTenderRepositoryID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String affectedTenderRepositoryID;
    @XmlElement(name = "AffectedWorkstationID", required = true)
    protected BigInteger affectedWorkstationID;
    @XmlElement(name = "OldAmount", required = true)
    protected BigDecimal oldAmount;
    @XmlElement(name = "NewAmount", required = true)
    protected BigDecimal newAmount;

    /**
     * Gets the value of the affectedTenderRepositoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedTenderRepositoryID() {
        return affectedTenderRepositoryID;
    }

    /**
     * Sets the value of the affectedTenderRepositoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedTenderRepositoryID(String value) {
        this.affectedTenderRepositoryID = value;
    }

    /**
     * Gets the value of the affectedWorkstationID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffectedWorkstationID() {
        return affectedWorkstationID;
    }

    /**
     * Sets the value of the affectedWorkstationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffectedWorkstationID(BigInteger value) {
        this.affectedWorkstationID = value;
    }

    /**
     * Gets the value of the oldAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldAmount() {
        return oldAmount;
    }

    /**
     * Sets the value of the oldAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldAmount(BigDecimal value) {
        this.oldAmount = value;
    }

    /**
     * Gets the value of the newAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewAmount() {
        return newAmount;
    }

    /**
     * Sets the value of the newAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewAmount(BigDecimal value) {
        this.newAmount = value;
    }

}
