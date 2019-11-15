
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
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ConfirmitData" minOccurs="0"/&gt;
 *         &lt;element name="validate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="merge" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="uniqueKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "projectId",
    "data",
    "validate",
    "merge",
    "uniqueKey",
    "inTransaction",
    "transactionKey"
})
@XmlRootElement(name = "UpdateRespondentsGeneral")
public class UpdateRespondentsGeneral {

    protected String key;
    protected String projectId;
    protected ConfirmitData data;
    protected boolean validate;
    protected boolean merge;
    protected String uniqueKey;
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
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
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
     * Gets the value of the validate property.
     * 
     */
    public boolean isValidate() {
        return validate;
    }

    /**
     * Sets the value of the validate property.
     * 
     */
    public void setValidate(boolean value) {
        this.validate = value;
    }

    /**
     * Gets the value of the merge property.
     * 
     */
    public boolean isMerge() {
        return merge;
    }

    /**
     * Sets the value of the merge property.
     * 
     */
    public void setMerge(boolean value) {
        this.merge = value;
    }

    /**
     * Gets the value of the uniqueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Sets the value of the uniqueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
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
