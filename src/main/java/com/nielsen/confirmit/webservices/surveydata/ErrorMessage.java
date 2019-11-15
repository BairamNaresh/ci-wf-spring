
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorInfoElements" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfErrorInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Table" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Row" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorMessage", propOrder = {
    "errorInfoElements"
})
public class ErrorMessage {

    @XmlElement(name = "ErrorInfoElements")
    protected ArrayOfErrorInfo errorInfoElements;
    @XmlAttribute(name = "Table")
    protected String table;
    @XmlAttribute(name = "Row")
    protected String row;

    /**
     * Gets the value of the errorInfoElements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorInfo }
     *     
     */
    public ArrayOfErrorInfo getErrorInfoElements() {
        return errorInfoElements;
    }

    /**
     * Sets the value of the errorInfoElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorInfo }
     *     
     */
    public void setErrorInfoElements(ArrayOfErrorInfo value) {
        this.errorInfoElements = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRow(String value) {
        this.row = value;
    }

}
