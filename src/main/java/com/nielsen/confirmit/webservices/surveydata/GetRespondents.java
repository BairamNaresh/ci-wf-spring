
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="respondentTransferDef" type="{http://firmglobal.com/Confirmit/webservices/8.5/}RespondentTransferDef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "key",
    "respondentTransferDef"
})
@XmlRootElement(name = "GetRespondents")
public class GetRespondents {

    protected String key;
    protected RespondentTransferDef respondentTransferDef;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the respondentTransferDef property.
     * 
     * @return
     *     possible object is
     *     {@link RespondentTransferDef }
     *     
     */
    public RespondentTransferDef getRespondentTransferDef() {
        return respondentTransferDef;
    }

    /**
     * Sets the value of the respondentTransferDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondentTransferDef }
     *     
     */
    public void setRespondentTransferDef(RespondentTransferDef value) {
        this.respondentTransferDef = value;
    }

}
