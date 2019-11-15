
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Category"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryProject" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://firmglobal.com/Confirmit/webservices/8.5/}LocaleString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
    "project",
    "name"
})
@XmlSeeAlso({
    CategoryFunction.class,
    CategoryField.class,
    CategoryFormElements.class,
    CategoryAnswer.class
})
public class Category {

    @XmlElement(name = "Project")
    protected QueryProject project;
    @XmlElement(name = "Name")
    protected LocaleString name;
    @XmlAttribute(name = "Code")
    protected String code;

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link QueryProject }
     *     
     */
    public QueryProject getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProject }
     *     
     */
    public void setProject(QueryProject value) {
        this.project = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleString }
     *     
     */
    public LocaleString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleString }
     *     
     */
    public void setName(LocaleString value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
