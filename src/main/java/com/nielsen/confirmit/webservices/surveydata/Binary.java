
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Binary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Binary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="LeftOperandFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="LeftOperandBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="LeftOperandConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="LeftOperandField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="LeftOperandForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="LeftOperandCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *           &lt;element name="LeftOperandExpressionList" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ExpressionList" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="RightOperandForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="RightOperandSurveyQuery" type="{http://firmglobal.com/Confirmit/webservices/8.5/}SurveyQuery" minOccurs="0"/&gt;
 *           &lt;element name="RightOperandCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *           &lt;element name="RightOperandFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="RightOperandBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="RightOperandField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="RightOperandConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="RightOperandExpressionList" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ExpressionList" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OrderBy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Binary", propOrder = {
    "leftOperandFunction",
    "leftOperandBinary",
    "leftOperandConstant",
    "leftOperandField",
    "leftOperandForm",
    "leftOperandCategorization",
    "leftOperandExpressionList",
    "rightOperandForm",
    "rightOperandSurveyQuery",
    "rightOperandCategorization",
    "rightOperandFunction",
    "rightOperandBinary",
    "rightOperandField",
    "rightOperandConstant",
    "rightOperandExpressionList"
})
@XmlSeeAlso({
    BinaryArithmetic.class,
    BinaryComparison.class,
    BinaryLogic.class
})
public abstract class Binary {

    @XmlElement(name = "LeftOperandFunction")
    protected Function leftOperandFunction;
    @XmlElement(name = "LeftOperandBinary")
    protected Binary leftOperandBinary;
    @XmlElement(name = "LeftOperandConstant")
    protected QueryConstant leftOperandConstant;
    @XmlElement(name = "LeftOperandField")
    protected QueryField leftOperandField;
    @XmlElement(name = "LeftOperandForm")
    protected QueryForm leftOperandForm;
    @XmlElement(name = "LeftOperandCategorization")
    protected Categorization leftOperandCategorization;
    @XmlElement(name = "LeftOperandExpressionList")
    protected ExpressionList leftOperandExpressionList;
    @XmlElement(name = "RightOperandForm")
    protected QueryForm rightOperandForm;
    @XmlElement(name = "RightOperandSurveyQuery")
    protected SurveyQuery rightOperandSurveyQuery;
    @XmlElement(name = "RightOperandCategorization")
    protected Categorization rightOperandCategorization;
    @XmlElement(name = "RightOperandFunction")
    protected Function rightOperandFunction;
    @XmlElement(name = "RightOperandBinary")
    protected Binary rightOperandBinary;
    @XmlElement(name = "RightOperandField")
    protected QueryField rightOperandField;
    @XmlElement(name = "RightOperandConstant")
    protected QueryConstant rightOperandConstant;
    @XmlElement(name = "RightOperandExpressionList")
    protected ExpressionList rightOperandExpressionList;
    @XmlAttribute(name = "OrderBy", required = true)
    protected boolean orderBy;

    /**
     * Gets the value of the leftOperandFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getLeftOperandFunction() {
        return leftOperandFunction;
    }

    /**
     * Sets the value of the leftOperandFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setLeftOperandFunction(Function value) {
        this.leftOperandFunction = value;
    }

    /**
     * Gets the value of the leftOperandBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getLeftOperandBinary() {
        return leftOperandBinary;
    }

    /**
     * Sets the value of the leftOperandBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setLeftOperandBinary(Binary value) {
        this.leftOperandBinary = value;
    }

    /**
     * Gets the value of the leftOperandConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getLeftOperandConstant() {
        return leftOperandConstant;
    }

    /**
     * Sets the value of the leftOperandConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setLeftOperandConstant(QueryConstant value) {
        this.leftOperandConstant = value;
    }

    /**
     * Gets the value of the leftOperandField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getLeftOperandField() {
        return leftOperandField;
    }

    /**
     * Sets the value of the leftOperandField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setLeftOperandField(QueryField value) {
        this.leftOperandField = value;
    }

    /**
     * Gets the value of the leftOperandForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getLeftOperandForm() {
        return leftOperandForm;
    }

    /**
     * Sets the value of the leftOperandForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setLeftOperandForm(QueryForm value) {
        this.leftOperandForm = value;
    }

    /**
     * Gets the value of the leftOperandCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getLeftOperandCategorization() {
        return leftOperandCategorization;
    }

    /**
     * Sets the value of the leftOperandCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setLeftOperandCategorization(Categorization value) {
        this.leftOperandCategorization = value;
    }

    /**
     * Gets the value of the leftOperandExpressionList property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionList }
     *     
     */
    public ExpressionList getLeftOperandExpressionList() {
        return leftOperandExpressionList;
    }

    /**
     * Sets the value of the leftOperandExpressionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionList }
     *     
     */
    public void setLeftOperandExpressionList(ExpressionList value) {
        this.leftOperandExpressionList = value;
    }

    /**
     * Gets the value of the rightOperandForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getRightOperandForm() {
        return rightOperandForm;
    }

    /**
     * Sets the value of the rightOperandForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setRightOperandForm(QueryForm value) {
        this.rightOperandForm = value;
    }

    /**
     * Gets the value of the rightOperandSurveyQuery property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyQuery }
     *     
     */
    public SurveyQuery getRightOperandSurveyQuery() {
        return rightOperandSurveyQuery;
    }

    /**
     * Sets the value of the rightOperandSurveyQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyQuery }
     *     
     */
    public void setRightOperandSurveyQuery(SurveyQuery value) {
        this.rightOperandSurveyQuery = value;
    }

    /**
     * Gets the value of the rightOperandCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getRightOperandCategorization() {
        return rightOperandCategorization;
    }

    /**
     * Sets the value of the rightOperandCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setRightOperandCategorization(Categorization value) {
        this.rightOperandCategorization = value;
    }

    /**
     * Gets the value of the rightOperandFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getRightOperandFunction() {
        return rightOperandFunction;
    }

    /**
     * Sets the value of the rightOperandFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setRightOperandFunction(Function value) {
        this.rightOperandFunction = value;
    }

    /**
     * Gets the value of the rightOperandBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getRightOperandBinary() {
        return rightOperandBinary;
    }

    /**
     * Sets the value of the rightOperandBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setRightOperandBinary(Binary value) {
        this.rightOperandBinary = value;
    }

    /**
     * Gets the value of the rightOperandField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getRightOperandField() {
        return rightOperandField;
    }

    /**
     * Sets the value of the rightOperandField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setRightOperandField(QueryField value) {
        this.rightOperandField = value;
    }

    /**
     * Gets the value of the rightOperandConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getRightOperandConstant() {
        return rightOperandConstant;
    }

    /**
     * Sets the value of the rightOperandConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setRightOperandConstant(QueryConstant value) {
        this.rightOperandConstant = value;
    }

    /**
     * Gets the value of the rightOperandExpressionList property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionList }
     *     
     */
    public ExpressionList getRightOperandExpressionList() {
        return rightOperandExpressionList;
    }

    /**
     * Sets the value of the rightOperandExpressionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionList }
     *     
     */
    public void setRightOperandExpressionList(ExpressionList value) {
        this.rightOperandExpressionList = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     */
    public boolean isOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     */
    public void setOrderBy(boolean value) {
        this.orderBy = value;
    }

}
