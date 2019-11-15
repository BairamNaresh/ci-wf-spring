
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Case complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Case"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="InputExpressionConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="InputExpressionCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *           &lt;element name="InputExpressionField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="InputExpressionForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="InputExpressionBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="InputExpressionFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ElseExpressionForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="ElseExpressionField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="ElseExpressionCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *           &lt;element name="ElseExpressionBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="ElseExpressionFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="ElseExpressionConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="WhenThenArguments" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfCaseWhenThen" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Case", propOrder = {
    "inputExpressionConstant",
    "inputExpressionCategorization",
    "inputExpressionField",
    "inputExpressionForm",
    "inputExpressionBinary",
    "inputExpressionFunction",
    "elseExpressionForm",
    "elseExpressionField",
    "elseExpressionCategorization",
    "elseExpressionBinary",
    "elseExpressionFunction",
    "elseExpressionConstant",
    "whenThenArguments"
})
public class Case
    extends Function
{

    @XmlElement(name = "InputExpressionConstant")
    protected QueryConstant inputExpressionConstant;
    @XmlElement(name = "InputExpressionCategorization")
    protected Categorization inputExpressionCategorization;
    @XmlElement(name = "InputExpressionField")
    protected QueryField inputExpressionField;
    @XmlElement(name = "InputExpressionForm")
    protected QueryForm inputExpressionForm;
    @XmlElement(name = "InputExpressionBinary")
    protected Binary inputExpressionBinary;
    @XmlElement(name = "InputExpressionFunction")
    protected Function inputExpressionFunction;
    @XmlElement(name = "ElseExpressionForm")
    protected QueryForm elseExpressionForm;
    @XmlElement(name = "ElseExpressionField")
    protected QueryField elseExpressionField;
    @XmlElement(name = "ElseExpressionCategorization")
    protected Categorization elseExpressionCategorization;
    @XmlElement(name = "ElseExpressionBinary")
    protected Binary elseExpressionBinary;
    @XmlElement(name = "ElseExpressionFunction")
    protected Function elseExpressionFunction;
    @XmlElement(name = "ElseExpressionConstant")
    protected QueryConstant elseExpressionConstant;
    @XmlElement(name = "WhenThenArguments")
    protected ArrayOfCaseWhenThen whenThenArguments;

    /**
     * Gets the value of the inputExpressionConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getInputExpressionConstant() {
        return inputExpressionConstant;
    }

    /**
     * Sets the value of the inputExpressionConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setInputExpressionConstant(QueryConstant value) {
        this.inputExpressionConstant = value;
    }

    /**
     * Gets the value of the inputExpressionCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getInputExpressionCategorization() {
        return inputExpressionCategorization;
    }

    /**
     * Sets the value of the inputExpressionCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setInputExpressionCategorization(Categorization value) {
        this.inputExpressionCategorization = value;
    }

    /**
     * Gets the value of the inputExpressionField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getInputExpressionField() {
        return inputExpressionField;
    }

    /**
     * Sets the value of the inputExpressionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setInputExpressionField(QueryField value) {
        this.inputExpressionField = value;
    }

    /**
     * Gets the value of the inputExpressionForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getInputExpressionForm() {
        return inputExpressionForm;
    }

    /**
     * Sets the value of the inputExpressionForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setInputExpressionForm(QueryForm value) {
        this.inputExpressionForm = value;
    }

    /**
     * Gets the value of the inputExpressionBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getInputExpressionBinary() {
        return inputExpressionBinary;
    }

    /**
     * Sets the value of the inputExpressionBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setInputExpressionBinary(Binary value) {
        this.inputExpressionBinary = value;
    }

    /**
     * Gets the value of the inputExpressionFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getInputExpressionFunction() {
        return inputExpressionFunction;
    }

    /**
     * Sets the value of the inputExpressionFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setInputExpressionFunction(Function value) {
        this.inputExpressionFunction = value;
    }

    /**
     * Gets the value of the elseExpressionForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getElseExpressionForm() {
        return elseExpressionForm;
    }

    /**
     * Sets the value of the elseExpressionForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setElseExpressionForm(QueryForm value) {
        this.elseExpressionForm = value;
    }

    /**
     * Gets the value of the elseExpressionField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getElseExpressionField() {
        return elseExpressionField;
    }

    /**
     * Sets the value of the elseExpressionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setElseExpressionField(QueryField value) {
        this.elseExpressionField = value;
    }

    /**
     * Gets the value of the elseExpressionCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getElseExpressionCategorization() {
        return elseExpressionCategorization;
    }

    /**
     * Sets the value of the elseExpressionCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setElseExpressionCategorization(Categorization value) {
        this.elseExpressionCategorization = value;
    }

    /**
     * Gets the value of the elseExpressionBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getElseExpressionBinary() {
        return elseExpressionBinary;
    }

    /**
     * Sets the value of the elseExpressionBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setElseExpressionBinary(Binary value) {
        this.elseExpressionBinary = value;
    }

    /**
     * Gets the value of the elseExpressionFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getElseExpressionFunction() {
        return elseExpressionFunction;
    }

    /**
     * Sets the value of the elseExpressionFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setElseExpressionFunction(Function value) {
        this.elseExpressionFunction = value;
    }

    /**
     * Gets the value of the elseExpressionConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getElseExpressionConstant() {
        return elseExpressionConstant;
    }

    /**
     * Sets the value of the elseExpressionConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setElseExpressionConstant(QueryConstant value) {
        this.elseExpressionConstant = value;
    }

    /**
     * Gets the value of the whenThenArguments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCaseWhenThen }
     *     
     */
    public ArrayOfCaseWhenThen getWhenThenArguments() {
        return whenThenArguments;
    }

    /**
     * Sets the value of the whenThenArguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCaseWhenThen }
     *     
     */
    public void setWhenThenArguments(ArrayOfCaseWhenThen value) {
        this.whenThenArguments = value;
    }

}
