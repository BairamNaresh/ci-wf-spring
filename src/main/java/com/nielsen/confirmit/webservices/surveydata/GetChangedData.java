
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
 *         &lt;element name="transferDef" type="{http://firmglobal.com/Confirmit/webservices/8.5/}TransferDef" minOccurs="0"/&gt;
 *         &lt;element name="token" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ResponseToken" minOccurs="0"/&gt;
 *         &lt;element name="lastSynchronizedVersion" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "token",
    "lastSynchronizedVersion"
})
@XmlRootElement(name = "GetChangedData")
public class GetChangedData {

    protected String key;
    protected TransferDef transferDef;
    protected ResponseToken token;
    protected long lastSynchronizedVersion;

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
     *     {@link TransferDef }
     *     
     */
    public TransferDef getTransferDef() {
        return transferDef;
    }

    /**
     * Sets the value of the transferDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDef }
     *     
     */
    public void setTransferDef(TransferDef value) {
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

    /**
     * Gets the value of the lastSynchronizedVersion property.
     * 
     */
    public long getLastSynchronizedVersion() {
        return lastSynchronizedVersion;
    }

    /**
     * Sets the value of the lastSynchronizedVersion property.
     * 
     */
    public void setLastSynchronizedVersion(long value) {
        this.lastSynchronizedVersion = value;
    }

}
