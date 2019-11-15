
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferDef" type="{http://firmglobal.com/Confirmit/webservices/8.5/}TransferDefBase" minOccurs="0"/&gt;
 *         &lt;element name="token" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ResponseToken" minOccurs="0"/&gt;
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
    "key",
    "transferDef",
    "token"
})
@XmlRootElement(name = "GetData")
public class GetData {

    protected String key;
    protected TransferDefBase transferDef;
    protected ResponseToken token;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the transferDef property.
     * 
     * @return
     *     possible object is
     *     {@link TransferDefBase }
     *     
     */
    public TransferDefBase getTransferDef() {
        return transferDef;
    }

    /**
     * Sets the value of the transferDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDefBase }
     *     
     */
    public void setTransferDef(TransferDefBase value) {
        this.transferDef = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseToken }
     *     
     */
    public ResponseToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseToken }
     *     
     */
    public void setToken(ResponseToken value) {
        this.token = value;
    }

}
