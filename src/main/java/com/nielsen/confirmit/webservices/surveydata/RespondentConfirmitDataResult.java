
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespondentConfirmitDataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondentConfirmitDataResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ConfirmitData" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://firmglobal.com/Confirmit/webservices/8.5/}RespondentToken" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondentConfirmitDataResult", propOrder = {
    "result",
    "token"
})
public class RespondentConfirmitDataResult {

    @XmlElement(name = "Result")
    protected ConfirmitData result;
    @XmlElement(name = "Token")
    protected RespondentToken token;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmitData }
     *     
     */
    public ConfirmitData getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmitData }
     *     
     */
    public void setResult(ConfirmitData value) {
        this.result = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link RespondentToken }
     *     
     */
    public RespondentToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondentToken }
     *     
     */
    public void setToken(RespondentToken value) {
        this.token = value;
    }

}
