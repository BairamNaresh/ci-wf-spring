
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedScriptBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedScriptBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedScriptBase", propOrder = {
    "currentForm"
})
@XmlSeeAlso({
    IncludeExcludeWithPrecodes.class,
    RandomCategorySelection.class,
    Redirect.class,
    IncludeExclude.class,
    AssignRequestValues.class,
    MaskOnQuestion.class
})
public abstract class PredefinedScriptBase {

    @XmlElement(name = "CurrentForm")
    protected String currentForm;

    /**
     * Gets the value of the currentForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentForm() {
        return currentForm;
    }

    /**
     * Sets the value of the currentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentForm(String value) {
        this.currentForm = value;
    }

}
