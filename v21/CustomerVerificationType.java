
package dtv.xcenter.poslog.ws.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CustomerVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerVerificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonalID" type="{http://v21.ws.poslog.xcenter.dtv/}PersonalIDType"/>
 *         &lt;element name="Birthdate" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerVerificationType", propOrder = {
    "personalID",
    "birthdate"
})
public class CustomerVerificationType {

    @XmlElement(name = "PersonalID", required = true)
    protected PersonalIDType personalID;
    @XmlElement(name = "Birthdate", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String birthdate;

    /**
     * Gets the value of the personalID property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalIDType }
     *     
     */
    public PersonalIDType getPersonalID() {
        return personalID;
    }

    /**
     * Sets the value of the personalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalIDType }
     *     
     */
    public void setPersonalID(PersonalIDType value) {
        this.personalID = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

}
