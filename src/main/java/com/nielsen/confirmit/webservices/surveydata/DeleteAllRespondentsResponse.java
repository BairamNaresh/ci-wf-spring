
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
 *         &lt;element name="DeleteAllRespondentsResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "deleteAllRespondentsResult"
})
@XmlRootElement(name = "DeleteAllRespondentsResponse")
public class DeleteAllRespondentsResponse {

    @XmlElement(name = "DeleteAllRespondentsResult")
    protected int deleteAllRespondentsResult;

    /**
     * Gets the value of the deleteAllRespondentsResult property.
     * 
     */
    public int getDeleteAllRespondentsResult() {
        return deleteAllRespondentsResult;
    }

    /**
     * Sets the value of the deleteAllRespondentsResult property.
     * 
     */
    public void setDeleteAllRespondentsResult(int value) {
        this.deleteAllRespondentsResult = value;
    }

}
