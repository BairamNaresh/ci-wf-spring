
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowIgnoreDialingCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowIgnoreDialingCommand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}BaseTelephoneCommand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowDialing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowIgnoreDialingCommand", propOrder = {
    "allowDialing"
})
public class AllowIgnoreDialingCommand
    extends BaseTelephoneCommand
{

    @XmlElement(name = "AllowDialing")
    protected boolean allowDialing;

    /**
     * Gets the value of the allowDialing property.
     * 
     */
    public boolean isAllowDialing() {
        return allowDialing;
    }

    /**
     * Sets the value of the allowDialing property.
     * 
     */
    public void setAllowDialing(boolean value) {
        this.allowDialing = value;
    }

}
