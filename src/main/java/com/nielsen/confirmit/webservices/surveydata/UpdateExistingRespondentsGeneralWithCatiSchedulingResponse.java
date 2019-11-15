
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
 *         &lt;element name="UpdateExistingRespondentsGeneralWithCatiSchedulingResult" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfErrorMessage" minOccurs="0"/&gt;
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
    "updateExistingRespondentsGeneralWithCatiSchedulingResult"
})
@XmlRootElement(name = "UpdateExistingRespondentsGeneralWithCatiSchedulingResponse")
public class UpdateExistingRespondentsGeneralWithCatiSchedulingResponse {

    @XmlElement(name = "UpdateExistingRespondentsGeneralWithCatiSchedulingResult")
    protected ArrayOfErrorMessage updateExistingRespondentsGeneralWithCatiSchedulingResult;

    /**
     * Gets the value of the updateExistingRespondentsGeneralWithCatiSchedulingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorMessage }
     *     
     */
    public ArrayOfErrorMessage getUpdateExistingRespondentsGeneralWithCatiSchedulingResult() {
        return updateExistingRespondentsGeneralWithCatiSchedulingResult;
    }

    /**
     * Sets the value of the updateExistingRespondentsGeneralWithCatiSchedulingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorMessage }
     *     
     */
    public void setUpdateExistingRespondentsGeneralWithCatiSchedulingResult(ArrayOfErrorMessage value) {
        this.updateExistingRespondentsGeneralWithCatiSchedulingResult = value;
    }

}
