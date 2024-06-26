
package dtv.xcenter.poslog.ws.v21;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemTransferLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemTransferLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceLocationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceBucketId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationLocationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationBucketId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTransferLineType", propOrder = {
    "lineSequence",
    "itemID",
    "sourceLocationId",
    "sourceBucketId",
    "destinationLocationId",
    "destinationBucketId",
    "quantity"
})
public class ItemTransferLineType {

    @XmlElement(name = "LineSequence", required = true)
    protected BigInteger lineSequence;
    @XmlElement(name = "ItemID", required = true)
    protected String itemID;
    @XmlElement(name = "SourceLocationId", required = true)
    protected String sourceLocationId;
    @XmlElement(name = "SourceBucketId", required = true)
    protected String sourceBucketId;
    @XmlElement(name = "DestinationLocationId", required = true)
    protected String destinationLocationId;
    @XmlElement(name = "DestinationBucketId", required = true)
    protected String destinationBucketId;
    @XmlElement(name = "Quantity", required = true)
    protected String quantity;

    /**
     * Gets the value of the lineSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineSequence() {
        return lineSequence;
    }

    /**
     * Sets the value of the lineSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineSequence(BigInteger value) {
        this.lineSequence = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the sourceLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLocationId() {
        return sourceLocationId;
    }

    /**
     * Sets the value of the sourceLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLocationId(String value) {
        this.sourceLocationId = value;
    }

    /**
     * Gets the value of the sourceBucketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceBucketId() {
        return sourceBucketId;
    }

    /**
     * Sets the value of the sourceBucketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceBucketId(String value) {
        this.sourceBucketId = value;
    }

    /**
     * Gets the value of the destinationLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationId() {
        return destinationLocationId;
    }

    /**
     * Sets the value of the destinationLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationId(String value) {
        this.destinationLocationId = value;
    }

    /**
     * Gets the value of the destinationBucketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationBucketId() {
        return destinationBucketId;
    }

    /**
     * Sets the value of the destinationBucketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationBucketId(String value) {
        this.destinationBucketId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

}
