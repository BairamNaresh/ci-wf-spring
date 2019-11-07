
package com.nielsen.confirmit.webservices.authoring;

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
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="baseLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="useFallbackLanguage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fallbackLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "projectId",
    "targetLanguage",
    "baseLanguage",
    "useFallbackLanguage",
    "fallbackLanguage"
})
@XmlRootElement(name = "ExportTranslation")
public class ExportTranslation {

    protected String key;
    protected String projectId;
    protected int targetLanguage;
    protected int baseLanguage;
    protected boolean useFallbackLanguage;
    protected int fallbackLanguage;

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
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the targetLanguage property.
     * 
     */
    public int getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * Sets the value of the targetLanguage property.
     * 
     */
    public void setTargetLanguage(int value) {
        this.targetLanguage = value;
    }

    /**
     * Gets the value of the baseLanguage property.
     * 
     */
    public int getBaseLanguage() {
        return baseLanguage;
    }

    /**
     * Sets the value of the baseLanguage property.
     * 
     */
    public void setBaseLanguage(int value) {
        this.baseLanguage = value;
    }

    /**
     * Gets the value of the useFallbackLanguage property.
     * 
     */
    public boolean isUseFallbackLanguage() {
        return useFallbackLanguage;
    }

    /**
     * Sets the value of the useFallbackLanguage property.
     * 
     */
    public void setUseFallbackLanguage(boolean value) {
        this.useFallbackLanguage = value;
    }

    /**
     * Gets the value of the fallbackLanguage property.
     * 
     */
    public int getFallbackLanguage() {
        return fallbackLanguage;
    }

    /**
     * Sets the value of the fallbackLanguage property.
     * 
     */
    public void setFallbackLanguage(int value) {
        this.fallbackLanguage = value;
    }

}
