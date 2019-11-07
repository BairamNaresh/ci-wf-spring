
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}ReadFilterSimple"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Forms" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfString1" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAllForms" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeHiddenVariable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeRecodedVariable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeBackgroundVariable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFilter", propOrder = {
    "forms",
    "includeAllForms",
    "includeHiddenVariable",
    "includeRecodedVariable",
    "includeBackgroundVariable"
})
@XmlSeeAlso({
    PoetReadFilter.class
})
public class ReadFilter
    extends ReadFilterSimple
{

    @XmlElement(name = "Forms")
    protected ArrayOfString1 forms;
    @XmlElement(name = "IncludeAllForms")
    protected boolean includeAllForms;
    @XmlElement(name = "IncludeHiddenVariable")
    protected boolean includeHiddenVariable;
    @XmlElement(name = "IncludeRecodedVariable")
    protected boolean includeRecodedVariable;
    @XmlElement(name = "IncludeBackgroundVariable")
    protected boolean includeBackgroundVariable;

    /**
     * Gets the value of the forms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getForms() {
        return forms;
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setForms(ArrayOfString1 value) {
        this.forms = value;
    }

    /**
     * Gets the value of the includeAllForms property.
     * 
     */
    public boolean isIncludeAllForms() {
        return includeAllForms;
    }

    /**
     * Sets the value of the includeAllForms property.
     * 
     */
    public void setIncludeAllForms(boolean value) {
        this.includeAllForms = value;
    }

    /**
     * Gets the value of the includeHiddenVariable property.
     * 
     */
    public boolean isIncludeHiddenVariable() {
        return includeHiddenVariable;
    }

    /**
     * Sets the value of the includeHiddenVariable property.
     * 
     */
    public void setIncludeHiddenVariable(boolean value) {
        this.includeHiddenVariable = value;
    }

    /**
     * Gets the value of the includeRecodedVariable property.
     * 
     */
    public boolean isIncludeRecodedVariable() {
        return includeRecodedVariable;
    }

    /**
     * Sets the value of the includeRecodedVariable property.
     * 
     */
    public void setIncludeRecodedVariable(boolean value) {
        this.includeRecodedVariable = value;
    }

    /**
     * Gets the value of the includeBackgroundVariable property.
     * 
     */
    public boolean isIncludeBackgroundVariable() {
        return includeBackgroundVariable;
    }

    /**
     * Sets the value of the includeBackgroundVariable property.
     * 
     */
    public void setIncludeBackgroundVariable(boolean value) {
        this.includeBackgroundVariable = value;
    }

}
