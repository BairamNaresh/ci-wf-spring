
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
 *         &lt;element name="GetCustomProjectInfoFieldResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getCustomProjectInfoFieldResult"
})
@XmlRootElement(name = "GetCustomProjectInfoFieldResponse")
public class GetCustomProjectInfoFieldResponse {

    @XmlElement(name = "GetCustomProjectInfoFieldResult")
    protected String getCustomProjectInfoFieldResult;

    /**
     * Gets the value of the getCustomProjectInfoFieldResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCustomProjectInfoFieldResult() {
        return getCustomProjectInfoFieldResult;
    }

    /**
     * Sets the value of the getCustomProjectInfoFieldResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCustomProjectInfoFieldResult(String value) {
        this.getCustomProjectInfoFieldResult = value;
    }

}
