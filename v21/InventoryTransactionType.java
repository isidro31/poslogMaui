
package dtv.xcenter.poslog.ws.v21;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InventoryTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ShippingDefectiveReturn" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="ReturnToVendor" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="CountID" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *             &lt;element name="CountType" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *             &lt;element name="CountStatus" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="DocumentID" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *             &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ReceivingOrder" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="ReceivingReplenishment" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="ReceivingSpecialOrder" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="ReceivingWorkOrder" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="ShippingOrder" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="ShippingSale" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="ShippingWorkOrder" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="InventoryCount" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryCountType"/>
 *           &lt;element name="ReceiveInventory" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="ReplenishmentOrder" type="{http://v21.ws.poslog.xcenter.dtv/}ReplenishmentOrderType"/>
 *           &lt;element name="TransferOut" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;element name="ItemTransfer" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryMovementType"/>
 *           &lt;sequence>
 *             &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="ItemCount" type="{http://v21.ws.poslog.xcenter.dtv/}ItemCountType" maxOccurs="unbounded"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryTransactionType", propOrder = {
    "shippingDefectiveReturn",
    "returnToVendor",
    "countID",
    "countType",
    "countStatus",
    "documentID",
    "documentType",
    "receivingOrder",
    "receivingReplenishment",
    "receivingSpecialOrder",
    "receivingWorkOrder",
    "shippingOrder",
    "shippingSale",
    "shippingWorkOrder",
    "inventoryCount",
    "receiveInventory",
    "replenishmentOrder",
    "transferOut",
    "itemTransfer",
    "reasonCode",
    "itemCount"
})
public class InventoryTransactionType {

