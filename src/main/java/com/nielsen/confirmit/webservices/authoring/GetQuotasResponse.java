
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetQuotasResult" type="{http://firmglobal.com/Confirmit/webservices/}SurveySchema" minOccurs="0"/&gt;
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
    "getQuotasResult"
})
@XmlRootElement(name = "GetQuotasResponse")
public class GetQuotasResponse {

    @XmlElement(name = "GetQuotasResult")
    protected SurveySchema getQuotasResult;

    /**
     * Gets the value of the getQuotasResult property.
     * 
     * @return
     *     possible object is
     *     {@link SurveySchema }
     *     
     */
    public SurveySchema getGetQuotasResult() {
        return getQuotasResult;
    }

    /**
     * Sets the value of the getQuotasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveySchema }
     *     
     */
    public void setGetQuotasResult(SurveySchema value) {
        this.getQuotasResult = value;
    }

}
