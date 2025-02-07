
package dtv.xcenter.poslog.ws.v21;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import dtv.xcenter.poslog_ext.ws.v21.ForeignCurrencyExchangeRate;
import dtv.xcenter.poslog_ext.ws.v21.PosTransactionPropertiesType;
import dtv.xcenter.poslog_ext.ws.v21.TimeClockTransaction;
import dtv.xcenter.poslog_ext.ws.v21.TrainingModeTransaction;


/**
 * <p>Java class for TransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}OrganizationID"/>
 *         &lt;element name="RetailStoreID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkstationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}CashDrawerID" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessDayDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BeginDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}FiscalNumber" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DeviceId" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}FiscalSessionNumber" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PosTransactionProperties" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}ForeignCurrencyExchangeRate"/>
 *           &lt;element name="TenderControlTransaction" type="{http://v21.ws.poslog.xcenter.dtv/}TenderControlTransactionType"/>
 *           &lt;element name="TillControlTransaction" type="{http://v21.ws.poslog.xcenter.dtv/}TillControlTransactionType"/>
 *           &lt;element name="TenderExchange" type="{http://v21.ws.poslog.xcenter.dtv/}TenderExchangeType"/>
 *           &lt;element name="ControlTransaction" type="{http://v21.ws.poslog.xcenter.dtv/}ControlTransactionType"/>
 *           &lt;element name="EscrowTransaction" type="{http://v21.ws.poslog.xcenter.dtv/}EscrowTransactionType"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TimeClockTransaction"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TrainingModeTransaction"/>
 *           &lt;element name="POSLogControlTransaction" type="{http://v21.ws.poslog.xcenter.dtv/}POSLogControlTransactionType"/>
 *           &lt;element name="InventoryTransaction" type="{http://v21.ws.poslog.xcenter.dtv/}InventoryTransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="RetailTransaction" type="{http://v21.ws.poslog.xcenter.dtv/}RetailTransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CancelFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TrainingModeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfflineFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TransactionType"/>
 *       &lt;attribute ref="{http://v21.ws.poslog-ext.xcenter.dtv/}AppVersion"/>
 *       &lt;attribute ref="{http://v21.ws.poslog-ext.xcenter.dtv/}crossChannelReturn"/>
 *       &lt;attribute ref="{http://v21.ws.poslog-ext.xcenter.dtv/}InventoryDocumentSubType"/>
 *       &lt;attribute ref="{http://v21.ws.poslog-ext.xcenter.dtv/}InventoryDocumentType"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType", propOrder = {
    "organizationID",
    "retailStoreID",
    "workstationID",
    "tillID",
    "cashDrawerID",
    "sequenceNumber",
    "businessDayDate",
    "beginDateTime",
    "endDateTime",
    "operatorID",
    "currencyCode",
    "fiscalNumber",
    "deviceId",
    "fiscalSessionNumber",
    "posTransactionProperties",
    "foreignCurrencyExchangeRate",
    "tenderControlTransaction",
    "tillControlTransaction",
    "tenderExchange",
    "controlTransaction",
    "escrowTransaction",
    "timeClockTransaction",
    "trainingModeTransaction",
    "posLogControlTransaction",
    "inventoryTransaction",
    "retailTransaction"
})
public class TransactionType {

    @XmlElement(name = "OrganizationID", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/", required = true)
    protected BigInteger organizationID;
    @XmlElement(name = "RetailStoreID", required = true)
    protected String retailStoreID;
    @XmlElement(name = "WorkstationID", required = true)
    protected String workstationID;
    @XmlElement(name = "TillID")
    protected String tillID;
    @XmlElement(name = "CashDrawerID", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String cashDrawerID;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElement(name = "BusinessDayDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar businessDayDate;
    @XmlElement(name = "BeginDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDateTime;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "OperatorID")
    protected String operatorID;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "FiscalNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String fiscalNumber;
    @XmlElement(name = "DeviceId", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String deviceId;
    @XmlElement(name = "FiscalSessionNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String fiscalSessionNumber;
    @XmlElement(name = "PosTransactionProperties", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected List<PosTransactionPropertiesType> posTransactionProperties;
    @XmlElement(name = "ForeignCurrencyExchangeRate", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected ForeignCurrencyExchangeRate foreignCurrencyExchangeRate;
    @XmlElement(name = "TenderControlTransaction")
    protected TenderControlTransactionType tenderControlTransaction;
    @XmlElement(name = "TillControlTransaction")
    protected TillControlTransactionType tillControlTransaction;
    @XmlElement(name = "TenderExchange")
    protected TenderExchangeType tenderExchange;
    @XmlElement(name = "ControlTransaction")
    protected ControlTransactionType controlTransaction;
    @XmlElement(name = "EscrowTransaction")
    protected EscrowTransactionType escrowTransaction;
    @XmlElement(name = "TimeClockTransaction", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TimeClockTransaction timeClockTransaction;
    @XmlElement(name = "TrainingModeTransaction", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TrainingModeTransaction trainingModeTransaction;
    @XmlElement(name = "POSLogControlTransaction")
    protected POSLogControlTransactionType posLogControlTransaction;
    @XmlElement(name = "InventoryTransaction")
    protected List<InventoryTransactionType> inventoryTransaction;
    @XmlElement(name = "RetailTransaction")
    protected RetailTransactionType retailTransaction;
    @XmlAttribute(name = "CancelFlag")
    protected Boolean cancelFlag;
    @XmlAttribute(name = "TrainingModeFlag")
    protected Boolean trainingModeFlag;
    @XmlAttribute(name = "OfflineFlag")
    protected Boolean offlineFlag;
    @XmlAttribute(name = "TransactionType", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String transactionType;
    @XmlAttribute(name = "AppVersion", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String appVersion;
    @XmlAttribute(name = "crossChannelReturn", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected Boolean crossChannelReturn;
    @XmlAttribute(name = "InventoryDocumentSubType", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String inventoryDocumentSubType;
    @XmlAttribute(name = "InventoryDocumentType", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String inventoryDocumentType;

    /**
     * Gets the value of the organizationID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the value of the organizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrganizationID(BigInteger value) {
        this.organizationID = value;
    }

    /**
     * Gets the value of the retailStoreID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailStoreID() {
        return retailStoreID;
    }

    /**
     * Sets the value of the retailStoreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailStoreID(String value) {
        this.retailStoreID = value;
    }

    /**
     * Gets the value of the workstationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstationID() {
        return workstationID;
    }

    /**
     * Sets the value of the workstationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstationID(String value) {
        this.workstationID = value;
    }

    /**
     * Gets the value of the tillID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTillID() {
        return tillID;
    }

    /**
     * Sets the value of the tillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTillID(String value) {
        this.tillID = value;
    }

    /**
     * Gets the value of the cashDrawerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashDrawerID() {
        return cashDrawerID;
    }

    /**
     * Sets the value of the cashDrawerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashDrawerID(String value) {
        this.cashDrawerID = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the businessDayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBusinessDayDate() {
        return businessDayDate;
    }

    /**
     * Sets the value of the businessDayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBusinessDayDate(XMLGregorianCalendar value) {
        this.businessDayDate = value;
    }

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDateTime(XMLGregorianCalendar value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the fiscalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalNumber() {
        return fiscalNumber;
    }

    /**
     * Sets the value of the fiscalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalNumber(String value) {
        this.fiscalNumber = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the fiscalSessionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalSessionNumber() {
        return fiscalSessionNumber;
    }

    /**
     * Sets the value of the fiscalSessionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalSessionNumber(String value) {
        this.fiscalSessionNumber = value;
    }

    /**
     * Gets the value of the posTransactionProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posTransactionProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosTransactionProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PosTransactionPropertiesType }
     * 
     * 
     */
    public List<PosTransactionPropertiesType> getPosTransactionProperties() {
        if (posTransactionProperties == null) {
            posTransactionProperties = new ArrayList<PosTransactionPropertiesType>();
        }
        return this.posTransactionProperties;
    }

    /**
     * Gets the value of the foreignCurrencyExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignCurrencyExchangeRate }
     *     
     */
    public ForeignCurrencyExchangeRate getForeignCurrencyExchangeRate() {
        return foreignCurrencyExchangeRate;
    }

    /**
     * Sets the value of the foreignCurrencyExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignCurrencyExchangeRate }
     *     
     */
    public void setForeignCurrencyExchangeRate(ForeignCurrencyExchangeRate value) {
        this.foreignCurrencyExchangeRate = value;
    }

    /**
     * Gets the value of the tenderControlTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link TenderControlTransactionType }
     *     
     */
    public TenderControlTransactionType getTenderControlTransaction() {
        return tenderControlTransaction;
    }

    /**
     * Sets the value of the tenderControlTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderControlTransactionType }
     *     
     */
    public void setTenderControlTransaction(TenderControlTransactionType value) {
        this.tenderControlTransaction = value;
    }

    /**
     * Gets the value of the tillControlTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link TillControlTransactionType }
     *     
     */
    public TillControlTransactionType getTillControlTransaction() {
        return tillControlTransaction;
    }

    /**
     * Sets the value of the tillControlTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TillControlTransactionType }
     *     
     */
    public void setTillControlTransaction(TillControlTransactionType value) {
        this.tillControlTransaction = value;
    }

    /**
     * Gets the value of the tenderExchange property.
     * 
     * @return
     *     possible object is
     *     {@link TenderExchangeType }
     *     
     */
    public TenderExchangeType getTenderExchange() {
        return tenderExchange;
    }

    /**
     * Sets the value of the tenderExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderExchangeType }
     *     
     */
    public void setTenderExchange(TenderExchangeType value) {
        this.tenderExchange = value;
    }

    /**
     * Gets the value of the controlTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link ControlTransactionType }
     *     
     */
    public ControlTransactionType getControlTransaction() {
        return controlTransaction;
    }

    /**
     * Sets the value of the controlTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlTransactionType }
     *     
     */
    public void setControlTransaction(ControlTransactionType value) {
        this.controlTransaction = value;
    }

    /**
     * Gets the value of the escrowTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link EscrowTransactionType }
     *     
     */
    public EscrowTransactionType getEscrowTransaction() {
        return escrowTransaction;
    }

    /**
     * Sets the value of the escrowTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrowTransactionType }
     *     
     */
    public void setEscrowTransaction(EscrowTransactionType value) {
        this.escrowTransaction = value;
    }

    /**
     * Gets the value of the timeClockTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link TimeClockTransaction }
     *     
     */
    public TimeClockTransaction getTimeClockTransaction() {
        return timeClockTransaction;
    }

    /**
     * Sets the value of the timeClockTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeClockTransaction }
     *     
     */
    public void setTimeClockTransaction(TimeClockTransaction value) {
        this.timeClockTransaction = value;
    }

    /**
     * Gets the value of the trainingModeTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingModeTransaction }
     *     
     */
    public TrainingModeTransaction getTrainingModeTransaction() {
        return trainingModeTransaction;
    }

    /**
     * Sets the value of the trainingModeTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingModeTransaction }
     *     
     */
    public void setTrainingModeTransaction(TrainingModeTransaction value) {
        this.trainingModeTransaction = value;
    }

    /**
     * Gets the value of the posLogControlTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link POSLogControlTransactionType }
     *     
     */
    public POSLogControlTransactionType getPOSLogControlTransaction() {
        return posLogControlTransaction;
    }

    /**
     * Sets the value of the posLogControlTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSLogControlTransactionType }
     *     
     */
    public void setPOSLogControlTransaction(POSLogControlTransactionType value) {
        this.posLogControlTransaction = value;
    }

    /**
     * Gets the value of the inventoryTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryTransactionType }
     * 
     * 
     */
    public List<InventoryTransactionType> getInventoryTransaction() {
        if (inventoryTransaction == null) {
            inventoryTransaction = new ArrayList<InventoryTransactionType>();
        }
        return this.inventoryTransaction;
    }

    /**
     * Gets the value of the retailTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link RetailTransactionType }
     *     
     */
    public RetailTransactionType getRetailTransaction() {
        return retailTransaction;
    }

    /**
     * Sets the value of the retailTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailTransactionType }
     *     
     */
    public void setRetailTransaction(RetailTransactionType value) {
        this.retailTransaction = value;
    }

    /**
     * Gets the value of the cancelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelFlag() {
        return cancelFlag;
    }

    /**
     * Sets the value of the cancelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelFlag(Boolean value) {
        this.cancelFlag = value;
    }

    /**
     * Gets the value of the trainingModeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrainingModeFlag() {
        return trainingModeFlag;
    }

    /**
     * Sets the value of the trainingModeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrainingModeFlag(Boolean value) {
        this.trainingModeFlag = value;
    }

    /**
     * Gets the value of the offlineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfflineFlag() {
        return offlineFlag;
    }

    /**
     * Sets the value of the offlineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfflineFlag(Boolean value) {
        this.offlineFlag = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the appVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * Sets the value of the appVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVersion(String value) {
        this.appVersion = value;
    }

    /**
     * Gets the value of the crossChannelReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossChannelReturn() {
        return crossChannelReturn;
    }

    /**
     * Sets the value of the crossChannelReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossChannelReturn(Boolean value) {
        this.crossChannelReturn = value;
    }

    /**
     * Gets the value of the inventoryDocumentSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryDocumentSubType() {
        return inventoryDocumentSubType;
    }

    /**
     * Sets the value of the inventoryDocumentSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryDocumentSubType(String value) {
        this.inventoryDocumentSubType = value;
    }

    /**
     * Gets the value of the inventoryDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryDocumentType() {
        return inventoryDocumentType;
    }

    /**
     * Sets the value of the inventoryDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryDocumentType(String value) {
        this.inventoryDocumentType = value;
    }

}