    @XmlElement(name = "ShippingDefectiveReturn")
    protected InventoryMovementType shippingDefectiveReturn;
    @XmlElement(name = "ReturnToVendor")
    protected InventoryMovementType returnToVendor;
    @XmlElement(name = "CountID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String countID;
    @XmlElement(name = "CountType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String countType;
    @XmlElement(name = "CountStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String countStatus;
    @XmlElement(name = "DocumentID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String documentID;
    @XmlElement(name = "DocumentType")
    protected String documentType;
    @XmlElement(name = "ReceivingOrder")
    protected InventoryMovementType receivingOrder;
    @XmlElement(name = "ReceivingReplenishment")
    protected InventoryMovementType receivingReplenishment;
    @XmlElement(name = "ReceivingSpecialOrder")
    protected InventoryMovementType receivingSpecialOrder;
    @XmlElement(name = "ReceivingWorkOrder")
    protected InventoryMovementType receivingWorkOrder;
    @XmlElement(name = "ShippingOrder")
    protected InventoryMovementType shippingOrder;
    @XmlElement(name = "ShippingSale")
    protected InventoryMovementType shippingSale;
    @XmlElement(name = "ShippingWorkOrder")
    protected InventoryMovementType shippingWorkOrder;
    @XmlElement(name = "InventoryCount")
    protected InventoryCountType inventoryCount;
    @XmlElement(name = "ReceiveInventory")
    protected InventoryMovementType receiveInventory;
    @XmlElement(name = "ReplenishmentOrder")
    protected ReplenishmentOrderType replenishmentOrder;
    @XmlElement(name = "TransferOut")
    protected InventoryMovementType transferOut;
    @XmlElement(name = "ItemTransfer")
    protected InventoryMovementType itemTransfer;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "ItemCount")
    protected List<ItemCountType> itemCount;
    @XmlAttribute(name = "Version")
    protected BigDecimal version;

    /**
     * Gets the value of the shippingDefectiveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getShippingDefectiveReturn() {
        return shippingDefectiveReturn;
    }

    /**
     * Sets the value of the shippingDefectiveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setShippingDefectiveReturn(InventoryMovementType value) {
        this.shippingDefectiveReturn = value;
    }

    /**
     * Gets the value of the returnToVendor property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getReturnToVendor() {
        return returnToVendor;
    }

    /**
     * Sets the value of the returnToVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setReturnToVendor(InventoryMovementType value) {
        this.returnToVendor = value;
    }

    /**
     * Gets the value of the countID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountID() {
        return countID;
    }

    /**
     * Sets the value of the countID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountID(String value) {
        this.countID = value;
    }

    /**
     * Gets the value of the countType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountType() {
        return countType;
    }

    /**
     * Sets the value of the countType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountType(String value) {
        this.countType = value;
    }

    /**
     * Gets the value of the countStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountStatus() {
        return countStatus;
    }

    /**
     * Sets the value of the countStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountStatus(String value) {
        this.countStatus = value;
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
     * Gets the value of the receivingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getReceivingOrder() {
        return receivingOrder;
    }

    /**
     * Sets the value of the receivingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setReceivingOrder(InventoryMovementType value) {
        this.receivingOrder = value;
    }

    /**
     * Gets the value of the receivingReplenishment property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getReceivingReplenishment() {
        return receivingReplenishment;
    }

    /**
     * Sets the value of the receivingReplenishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setReceivingReplenishment(InventoryMovementType value) {
        this.receivingReplenishment = value;
    }

    /**
     * Gets the value of the receivingSpecialOrder property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getReceivingSpecialOrder() {
        return receivingSpecialOrder;
    }

    /**
     * Sets the value of the receivingSpecialOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setReceivingSpecialOrder(InventoryMovementType value) {
        this.receivingSpecialOrder = value;
    }

    /**
     * Gets the value of the receivingWorkOrder property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getReceivingWorkOrder() {
        return receivingWorkOrder;
    }

    /**
     * Sets the value of the receivingWorkOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setReceivingWorkOrder(InventoryMovementType value) {
        this.receivingWorkOrder = value;
    }

    /**
     * Gets the value of the shippingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getShippingOrder() {
        return shippingOrder;
    }

    /**
     * Sets the value of the shippingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setShippingOrder(InventoryMovementType value) {
        this.shippingOrder = value;
    }

    /**
     * Gets the value of the shippingSale property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getShippingSale() {
        return shippingSale;
    }

    /**
     * Sets the value of the shippingSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setShippingSale(InventoryMovementType value) {
        this.shippingSale = value;
    }

    /**
     * Gets the value of the shippingWorkOrder property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getShippingWorkOrder() {
        return shippingWorkOrder;
    }

    /**
     * Sets the value of the shippingWorkOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setShippingWorkOrder(InventoryMovementType value) {
        this.shippingWorkOrder = value;
    }

    /**
     * Gets the value of the inventoryCount property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryCountType }
     *     
     */
    public InventoryCountType getInventoryCount() {
        return inventoryCount;
    }

    /**
     * Sets the value of the inventoryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryCountType }
     *     
     */
    public void setInventoryCount(InventoryCountType value) {
        this.inventoryCount = value;
    }

    /**
     * Gets the value of the receiveInventory property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getReceiveInventory() {
        return receiveInventory;
    }

    /**
     * Sets the value of the receiveInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setReceiveInventory(InventoryMovementType value) {
        this.receiveInventory = value;
    }

    /**
     * Gets the value of the replenishmentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentOrderType }
     *     
     */
    public ReplenishmentOrderType getReplenishmentOrder() {
        return replenishmentOrder;
    }

    /**
     * Sets the value of the replenishmentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentOrderType }
     *     
     */
    public void setReplenishmentOrder(ReplenishmentOrderType value) {
        this.replenishmentOrder = value;
    }

    /**
     * Gets the value of the transferOut property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getTransferOut() {
        return transferOut;
    }

    /**
     * Sets the value of the transferOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setTransferOut(InventoryMovementType value) {
        this.transferOut = value;
    }

    /**
     * Gets the value of the itemTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMovementType }
     *     
     */
    public InventoryMovementType getItemTransfer() {
        return itemTransfer;
    }

    /**
     * Sets the value of the itemTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMovementType }
     *     
     */
    public void setItemTransfer(InventoryMovementType value) {
        this.itemTransfer = value;
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
     * Gets the value of the itemCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCountType }
     * 
     * 
     */
    public List<ItemCountType> getItemCount() {
        if (itemCount == null) {
            itemCount = new ArrayList<ItemCountType>();
        }
        return this.itemCount;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}
