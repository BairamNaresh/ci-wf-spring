
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
 *         &lt;element name="IsRespondentUniqueKeyResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isRespondentUniqueKeyResult"
})
@XmlRootElement(name = "IsRespondentUniqueKeyResponse")
public class IsRespondentUniqueKeyResponse {

    @XmlElement(name = "IsRespondentUniqueKeyResult")
    protected boolean isRespondentUniqueKeyResult;

    /**
     * Gets the value of the isRespondentUniqueKeyResult property.
     * 
     */
    public boolean isIsRespondentUniqueKeyResult() {
        return isRespondentUniqueKeyResult;
    }

    /**
     * Sets the value of the isRespondentUniqueKeyResult property.
     * 
     */
    public void setIsRespondentUniqueKeyResult(boolean value) {
        this.isRespondentUniqueKeyResult = value;
    }

}
