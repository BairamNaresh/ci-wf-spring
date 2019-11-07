
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="readFilterSimple" type="{http://firmglobal.com/Confirmit/webservices/}ReadFilterSimple" minOccurs="0"/&gt;
 *         &lt;element name="schemaSource" type="{http://firmglobal.com/Confirmit/webservices/}SchemaSourceType"/&gt;
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
    "name",
    "readFilterSimple",
    "schemaSource"
})
@XmlRootElement(name = "GetFormByName")
public class GetFormByName {

    protected String key;
    protected String projectId;
    protected String name;
    protected ReadFilterSimple readFilterSimple;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SchemaSourceType schemaSource;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the readFilterSimple property.
     * 
     * @return
     *     possible object is
     *     {@link ReadFilterSimple }
     *     
     */
    public ReadFilterSimple getReadFilterSimple() {
        return readFilterSimple;
    }

    /**
     * Sets the value of the readFilterSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadFilterSimple }
     *     
     */
    public void setReadFilterSimple(ReadFilterSimple value) {
        this.readFilterSimple = value;
    }

    /**
     * Gets the value of the schemaSource property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaSourceType }
     *     
     */
    public SchemaSourceType getSchemaSource() {
        return schemaSource;
    }

    /**
     * Sets the value of the schemaSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaSourceType }
     *     
     */
    public void setSchemaSource(SchemaSourceType value) {
        this.schemaSource = value;
    }

}
