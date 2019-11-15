
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnowflakeDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SnowflakeDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Dimension"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubDimensions" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfSimpleDimension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LoadUsedCombinations" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnowflakeDimension", propOrder = {
    "subDimensions"
})
public class SnowflakeDimension
    extends Dimension
{

    @XmlElement(name = "SubDimensions")
    protected ArrayOfSimpleDimension subDimensions;
    @XmlAttribute(name = "LoadUsedCombinations", required = true)
    protected boolean loadUsedCombinations;

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
     * Gets the value of the loadUsedCombinations property.
     * 
     */
    public boolean isLoadUsedCombinations() {
        return loadUsedCombinations;
    }

    /**
     * Sets the value of the loadUsedCombinations property.
     * 
     */
    public void setLoadUsedCombinations(boolean value) {
        this.loadUsedCombinations = value;
    }

}
