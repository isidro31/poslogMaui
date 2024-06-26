
package dtv.xcenter.poslog.ws.v21;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransactionLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetailStoreID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkstationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LineItemSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BusinessDayDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}LinkTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EntryMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionLinkType", propOrder = {
    "retailStoreID",
    "workstationID",
    "sequenceNumber",
    "lineItemSequenceNumber",
    "businessDayDate",
    "linkTypeCode"
})
public class TransactionLinkType {

    @XmlElement(name = "RetailStoreID", required = true)
    protected String retailStoreID;
    @XmlElement(name = "WorkstationID", required = true)
    protected String workstationID;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElement(name = "LineItemSequenceNumber")
    protected BigInteger lineItemSequenceNumber;
    @XmlElement(name = "BusinessDayDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar businessDayDate;
    @XmlElement(name = "LinkTypeCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String linkTypeCode;
    @XmlAttribute(name = "ReasonCode")
    protected String reasonCode;
    @XmlAttribute(name = "EntryMethod")
    protected String entryMethod;

    /**
     * Gets the value of the retailStoreID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailStoreID() {
        return retailStoreID;
    }

    /**
     * Sets the value of the retailStoreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailStoreID(String value) {
        this.retailStoreID = value;
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
     * Gets the value of the lineItemSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineItemSequenceNumber() {
        return lineItemSequenceNumber;
    }

    /**
     * Sets the value of the lineItemSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineItemSequenceNumber(BigInteger value) {
        this.lineItemSequenceNumber = value;
    }

    /**
     * Gets the value of the businessDayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBusinessDayDate() {
        return businessDayDate;
    }

    /**
     * Sets the value of the businessDayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBusinessDayDate(XMLGregorianCalendar value) {
        this.businessDayDate = value;
    }

    /**
     * Gets the value of the linkTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTypeCode() {
        return linkTypeCode;
    }

    /**
     * Sets the value of the linkTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTypeCode(String value) {
        this.linkTypeCode = value;
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
     * Gets the value of the entryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryMethod() {
        return entryMethod;
    }

    /**
     * Sets the value of the entryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryMethod(String value) {
        this.entryMethod = value;
    }

}
