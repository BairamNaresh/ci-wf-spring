
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateDiff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateDiff"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="StartDateConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="StartDateFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="StartDateForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="StartDateField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="StartDateBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="StartDateCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="EndDateConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="EndDateField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="EndDateForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="EndDateBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="EndDateCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *           &lt;element name="EndDateFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Period" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}PeriodType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateDiff", propOrder = {
    "startDateConstant",
    "startDateFunction",
    "startDateForm",
    "startDateField",
    "startDateBinary",
    "startDateCategorization",
    "endDateConstant",
    "endDateField",
    "endDateForm",
    "endDateBinary",
    "endDateCategorization",
    "endDateFunction"
})
public class DateDiff
    extends Function
{

    @XmlElement(name = "StartDateConstant")
    protected QueryConstant startDateConstant;
    @XmlElement(name = "StartDateFunction")
    protected Function startDateFunction;
    @XmlElement(name = "StartDateForm")
    protected QueryForm startDateForm;
    @XmlElement(name = "StartDateField")
    protected QueryField startDateField;
    @XmlElement(name = "StartDateBinary")
    protected Binary startDateBinary;
    @XmlElement(name = "StartDateCategorization")
    protected Categorization startDateCategorization;
    @XmlElement(name = "EndDateConstant")
    protected QueryConstant endDateConstant;
    @XmlElement(name = "EndDateField")
    protected QueryField endDateField;
    @XmlElement(name = "EndDateForm")
    protected QueryForm endDateForm;
    @XmlElement(name = "EndDateBinary")
    protected Binary endDateBinary;
    @XmlElement(name = "EndDateCategorization")
    protected Categorization endDateCategorization;
    @XmlElement(name = "EndDateFunction")
    protected Function endDateFunction;
    @XmlAttribute(name = "Period", required = true)
    protected PeriodType period;

    /**
     * Gets the value of the startDateConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getStartDateConstant() {
        return startDateConstant;
    }

    /**
     * Sets the value of the startDateConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setStartDateConstant(QueryConstant value) {
        this.startDateConstant = value;
    }

    /**
     * Gets the value of the startDateFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getStartDateFunction() {
        return startDateFunction;
    }

    /**
     * Sets the value of the startDateFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setStartDateFunction(Function value) {
        this.startDateFunction = value;
    }

    /**
     * Gets the value of the startDateForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getStartDateForm() {
        return startDateForm;
    }

    /**
     * Sets the value of the startDateForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setStartDateForm(QueryForm value) {
        this.startDateForm = value;
    }

    /**
     * Gets the value of the startDateField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getStartDateField() {
        return startDateField;
    }

    /**
     * Sets the value of the startDateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setStartDateField(QueryField value) {
        this.startDateField = value;
    }

    /**
     * Gets the value of the startDateBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getStartDateBinary() {
        return startDateBinary;
    }

    /**
     * Sets the value of the startDateBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setStartDateBinary(Binary value) {
        this.startDateBinary = value;
    }

    /**
     * Gets the value of the startDateCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getStartDateCategorization() {
        return startDateCategorization;
    }

    /**
     * Sets the value of the startDateCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setStartDateCategorization(Categorization value) {
        this.startDateCategorization = value;
    }

    /**
     * Gets the value of the endDateConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getEndDateConstant() {
        return endDateConstant;
    }

    /**
     * Sets the value of the endDateConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setEndDateConstant(QueryConstant value) {
        this.endDateConstant = value;
    }

    /**
     * Gets the value of the endDateField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getEndDateField() {
        return endDateField;
    }

    /**
     * Sets the value of the endDateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setEndDateField(QueryField value) {
        this.endDateField = value;
    }

    /**
     * Gets the value of the endDateForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getEndDateForm() {
        return endDateForm;
    }

    /**
     * Sets the value of the endDateForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setEndDateForm(QueryForm value) {
        this.endDateForm = value;
    }

    /**
     * Gets the value of the endDateBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getEndDateBinary() {
        return endDateBinary;
    }

    /**
     * Sets the value of the endDateBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setEndDateBinary(Binary value) {
        this.endDateBinary = value;
    }

    /**
     * Gets the value of the endDateCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getEndDateCategorization() {
        return endDateCategorization;
    }

    /**
     * Sets the value of the endDateCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setEndDateCategorization(Categorization value) {
        this.endDateCategorization = value;
    }

    /**
     * Gets the value of the endDateFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getEndDateFunction() {
        return endDateFunction;
    }

    /**
     * Sets the value of the endDateFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setEndDateFunction(Function value) {
        this.endDateFunction = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

}
