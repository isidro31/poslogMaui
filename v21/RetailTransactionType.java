
package dtv.xcenter.poslog.ws.v21;

import java.math.BigDecimal;
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
import dtv.xcenter.poslog_ext.ws.v21.FlightInformation;
import dtv.xcenter.poslog_ext.ws.v21.PosTransactionPropertiesType;


/**
 * <p>Java class for RetailTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}OrganizationID" minOccurs="0"/>
 *         &lt;element name="RetailStoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkstationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}CashDrawerID" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessDayDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BeginDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}FiscalNumber" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DeviceId" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}FiscalSessionNumber" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PosTransactionProperties" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LineItem" type="{http://v21.ws.poslog.xcenter.dtv/}LineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://v21.ws.poslog.xcenter.dtv/}TotalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoundedTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerAccount" type="{http://v21.ws.poslog.xcenter.dtv/}CustomerAccountType" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://v21.ws.poslog.xcenter.dtv/}PoslogCustomerType" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}EmployeeSaleId" minOccurs="0"/>
 *         &lt;element name="TransactionLink" type="{http://v21.ws.poslog.xcenter.dtv/}TransactionLinkType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PostVoidReasonCode" minOccurs="0"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TransCancelReasonCode" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PostVoidComment" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}FlightInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailTransactionType", propOrder = {
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
    "lineItem",
    "total",
    "roundedTotal",
    "customerAccount",
    "customer",
    "employeeSaleId",
    "transactionLink",
    "postVoidReasonCode",
    "transCancelReasonCode",
    "postVoidComment",
    "flightInformation"
})
public class RetailTransactionType {

    @XmlElement(name = "OrganizationID", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigInteger organizationID;
    @XmlElement(name = "RetailStoreID")
    protected String retailStoreID;
    @XmlElement(name = "WorkstationID")
    protected String workstationID;
    @XmlElement(name = "TillID")
    protected String tillID;
    @XmlElement(name = "CashDrawerID", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String cashDrawerID;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "BusinessDayDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar businessDayDate;
    @XmlElement(name = "BeginDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDateTime;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "OperatorID")
    protected String operatorID;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "FiscalNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String fiscalNumber;
    @XmlElement(name = "DeviceId", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String deviceId;
    @XmlElement(name = "FiscalSessionNumber", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String fiscalSessionNumber;
    @XmlElement(name = "PosTransactionProperties", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected List<PosTransactionPropertiesType> posTransactionProperties;
    @XmlElement(name = "LineItem")
    protected List<LineItemType> lineItem;
    @XmlElement(name = "Total")
    protected List<TotalType> total;
    @XmlElement(name = "RoundedTotal")
    protected BigDecimal roundedTotal;
    @XmlElement(name = "CustomerAccount")
    protected CustomerAccountType customerAccount;
    @XmlElement(name = "Customer")
    protected PoslogCustomerType customer;
    @XmlElement(name = "EmployeeSaleId", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigInteger employeeSaleId;
    @XmlElement(name = "TransactionLink")
    protected TransactionLinkType transactionLink;
    @XmlElement(name = "PostVoidReasonCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String postVoidReasonCode;
    @XmlElement(name = "TransCancelReasonCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String transCancelReasonCode;
    @XmlElement(name = "PostVoidComment", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String postVoidComment;
    @XmlElement(name = "FlightInformation", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected FlightInformation flightInformation;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "TypeCode")
    protected String typeCode;
    @XmlAttribute(name = "TransactionStatus")
    protected String transactionStatus;

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
     * Gets the value of the lineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<LineItemType>();
        }
        return this.lineItem;
    }

    /**
     * Gets the value of the total property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the total property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalType }
     * 
     * 
     */
    public List<TotalType> getTotal() {
        if (total == null) {
            total = new ArrayList<TotalType>();
        }
        return this.total;
    }

    /**
     * Gets the value of the roundedTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundedTotal() {
        return roundedTotal;
    }

    /**
     * Sets the value of the roundedTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundedTotal(BigDecimal value) {
        this.roundedTotal = value;
    }

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountType }
     *     
     */
    public CustomerAccountType getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountType }
     *     
     */
    public void setCustomerAccount(CustomerAccountType value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link PoslogCustomerType }
     *     
     */
    public PoslogCustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoslogCustomerType }
     *     
     */
    public void setCustomer(PoslogCustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the employeeSaleId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeeSaleId() {
        return employeeSaleId;
    }

    /**
     * Sets the value of the employeeSaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeeSaleId(BigInteger value) {
        this.employeeSaleId = value;
    }

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

    /**
     * Gets the value of the transCancelReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransCancelReasonCode() {
        return transCancelReasonCode;
    }

    /**
     * Sets the value of the transCancelReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransCancelReasonCode(String value) {
        this.transCancelReasonCode = value;
    }

    /**
     * Gets the value of the postVoidComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostVoidComment() {
        return postVoidComment;
    }

    /**
     * Sets the value of the postVoidComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostVoidComment(String value) {
        this.postVoidComment = value;
    }

    /**
     * Gets the value of the flightInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInformation }
     *     
     */
    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    /**
     * Sets the value of the flightInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInformation }
     *     
     */
    public void setFlightInformation(FlightInformation value) {
        this.flightInformation = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

}
