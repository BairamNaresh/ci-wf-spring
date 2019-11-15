
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WhereClause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WhereClause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ExpressionBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="ExpressionSurveyQuery" type="{http://firmglobal.com/Confirmit/webservices/8.5/}SurveyQuery" minOccurs="0"/&gt;
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
@XmlType(name = "WhereClause", propOrder = {
    "expressionBinary",
    "expressionFunction",
    "expressionConstant",
    "expressionField",
    "expressionForm",
    "expressionSurveyQuery"
})
public class WhereClause {

    @XmlElement(name = "ExpressionBinary")
    protected Binary expressionBinary;
    @XmlElement(name = "ExpressionFunction")
    protected Function expressionFunction;
    @XmlElement(name = "ExpressionConstant")
    protected QueryConstant expressionConstant;
    @XmlElement(name = "ExpressionField")
    protected QueryField expressionField;
    @XmlElement(name = "ExpressionForm")
    protected QueryForm expressionForm;
    @XmlElement(name = "ExpressionSurveyQuery")
    protected SurveyQuery expressionSurveyQuery;

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
     * Gets the value of the expressionSurveyQuery property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyQuery }
     *     
     */
    public SurveyQuery getExpressionSurveyQuery() {
        return expressionSurveyQuery;
    }

    /**
     * Sets the value of the expressionSurveyQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyQuery }
     *     
     */
    public void setExpressionSurveyQuery(SurveyQuery value) {
        this.expressionSurveyQuery = value;
    }

}
