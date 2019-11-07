
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoopLevelReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoopLevelReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}AnswerBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoopLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoopLevelReference", propOrder = {
    "loopLevelName"
})
public class LoopLevelReference
    extends AnswerBase
{

    @XmlElement(name = "LoopLevelName")
    protected String loopLevelName;

    /**
     * Gets the value of the loopLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopLevelName() {
        return loopLevelName;
    }

    /**
     * Sets the value of the loopLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopLevelName(String value) {
        this.loopLevelName = value;
    }

}
