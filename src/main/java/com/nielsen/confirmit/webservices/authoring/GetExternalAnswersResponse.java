
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
 *         &lt;element name="GetExternalAnswersResult" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfAnswerBase" minOccurs="0"/&gt;
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
    "getExternalAnswersResult"
})
@XmlRootElement(name = "GetExternalAnswersResponse")
public class GetExternalAnswersResponse {

    @XmlElement(name = "GetExternalAnswersResult")
    protected ArrayOfAnswerBase getExternalAnswersResult;

    /**
     * Gets the value of the getExternalAnswersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnswerBase }
     *     
     */
    public ArrayOfAnswerBase getGetExternalAnswersResult() {
        return getExternalAnswersResult;
    }

    /**
     * Sets the value of the getExternalAnswersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnswerBase }
     *     
     */
    public void setGetExternalAnswersResult(ArrayOfAnswerBase value) {
        this.getExternalAnswersResult = value;
    }

}
