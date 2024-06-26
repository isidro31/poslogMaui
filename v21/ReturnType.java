
package dtv.xcenter.poslog.ws.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import dtv.xcenter.poslog_ext.ws.v21.Disposition;


/**
 * <p>Java class for ReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v21.ws.poslog.xcenter.dtv/}SaleType">
 *       &lt;sequence>
 *         &lt;element name="Disposal" type="{http://v21.ws.poslog.xcenter.dtv/}DisposalType" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}ReturnType" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}ReasonComment" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Disposition" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PostVoidReasonCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnType", propOrder = {
    "disposal",
    "reason",
    "returnType",
    "reasonComment",
    "disposition",
    "postVoidReasonCode"
})
public class ReturnType
    extends SaleType
{

    @XmlElement(name = "Disposal")
    protected DisposalType disposal;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "ReturnType", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String returnType;
    @XmlElement(name = "ReasonComment", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String reasonComment;
    @XmlElement(name = "Disposition", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected Disposition disposition;
    @XmlElement(name = "PostVoidReasonCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String postVoidReasonCode;

    /**
     * Gets the value of the disposal property.
     * 
     * @return
     *     possible object is
     *     {@link DisposalType }
     *     
     */
    public DisposalType getDisposal() {
        return disposal;
    }

    /**
     * Sets the value of the disposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisposalType }
     *     
     */
    public void setDisposal(DisposalType value) {
        this.disposal = value;
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
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnType(String value) {
        this.returnType = value;
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

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link Disposition }
     *     
     */
    public Disposition getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disposition }
     *     
     */
    public void setDisposition(Disposition value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the postVoidReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostVoidReasonCode() {
        return postVoidReasonCode;
    }

    /**
     * Sets the value of the postVoidReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostVoidReasonCode(String value) {
        this.postVoidReasonCode = value;
    }

}
