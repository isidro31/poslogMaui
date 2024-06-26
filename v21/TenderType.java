
package dtv.xcenter.poslog.ws.v21;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dtv.xcenter.poslog_ext.ws.v21.AccountCredit;
import dtv.xcenter.poslog_ext.ws.v21.LineItemPropertyType;
import dtv.xcenter.poslog_ext.ws.v21.PayDeductType;


/**
 * <p>Java class for TenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TenderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ForeignCurrency" type="{http://v21.ws.poslog.xcenter.dtv/}ForeignCurrencyType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://v21.ws.poslog.xcenter.dtv/}AmountType"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}FiscalTenderID" minOccurs="0"/>
 *         &lt;element name="Authorization" type="{http://v21.ws.poslog.xcenter.dtv/}AuthorizationType" minOccurs="0"/>
 *         &lt;element name="CustomerVerification" type="{http://v21.ws.poslog.xcenter.dtv/}CustomerVerificationType" minOccurs="0"/>
 *         &lt;element name="CreditDebit" type="{http://v21.ws.poslog.xcenter.dtv/}CreditDebitType" minOccurs="0"/>
 *         &lt;element name="GiftCard" type="{http://v21.ws.poslog.xcenter.dtv/}GiftCardType" minOccurs="0"/>
 *         &lt;element name="Voucher" type="{http://v21.ws.poslog.xcenter.dtv/}VoucherType" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PayDeduct" minOccurs="0"/>
 *         &lt;element name="Check" type="{http://v21.ws.poslog.xcenter.dtv/}CheckType" minOccurs="0"/>
 *         &lt;element name="Coupon" type="{http://v21.ws.poslog.xcenter.dtv/}CouponType" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}AccountCredit" minOccurs="0"/>
 *         &lt;element name="TravelersCheck" type="{http://v21.ws.poslog.xcenter.dtv/}TravelersCheckType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://v21.ws.poslog.xcenter.dtv/}AddressType" minOccurs="0"/>
 *         &lt;element name="SendCheck" type="{http://v21.ws.poslog.xcenter.dtv/}SendCheckType" minOccurs="0"/>
 *         &lt;element name="StoreAccount" type="{http://v21.ws.poslog.xcenter.dtv/}TenderAccountInfo" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}UserName" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PONumber" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}LineItemProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}SerialNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TenderType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{http://v21.ws.poslog-ext.xcenter.dtv/}ChangeFlag"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderType", propOrder = {
    "tenderID",
    "foreignCurrency",
    "amount",
    "fiscalTenderID",
    "authorization",
    "customerVerification",
    "creditDebit",
    "giftCard",
    "voucher",
    "payDeduct",
    "check",
    "coupon",
    "accountCredit",
    "travelersCheck",
    "address",
    "sendCheck",
    "storeAccount",
    "userName",
    "poNumber",
    "lineItemProperty",
    "serialNumber"
})
public class TenderType {

    @XmlElement(name = "TenderID", required = true)
    protected String tenderID;
    @XmlElement(name = "ForeignCurrency")
    protected ForeignCurrencyType foreignCurrency;
    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "FiscalTenderID", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String fiscalTenderID;
    @XmlElement(name = "Authorization")
    protected AuthorizationType authorization;
    @XmlElement(name = "CustomerVerification")
    protected CustomerVerificationType customerVerification;
    @XmlElement(name = "CreditDebit")
    protected CreditDebitType creditDebit;
    @XmlElement(name = "GiftCard")
    protected GiftCardType giftCard;
    @XmlElement(name = "Voucher")
    protected VoucherType voucher;
    @XmlElement(name = "PayDeduct", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected PayDeductType payDeduct;
    @XmlElement(name = "Check")
    protected CheckType check;
    @XmlElement(name = "Coupon")
    protected CouponType coupon;
    @XmlElement(name = "AccountCredit", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected AccountCredit accountCredit;
    @XmlElement(name = "TravelersCheck")
    protected TravelersCheckType travelersCheck;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "SendCheck")
    protected SendCheckType sendCheck;
    @XmlElement(name = "StoreAccount")
    protected TenderAccountInfo storeAccount;
    @XmlElement(name = "UserName", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String userName;
    @XmlElement(name = "PONumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String poNumber;
    @XmlElement(name = "LineItemProperty", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected List<LineItemPropertyType> lineItemProperty;
    @XmlElement(name = "SerialNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String serialNumber;
    @XmlAttribute(name = "TenderType")
    protected String tenderType;
    @XmlAttribute(name = "TypeCode")
    protected String typeCode;
    @XmlAttribute(name = "ChangeFlag", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected Boolean changeFlag;

    /**
     * Gets the value of the tenderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderID() {
        return tenderID;
    }

    /**
     * Sets the value of the tenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderID(String value) {
        this.tenderID = value;
    }

    /**
     * Gets the value of the foreignCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignCurrencyType }
     *     
     */
    public ForeignCurrencyType getForeignCurrency() {
        return foreignCurrency;
    }

    /**
     * Sets the value of the foreignCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignCurrencyType }
     *     
     */
    public void setForeignCurrency(ForeignCurrencyType value) {
        this.foreignCurrency = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the fiscalTenderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalTenderID() {
        return fiscalTenderID;
    }

    /**
     * Sets the value of the fiscalTenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalTenderID(String value) {
        this.fiscalTenderID = value;
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

    /**
     * Gets the value of the customerVerification property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerVerificationType }
     *     
     */
    public CustomerVerificationType getCustomerVerification() {
        return customerVerification;
    }

    /**
     * Sets the value of the customerVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerVerificationType }
     *     
     */
    public void setCustomerVerification(CustomerVerificationType value) {
        this.customerVerification = value;
    }

    /**
     * Gets the value of the creditDebit property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitType }
     *     
     */
    public CreditDebitType getCreditDebit() {
        return creditDebit;
    }

    /**
     * Sets the value of the creditDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitType }
     *     
     */
    public void setCreditDebit(CreditDebitType value) {
        this.creditDebit = value;
    }

    /**
     * Gets the value of the giftCard property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardType }
     *     
     */
    public GiftCardType getGiftCard() {
        return giftCard;
    }

    /**
     * Sets the value of the giftCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardType }
     *     
     */
    public void setGiftCard(GiftCardType value) {
        this.giftCard = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherType }
     *     
     */
    public VoucherType getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherType }
     *     
     */
    public void setVoucher(VoucherType value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the payDeduct property.
     * 
     * @return
     *     possible object is
     *     {@link PayDeductType }
     *     
     */
    public PayDeductType getPayDeduct() {
        return payDeduct;
    }

    /**
     * Sets the value of the payDeduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayDeductType }
     *     
     */
    public void setPayDeduct(PayDeductType value) {
        this.payDeduct = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link CheckType }
     *     
     */
    public CheckType getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckType }
     *     
     */
    public void setCheck(CheckType value) {
        this.check = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link CouponType }
     *     
     */
    public CouponType getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponType }
     *     
     */
    public void setCoupon(CouponType value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the accountCredit property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCredit }
     *     
     */
    public AccountCredit getAccountCredit() {
        return accountCredit;
    }

    /**
     * Sets the value of the accountCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCredit }
     *     
     */
    public void setAccountCredit(AccountCredit value) {
        this.accountCredit = value;
    }

    /**
     * Gets the value of the travelersCheck property.
     * 
     * @return
     *     possible object is
     *     {@link TravelersCheckType }
     *     
     */
    public TravelersCheckType getTravelersCheck() {
        return travelersCheck;
    }

    /**
     * Sets the value of the travelersCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelersCheckType }
     *     
     */
    public void setTravelersCheck(TravelersCheckType value) {
        this.travelersCheck = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the sendCheck property.
     * 
     * @return
     *     possible object is
     *     {@link SendCheckType }
     *     
     */
    public SendCheckType getSendCheck() {
        return sendCheck;
    }

    /**
     * Sets the value of the sendCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendCheckType }
     *     
     */
    public void setSendCheck(SendCheckType value) {
        this.sendCheck = value;
    }

    /**
     * Gets the value of the storeAccount property.
     * 
     * @return
     *     possible object is
     *     {@link TenderAccountInfo }
     *     
     */
    public TenderAccountInfo getStoreAccount() {
        return storeAccount;
    }

    /**
     * Sets the value of the storeAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderAccountInfo }
     *     
     */
    public void setStoreAccount(TenderAccountInfo value) {
        this.storeAccount = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the lineItemProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemPropertyType }
     * 
     * 
     */
    public List<LineItemPropertyType> getLineItemProperty() {
        if (lineItemProperty == null) {
            lineItemProperty = new ArrayList<LineItemPropertyType>();
        }
        return this.lineItemProperty;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the tenderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderType() {
        return tenderType;
    }

    /**
     * Sets the value of the tenderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderType(String value) {
        this.tenderType = value;
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

    /**
     * Gets the value of the changeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeFlag() {
        return changeFlag;
    }

    /**
     * Sets the value of the changeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeFlag(Boolean value) {
        this.changeFlag = value;
    }

}
