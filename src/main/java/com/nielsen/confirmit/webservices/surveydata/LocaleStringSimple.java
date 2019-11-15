
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocaleStringSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocaleStringSimple"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}LocaleString"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Strings" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfLanguageString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocaleStringSimple", propOrder = {
    "strings"
})
public class LocaleStringSimple
    extends LocaleString
{

    @XmlElement(name = "Strings")
    protected ArrayOfLanguageString strings;

    /**
     * Gets the value of the strings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString }
     *     
     */
    public ArrayOfLanguageString getStrings() {
        return strings;
    }

    /**
     * Sets the value of the strings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString }
     *     
     */
    public void setStrings(ArrayOfLanguageString value) {
        this.strings = value;
    }

}
