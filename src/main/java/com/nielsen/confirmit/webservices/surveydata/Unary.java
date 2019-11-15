
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Unary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Unary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequiredBase" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ArgumentForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="ArgumentConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="ArgumentField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="ArgumentFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="ArgumentBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="ArgumentCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}UnaryType" /&gt;
 *       &lt;attribute name="Distinct" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unary", propOrder = {
    "requiredBase",
    "argumentForm",
    "argumentConstant",
    "argumentField",
    "argumentFunction",
    "argumentBinary",
    "argumentCategorization"
})
public class Unary
    extends Function
{

    @XmlElement(name = "RequiredBase")
    protected int requiredBase;
    @XmlElement(name = "ArgumentForm")
    protected QueryForm argumentForm;
    @XmlElement(name = "ArgumentConstant")
    protected QueryConstant argumentConstant;
    @XmlElement(name = "ArgumentField")
    protected QueryField argumentField;
    @XmlElement(name = "ArgumentFunction")
    protected Function argumentFunction;
    @XmlElement(name = "ArgumentBinary")
    protected Binary argumentBinary;
    @XmlElement(name = "ArgumentCategorization")
    protected Categorization argumentCategorization;
    @XmlAttribute(name = "Type", required = true)
    protected UnaryType type;
    @XmlAttribute(name = "Distinct", required = true)
    protected boolean distinct;

    /**
     * Gets the value of the requiredBase property.
     * 
     */
    public int getRequiredBase() {
        return requiredBase;
    }

    /**
     * Sets the value of the requiredBase property.
     * 
     */
    public void setRequiredBase(int value) {
        this.requiredBase = value;
    }

    /**
     * Gets the value of the argumentForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getArgumentForm() {
        return argumentForm;
    }

    /**
     * Sets the value of the argumentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setArgumentForm(QueryForm value) {
        this.argumentForm = value;
    }

    /**
     * Gets the value of the argumentConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getArgumentConstant() {
        return argumentConstant;
    }

    /**
     * Sets the value of the argumentConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setArgumentConstant(QueryConstant value) {
        this.argumentConstant = value;
    }

    /**
     * Gets the value of the argumentField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getArgumentField() {
        return argumentField;
    }

    /**
     * Sets the value of the argumentField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setArgumentField(QueryField value) {
        this.argumentField = value;
    }

    /**
     * Gets the value of the argumentFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getArgumentFunction() {
        return argumentFunction;
    }

    /**
     * Sets the value of the argumentFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setArgumentFunction(Function value) {
        this.argumentFunction = value;
    }

    /**
     * Gets the value of the argumentBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getArgumentBinary() {
        return argumentBinary;
    }

    /**
     * Sets the value of the argumentBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setArgumentBinary(Binary value) {
        this.argumentBinary = value;
    }

    /**
     * Gets the value of the argumentCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getArgumentCategorization() {
        return argumentCategorization;
    }

    /**
     * Sets the value of the argumentCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setArgumentCategorization(Categorization value) {
        this.argumentCategorization = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link UnaryType }
     *     
     */
    public UnaryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnaryType }
     *     
     */
    public void setType(UnaryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the distinct property.
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Sets the value of the distinct property.
     * 
     */
    public void setDistinct(boolean value) {
        this.distinct = value;
    }

}
