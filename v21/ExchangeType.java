
package dtv.xcenter.poslog.ws.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v21.ws.poslog.xcenter.dtv/}SaleType">
 *       &lt;sequence>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}NewSerialNumber"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}OriginalSerialNumber"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}ReasonComment"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeType", propOrder = {
    "newSerialNumber",
    "originalSerialNumber",
    "reason",
    "reasonComment"
})
public class ExchangeType
    extends SaleType
{

    @XmlElement(name = "NewSerialNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/", required = true)
    protected String newSerialNumber;
    @XmlElement(name = "OriginalSerialNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/", required = true)
    protected String originalSerialNumber;
    @XmlElement(name = "Reason", required = true)
    protected String reason;
    @XmlElement(name = "ReasonComment", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/", required = true)
    protected String reasonComment;

    /**
     * Gets the value of the newSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSerialNumber() {
        return newSerialNumber;
    }

    /**
     * Sets the value of the newSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSerialNumber(String value) {
        this.newSerialNumber = value;
    }

    /**
     * Gets the value of the originalSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalSerialNumber() {
        return originalSerialNumber;
    }

    /**
     * Sets the value of the originalSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalSerialNumber(String value) {
        this.originalSerialNumber = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the reasonComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonComment() {
        return reasonComment;
    }

    /**
     * Sets the value of the reasonComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonComment(String value) {
        this.reasonComment = value;
    }

}
