
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LangSpecString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LangSpecString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="LanguageString" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LanguageValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LanguageId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LangSpecString")
public class LangSpecString {

    @XmlAttribute(name = "LanguageString")
    protected String languageString;
    @XmlAttribute(name = "LanguageValue")
    protected String languageValue;
    @XmlAttribute(name = "LanguageId", required = true)
    protected int languageId;

    /**
     * Gets the value of the languageString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageString() {
        return languageString;
    }

    /**
     * Sets the value of the languageString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageString(String value) {
        this.languageString = value;
    }

    /**
     * Gets the value of the languageValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageValue() {
        return languageValue;
    }

    /**
     * Sets the value of the languageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageValue(String value) {
        this.languageValue = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     */
    public int getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     */
    public void setLanguageId(int value) {
        this.languageId = value;
    }

}
