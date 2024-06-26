
package dtv.xcenter.poslog.ws.v21;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dtv.xcenter.poslog_ext.ws.v21.EscrowTransferFromAccount;
import dtv.xcenter.poslog_ext.ws.v21.EscrowTransferToAccount;


/**
 * <p>Java class for EscrowTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrowTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Customer" type="{http://v21.ws.poslog.xcenter.dtv/}PoslogCustomerType"/>
 *         &lt;element name="LineItem" type="{http://v21.ws.poslog.xcenter.dtv/}LineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}EscrowTransferToAccount"/>
 *         &lt;element ref="{http://v21.ws.poslog-ext.xcenter.dtv/}EscrowTransferFromAccount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EscrowTransactionType", propOrder = {
    "transactionType",
    "customer",
    "lineItem",
    "escrowTransferToAccount",
    "escrowTransferFromAccount"
})
public class EscrowTransactionType {

    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    @XmlElement(name = "Customer", required = true)
    protected PoslogCustomerType customer;
    @XmlElement(name = "LineItem")
    protected List<LineItemType> lineItem;
    @XmlElement(name = "EscrowTransferToAccount", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/", required = true)
    protected EscrowTransferToAccount escrowTransferToAccount;
    @XmlElement(name = "EscrowTransferFromAccount", namespace = "http://v21.ws.poslog-ext.xcenter.dtv/", required = true)
    protected EscrowTransferFromAccount escrowTransferFromAccount;

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
     * Gets the value of the escrowTransferToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link EscrowTransferToAccount }
     *     
     */
    public EscrowTransferToAccount getEscrowTransferToAccount() {
        return escrowTransferToAccount;
    }

    /**
     * Sets the value of the escrowTransferToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrowTransferToAccount }
     *     
     */
    public void setEscrowTransferToAccount(EscrowTransferToAccount value) {
        this.escrowTransferToAccount = value;
    }

    /**
     * Gets the value of the escrowTransferFromAccount property.
     * 
     * @return
     *     possible object is
     *     {@link EscrowTransferFromAccount }
     *     
     */
    public EscrowTransferFromAccount getEscrowTransferFromAccount() {
        return escrowTransferFromAccount;
    }

    /**
     * Sets the value of the escrowTransferFromAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrowTransferFromAccount }
     *     
     */
    public void setEscrowTransferFromAccount(EscrowTransferFromAccount value) {
        this.escrowTransferFromAccount = value;
    }

}
