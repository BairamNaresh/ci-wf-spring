
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GetSurveyStatusResult" type="{http://firmglobal.com/Confirmit/webservices/}SurveyStatusType"/&gt;
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
    "getSurveyStatusResult"
})
@XmlRootElement(name = "GetSurveyStatusResponse")
public class GetSurveyStatusResponse {

    @XmlElement(name = "GetSurveyStatusResult", required = true)
    @XmlSchemaType(name = "string")
    protected SurveyStatusType getSurveyStatusResult;

    /**
     * Gets the value of the getSurveyStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyStatusType }
     *     
     */
    public SurveyStatusType getGetSurveyStatusResult() {
        return getSurveyStatusResult;
    }

    /**
     * Sets the value of the getSurveyStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyStatusType }
     *     
     */
    public void setGetSurveyStatusResult(SurveyStatusType value) {
        this.getSurveyStatusResult = value;
    }

}
