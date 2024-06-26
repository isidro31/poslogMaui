
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
 * <p>Java class for ControlTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}SystemCycleType"/>
 *           &lt;element name="NoSale" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *           &lt;element name="ReceiptReprint" type="{http://v21.ws.poslog.xcenter.dtv/}ReceiptReprintType" maxOccurs="unbounded"/>
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
@XmlType(name = "ControlTransactionType", propOrder = {
    "reasonCode",
    "systemCycleType",
    "noSale",
    "receiptReprint"
})
public class ControlTransactionType {

    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "SystemCycleType", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String systemCycleType;
    @XmlElement(name = "NoSale")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String noSale;
    @XmlElement(name = "ReceiptReprint")
    protected List<ReceiptReprintType> receiptReprint;

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
     * Gets the value of the systemCycleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCycleType() {
        return systemCycleType;
    }

    /**
     * Sets the value of the systemCycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCycleType(String value) {
        this.systemCycleType = value;
    }

    /**
     * Gets the value of the noSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSale() {
        return noSale;
    }

    /**
     * Sets the value of the noSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSale(String value) {
        this.noSale = value;
    }

    /**
     * Gets the value of the receiptReprint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptReprint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptReprint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptReprintType }
     * 
     * 
     */
    public List<ReceiptReprintType> getReceiptReprint() {
        if (receiptReprint == null) {
            receiptReprint = new ArrayList<ReceiptReprintType>();
        }
        return this.receiptReprint;
    }

}
