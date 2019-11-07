
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
 *         &lt;element name="GetProjectEmailObjectsResult" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfEmailObject" minOccurs="0"/&gt;
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
    "getProjectEmailObjectsResult"
})
@XmlRootElement(name = "GetProjectEmailObjectsResponse")
public class GetProjectEmailObjectsResponse {

    @XmlElement(name = "GetProjectEmailObjectsResult")
    protected ArrayOfEmailObject getProjectEmailObjectsResult;

    /**
     * Gets the value of the getProjectEmailObjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailObject }
     *     
     */
    public ArrayOfEmailObject getGetProjectEmailObjectsResult() {
        return getProjectEmailObjectsResult;
    }

    /**
     * Sets the value of the getProjectEmailObjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailObject }
     *     
     */
    public void setGetProjectEmailObjectsResult(ArrayOfEmailObject value) {
        this.getProjectEmailObjectsResult = value;
    }

}
