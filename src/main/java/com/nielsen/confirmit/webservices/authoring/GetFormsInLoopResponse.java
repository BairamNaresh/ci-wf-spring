
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
 *         &lt;element name="GetFormsInLoopResult" type="{http://firmglobal.com/Confirmit/webservices/}SurveySchema" minOccurs="0"/&gt;
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
    "getFormsInLoopResult"
})
@XmlRootElement(name = "GetFormsInLoopResponse")
public class GetFormsInLoopResponse {

    @XmlElement(name = "GetFormsInLoopResult")
    protected SurveySchema getFormsInLoopResult;

    /**
     * Gets the value of the getFormsInLoopResult property.
     * 
     * @return
     *     possible object is
     *     {@link SurveySchema }
     *     
     */
    public SurveySchema getGetFormsInLoopResult() {
        return getFormsInLoopResult;
    }

    /**
     * Sets the value of the getFormsInLoopResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveySchema }
     *     
     */
    public void setGetFormsInLoopResult(SurveySchema value) {
        this.getFormsInLoopResult = value;
    }

}
