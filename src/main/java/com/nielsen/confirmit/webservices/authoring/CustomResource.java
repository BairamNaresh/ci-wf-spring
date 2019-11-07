
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalizedString" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLangSpecString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomResource", propOrder = {
    "id",
    "localizedString"
})
public class CustomResource {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "LocalizedString")
    protected ArrayOfLangSpecString localizedString;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the localizedString property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLangSpecString }
     *     
     */
    public ArrayOfLangSpecString getLocalizedString() {
        return localizedString;
    }

    /**
     * Sets the value of the localizedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLangSpecString }
     *     
     */
    public void setLocalizedString(ArrayOfLangSpecString value) {
        this.localizedString = value;
    }

}
