
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DialCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DialCommand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}BaseTelephoneCommand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TelephoneVariable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DialingTexts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfCommandText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialCommand", propOrder = {
    "telephoneVariable",
    "dialingTexts"
})
public class DialCommand
    extends BaseTelephoneCommand
{

    @XmlElement(name = "TelephoneVariable")
    protected String telephoneVariable;
    @XmlElement(name = "DialingTexts")
    protected ArrayOfCommandText dialingTexts;

    /**
     * Gets the value of the telephoneVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneVariable() {
        return telephoneVariable;
    }

    /**
     * Sets the value of the telephoneVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneVariable(String value) {
        this.telephoneVariable = value;
    }

    /**
     * Gets the value of the dialingTexts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommandText }
     *     
     */
    public ArrayOfCommandText getDialingTexts() {
        return dialingTexts;
    }

    /**
     * Sets the value of the dialingTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommandText }
     *     
     */
    public void setDialingTexts(ArrayOfCommandText value) {
        this.dialingTexts = value;
    }

}
