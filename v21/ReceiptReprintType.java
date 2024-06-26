
package dtv.xcenter.poslog.ws.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dtv.xcenter.poslog_ext.ws.v21.DocumentLink;


/**
 * <p>Java class for ReceiptReprintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptReprintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="TransactionLink" type="{http://v21.ws.poslog.xcenter.dtv/}TransactionLinkType"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DocumentLink"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptReprintType", propOrder = {
    "transactionLink",
    "documentLink"
})
public class ReceiptReprintType {

    @XmlElement(name = "TransactionLink")
    protected TransactionLinkType transactionLink;
    @XmlElement(name = "DocumentLink", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected DocumentLink documentLink;
    @XmlAttribute(name = "TypeCode")
    protected String typeCode;

    /**
     * Gets the value of the transactionLink property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLinkType }
     *     
     */
    public TransactionLinkType getTransactionLink() {
        return transactionLink;
    }

    /**
     * Sets the value of the transactionLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLinkType }
     *     
     */
    public void setTransactionLink(TransactionLinkType value) {
        this.transactionLink = value;
    }

    /**
     * Gets the value of the documentLink property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentLink }
     *     
     */
    public DocumentLink getDocumentLink() {
        return documentLink;
    }

    /**
     * Sets the value of the documentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentLink }
     *     
     */
    public void setDocumentLink(DocumentLink value) {
        this.documentLink = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
