
package dtv.xcenter.poslog.ws.v21;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CreatorPartyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CreationTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NoteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteType", propOrder = {
    "noteID",
    "creatorPartyID",
    "creationTimestamp",
    "noteText"
})
public class NoteType {

    @XmlElement(name = "NoteID", required = true)
    protected BigInteger noteID;
    @XmlElement(name = "CreatorPartyID", required = true)
    protected BigInteger creatorPartyID;
    @XmlElement(name = "CreationTimestamp", required = true)
    protected String creationTimestamp;
    @XmlElement(name = "NoteText")
    protected String noteText;

    /**
     * Gets the value of the noteID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoteID() {
        return noteID;
    }

    /**
     * Sets the value of the noteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoteID(BigInteger value) {
        this.noteID = value;
    }

    /**
     * Gets the value of the creatorPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreatorPartyID() {
        return creatorPartyID;
    }

    /**
     * Sets the value of the creatorPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreatorPartyID(BigInteger value) {
        this.creatorPartyID = value;
    }

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTimestamp(String value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteText(String value) {
        this.noteText = value;
    }

}
