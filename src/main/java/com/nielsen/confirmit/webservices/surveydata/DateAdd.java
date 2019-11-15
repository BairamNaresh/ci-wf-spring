
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAdd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAdd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="DateBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" minOccurs="0"/&gt;
 *           &lt;element name="DateFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="DateConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="DateField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="DateForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="DateCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
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
@XmlType(name = "DateAdd", propOrder = {
    "number",
    "dateBinary",
    "dateFunction",
    "dateConstant",
    "dateField",
    "dateForm",
    "dateCategorization"
})
public class DateAdd
    extends Function
{

    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "DateBinary")
    protected Binary dateBinary;
    @XmlElement(name = "DateFunction")
    protected Function dateFunction;
    @XmlElement(name = "DateConstant")
    protected QueryConstant dateConstant;
    @XmlElement(name = "DateField")
    protected QueryField dateField;
    @XmlElement(name = "DateForm")
    protected QueryForm dateForm;
    @XmlElement(name = "DateCategorization")
    protected Categorization dateCategorization;
    @XmlAttribute(name = "Period", required = true)
    protected PeriodType period;

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the dateBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getDateBinary() {
        return dateBinary;
    }

    /**
     * Sets the value of the dateBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setDateBinary(Binary value) {
        this.dateBinary = value;
    }

    /**
     * Gets the value of the dateFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getDateFunction() {
        return dateFunction;
    }

    /**
     * Sets the value of the dateFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setDateFunction(Function value) {
        this.dateFunction = value;
    }

    /**
     * Gets the value of the dateConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getDateConstant() {
        return dateConstant;
    }

    /**
     * Sets the value of the dateConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setDateConstant(QueryConstant value) {
        this.dateConstant = value;
    }

    /**
     * Gets the value of the dateField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getDateField() {
        return dateField;
    }

    /**
     * Sets the value of the dateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setDateField(QueryField value) {
        this.dateField = value;
    }

    /**
     * Gets the value of the dateForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getDateForm() {
        return dateForm;
    }

    /**
     * Sets the value of the dateForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setDateForm(QueryForm value) {
        this.dateForm = value;
    }

    /**
     * Gets the value of the dateCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getDateCategorization() {
        return dateCategorization;
    }

    /**
     * Sets the value of the dateCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setDateCategorization(Categorization value) {
        this.dateCategorization = value;
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
