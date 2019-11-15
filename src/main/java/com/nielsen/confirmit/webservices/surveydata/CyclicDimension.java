
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CyclicDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CyclicDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Dimension"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SelectExpressionBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}BinaryArithmetic" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
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
@XmlType(name = "CyclicDimension", propOrder = {
    "selectExpressionBinary",
    "selectExpressionField",
    "selectExpressionConstant",
    "selectExpressionCategorization",
    "selectExpressionForm",
    "selectExpressionFunction"
})
@XmlSeeAlso({
    TimeseriesDimension.class
})
public abstract class CyclicDimension
    extends Dimension
{

    @XmlElement(name = "SelectExpressionBinary")
    protected BinaryArithmetic selectExpressionBinary;
    @XmlElement(name = "SelectExpressionField")
    protected QueryField selectExpressionField;
    @XmlElement(name = "SelectExpressionConstant")
    protected QueryConstant selectExpressionConstant;
    @XmlElement(name = "SelectExpressionCategorization")
    protected Categorization selectExpressionCategorization;
    @XmlElement(name = "SelectExpressionForm")
    protected QueryForm selectExpressionForm;
    @XmlElement(name = "SelectExpressionFunction")
    protected Function selectExpressionFunction;

    /**
     * Gets the value of the selectExpressionBinary property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryArithmetic }
     *     
     */
    public BinaryArithmetic getSelectExpressionBinary() {
        return selectExpressionBinary;
    }

    /**
     * Sets the value of the selectExpressionBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryArithmetic }
     *     
     */
    public void setSelectExpressionBinary(BinaryArithmetic value) {
        this.selectExpressionBinary = value;
    }

    /**
     * Gets the value of the selectExpressionField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getSelectExpressionField() {
        return selectExpressionField;
    }

    /**
     * Sets the value of the selectExpressionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setSelectExpressionField(QueryField value) {
        this.selectExpressionField = value;
    }

    /**
     * Gets the value of the selectExpressionConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getSelectExpressionConstant() {
        return selectExpressionConstant;
    }

    /**
     * Sets the value of the selectExpressionConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setSelectExpressionConstant(QueryConstant value) {
        this.selectExpressionConstant = value;
    }

    /**
     * Gets the value of the selectExpressionCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getSelectExpressionCategorization() {
        return selectExpressionCategorization;
    }

    /**
     * Sets the value of the selectExpressionCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setSelectExpressionCategorization(Categorization value) {
        this.selectExpressionCategorization = value;
    }

    /**
     * Gets the value of the selectExpressionForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getSelectExpressionForm() {
        return selectExpressionForm;
    }

    /**
     * Sets the value of the selectExpressionForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setSelectExpressionForm(QueryForm value) {
        this.selectExpressionForm = value;
    }

    /**
     * Gets the value of the selectExpressionFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getSelectExpressionFunction() {
        return selectExpressionFunction;
    }

    /**
     * Sets the value of the selectExpressionFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setSelectExpressionFunction(Function value) {
        this.selectExpressionFunction = value;
    }

}
