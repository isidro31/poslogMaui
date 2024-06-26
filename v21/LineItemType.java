
package dtv.xcenter.poslog.ws.v21;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import dtv.xcenter.poslog_ext.ws.v21.Coupon;
import dtv.xcenter.poslog_ext.ws.v21.TransactionDeal;


/**
 * <p>Java class for LineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeginDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Layaway" type="{http://v21.ws.poslog.xcenter.dtv/}LayawayType" minOccurs="0"/>
 *         &lt;element name="PreviousLayaway" type="{http://v21.ws.poslog.xcenter.dtv/}PreviousLayawayType" minOccurs="0"/>
 *         &lt;element name="PreviousCustomerOrder" type="{http://v21.ws.poslog.xcenter.dtv/}PreviousCustomerOrderType" minOccurs="0"/>
 *         &lt;element name="CustomerOrderForDelivery" type="{http://v21.ws.poslog.xcenter.dtv/}CustomerOrderForDeliveryType" minOccurs="0"/>
 *         &lt;element name="CustomerOrderForPickup" type="{http://v21.ws.poslog.xcenter.dtv/}CustomerOrderForPickupType" minOccurs="0"/>
 *         &lt;element name="Return" type="{http://v21.ws.poslog.xcenter.dtv/}ReturnType" minOccurs="0"/>
 *         &lt;element name="SaleForDelivery" type="{http://v21.ws.poslog.xcenter.dtv/}SaleForDeliveryType" minOccurs="0"/>
 *         &lt;element name="Sale" type="{http://v21.ws.poslog.xcenter.dtv/}SaleType" minOccurs="0"/>
 *         &lt;element name="Exchange" type="{http://v21.ws.poslog.xcenter.dtv/}ExchangeType" minOccurs="0"/>
 *         &lt;element name="Tender" type="{http://v21.ws.poslog.xcenter.dtv/}TenderType" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}Coupon" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TransactionDeal" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DocumentType"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}DocumentId"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}SeriesId"/>
 *           &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}ActivityCode"/>
 *         &lt;/sequence>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}QuantityShipped" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="SerialNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="EnteredItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="ActualCount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="ExpectedCount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="PostedCount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="SaleLineItem" type="{http://v21.ws.poslog.xcenter.dtv/}SaleLineItemType"/>
 *         &lt;/sequence>
 *         &lt;element name="RecordCreationType" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="ItemAccountModifier" type="{http://v21.ws.poslog.xcenter.dtv/}ItemAccountModifierType" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://v21.ws.poslog.xcenter.dtv/}TaxType" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://v21.ws.poslog.xcenter.dtv/}DiscountType" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="QuantityOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="QuantityReceived" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="CartonNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="LineItemNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *         &lt;element name="PaymentOnAccount" type="{http://v21.ws.poslog.xcenter.dtv/}PaymentOnAccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EntryMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VoidFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemType", propOrder = {
    "sequenceNumber",
    "beginDateTime",
    "endDateTime",
    "layaway",
    "previousLayaway",
    "previousCustomerOrder",
    "customerOrderForDelivery",
    "customerOrderForPickup",
    "_return",
    "saleForDelivery",
    "sale",
    "exchange",
    "tender",
    "coupon",
    "transactionDeal",
    "documentType",
    "documentId",
    "seriesId",
    "activityCode",
    "lineNumber",
    "itemID",
    "quantityShipped",
    "serialNumbers",
    "enteredItemID",
    "typeCode",
    "actualCount",
    "expectedCount",
    "postedCount",
    "saleLineItem",
    "recordCreationType",
    "statusCode",
    "itemAccountModifier",
    "tax",
    "discount",
    "quantityOrdered",
    "quantityReceived",
    "cartonNumber",
    "lineItemNumber",
    "description",
    "paymentOnAccount"
})
public class LineItemType {

    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "BeginDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDateTime;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "Layaway")
    protected LayawayType layaway;
    @XmlElement(name = "PreviousLayaway")
    protected PreviousLayawayType previousLayaway;
    @XmlElement(name = "PreviousCustomerOrder")
    protected PreviousCustomerOrderType previousCustomerOrder;
    @XmlElement(name = "CustomerOrderForDelivery")
    protected CustomerOrderForDeliveryType customerOrderForDelivery;
    @XmlElement(name = "CustomerOrderForPickup")
    protected CustomerOrderForPickupType customerOrderForPickup;
    @XmlElement(name = "Return")
    protected ReturnType _return;
    @XmlElement(name = "SaleForDelivery")
    protected SaleForDeliveryType saleForDelivery;
    @XmlElement(name = "Sale")
    protected SaleType sale;
    @XmlElement(name = "Exchange")
    protected ExchangeType exchange;
    @XmlElement(name = "Tender")
    protected TenderType tender;
    @XmlElement(name = "Coupon", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected Coupon coupon;
    @XmlElement(name = "TransactionDeal", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected TransactionDeal transactionDeal;
    @XmlElement(name = "DocumentType", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String documentType;
    @XmlElement(name = "DocumentId", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String documentId;
    @XmlElement(name = "SeriesId", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String seriesId;
    @XmlElement(name = "ActivityCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String activityCode;
    @XmlElement(name = "LineNumber")
    protected BigInteger lineNumber;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "QuantityShipped", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigDecimal quantityShipped;
    @XmlElement(name = "SerialNumbers")
    protected String serialNumbers;
    @XmlElement(name = "EnteredItemID")
    protected String enteredItemID;
    @XmlElement(name = "TypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String typeCode;
    @XmlElement(name = "ActualCount")
    protected BigDecimal actualCount;
    @XmlElement(name = "ExpectedCount")
    protected BigDecimal expectedCount;
    @XmlElement(name = "PostedCount")
    protected BigDecimal postedCount;
    @XmlElement(name = "SaleLineItem")
    protected SaleLineItemType saleLineItem;
    @XmlElement(name = "RecordCreationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String recordCreationType;
    @XmlElement(name = "StatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String statusCode;
    @XmlElement(name = "ItemAccountModifier")
    protected ItemAccountModifierType itemAccountModifier;
    @XmlElement(name = "Tax")
    protected TaxType tax;
    @XmlElement(name = "Discount")
    protected DiscountType discount;
    @XmlElement(name = "QuantityOrdered")
    protected BigDecimal quantityOrdered;
    @XmlElement(name = "QuantityReceived")
    protected BigDecimal quantityReceived;
    @XmlElement(name = "CartonNumber")
    protected String cartonNumber;
    @XmlElement(name = "LineItemNumber")
    protected BigInteger lineItemNumber;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PaymentOnAccount")
    protected PaymentOnAccountType paymentOnAccount;
    @XmlAttribute(name = "EntryMethod")
    protected String entryMethod;
    @XmlAttribute(name = "VoidFlag")
    protected Boolean voidFlag;

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
     * Gets the value of the layaway property.
     * 
     * @return
     *     possible object is
     *     {@link LayawayType }
     *     
     */
    public LayawayType getLayaway() {
        return layaway;
    }

    /**
     * Sets the value of the layaway property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayawayType }
     *     
     */
    public void setLayaway(LayawayType value) {
        this.layaway = value;
    }

    /**
     * Gets the value of the previousLayaway property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousLayawayType }
     *     
     */
    public PreviousLayawayType getPreviousLayaway() {
        return previousLayaway;
    }

    /**
     * Sets the value of the previousLayaway property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousLayawayType }
     *     
     */
    public void setPreviousLayaway(PreviousLayawayType value) {
        this.previousLayaway = value;
    }

    /**
     * Gets the value of the previousCustomerOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousCustomerOrderType }
     *     
     */
    public PreviousCustomerOrderType getPreviousCustomerOrder() {
        return previousCustomerOrder;
    }

    /**
     * Sets the value of the previousCustomerOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousCustomerOrderType }
     *     
     */
    public void setPreviousCustomerOrder(PreviousCustomerOrderType value) {
        this.previousCustomerOrder = value;
    }

    /**
     * Gets the value of the customerOrderForDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderForDeliveryType }
     *     
     */
    public CustomerOrderForDeliveryType getCustomerOrderForDelivery() {
        return customerOrderForDelivery;
    }

    /**
     * Sets the value of the customerOrderForDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderForDeliveryType }
     *     
     */
    public void setCustomerOrderForDelivery(CustomerOrderForDeliveryType value) {
        this.customerOrderForDelivery = value;
    }

    /**
     * Gets the value of the customerOrderForPickup property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderForPickupType }
     *     
     */
    public CustomerOrderForPickupType getCustomerOrderForPickup() {
        return customerOrderForPickup;
    }

    /**
     * Sets the value of the customerOrderForPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderForPickupType }
     *     
     */
    public void setCustomerOrderForPickup(CustomerOrderForPickupType value) {
        this.customerOrderForPickup = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnType }
     *     
     */
    public ReturnType getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnType }
     *     
     */
    public void setReturn(ReturnType value) {
        this._return = value;
    }

    /**
     * Gets the value of the saleForDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link SaleForDeliveryType }
     *     
     */
    public SaleForDeliveryType getSaleForDelivery() {
        return saleForDelivery;
    }

    /**
     * Sets the value of the saleForDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleForDeliveryType }
     *     
     */
    public void setSaleForDelivery(SaleForDeliveryType value) {
        this.saleForDelivery = value;
    }

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link SaleType }
     *     
     */
    public SaleType getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleType }
     *     
     */
    public void setSale(SaleType value) {
        this.sale = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeType }
     *     
     */
    public ExchangeType getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeType }
     *     
     */
    public void setExchange(ExchangeType value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the tender property.
     * 
     * @return
     *     possible object is
     *     {@link TenderType }
     *     
     */
    public TenderType getTender() {
        return tender;
    }

    /**
     * Sets the value of the tender property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderType }
     *     
     */
    public void setTender(TenderType value) {
        this.tender = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link Coupon }
     *     
     */
    public Coupon getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coupon }
     *     
     */
    public void setCoupon(Coupon value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the transactionDeal property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDeal }
     *     
     */
    public TransactionDeal getTransactionDeal() {
        return transactionDeal;
    }

    /**
     * Sets the value of the transactionDeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDeal }
     *     
     */
    public void setTransactionDeal(TransactionDeal value) {
        this.transactionDeal = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the seriesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesId() {
        return seriesId;
    }

    /**
     * Sets the value of the seriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesId(String value) {
        this.seriesId = value;
    }

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the quantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Sets the value of the quantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityShipped(BigDecimal value) {
        this.quantityShipped = value;
    }

    /**
     * Gets the value of the serialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * Sets the value of the serialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumbers(String value) {
        this.serialNumbers = value;
    }

    /**
     * Gets the value of the enteredItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnteredItemID() {
        return enteredItemID;
    }

    /**
     * Sets the value of the enteredItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnteredItemID(String value) {
        this.enteredItemID = value;
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
     * Gets the value of the actualCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualCount() {
        return actualCount;
    }

    /**
     * Sets the value of the actualCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualCount(BigDecimal value) {
        this.actualCount = value;
    }

    /**
     * Gets the value of the expectedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpectedCount() {
        return expectedCount;
    }

    /**
     * Sets the value of the expectedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpectedCount(BigDecimal value) {
        this.expectedCount = value;
    }

    /**
     * Gets the value of the postedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostedCount() {
        return postedCount;
    }

    /**
     * Sets the value of the postedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostedCount(BigDecimal value) {
        this.postedCount = value;
    }

    /**
     * Gets the value of the saleLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link SaleLineItemType }
     *     
     */
    public SaleLineItemType getSaleLineItem() {
        return saleLineItem;
    }

    /**
     * Sets the value of the saleLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleLineItemType }
     *     
     */
    public void setSaleLineItem(SaleLineItemType value) {
        this.saleLineItem = value;
    }

    /**
     * Gets the value of the recordCreationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCreationType() {
        return recordCreationType;
    }

    /**
     * Sets the value of the recordCreationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCreationType(String value) {
        this.recordCreationType = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the itemAccountModifier property.
     * 
     * @return
     *     possible object is
     *     {@link ItemAccountModifierType }
     *     
     */
    public ItemAccountModifierType getItemAccountModifier() {
        return itemAccountModifier;
    }

    /**
     * Sets the value of the itemAccountModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAccountModifierType }
     *     
     */
    public void setItemAccountModifier(ItemAccountModifierType value) {
        this.itemAccountModifier = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTax(TaxType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscount(DiscountType value) {
        this.discount = value;
    }

    /**
     * Gets the value of the quantityOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }

    /**
     * Sets the value of the quantityOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityOrdered(BigDecimal value) {
        this.quantityOrdered = value;
    }

    /**
     * Gets the value of the quantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Sets the value of the quantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityReceived(BigDecimal value) {
        this.quantityReceived = value;
    }

    /**
     * Gets the value of the cartonNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartonNumber() {
        return cartonNumber;
    }

    /**
     * Sets the value of the cartonNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartonNumber(String value) {
        this.cartonNumber = value;
    }

    /**
     * Gets the value of the lineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineItemNumber(BigInteger value) {
        this.lineItemNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the paymentOnAccount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOnAccountType }
     *     
     */
    public PaymentOnAccountType getPaymentOnAccount() {
        return paymentOnAccount;
    }

    /**
     * Sets the value of the paymentOnAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOnAccountType }
     *     
     */
    public void setPaymentOnAccount(PaymentOnAccountType value) {
        this.paymentOnAccount = value;
    }

    /**
     * Gets the value of the entryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryMethod() {
        return entryMethod;
    }

    /**
     * Sets the value of the entryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryMethod(String value) {
        this.entryMethod = value;
    }

    /**
     * Gets the value of the voidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidFlag() {
        return voidFlag;
    }

    /**
     * Sets the value of the voidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidFlag(Boolean value) {
        this.voidFlag = value;
    }

}
