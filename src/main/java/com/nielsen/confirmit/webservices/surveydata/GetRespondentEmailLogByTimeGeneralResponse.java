
package com.nielsen.confirmit.webservices.surveydata;

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
 *         &lt;element name="GetRespondentEmailLogByTimeGeneralResult" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ConfirmitData" minOccurs="0"/&gt;
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
    "getRespondentEmailLogByTimeGeneralResult"
})
@XmlRootElement(name = "GetRespondentEmailLogByTimeGeneralResponse")
public class GetRespondentEmailLogByTimeGeneralResponse {

    @XmlElement(name = "GetRespondentEmailLogByTimeGeneralResult")
    protected ConfirmitData getRespondentEmailLogByTimeGeneralResult;

    /**
     * Gets the value of the getRespondentEmailLogByTimeGeneralResult property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmitData }
     *     
     */
    public ConfirmitData getGetRespondentEmailLogByTimeGeneralResult() {
        return getRespondentEmailLogByTimeGeneralResult;
    }

    /**
     * Sets the value of the getRespondentEmailLogByTimeGeneralResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmitData }
     *     
     */
    public void setGetRespondentEmailLogByTimeGeneralResult(ConfirmitData value) {
        this.getRespondentEmailLogByTimeGeneralResult = value;
    }

}
