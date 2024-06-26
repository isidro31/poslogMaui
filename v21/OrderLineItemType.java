
package dtv.xcenter.poslog.ws.v21;

import java.math.BigInteger;
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
 * <p>Java class for OrderLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItemSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="SuggestedOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="OrderQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;/sequence>
 *         &lt;element name="LineComment" type="{http://v21.ws.poslog.xcenter.dtv/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VoidFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLineItemType", propOrder = {
    "lineItemSequence",
    "itemId",
    "description",
    "status",
    "suggestedOrderQuantity",
    "orderQuantity",
    "sourceId",
    "sourceType",
    "lineComment"
})
public class OrderLineItemType {

    @XmlElement(name = "LineItemSequence", required = true)
    protected BigInteger lineItemSequence;
    @XmlElement(name = "ItemId", required = true)
    protected String itemId;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String status;
    @XmlElement(name = "SuggestedOrderQuantity")
    protected BigInteger suggestedOrderQuantity;
    @XmlElement(name = "OrderQuantity")
    protected BigInteger orderQuantity;
    @XmlElement(name = "SourceId")
    protected BigInteger sourceId;
    @XmlElement(name = "SourceType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sourceType;
    @XmlElement(name = "LineComment")
    protected List<CommentType> lineComment;
    @XmlAttribute(name = "VoidFlag")
    protected Boolean voidFlag;

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

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the suggestedOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSuggestedOrderQuantity() {
        return suggestedOrderQuantity;
    }

    /**
     * Sets the value of the suggestedOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSuggestedOrderQuantity(BigInteger value) {
        this.suggestedOrderQuantity = value;
    }

    /**
     * Gets the value of the orderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Sets the value of the orderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderQuantity(BigInteger value) {
        this.orderQuantity = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceId(BigInteger value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the lineComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getLineComment() {
        if (lineComment == null) {
            lineComment = new ArrayList<CommentType>();
        }
        return this.lineComment;
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
