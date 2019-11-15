
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmitData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmitData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataLevels" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfDataLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmitData", propOrder = {
    "dataLevels"
})
public class ConfirmitData {

    @XmlElement(name = "DataLevels")
    protected ArrayOfDataLevel dataLevels;

    /**
     * Gets the value of the dataLevels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDataLevel }
     *     
     */
    public ArrayOfDataLevel getDataLevels() {
        return dataLevels;
    }

    /**
     * Sets the value of the dataLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDataLevel }
     *     
     */
    public void setDataLevels(ArrayOfDataLevel value) {
        this.dataLevels = value;
    }

}
