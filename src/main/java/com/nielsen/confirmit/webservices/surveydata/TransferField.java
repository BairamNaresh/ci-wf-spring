
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeConvertion" type="{http://firmglobal.com/Confirmit/webservices/8.5/}TypeConvertion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsSystemVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferField", propOrder = {
    "typeConvertion"
})
public class TransferField {

    @XmlElement(name = "TypeConvertion")
    protected TypeConvertion typeConvertion;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "IsSystemVariable", required = true)
    protected boolean isSystemVariable;

    /**
     * Gets the value of the typeConvertion property.
     * 
     * @return
     *     possible object is
     *     {@link TypeConvertion }
     *     
     */
    public TypeConvertion getTypeConvertion() {
        return typeConvertion;
    }

    /**
     * Sets the value of the typeConvertion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeConvertion }
     *     
     */
    public void setTypeConvertion(TypeConvertion value) {
        this.typeConvertion = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isSystemVariable property.
     * 
     */
    public boolean isIsSystemVariable() {
        return isSystemVariable;
    }

    /**
     * Sets the value of the isSystemVariable property.
     * 
     */
    public void setIsSystemVariable(boolean value) {
        this.isSystemVariable = value;
    }

}
