
package dtv.xcenter.poslog.ws.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDebitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditDebitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="PrimaryAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WalletRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WalletProviderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReconciliationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}ExpirationDateEncrypted" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}MaskedCardNumber" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}AuthorizationToken" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}HashedCardNumber" minOccurs="0"/>
 *         &lt;element name="CustomerNotPresentReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDebitType", propOrder = {
    "primaryAccountNumber",
    "walletRequestId",
    "walletProviderId",
    "reconciliationCode",
    "expirationDateEncrypted",
    "maskedCardNumber",
    "authorizationToken",
    "hashedCardNumber",
    "customerNotPresentReasonCode"
})
public class CreditDebitType {

    @XmlElement(name = "PrimaryAccountNumber")
    protected String primaryAccountNumber;
    @XmlElement(name = "WalletRequestId")
    protected String walletRequestId;
    @XmlElement(name = "WalletProviderId")
    protected String walletProviderId;
    @XmlElement(name = "ReconciliationCode")
    protected String reconciliationCode;
    @XmlElement(name = "ExpirationDateEncrypted", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String expirationDateEncrypted;
    @XmlElement(name = "MaskedCardNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String maskedCardNumber;
    @XmlElement(name = "AuthorizationToken", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String authorizationToken;
    @XmlElement(name = "HashedCardNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String hashedCardNumber;
    @XmlElement(name = "CustomerNotPresentReasonCode")
    protected String customerNotPresentReasonCode;

    /**
     * Gets the value of the primaryAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountNumber() {
        return primaryAccountNumber;
    }

    /**
     * Sets the value of the primaryAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountNumber(String value) {
        this.primaryAccountNumber = value;
    }

    /**
     * Gets the value of the walletRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletRequestId() {
        return walletRequestId;
    }

    /**
     * Sets the value of the walletRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletRequestId(String value) {
        this.walletRequestId = value;
    }

    /**
     * Gets the value of the walletProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletProviderId() {
        return walletProviderId;
    }

    /**
     * Sets the value of the walletProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletProviderId(String value) {
        this.walletProviderId = value;
    }

    /**
     * Gets the value of the reconciliationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationCode() {
        return reconciliationCode;
    }

    /**
     * Sets the value of the reconciliationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationCode(String value) {
        this.reconciliationCode = value;
    }

    /**
     * Gets the value of the expirationDateEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDateEncrypted() {
        return expirationDateEncrypted;
    }

    /**
     * Sets the value of the expirationDateEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDateEncrypted(String value) {
        this.expirationDateEncrypted = value;
    }

    /**
     * Gets the value of the maskedCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * Sets the value of the maskedCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCardNumber(String value) {
        this.maskedCardNumber = value;
    }

    /**
     * Gets the value of the authorizationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationToken() {
        return authorizationToken;
    }

    /**
     * Sets the value of the authorizationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationToken(String value) {
        this.authorizationToken = value;
    }

    /**
     * Gets the value of the hashedCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedCardNumber() {
        return hashedCardNumber;
    }

    /**
     * Sets the value of the hashedCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedCardNumber(String value) {
        this.hashedCardNumber = value;
    }

    /**
     * Gets the value of the customerNotPresentReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNotPresentReasonCode() {
        return customerNotPresentReasonCode;
    }

    /**
     * Sets the value of the customerNotPresentReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNotPresentReasonCode(String value) {
        this.customerNotPresentReasonCode = value;
    }

}
