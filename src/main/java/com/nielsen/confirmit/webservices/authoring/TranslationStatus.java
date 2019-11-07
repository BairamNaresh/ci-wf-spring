
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TranslationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslationStatus"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://firmglobal.com/Confirmit/webservices/&gt;StatusType"&gt;
 *       &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslationStatus", propOrder = {
    "value"
})
public class TranslationStatus {

    @XmlValue
    protected StatusType value;
    @XmlAttribute(name = "Language", required = true)
    protected int language;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setValue(StatusType value) {
        this.value = value;
    }

    /**
     * Gets the value of the language property.
     * 
     */
    public int getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     */
    public void setLanguage(int value) {
        this.language = value;
    }

}
