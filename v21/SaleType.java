
package dtv.xcenter.poslog.ws.v21;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dtv.xcenter.poslog_ext.ws.v21.LineItemAssociation;
import dtv.xcenter.poslog_ext.ws.v21.LineItemPropertyType;
import dtv.xcenter.poslog_ext.ws.v21.PercentageOfItemType;


/**
 * <p>Java class for SaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}FiscalItemID" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}FiscalItemDescription" minOccurs="0"/>
 *         &lt;element name="UnitCostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RegularSalesUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ActualSalesUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExtendedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}UnitOfMeasureCode" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}MeasurementRequired" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}WeightEntryMethodCode" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TareValue" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TareType" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}TareUnitOfMeasureCode" minOccurs="0"/>
 *         &lt;element name="SellingLocation" type="{http://v21.ws.poslog.xcenter.dtv/}StoreStructure" minOccurs="0"/>
 *         &lt;element name="MerchandiseHierarchy" type="{http://v21.ws.poslog.xcenter.dtv/}MerchandiseHierarchyType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}ScannedItemID" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}AuthorizationCode" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftReceiptFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}VoidReason" minOccurs="0"/>
 *         &lt;element name="Associate" type="{http://v21.ws.poslog.xcenter.dtv/}AssociateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}PercentageOfItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RetailPriceModifier" type="{http://v21.ws.poslog.xcenter.dtv/}RetailPriceModifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://v21.ws.poslog.xcenter.dtv/}TaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Kit" type="{http://v21.ws.poslog.xcenter.dtv/}KitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionLink" type="{http://v21.ws.poslog.xcenter.dtv/}TransactionLinkType" minOccurs="0"/>
 *         &lt;element name="UnitListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}LineItemProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}LineItemAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleType", propOrder = {
    "itemID",
    "description",
    "fiscalItemID",
    "fiscalItemDescription",
    "unitCostPrice",
    "regularSalesUnitPrice",
    "actualSalesUnitPrice",
    "extendedAmount",
    "quantity",
    "unitOfMeasureCode",
    "measurementRequired",
    "weightEntryMethodCode",
    "tareValue",
    "tareType",
    "tareUnitOfMeasureCode",
    "sellingLocation",
    "merchandiseHierarchy",
    "scannedItemID",
    "authorizationCode",
    "serialNumber",
    "giftReceiptFlag",
    "voidReason",
    "associate",
    "percentageOfItem",
    "retailPriceModifier",
    "tax",
    "kit",
    "transactionLink",
    "unitListPrice",
    "lineItemProperty",
    "lineItemAssociation"
})
@XmlSeeAlso({
    CustomerOrderForPickupType.class,
    LayawayType.class,
    CustomerOrderForDeliveryType.class,
    ExchangeType.class,
    ReturnType.class,
    PreviousLayawayType.class,
    SaleForDeliveryType.class
})
public class SaleType {

    @XmlElement(name = "ItemID", required = true)
    protected String itemID;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FiscalItemID", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String fiscalItemID;
    @XmlElement(name = "FiscalItemDescription", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String fiscalItemDescription;
    @XmlElement(name = "UnitCostPrice")
    protected BigDecimal unitCostPrice;
    @XmlElement(name = "RegularSalesUnitPrice")
    protected BigDecimal regularSalesUnitPrice;
    @XmlElement(name = "ActualSalesUnitPrice")
    protected BigDecimal actualSalesUnitPrice;
    @XmlElement(name = "ExtendedAmount")
    protected BigDecimal extendedAmount;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "UnitOfMeasureCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String unitOfMeasureCode;
    @XmlElement(name = "MeasurementRequired", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected Boolean measurementRequired;
    @XmlElement(name = "WeightEntryMethodCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String weightEntryMethodCode;
    @XmlElement(name = "TareValue", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected BigDecimal tareValue;
    @XmlElement(name = "TareType", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String tareType;
    @XmlElement(name = "TareUnitOfMeasureCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String tareUnitOfMeasureCode;
    @XmlElement(name = "SellingLocation")
    protected StoreStructure sellingLocation;
    @XmlElement(name = "MerchandiseHierarchy")
    protected List<MerchandiseHierarchyType> merchandiseHierarchy;
    @XmlElement(name = "ScannedItemID", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String scannedItemID;
    @XmlElement(name = "AuthorizationCode", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String authorizationCode;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "GiftReceiptFlag")
    protected Boolean giftReceiptFlag;
    @XmlElement(name = "VoidReason", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected String voidReason;
    @XmlElement(name = "Associate")
    protected List<AssociateType> associate;
    @XmlElement(name = "PercentageOfItem", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected List<PercentageOfItemType> percentageOfItem;
    @XmlElement(name = "RetailPriceModifier")
    protected List<RetailPriceModifierType> retailPriceModifier;
    @XmlElement(name = "Tax")
    protected List<TaxType> tax;
    @XmlElement(name = "Kit")
    protected List<KitType> kit;
    @XmlElement(name = "TransactionLink")
    protected TransactionLinkType transactionLink;
    @XmlElement(name = "UnitListPrice")
    protected BigDecimal unitListPrice;
    @XmlElement(name = "LineItemProperty", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected List<LineItemPropertyType> lineItemProperty;
    @XmlElement(name = "LineItemAssociation", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/")
    protected List<LineItemAssociation> lineItemAssociation;
    @XmlAttribute(name = "ItemType")
    protected String itemType;

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
     * Gets the value of the fiscalItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalItemID() {
        return fiscalItemID;
    }

    /**
     * Sets the value of the fiscalItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalItemID(String value) {
        this.fiscalItemID = value;
    }

    /**
     * Gets the value of the fiscalItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalItemDescription() {
        return fiscalItemDescription;
    }

    /**
     * Sets the value of the fiscalItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalItemDescription(String value) {
        this.fiscalItemDescription = value;
    }

    /**
     * Gets the value of the unitCostPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCostPrice() {
        return unitCostPrice;
    }

    /**
     * Sets the value of the unitCostPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCostPrice(BigDecimal value) {
        this.unitCostPrice = value;
    }

    /**
     * Gets the value of the regularSalesUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegularSalesUnitPrice() {
        return regularSalesUnitPrice;
    }

    /**
     * Sets the value of the regularSalesUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegularSalesUnitPrice(BigDecimal value) {
        this.regularSalesUnitPrice = value;
    }

    /**
     * Gets the value of the actualSalesUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualSalesUnitPrice() {
        return actualSalesUnitPrice;
    }

    /**
     * Sets the value of the actualSalesUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualSalesUnitPrice(BigDecimal value) {
        this.actualSalesUnitPrice = value;
    }

    /**
     * Gets the value of the extendedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendedAmount() {
        return extendedAmount;
    }

    /**
     * Sets the value of the extendedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendedAmount(BigDecimal value) {
        this.extendedAmount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * Gets the value of the measurementRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeasurementRequired() {
        return measurementRequired;
    }

    /**
     * Sets the value of the measurementRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeasurementRequired(Boolean value) {
        this.measurementRequired = value;
    }

    /**
     * Gets the value of the weightEntryMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightEntryMethodCode() {
        return weightEntryMethodCode;
    }

    /**
     * Sets the value of the weightEntryMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightEntryMethodCode(String value) {
        this.weightEntryMethodCode = value;
    }

    /**
     * Gets the value of the tareValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTareValue() {
        return tareValue;
    }

    /**
     * Sets the value of the tareValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTareValue(BigDecimal value) {
        this.tareValue = value;
    }

    /**
     * Gets the value of the tareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTareType() {
        return tareType;
    }

    /**
     * Sets the value of the tareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTareType(String value) {
        this.tareType = value;
    }

    /**
     * Gets the value of the tareUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTareUnitOfMeasureCode() {
        return tareUnitOfMeasureCode;
    }

    /**
     * Sets the value of the tareUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTareUnitOfMeasureCode(String value) {
        this.tareUnitOfMeasureCode = value;
    }

    /**
     * Gets the value of the sellingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link StoreStructure }
     *     
     */
    public StoreStructure getSellingLocation() {
        return sellingLocation;
    }

    /**
     * Sets the value of the sellingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreStructure }
     *     
     */
    public void setSellingLocation(StoreStructure value) {
        this.sellingLocation = value;
    }

    /**
     * Gets the value of the merchandiseHierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the merchandiseHierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMerchandiseHierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchandiseHierarchyType }
     * 
     * 
     */
    public List<MerchandiseHierarchyType> getMerchandiseHierarchy() {
        if (merchandiseHierarchy == null) {
            merchandiseHierarchy = new ArrayList<MerchandiseHierarchyType>();
        }
        return this.merchandiseHierarchy;
    }

    /**
     * Gets the value of the scannedItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannedItemID() {
        return scannedItemID;
    }

    /**
     * Sets the value of the scannedItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannedItemID(String value) {
        this.scannedItemID = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
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
     * Gets the value of the giftReceiptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGiftReceiptFlag() {
        return giftReceiptFlag;
    }

    /**
     * Sets the value of the giftReceiptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGiftReceiptFlag(Boolean value) {
        this.giftReceiptFlag = value;
    }

    /**
     * Gets the value of the voidReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidReason() {
        return voidReason;
    }

    /**
     * Sets the value of the voidReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidReason(String value) {
        this.voidReason = value;
    }

    /**
     * Gets the value of the associate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociateType }
     * 
     * 
     */
    public List<AssociateType> getAssociate() {
        if (associate == null) {
            associate = new ArrayList<AssociateType>();
        }
        return this.associate;
    }

    /**
     * Gets the value of the percentageOfItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the percentageOfItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPercentageOfItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PercentageOfItemType }
     * 
     * 
     */
    public List<PercentageOfItemType> getPercentageOfItem() {
        if (percentageOfItem == null) {
            percentageOfItem = new ArrayList<PercentageOfItemType>();
        }
        return this.percentageOfItem;
    }

    /**
     * Gets the value of the retailPriceModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailPriceModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailPriceModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailPriceModifierType }
     * 
     * 
     */
    public List<RetailPriceModifierType> getRetailPriceModifier() {
        if (retailPriceModifier == null) {
            retailPriceModifier = new ArrayList<RetailPriceModifierType>();
        }
        return this.retailPriceModifier;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxType>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the kit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KitType }
     * 
     * 
     */
    public List<KitType> getKit() {
        if (kit == null) {
            kit = new ArrayList<KitType>();
        }
        return this.kit;
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
     * Gets the value of the unitListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitListPrice() {
        return unitListPrice;
    }

    /**
     * Sets the value of the unitListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitListPrice(BigDecimal value) {
        this.unitListPrice = value;
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
     * Gets the value of the lineItemAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemAssociation }
     * 
     * 
     */
    public List<LineItemAssociation> getLineItemAssociation() {
        if (lineItemAssociation == null) {
            lineItemAssociation = new ArrayList<LineItemAssociation>();
        }
        return this.lineItemAssociation;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

}
