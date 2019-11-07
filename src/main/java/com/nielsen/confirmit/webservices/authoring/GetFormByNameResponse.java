
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
 *         &lt;element name="GetFormByNameResult" type="{http://firmglobal.com/Confirmit/webservices/}SurveySchema" minOccurs="0"/&gt;
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
    "getFormByNameResult"
})
@XmlRootElement(name = "GetFormByNameResponse")
public class GetFormByNameResponse {

    @XmlElement(name = "GetFormByNameResult")
    protected SurveySchema getFormByNameResult;

    /**
     * Gets the value of the getFormByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link SurveySchema }
     *     
     */
    public SurveySchema getGetFormByNameResult() {
        return getFormByNameResult;
    }

    /**
     * Sets the value of the getFormByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveySchema }
     *     
     */
    public void setGetFormByNameResult(SurveySchema value) {
        this.getFormByNameResult = value;
    }

}
