
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Levels" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfChangedDataLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangedData", propOrder = {
    "levels"
})
public class ChangedData {

    @XmlElement(name = "Levels")
    protected ArrayOfChangedDataLevel levels;

    /**
     * Gets the value of the levels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChangedDataLevel }
     *     
     */
    public ArrayOfChangedDataLevel getLevels() {
        return levels;
    }

    /**
     * Sets the value of the levels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChangedDataLevel }
     *     
     */
    public void setLevels(ArrayOfChangedDataLevel value) {
        this.levels = value;
    }

}
