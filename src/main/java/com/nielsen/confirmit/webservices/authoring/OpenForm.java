
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OpenForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionFormBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MaxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Indexed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsBitstreamVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Characteristic" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="IsDate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsGeolocation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AcceptLeadingZeros" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Unique" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReplicateDataForMultimode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Columns" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Precision" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Scale" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="LowerLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="UpperLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Rows" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Numeric" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReadOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Password" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LowerLimitType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}LowerLimitDataType" /&gt;
 *       &lt;attribute name="UpperLimitType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}UpperLimitDataType" /&gt;
 *       &lt;attribute name="Custom" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ResizableMode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="FormattingAssistance" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Slider" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="VerticalSlider" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SliderSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenForm", propOrder = {
    "minDate",
    "maxDate",
    "expression"
})
public class OpenForm
    extends QuestionFormBase
{

    @XmlElementRef(name = "MinDate", namespace = "http://firmglobal.com/Confirmit/webservices/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> minDate;
    @XmlElementRef(name = "MaxDate", namespace = "http://firmglobal.com/Confirmit/webservices/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> maxDate;
    @XmlElement(name = "Expression")
    protected String expression;
    @XmlAttribute(name = "Indexed", required = true)
    protected boolean indexed;
    @XmlAttribute(name = "IsBitstreamVariable", required = true)
    protected boolean isBitstreamVariable;
    @XmlAttribute(name = "Characteristic", required = true)
    protected int characteristic;
    @XmlAttribute(name = "IsDate", required = true)
    protected boolean isDate;
    @XmlAttribute(name = "IsGeolocation", required = true)
    protected boolean isGeolocation;
    @XmlAttribute(name = "AcceptLeadingZeros", required = true)
    protected boolean acceptLeadingZeros;
    @XmlAttribute(name = "Unique", required = true)
    protected boolean unique;
    @XmlAttribute(name = "ReplicateDataForMultimode", required = true)
    protected boolean replicateDataForMultimode;
    @XmlAttribute(name = "Columns", required = true)
    protected int columns;
    @XmlAttribute(name = "Precision", required = true)
    protected int precision;
    @XmlAttribute(name = "Scale", required = true)
    protected int scale;
    @XmlAttribute(name = "LowerLimit", required = true)
    protected double lowerLimit;
    @XmlAttribute(name = "UpperLimit", required = true)
    protected double upperLimit;
    @XmlAttribute(name = "Rows", required = true)
    protected int rows;
    @XmlAttribute(name = "Numeric", required = true)
    protected boolean numeric;
    @XmlAttribute(name = "ReadOnly", required = true)
    protected boolean readOnly;
    @XmlAttribute(name = "Password", required = true)
    protected boolean password;
    @XmlAttribute(name = "LowerLimitType", required = true)
    protected LowerLimitDataType lowerLimitType;
    @XmlAttribute(name = "UpperLimitType", required = true)
    protected UpperLimitDataType upperLimitType;
    @XmlAttribute(name = "Custom", required = true)
    protected boolean custom;
    @XmlAttribute(name = "ResizableMode", required = true)
    protected int resizableMode;
    @XmlAttribute(name = "FormattingAssistance", required = true)
    protected boolean formattingAssistance;
    @XmlAttribute(name = "Slider", required = true)
    protected boolean slider;
    @XmlAttribute(name = "VerticalSlider", required = true)
    protected boolean verticalSlider;
    @XmlAttribute(name = "SliderSize", required = true)
    protected int sliderSize;

    /**
     * Gets the value of the minDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMinDate() {
        return minDate;
    }

    /**
     * Sets the value of the minDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMinDate(JAXBElement<XMLGregorianCalendar> value) {
        this.minDate = value;
    }

    /**
     * Gets the value of the maxDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMaxDate() {
        return maxDate;
    }

    /**
     * Sets the value of the maxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMaxDate(JAXBElement<XMLGregorianCalendar> value) {
        this.maxDate = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the indexed property.
     * 
     */
    public boolean isIndexed() {
        return indexed;
    }

    /**
     * Sets the value of the indexed property.
     * 
     */
    public void setIndexed(boolean value) {
        this.indexed = value;
    }

    /**
     * Gets the value of the isBitstreamVariable property.
     * 
     */
    public boolean isIsBitstreamVariable() {
        return isBitstreamVariable;
    }

    /**
     * Sets the value of the isBitstreamVariable property.
     * 
     */
    public void setIsBitstreamVariable(boolean value) {
        this.isBitstreamVariable = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     */
    public int getCharacteristic() {
        return characteristic;
    }

    /**
     * Sets the value of the characteristic property.
     * 
     */
    public void setCharacteristic(int value) {
        this.characteristic = value;
    }

    /**
     * Gets the value of the isDate property.
     * 
     */
    public boolean isIsDate() {
        return isDate;
    }

    /**
     * Sets the value of the isDate property.
     * 
     */
    public void setIsDate(boolean value) {
        this.isDate = value;
    }

    /**
     * Gets the value of the isGeolocation property.
     * 
     */
    public boolean isIsGeolocation() {
        return isGeolocation;
    }

    /**
     * Sets the value of the isGeolocation property.
     * 
     */
    public void setIsGeolocation(boolean value) {
        this.isGeolocation = value;
    }

    /**
     * Gets the value of the acceptLeadingZeros property.
     * 
     */
    public boolean isAcceptLeadingZeros() {
        return acceptLeadingZeros;
    }

    /**
     * Sets the value of the acceptLeadingZeros property.
     * 
     */
    public void setAcceptLeadingZeros(boolean value) {
        this.acceptLeadingZeros = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     */
    public void setUnique(boolean value) {
        this.unique = value;
    }

    /**
     * Gets the value of the replicateDataForMultimode property.
     * 
     */
    public boolean isReplicateDataForMultimode() {
        return replicateDataForMultimode;
    }

    /**
     * Sets the value of the replicateDataForMultimode property.
     * 
     */
    public void setReplicateDataForMultimode(boolean value) {
        this.replicateDataForMultimode = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     */
    public void setColumns(int value) {
        this.columns = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     */
    public int getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     */
    public void setScale(int value) {
        this.scale = value;
    }

    /**
     * Gets the value of the lowerLimit property.
     * 
     */
    public double getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     */
    public void setLowerLimit(double value) {
        this.lowerLimit = value;
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     */
    public double getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     */
    public void setUpperLimit(double value) {
        this.upperLimit = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     */
    public int getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     */
    public void setRows(int value) {
        this.rows = value;
    }

    /**
     * Gets the value of the numeric property.
     * 
     */
    public boolean isNumeric() {
        return numeric;
    }

    /**
     * Sets the value of the numeric property.
     * 
     */
    public void setNumeric(boolean value) {
        this.numeric = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the password property.
     * 
     */
    public boolean isPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     */
    public void setPassword(boolean value) {
        this.password = value;
    }

    /**
     * Gets the value of the lowerLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link LowerLimitDataType }
     *     
     */
    public LowerLimitDataType getLowerLimitType() {
        return lowerLimitType;
    }

    /**
     * Sets the value of the lowerLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerLimitDataType }
     *     
     */
    public void setLowerLimitType(LowerLimitDataType value) {
        this.lowerLimitType = value;
    }

    /**
     * Gets the value of the upperLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link UpperLimitDataType }
     *     
     */
    public UpperLimitDataType getUpperLimitType() {
        return upperLimitType;
    }

    /**
     * Sets the value of the upperLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperLimitDataType }
     *     
     */
    public void setUpperLimitType(UpperLimitDataType value) {
        this.upperLimitType = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     */
    public void setCustom(boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the resizableMode property.
     * 
     */
    public int getResizableMode() {
        return resizableMode;
    }

    /**
     * Sets the value of the resizableMode property.
     * 
     */
    public void setResizableMode(int value) {
        this.resizableMode = value;
    }

    /**
     * Gets the value of the formattingAssistance property.
     * 
     */
    public boolean isFormattingAssistance() {
        return formattingAssistance;
    }

    /**
     * Sets the value of the formattingAssistance property.
     * 
     */
    public void setFormattingAssistance(boolean value) {
        this.formattingAssistance = value;
    }

    /**
     * Gets the value of the slider property.
     * 
     */
    public boolean isSlider() {
        return slider;
    }

    /**
     * Sets the value of the slider property.
     * 
     */
    public void setSlider(boolean value) {
        this.slider = value;
    }

    /**
     * Gets the value of the verticalSlider property.
     * 
     */
    public boolean isVerticalSlider() {
        return verticalSlider;
    }

    /**
     * Sets the value of the verticalSlider property.
     * 
     */
    public void setVerticalSlider(boolean value) {
        this.verticalSlider = value;
    }

    /**
     * Gets the value of the sliderSize property.
     * 
     */
    public int getSliderSize() {
        return sliderSize;
    }

    /**
     * Sets the value of the sliderSize property.
     * 
     */
    public void setSliderSize(int value) {
        this.sliderSize = value;
    }

}
