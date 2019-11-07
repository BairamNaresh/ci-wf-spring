
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormPoetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="_Objid_Xml" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormReference", propOrder = {
    "formPoetId",
    "name"
})
public class FormReference {

    @XmlElement(name = "FormPoetId")
    protected String formPoetId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlAttribute(name = "_Objid_Xml")
    protected String objidXml;

    /**
     * Gets the value of the formPoetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormPoetId() {
        return formPoetId;
    }

    /**
     * Sets the value of the formPoetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormPoetId(String value) {
        this.formPoetId = value;
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
     * Gets the value of the objidXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjidXml() {
        return objidXml;
    }

    /**
     * Sets the value of the objidXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjidXml(String value) {
        this.objidXml = value;
    }

}
