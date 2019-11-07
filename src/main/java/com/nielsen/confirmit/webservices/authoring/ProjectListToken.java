
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectListToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectListToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AtEnd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HasError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectListToken", propOrder = {
    "lastId",
    "atEnd",
    "hasError"
})
public class ProjectListToken {

    @XmlElement(name = "LastId")
    protected String lastId;
    @XmlElement(name = "AtEnd")
    protected boolean atEnd;
    @XmlElement(name = "HasError")
    protected boolean hasError;

    /**
     * Gets the value of the lastId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastId() {
        return lastId;
    }

    /**
     * Sets the value of the lastId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastId(String value) {
        this.lastId = value;
    }

    /**
     * Gets the value of the atEnd property.
     * 
     */
    public boolean isAtEnd() {
        return atEnd;
    }

    /**
     * Sets the value of the atEnd property.
     * 
     */
    public void setAtEnd(boolean value) {
        this.atEnd = value;
    }

    /**
     * Gets the value of the hasError property.
     * 
     */
    public boolean isHasError() {
        return hasError;
    }

    /**
     * Sets the value of the hasError property.
     * 
     */
    public void setHasError(boolean value) {
        this.hasError = value;
    }

}
