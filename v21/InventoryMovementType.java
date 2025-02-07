
package dtv.xcenter.poslog.ws.v21;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InventoryMovementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryMovementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentStatus" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="DocumentID" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *         &lt;element name="RetailStoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginatorID" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="OriginatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentTypeDescription" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentSubType" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="RecordCreationType" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="CreationTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="CompletionTimestamp" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="LastActivityTimestamp" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://v21.ws.poslog.xcenter.dtv/}NoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Shipment" type="{http://v21.ws.poslog.xcenter.dtv/}ShipmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Carton" type="{http://v21.ws.poslog.xcenter.dtv/}CartonType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineItem" type="{http://v21.ws.poslog.xcenter.dtv/}LineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemTransferLine" type="{http://v21.ws.poslog.xcenter.dtv/}ItemTransferLineType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryMovementType", propOrder = {
    "documentStatus",
    "documentID",
    "retailStoreID",
    "originatorID",
    "originatorName",
    "documentTypeDescription",
    "documentType",
    "documentSubType",
    "recordCreationType",
    "creationTimestamp",
    "expectedDeliveryDate",
    "completionTimestamp",
    "lastActivityTimestamp",
    "note",
    "shipment",
    "carton",
    "statusCode",
    "lineItem",
    "itemTransferLine"
})
public class InventoryMovementType {

    @XmlElement(name = "DocumentStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String documentStatus;
    @XmlElement(name = "DocumentID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String documentID;
    @XmlElement(name = "RetailStoreID")
    protected String retailStoreID;
    @XmlElement(name = "OriginatorID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String originatorID;
    @XmlElement(name = "OriginatorName")
    protected String originatorName;
    @XmlElement(name = "DocumentTypeDescription", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String documentTypeDescription;
    @XmlElement(name = "DocumentType", required = true)
    protected String documentType;
    @XmlElement(name = "DocumentSubType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String documentSubType;
    @XmlElement(name = "RecordCreationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String recordCreationType;
    @XmlElement(name = "CreationTimestamp")
    protected String creationTimestamp;
    @XmlElement(name = "ExpectedDeliveryDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String expectedDeliveryDate;
    @XmlElement(name = "CompletionTimestamp")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String completionTimestamp;
    @XmlElement(name = "LastActivityTimestamp")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lastActivityTimestamp;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "Shipment")
    protected List<ShipmentType> shipment;
    @XmlElement(name = "Carton")
    protected List<CartonType> carton;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "LineItem")
    protected List<LineItemType> lineItem;
    @XmlElement(name = "ItemTransferLine")
    protected List<ItemTransferLineType> itemTransferLine;

    /**
     * Gets the value of the documentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Sets the value of the documentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStatus(String value) {
        this.documentStatus = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

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
     * Gets the value of the originatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorID() {
        return originatorID;
    }

    /**
     * Sets the value of the originatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorID(String value) {
        this.originatorID = value;
    }

    /**
     * Gets the value of the originatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorName() {
        return originatorName;
    }

    /**
     * Sets the value of the originatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorName(String value) {
        this.originatorName = value;
    }

    /**
     * Gets the value of the documentTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeDescription() {
        return documentTypeDescription;
    }

    /**
     * Sets the value of the documentTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeDescription(String value) {
        this.documentTypeDescription = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSubType() {
        return documentSubType;
    }

    /**
     * Sets the value of the documentSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSubType(String value) {
        this.documentSubType = value;
    }

    /**
     * Gets the value of the recordCreationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCreationType() {
        return recordCreationType;
    }

    /**
     * Sets the value of the recordCreationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCreationType(String value) {
        this.recordCreationType = value;
    }

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTimestamp(String value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDeliveryDate(String value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the completionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionTimestamp() {
        return completionTimestamp;
    }

    /**
     * Sets the value of the completionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionTimestamp(String value) {
        this.completionTimestamp = value;
    }

    /**
     * Gets the value of the lastActivityTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastActivityTimestamp() {
        return lastActivityTimestamp;
    }

    /**
     * Sets the value of the lastActivityTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastActivityTimestamp(String value) {
        this.lastActivityTimestamp = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getShipment() {
        if (shipment == null) {
            shipment = new ArrayList<ShipmentType>();
        }
        return this.shipment;
    }

    /**
     * Gets the value of the carton property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carton property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarton().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartonType }
     * 
     * 
     */
    public List<CartonType> getCarton() {
        if (carton == null) {
            carton = new ArrayList<CartonType>();
        }
        return this.carton;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the lineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<LineItemType>();
        }
        return this.lineItem;
    }

    /**
     * Gets the value of the itemTransferLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemTransferLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemTransferLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemTransferLineType }
     * 
     * 
     */
    public List<ItemTransferLineType> getItemTransferLine() {
        if (itemTransferLine == null) {
            itemTransferLine = new ArrayList<ItemTransferLineType>();
        }
        return this.itemTransferLine;
    }

}
