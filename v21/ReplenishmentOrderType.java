
package dtv.xcenter.poslog.ws.v21;

import java.math.BigInteger;
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
 * <p>Java class for ReplenishmentOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *           &lt;element name="CreationType" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *           &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *           &lt;element name="RetailLocationId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;/sequence>
 *         &lt;element name="CreatedTimestamp" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="HeaderComment" type="{http://v21.ws.poslog.xcenter.dtv/}CommentType" minOccurs="0"/>
 *         &lt;element name="OrderLineItem" type="{http://v21.ws.poslog.xcenter.dtv/}OrderLineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentOrderType", propOrder = {
    "orderId",
    "creationType",
    "orderStatus",
    "retailLocationId",
    "createdTimestamp",
    "headerComment",
    "orderLineItem"
})
public class ReplenishmentOrderType {

    @XmlElement(name = "OrderId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String orderId;
    @XmlElement(name = "CreationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String creationType;
    @XmlElement(name = "OrderStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String orderStatus;
    @XmlElement(name = "RetailLocationId")
    protected BigInteger retailLocationId;
    @XmlElement(name = "CreatedTimestamp")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String createdTimestamp;
    @XmlElement(name = "HeaderComment")
    protected CommentType headerComment;
    @XmlElement(name = "OrderLineItem")
    protected List<OrderLineItemType> orderLineItem;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the creationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationType() {
        return creationType;
    }

    /**
     * Sets the value of the creationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationType(String value) {
        this.creationType = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the retailLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetailLocationId() {
        return retailLocationId;
    }

    /**
     * Sets the value of the retailLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetailLocationId(BigInteger value) {
        this.retailLocationId = value;
    }

    /**
     * Gets the value of the createdTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * Sets the value of the createdTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedTimestamp(String value) {
        this.createdTimestamp = value;
    }

    /**
     * Gets the value of the headerComment property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getHeaderComment() {
        return headerComment;
    }

    /**
     * Sets the value of the headerComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setHeaderComment(CommentType value) {
        this.headerComment = value;
    }

    /**
     * Gets the value of the orderLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLineItemType }
     * 
     * 
     */
    public List<OrderLineItemType> getOrderLineItem() {
        if (orderLineItem == null) {
            orderLineItem = new ArrayList<OrderLineItemType>();
        }
        return this.orderLineItem;
    }

}
