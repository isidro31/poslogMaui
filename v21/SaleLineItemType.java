
package dtv.xcenter.poslog.ws.v21;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SaleLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetailLocationID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="WorkstationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="TransactionSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="LineItemSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleLineItemType", propOrder = {
    "retailLocationID",
    "workstationID",
    "businessDate",
    "transactionSequence",
    "lineItemSequence"
})
public class SaleLineItemType {

    @XmlElement(name = "RetailLocationID", required = true)
    protected BigInteger retailLocationID;
    @XmlElement(name = "WorkstationID", required = true)
    protected String workstationID;
    @XmlElement(name = "BusinessDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String businessDate;
    @XmlElement(name = "TransactionSequence", required = true)
    protected BigInteger transactionSequence;
    @XmlElement(name = "LineItemSequence", required = true)
    protected BigInteger lineItemSequence;

    /**
     * Gets the value of the retailLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetailLocationID() {
        return retailLocationID;
    }

    /**
     * Sets the value of the retailLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetailLocationID(BigInteger value) {
        this.retailLocationID = value;
    }

    /**
     * Gets the value of the workstationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstationID() {
        return workstationID;
    }

    /**
     * Sets the value of the workstationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstationID(String value) {
        this.workstationID = value;
    }

    /**
     * Gets the value of the businessDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDate() {
        return businessDate;
    }

    /**
     * Sets the value of the businessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDate(String value) {
        this.businessDate = value;
    }

    /**
     * Gets the value of the transactionSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionSequence() {
        return transactionSequence;
    }

    /**
     * Sets the value of the transactionSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionSequence(BigInteger value) {
        this.transactionSequence = value;
    }

    /**
     * Gets the value of the lineItemSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineItemSequence() {
        return lineItemSequence;
    }

    /**
     * Sets the value of the lineItemSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineItemSequence(BigInteger value) {
        this.lineItemSequence = value;
    }

}
