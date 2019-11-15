
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferDef" type="{http://firmglobal.com/Confirmit/webservices/8.5/}TransferDef" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ConfirmitData" minOccurs="0"/&gt;
 *         &lt;element name="applyRules" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transactionKey" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "key",
    "transferDef",
    "data",
    "applyRules",
    "inTransaction",
    "transactionKey"
})
@XmlRootElement(name = "UpdateDataGeneral")
public class UpdateDataGeneral {

    protected String key;
    protected TransferDef transferDef;
    protected ConfirmitData data;
    protected boolean applyRules;
    protected boolean inTransaction;
    protected int transactionKey;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the transferDef property.
     * 
     * @return
     *     possible object is
     *     {@link TransferDef }
     *     
     */
    public TransferDef getTransferDef() {
        return transferDef;
    }

    /**
     * Sets the value of the transferDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDef }
     *     
     */
    public void setTransferDef(TransferDef value) {
        this.transferDef = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmitData }
     *     
     */
    public ConfirmitData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmitData }
     *     
     */
    public void setData(ConfirmitData value) {
        this.data = value;
    }

    /**
     * Gets the value of the applyRules property.
     * 
     */
    public boolean isApplyRules() {
        return applyRules;
    }

    /**
     * Sets the value of the applyRules property.
     * 
     */
    public void setApplyRules(boolean value) {
        this.applyRules = value;
    }

    /**
     * Gets the value of the inTransaction property.
     * 
     */
    public boolean isInTransaction() {
        return inTransaction;
    }

    /**
     * Sets the value of the inTransaction property.
     * 
     */
    public void setInTransaction(boolean value) {
        this.inTransaction = value;
    }

    /**
     * Gets the value of the transactionKey property.
     * 
     */
    public int getTransactionKey() {
        return transactionKey;
    }

    /**
     * Sets the value of the transactionKey property.
     * 
     */
    public void setTransactionKey(int value) {
        this.transactionKey = value;
    }

}
