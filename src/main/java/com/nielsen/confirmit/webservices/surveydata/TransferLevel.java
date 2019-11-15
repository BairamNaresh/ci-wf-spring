
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SkipLoopValidation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Where" type="{http://firmglobal.com/Confirmit/webservices/8.5/}WhereClause" minOccurs="0"/&gt;
 *         &lt;element name="Forms" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfTransferForm" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfString3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LoopId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsTopLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllChildrenForms" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferLevel", propOrder = {
    "skipLoopValidation",
    "where",
    "forms",
    "fields"
})
public class TransferLevel {

    @XmlElement(name = "SkipLoopValidation")
    protected boolean skipLoopValidation;
    @XmlElement(name = "Where")
    protected WhereClause where;
    @XmlElement(name = "Forms")
    protected ArrayOfTransferForm forms;
    @XmlElement(name = "Fields")
    protected ArrayOfString3 fields;
    @XmlAttribute(name = "LoopId")
    protected String loopId;
    @XmlAttribute(name = "IsTopLevel", required = true)
    protected boolean isTopLevel;
    @XmlAttribute(name = "AllChildrenForms", required = true)
    protected boolean allChildrenForms;

    /**
     * Gets the value of the skipLoopValidation property.
     * 
     */
    public boolean isSkipLoopValidation() {
        return skipLoopValidation;
    }

    /**
     * Sets the value of the skipLoopValidation property.
     * 
     */
    public void setSkipLoopValidation(boolean value) {
        this.skipLoopValidation = value;
    }

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link WhereClause }
     *     
     */
    public WhereClause getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhereClause }
     *     
     */
    public void setWhere(WhereClause value) {
        this.where = value;
    }

    /**
     * Gets the value of the forms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransferForm }
     *     
     */
    public ArrayOfTransferForm getForms() {
        return forms;
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransferForm }
     *     
     */
    public void setForms(ArrayOfTransferForm value) {
        this.forms = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString3 }
     *     
     */
    public ArrayOfString3 getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString3 }
     *     
     */
    public void setFields(ArrayOfString3 value) {
        this.fields = value;
    }

    /**
     * Gets the value of the loopId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopId() {
        return loopId;
    }

    /**
     * Sets the value of the loopId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopId(String value) {
        this.loopId = value;
    }

    /**
     * Gets the value of the isTopLevel property.
     * 
     */
    public boolean isIsTopLevel() {
        return isTopLevel;
    }

    /**
     * Sets the value of the isTopLevel property.
     * 
     */
    public void setIsTopLevel(boolean value) {
        this.isTopLevel = value;
    }

    /**
     * Gets the value of the allChildrenForms property.
     * 
     */
    public boolean isAllChildrenForms() {
        return allChildrenForms;
    }

    /**
     * Sets the value of the allChildrenForms property.
     * 
     */
    public void setAllChildrenForms(boolean value) {
        this.allChildrenForms = value;
    }

}
