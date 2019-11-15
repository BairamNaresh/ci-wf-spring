
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fields" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfTransferField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AllChildrenFields" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsSystemVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BitString" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NullPadding" use="required" type="{http://microsoft.com/wsdl/types/}char" /&gt;
 *       &lt;attribute name="Spread" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SpreadSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SpreadOutputPadding" use="required" type="{http://microsoft.com/wsdl/types/}char" /&gt;
 *       &lt;attribute name="SpreadValuePadding" use="required" type="{http://microsoft.com/wsdl/types/}char" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferForm", propOrder = {
    "fields"
})
public class TransferForm {

    @XmlElement(name = "Fields")
    protected ArrayOfTransferField fields;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "AllChildrenFields", required = true)
    protected boolean allChildrenFields;
    @XmlAttribute(name = "IsSystemVariable", required = true)
    protected boolean isSystemVariable;
    @XmlAttribute(name = "BitString", required = true)
    protected boolean bitString;
    @XmlAttribute(name = "NullPadding", required = true)
    protected int nullPadding;
    @XmlAttribute(name = "Spread", required = true)
    protected boolean spread;
    @XmlAttribute(name = "SpreadSize", required = true)
    protected int spreadSize;
    @XmlAttribute(name = "SpreadOutputPadding", required = true)
    protected int spreadOutputPadding;
    @XmlAttribute(name = "SpreadValuePadding", required = true)
    protected int spreadValuePadding;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransferField }
     *     
     */
    public ArrayOfTransferField getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransferField }
     *     
     */
    public void setFields(ArrayOfTransferField value) {
        this.fields = value;
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
     * Gets the value of the allChildrenFields property.
     * 
     */
    public boolean isAllChildrenFields() {
        return allChildrenFields;
    }

    /**
     * Sets the value of the allChildrenFields property.
     * 
     */
    public void setAllChildrenFields(boolean value) {
        this.allChildrenFields = value;
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

    /**
     * Gets the value of the bitString property.
     * 
     */
    public boolean isBitString() {
        return bitString;
    }

    /**
     * Sets the value of the bitString property.
     * 
     */
    public void setBitString(boolean value) {
        this.bitString = value;
    }

    /**
     * Gets the value of the nullPadding property.
     * 
     */
    public int getNullPadding() {
        return nullPadding;
    }

    /**
     * Sets the value of the nullPadding property.
     * 
     */
    public void setNullPadding(int value) {
        this.nullPadding = value;
    }

    /**
     * Gets the value of the spread property.
     * 
     */
    public boolean isSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     */
    public void setSpread(boolean value) {
        this.spread = value;
    }

    /**
     * Gets the value of the spreadSize property.
     * 
     */
    public int getSpreadSize() {
        return spreadSize;
    }

    /**
     * Sets the value of the spreadSize property.
     * 
     */
    public void setSpreadSize(int value) {
        this.spreadSize = value;
    }

    /**
     * Gets the value of the spreadOutputPadding property.
     * 
     */
    public int getSpreadOutputPadding() {
        return spreadOutputPadding;
    }

    /**
     * Sets the value of the spreadOutputPadding property.
     * 
     */
    public void setSpreadOutputPadding(int value) {
        this.spreadOutputPadding = value;
    }

    /**
     * Gets the value of the spreadValuePadding property.
     * 
     */
    public int getSpreadValuePadding() {
        return spreadValuePadding;
    }

    /**
     * Sets the value of the spreadValuePadding property.
     * 
     */
    public void setSpreadValuePadding(int value) {
        this.spreadValuePadding = value;
    }

}
