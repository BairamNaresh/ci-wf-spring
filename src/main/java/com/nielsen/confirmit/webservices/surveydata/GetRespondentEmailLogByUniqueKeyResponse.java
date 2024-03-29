
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="GetRespondentEmailLogByUniqueKeyResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any minOccurs="2"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "getRespondentEmailLogByUniqueKeyResult"
})
@XmlRootElement(name = "GetRespondentEmailLogByUniqueKeyResponse")
public class GetRespondentEmailLogByUniqueKeyResponse {

    @XmlElement(name = "GetRespondentEmailLogByUniqueKeyResult")
    protected GetRespondentEmailLogByUniqueKeyResponse.GetRespondentEmailLogByUniqueKeyResult getRespondentEmailLogByUniqueKeyResult;

    /**
     * Gets the value of the getRespondentEmailLogByUniqueKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetRespondentEmailLogByUniqueKeyResponse.GetRespondentEmailLogByUniqueKeyResult }
     *     
     */
    public GetRespondentEmailLogByUniqueKeyResponse.GetRespondentEmailLogByUniqueKeyResult getGetRespondentEmailLogByUniqueKeyResult() {
        return getRespondentEmailLogByUniqueKeyResult;
    }

    /**
     * Sets the value of the getRespondentEmailLogByUniqueKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRespondentEmailLogByUniqueKeyResponse.GetRespondentEmailLogByUniqueKeyResult }
     *     
     */
    public void setGetRespondentEmailLogByUniqueKeyResult(GetRespondentEmailLogByUniqueKeyResponse.GetRespondentEmailLogByUniqueKeyResult value) {
        this.getRespondentEmailLogByUniqueKeyResult = value;
    }


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
     *         &lt;any minOccurs="2"/&gt;
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
        "any"
    })
    public static class GetRespondentEmailLogByUniqueKeyResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
