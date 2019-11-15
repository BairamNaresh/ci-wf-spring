
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeConvertion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeConvertion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataType" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ConfirmitDbType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ExpressionForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeConvertion", propOrder = {
    "length",
    "dateFormat",
    "dataType",
    "expressionForm",
    "expressionBinary",
    "expressionConstant",
    "expressionField",
    "expressionFunction",
    "expressionCategorization"
})
public class TypeConvertion
    extends Function
{

    @XmlElement(name = "Length")
    protected int length;
    @XmlElement(name = "DateFormat")
    protected String dateFormat;
    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected ConfirmitDbType dataType;
    @XmlElement(name = "ExpressionForm")
    protected QueryForm expressionForm;
    @XmlElement(name = "ExpressionBinary")
    protected Binary expressionBinary;
    @XmlElement(name = "ExpressionConstant")
    protected QueryConstant expressionConstant;
    @XmlElement(name = "ExpressionField")
    protected QueryField expressionField;
    @XmlElement(name = "ExpressionFunction")
    protected Function expressionFunction;
    @XmlElement(name = "ExpressionCategorization")
    protected Categorization expressionCategorization;

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmitDbType }
     *     
     */
    public ConfirmitDbType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmitDbType }
     *     
     */
    public void setDataType(ConfirmitDbType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the expressionForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getExpressionForm() {
        return expressionForm;
    }

    /**
     * Sets the value of the expressionForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setExpressionForm(QueryForm value) {
        this.expressionForm = value;
    }

    /**
     * Gets the value of the expressionBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getExpressionBinary() {
        return expressionBinary;
    }

    /**
     * Sets the value of the expressionBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setExpressionBinary(Binary value) {
        this.expressionBinary = value;
    }

    /**
     * Gets the value of the expressionConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getExpressionConstant() {
        return expressionConstant;
    }

    /**
     * Sets the value of the expressionConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setExpressionConstant(QueryConstant value) {
        this.expressionConstant = value;
    }

    /**
     * Gets the value of the expressionField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getExpressionField() {
        return expressionField;
    }

    /**
     * Sets the value of the expressionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setExpressionField(QueryField value) {
        this.expressionField = value;
    }

    /**
     * Gets the value of the expressionFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getExpressionFunction() {
        return expressionFunction;
    }

    /**
     * Sets the value of the expressionFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setExpressionFunction(Function value) {
        this.expressionFunction = value;
    }

    /**
     * Gets the value of the expressionCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getExpressionCategorization() {
        return expressionCategorization;
    }

    /**
     * Sets the value of the expressionCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setExpressionCategorization(Categorization value) {
        this.expressionCategorization = value;
    }

}
