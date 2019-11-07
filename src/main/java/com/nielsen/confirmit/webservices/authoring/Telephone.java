
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Telephone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Telephone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneCommand" type="{http://firmglobal.com/Confirmit/webservices/}BaseTelephoneCommand" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TelephoneCommandType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TelephoneCommandType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telephone", propOrder = {
    "name",
    "telephoneCommand"
})
public class Telephone
    extends QuestionnaireNode
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TelephoneCommand")
    protected BaseTelephoneCommand telephoneCommand;
    @XmlAttribute(name = "TelephoneCommandType", required = true)
    protected TelephoneCommandType telephoneCommandType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the telephoneCommand property.
     * 
     * @return
     *     possible object is
     *     {@link BaseTelephoneCommand }
     *     
     */
    public BaseTelephoneCommand getTelephoneCommand() {
        return telephoneCommand;
    }

    /**
     * Sets the value of the telephoneCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseTelephoneCommand }
     *     
     */
    public void setTelephoneCommand(BaseTelephoneCommand value) {
        this.telephoneCommand = value;
    }

    /**
     * Gets the value of the telephoneCommandType property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneCommandType }
     *     
     */
    public TelephoneCommandType getTelephoneCommandType() {
        return telephoneCommandType;
    }

    /**
     * Sets the value of the telephoneCommandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneCommandType }
     *     
     */
    public void setTelephoneCommandType(TelephoneCommandType value) {
        this.telephoneCommandType = value;
    }

}
