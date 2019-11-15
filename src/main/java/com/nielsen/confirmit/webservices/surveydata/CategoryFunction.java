
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Category"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Function" type="{http://firmglobal.com/Confirmit/webservices/8.5/}UnaryType"/&gt;
 *         &lt;element name="CalculateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryFunction", propOrder = {
    "function",
    "calculateOnly"
})
public class CategoryFunction
    extends Category
{

    @XmlElement(name = "Function", required = true)
    @XmlSchemaType(name = "string")
    protected UnaryType function;
    @XmlElement(name = "CalculateOnly")
    protected boolean calculateOnly;

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link UnaryType }
     *     
     */
    public UnaryType getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnaryType }
     *     
     */
    public void setFunction(UnaryType value) {
        this.function = value;
    }

    /**
     * Gets the value of the calculateOnly property.
     * 
     */
    public boolean isCalculateOnly() {
        return calculateOnly;
    }

    /**
     * Sets the value of the calculateOnly property.
     * 
     */
    public void setCalculateOnly(boolean value) {
        this.calculateOnly = value;
    }

}
