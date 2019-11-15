
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeseriesDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeseriesDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}CyclicDimension"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Units" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfUnitType" minOccurs="0"/&gt;
 *         &lt;element name="SubDimensions" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfSimpleDimension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="EndDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DayOfWeek" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}DayOfWeek" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeseriesDimension", propOrder = {
    "units",
    "subDimensions"
})
public class TimeseriesDimension
    extends CyclicDimension
{

    @XmlElement(name = "Units")
    protected ArrayOfUnitType units;
    @XmlElement(name = "SubDimensions")
    protected ArrayOfSimpleDimension subDimensions;
    @XmlAttribute(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "DayOfWeek", required = true)
    protected DayOfWeek dayOfWeek;

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitType }
     *     
     */
    public ArrayOfUnitType getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitType }
     *     
     */
    public void setUnits(ArrayOfUnitType value) {
        this.units = value;
    }

    /**
     * Gets the value of the subDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimpleDimension }
     *     
     */
    public ArrayOfSimpleDimension getSubDimensions() {
        return subDimensions;
    }

    /**
     * Sets the value of the subDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimpleDimension }
     *     
     */
    public void setSubDimensions(ArrayOfSimpleDimension value) {
        this.subDimensions = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setDayOfWeek(DayOfWeek value) {
        this.dayOfWeek = value;
    }

}
