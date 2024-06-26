
package dtv.xcenter.poslog.ws.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dtv.xcenter.poslog_ext.ws.v21.AssignTill;
import dtv.xcenter.poslog_ext.ws.v21.AttachTill;
import dtv.xcenter.poslog_ext.ws.v21.RemoveTill;


/**
 * <p>Java class for POSLogControlTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSLogControlTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}AssignTill" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}AttachTill" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}RemoveTill" minOccurs="0"/>
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
@XmlType(name = "POSLogControlTransactionType", propOrder = {
    "operatorID",
    "assignTill",
    "attachTill",
    "removeTill"
})
public class POSLogControlTransactionType {

    @XmlElement(name = "OperatorID")
    protected String operatorID;
    @XmlElement(name = "AssignTill", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected AssignTill assignTill;
    @XmlElement(name = "AttachTill", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected AttachTill attachTill;
    @XmlElement(name = "RemoveTill", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected RemoveTill removeTill;

    /**
     * Gets the value of the operatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorID() {
        return operatorID;
    }

    /**
     * Sets the value of the operatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorID(String value) {
        this.operatorID = value;
    }

    /**
     * Gets the value of the assignTill property.
     * 
     * @return
     *     possible object is
     *     {@link AssignTill }
     *     
     */
    public AssignTill getAssignTill() {
        return assignTill;
    }

    /**
     * Sets the value of the assignTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignTill }
     *     
     */
    public void setAssignTill(AssignTill value) {
        this.assignTill = value;
    }

    /**
     * Gets the value of the attachTill property.
     * 
     * @return
     *     possible object is
     *     {@link AttachTill }
     *     
     */
    public AttachTill getAttachTill() {
        return attachTill;
    }

    /**
     * Sets the value of the attachTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachTill }
     *     
     */
    public void setAttachTill(AttachTill value) {
        this.attachTill = value;
    }

    /**
     * Gets the value of the removeTill property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveTill }
     *     
     */
    public RemoveTill getRemoveTill() {
        return removeTill;
    }

    /**
     * Sets the value of the removeTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveTill }
     *     
     */
    public void setRemoveTill(RemoveTill value) {
        this.removeTill = value;
    }

}
