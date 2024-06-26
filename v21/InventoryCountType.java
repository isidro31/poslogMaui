
package dtv.xcenter.poslog.ws.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InventoryCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountID" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="CountType" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="CountStatus" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryCountType", propOrder = {
    "countID",
    "countType",
    "countStatus"
})
public class InventoryCountType {

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

}
