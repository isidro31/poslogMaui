
package dtv.xcenter.poslog.ws.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateSold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InitialBalance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrentBalance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Authorization" type="{http://v21.ws.poslog.xcenter.dtv/}AuthorizationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCardType", propOrder = {
    "cardNumber",
    "dateSold",
    "initialBalance",
    "currentBalance",
    "authorization"
})
public class GiftCardType {

    @XmlElement(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlElement(name = "DateSold", required = true)
    protected String dateSold;
    @XmlElement(name = "InitialBalance", required = true)
    protected String initialBalance;
    @XmlElement(name = "CurrentBalance", required = true)
    protected String currentBalance;
    @XmlElement(name = "Authorization", required = true)
    protected AuthorizationType authorization;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the dateSold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSold() {
        return dateSold;
    }

    /**
     * Sets the value of the dateSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSold(String value) {
        this.dateSold = value;
    }

    /**
     * Gets the value of the initialBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialBalance() {
        return initialBalance;
    }

    /**
     * Sets the value of the initialBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialBalance(String value) {
        this.initialBalance = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentBalance(String value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType }
     *     
     */
    public AuthorizationType getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType }
     *     
     */
    public void setAuthorization(AuthorizationType value) {
        this.authorization = value;
    }

}
