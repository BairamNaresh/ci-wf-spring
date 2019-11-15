
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseWhenThen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseWhenThen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="WhenExpressionField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="WhenExpressionBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="WhenExpressionConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="WhenExpressionCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *           &lt;element name="WhenExpressionFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="WhenExpressionForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ThenExpressionBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="ThenExpressionConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="ThenExpressionForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="ThenExpressionFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="ThenExpressionField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="ThenExpressionCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseWhenThen", propOrder = {
    "whenExpressionField",
    "whenExpressionBinary",
    "whenExpressionConstant",
    "whenExpressionCategorization",
    "whenExpressionFunction",
    "whenExpressionForm",
    "thenExpressionBinary",
    "thenExpressionConstant",
    "thenExpressionForm",
    "thenExpressionFunction",
    "thenExpressionField",
    "thenExpressionCategorization"
})
public class CaseWhenThen {

    @XmlElement(name = "WhenExpressionField")
    protected QueryField whenExpressionField;
    @XmlElement(name = "WhenExpressionBinary")
    protected Binary whenExpressionBinary;
    @XmlElement(name = "WhenExpressionConstant")
    protected QueryConstant whenExpressionConstant;
    @XmlElement(name = "WhenExpressionCategorization")
    protected Categorization whenExpressionCategorization;
    @XmlElement(name = "WhenExpressionFunction")
    protected Function whenExpressionFunction;
    @XmlElement(name = "WhenExpressionForm")
    protected QueryForm whenExpressionForm;
    @XmlElement(name = "ThenExpressionBinary")
    protected Binary thenExpressionBinary;
    @XmlElement(name = "ThenExpressionConstant")
    protected QueryConstant thenExpressionConstant;
    @XmlElement(name = "ThenExpressionForm")
    protected QueryForm thenExpressionForm;
    @XmlElement(name = "ThenExpressionFunction")
    protected Function thenExpressionFunction;
    @XmlElement(name = "ThenExpressionField")
    protected QueryField thenExpressionField;
    @XmlElement(name = "ThenExpressionCategorization")
    protected Categorization thenExpressionCategorization;

    /**
     * Gets the value of the whenExpressionField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getWhenExpressionField() {
        return whenExpressionField;
    }

    /**
     * Sets the value of the whenExpressionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setWhenExpressionField(QueryField value) {
        this.whenExpressionField = value;
    }

    /**
     * Gets the value of the whenExpressionBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getWhenExpressionBinary() {
        return whenExpressionBinary;
    }

    /**
     * Sets the value of the whenExpressionBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setWhenExpressionBinary(Binary value) {
        this.whenExpressionBinary = value;
    }

    /**
     * Gets the value of the whenExpressionConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getWhenExpressionConstant() {
        return whenExpressionConstant;
    }

    /**
     * Sets the value of the whenExpressionConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setWhenExpressionConstant(QueryConstant value) {
        this.whenExpressionConstant = value;
    }

    /**
     * Gets the value of the whenExpressionCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getWhenExpressionCategorization() {
        return whenExpressionCategorization;
    }

    /**
     * Sets the value of the whenExpressionCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setWhenExpressionCategorization(Categorization value) {
        this.whenExpressionCategorization = value;
    }

    /**
     * Gets the value of the whenExpressionFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getWhenExpressionFunction() {
        return whenExpressionFunction;
    }

    /**
     * Sets the value of the whenExpressionFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setWhenExpressionFunction(Function value) {
        this.whenExpressionFunction = value;
    }

    /**
     * Gets the value of the whenExpressionForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getWhenExpressionForm() {
        return whenExpressionForm;
    }

    /**
     * Sets the value of the whenExpressionForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setWhenExpressionForm(QueryForm value) {
        this.whenExpressionForm = value;
    }

    /**
     * Gets the value of the thenExpressionBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getThenExpressionBinary() {
        return thenExpressionBinary;
    }

    /**
     * Sets the value of the thenExpressionBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setThenExpressionBinary(Binary value) {
        this.thenExpressionBinary = value;
    }

    /**
     * Gets the value of the thenExpressionConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getThenExpressionConstant() {
        return thenExpressionConstant;
    }

    /**
     * Sets the value of the thenExpressionConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setThenExpressionConstant(QueryConstant value) {
        this.thenExpressionConstant = value;
    }

    /**
     * Gets the value of the thenExpressionForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getThenExpressionForm() {
        return thenExpressionForm;
    }

    /**
     * Sets the value of the thenExpressionForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setThenExpressionForm(QueryForm value) {
        this.thenExpressionForm = value;
    }

    /**
     * Gets the value of the thenExpressionFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getThenExpressionFunction() {
        return thenExpressionFunction;
    }

    /**
     * Sets the value of the thenExpressionFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setThenExpressionFunction(Function value) {
        this.thenExpressionFunction = value;
    }

    /**
     * Gets the value of the thenExpressionField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getThenExpressionField() {
        return thenExpressionField;
    }

    /**
     * Sets the value of the thenExpressionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setThenExpressionField(QueryField value) {
        this.thenExpressionField = value;
    }

    /**
     * Gets the value of the thenExpressionCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getThenExpressionCategorization() {
        return thenExpressionCategorization;
    }

    /**
     * Sets the value of the thenExpressionCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setThenExpressionCategorization(Categorization value) {
        this.thenExpressionCategorization = value;
    }

}
