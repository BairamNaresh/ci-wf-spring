
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangedDataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangedDataResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ChangedData" minOccurs="0"/&gt;
 *         &lt;element name="ResponseToken" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ResponseToken" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangedDataResult", propOrder = {
    "result",
    "responseToken"
})
public class ChangedDataResult {

    @XmlElement(name = "Result")
    protected ChangedData result;
    @XmlElement(name = "ResponseToken")
    protected ResponseToken responseToken;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ChangedData }
     *     
     */
    public ChangedData getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedData }
     *     
     */
    public void setResult(ChangedData value) {
        this.result = value;
    }

    /**
     * Gets the value of the responseToken property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseToken }
     *     
     */
    public ResponseToken getResponseToken() {
        return responseToken;
    }

    /**
     * Sets the value of the responseToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseToken }
     *     
     */
    public void setResponseToken(ResponseToken value) {
        this.responseToken = value;
    }

}
