
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
 * <p>Java class for TillControlTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TillControlTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TillControlComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TillControlDetail" type="{http://v21.ws.poslog.xcenter.dtv/}TillControlDetailType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TillControlTransactionType", propOrder = {
    "type",
    "employeeID",
    "reasonCode",
    "tillControlComment",
    "tillControlDetail"
})
public class TillControlTransactionType {

    @XmlElement(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;
    @XmlElement(name = "EmployeeID", required = true)
    protected String employeeID;
    @XmlElement(name = "ReasonCode", required = true)
    protected String reasonCode;
    @XmlElement(name = "TillControlComment", required = true)
    protected String tillControlComment;
    @XmlElement(name = "TillControlDetail", required = true)
    protected List<TillControlDetailType> tillControlDetail;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeID(String value) {
        this.employeeID = value;
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
     * Gets the value of the tillControlComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTillControlComment() {
        return tillControlComment;
    }

    /**
     * Sets the value of the tillControlComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTillControlComment(String value) {
        this.tillControlComment = value;
    }

    /**
     * Gets the value of the tillControlDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tillControlDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTillControlDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TillControlDetailType }
     * 
     * 
     */
    public List<TillControlDetailType> getTillControlDetail() {
        if (tillControlDetail == null) {
            tillControlDetail = new ArrayList<TillControlDetailType>();
        }
        return this.tillControlDetail;
    }

}
