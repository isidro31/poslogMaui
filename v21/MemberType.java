
package dtv.xcenter.poslog.ws.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Return" type="{http://v21.ws.poslog.xcenter.dtv/}ReturnType"/>
 *         &lt;element name="Sale" type="{http://v21.ws.poslog.xcenter.dtv/}SaleType"/>
 *         &lt;element name="SaleForPickup" type="{http://v21.ws.poslog.xcenter.dtv/}SaleForPickupType"/>
 *       &lt;/choice>
 *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberType", propOrder = {
    "_return",
    "sale",
    "saleForPickup"
})
public class MemberType {

    @XmlElement(name = "Return")
    protected ReturnType _return;
    @XmlElement(name = "Sale")
    protected SaleType sale;
    @XmlElement(name = "SaleForPickup")
    protected SaleForPickupType saleForPickup;
    @XmlAttribute(name = "Action")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String action;

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
     * Gets the value of the saleForPickup property.
     * 
     * @return
     *     possible object is
     *     {@link SaleForPickupType }
     *     
     */
    public SaleForPickupType getSaleForPickup() {
        return saleForPickup;
    }

    /**
     * Sets the value of the saleForPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleForPickupType }
     *     
     */
    public void setSaleForPickup(SaleForPickupType value) {
        this.saleForPickup = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
