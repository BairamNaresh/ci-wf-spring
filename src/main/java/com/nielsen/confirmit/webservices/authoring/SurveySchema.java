
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurveySchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurveySchema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadFilter" type="{http://firmglobal.com/Confirmit/webservices/}ReadFilter" minOccurs="0"/&gt;
 *         &lt;element name="Root" type="{http://firmglobal.com/Confirmit/webservices/}Root" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://firmglobal.com/Confirmit/webservices/}StateType"/&gt;
 *         &lt;element name="SchemaSource" type="{http://firmglobal.com/Confirmit/webservices/}SchemaSourceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurveySchema", propOrder = {
    "readFilter",
    "root",
    "state",
    "schemaSource"
})
public class SurveySchema {

    @XmlElement(name = "ReadFilter")
    protected ReadFilter readFilter;
    @XmlElement(name = "Root")
    protected Root root;
    @XmlElement(name = "State", required = true)
    @XmlSchemaType(name = "string")
    protected StateType state;
    @XmlElement(name = "SchemaSource", required = true)
    @XmlSchemaType(name = "string")
    protected SchemaSourceType schemaSource;

    /**
     * Gets the value of the readFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReadFilter }
     *     
     */
    public ReadFilter getReadFilter() {
        return readFilter;
    }

    /**
     * Sets the value of the readFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadFilter }
     *     
     */
    public void setReadFilter(ReadFilter value) {
        this.readFilter = value;
    }

    /**
     * Gets the value of the root property.
     * 
     * @return
     *     possible object is
     *     {@link Root }
     *     
     */
    public Root getRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     * 
     * @param value
     *     allowed object is
     *     {@link Root }
     *     
     */
    public void setRoot(Root value) {
        this.root = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
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
