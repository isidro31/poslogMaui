
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
import dtv.xcenter.poslog_ext.ws.v21.AssociateAdvance;
import dtv.xcenter.poslog_ext.ws.v21.TillCountType;


/**
 * <p>Java class for TenderControlTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderControlTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}AssignTillTenderTransfer" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}BeginTillCount" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}MidDayTillDeposit" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TillClosingCount" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TillReconcileCount" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}BankDeposit" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}LocalCurrencyPickup" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}CashTransfer" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}LocalCurrencyDeposit" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TillAudit" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}StoreBankAudit" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}SafeBagAddFunds" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DeclareSafeBag" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}StartRemoteCount" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}EndRemoteCount" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}AssociateAdvance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="PaidIn" type="{http://v21.ws.poslog.xcenter.dtv/}PaidInOutType"/>
 *           &lt;element name="PaidOut" type="{http://v21.ws.poslog.xcenter.dtv/}PaidInOutType"/>
 *         &lt;/choice>
 *         &lt;element name="GLAccountNumber" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderControlTransactionType", propOrder = {
    "operatorID",
    "assignTillTenderTransfer",
    "beginTillCount",
    "midDayTillDeposit",
    "tillClosingCount",
    "tillReconcileCount",
    "bankDeposit",
    "localCurrencyPickup",
    "cashTransfer",
    "localCurrencyDeposit",
    "tillAudit",
    "storeBankAudit",
    "safeBagAddFunds",
    "declareSafeBag",
    "startRemoteCount",
    "endRemoteCount",
    "associateAdvance",
    "paidIn",
    "paidOut",
    "glAccountNumber",
    "comment"
})
public class TenderControlTransactionType {

    @XmlElement(name = "OperatorID", required = true)
    protected String operatorID;
    @XmlElement(name = "AssignTillTenderTransfer", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType assignTillTenderTransfer;
    @XmlElement(name = "BeginTillCount", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType beginTillCount;
    @XmlElement(name = "MidDayTillDeposit", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType midDayTillDeposit;
    @XmlElement(name = "TillClosingCount", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType tillClosingCount;
    @XmlElement(name = "TillReconcileCount", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType tillReconcileCount;
    @XmlElement(name = "BankDeposit", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType bankDeposit;
    @XmlElement(name = "LocalCurrencyPickup", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType localCurrencyPickup;
    @XmlElement(name = "CashTransfer", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType cashTransfer;
    @XmlElement(name = "LocalCurrencyDeposit", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType localCurrencyDeposit;
    @XmlElement(name = "TillAudit", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType tillAudit;
    @XmlElement(name = "StoreBankAudit", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType storeBankAudit;
    @XmlElement(name = "SafeBagAddFunds", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType safeBagAddFunds;
    @XmlElement(name = "DeclareSafeBag", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType declareSafeBag;
    @XmlElement(name = "StartRemoteCount", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType startRemoteCount;
    @XmlElement(name = "EndRemoteCount", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TillCountType endRemoteCount;
    @XmlElement(name = "AssociateAdvance", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected List<AssociateAdvance> associateAdvance;
    @XmlElement(name = "PaidIn")
    protected PaidInOutType paidIn;
    @XmlElement(name = "PaidOut")
    protected PaidInOutType paidOut;
    @XmlElement(name = "GLAccountNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String glAccountNumber;
    @XmlElement(name = "Comment")
    protected String comment;

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
     * Gets the value of the assignTillTenderTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getAssignTillTenderTransfer() {
        return assignTillTenderTransfer;
    }

    /**
     * Sets the value of the assignTillTenderTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setAssignTillTenderTransfer(TillCountType value) {
        this.assignTillTenderTransfer = value;
    }

    /**
     * Gets the value of the beginTillCount property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getBeginTillCount() {
        return beginTillCount;
    }

    /**
     * Sets the value of the beginTillCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setBeginTillCount(TillCountType value) {
        this.beginTillCount = value;
    }

    /**
     * Gets the value of the midDayTillDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getMidDayTillDeposit() {
        return midDayTillDeposit;
    }

    /**
     * Sets the value of the midDayTillDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setMidDayTillDeposit(TillCountType value) {
        this.midDayTillDeposit = value;
    }

    /**
     * Gets the value of the tillClosingCount property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getTillClosingCount() {
        return tillClosingCount;
    }

    /**
     * Sets the value of the tillClosingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setTillClosingCount(TillCountType value) {
        this.tillClosingCount = value;
    }

    /**
     * Gets the value of the tillReconcileCount property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getTillReconcileCount() {
        return tillReconcileCount;
    }

    /**
     * Sets the value of the tillReconcileCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setTillReconcileCount(TillCountType value) {
        this.tillReconcileCount = value;
    }

    /**
     * Gets the value of the bankDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getBankDeposit() {
        return bankDeposit;
    }

    /**
     * Sets the value of the bankDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setBankDeposit(TillCountType value) {
        this.bankDeposit = value;
    }

    /**
     * Gets the value of the localCurrencyPickup property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getLocalCurrencyPickup() {
        return localCurrencyPickup;
    }

    /**
     * Sets the value of the localCurrencyPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setLocalCurrencyPickup(TillCountType value) {
        this.localCurrencyPickup = value;
    }

    /**
     * Gets the value of the cashTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getCashTransfer() {
        return cashTransfer;
    }

    /**
     * Sets the value of the cashTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setCashTransfer(TillCountType value) {
        this.cashTransfer = value;
    }

    /**
     * Gets the value of the localCurrencyDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getLocalCurrencyDeposit() {
        return localCurrencyDeposit;
    }

    /**
     * Sets the value of the localCurrencyDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setLocalCurrencyDeposit(TillCountType value) {
        this.localCurrencyDeposit = value;
    }

    /**
     * Gets the value of the tillAudit property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getTillAudit() {
        return tillAudit;
    }

    /**
     * Sets the value of the tillAudit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setTillAudit(TillCountType value) {
        this.tillAudit = value;
    }

    /**
     * Gets the value of the storeBankAudit property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getStoreBankAudit() {
        return storeBankAudit;
    }

    /**
     * Sets the value of the storeBankAudit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setStoreBankAudit(TillCountType value) {
        this.storeBankAudit = value;
    }

    /**
     * Gets the value of the safeBagAddFunds property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getSafeBagAddFunds() {
        return safeBagAddFunds;
    }

    /**
     * Sets the value of the safeBagAddFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setSafeBagAddFunds(TillCountType value) {
        this.safeBagAddFunds = value;
    }

    /**
     * Gets the value of the declareSafeBag property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getDeclareSafeBag() {
        return declareSafeBag;
    }

    /**
     * Sets the value of the declareSafeBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setDeclareSafeBag(TillCountType value) {
        this.declareSafeBag = value;
    }

    /**
     * Gets the value of the startRemoteCount property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getStartRemoteCount() {
        return startRemoteCount;
    }

    /**
     * Sets the value of the startRemoteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setStartRemoteCount(TillCountType value) {
        this.startRemoteCount = value;
    }

    /**
     * Gets the value of the endRemoteCount property.
     * 
     * @return
     *     possible object is
     *     {@link TillCountType }
     *     
     */
    public TillCountType getEndRemoteCount() {
        return endRemoteCount;
    }

    /**
     * Sets the value of the endRemoteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillCountType }
     *     
     */
    public void setEndRemoteCount(TillCountType value) {
        this.endRemoteCount = value;
    }

    /**
     * Gets the value of the associateAdvance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associateAdvance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociateAdvance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociateAdvance }
     * 
     * 
     */
    public List<AssociateAdvance> getAssociateAdvance() {
        if (associateAdvance == null) {
            associateAdvance = new ArrayList<AssociateAdvance>();
        }
        return this.associateAdvance;
    }

    /**
     * Gets the value of the paidIn property.
     * 
     * @return
     *     possible object is
     *     {@link PaidInOutType }
     *     
     */
    public PaidInOutType getPaidIn() {
        return paidIn;
    }

    /**
     * Sets the value of the paidIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidInOutType }
     *     
     */
    public void setPaidIn(PaidInOutType value) {
        this.paidIn = value;
    }

    /**
     * Gets the value of the paidOut property.
     * 
     * @return
     *     possible object is
     *     {@link PaidInOutType }
     *     
     */
    public PaidInOutType getPaidOut() {
        return paidOut;
    }

    /**
     * Sets the value of the paidOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidInOutType }
     *     
     */
    public void setPaidOut(PaidInOutType value) {
        this.paidOut = value;
    }

    /**
     * Gets the value of the glAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLAccountNumber() {
        return glAccountNumber;
    }

    /**
     * Sets the value of the glAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLAccountNumber(String value) {
        this.glAccountNumber = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
