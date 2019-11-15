
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Categorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Categorization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryProject" minOccurs="0"/&gt;
 *         &lt;element name="OverrideTexts" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfTextForCategory" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://firmglobal.com/Confirmit/webservices/8.5/}LocaleString" minOccurs="0"/&gt;
 *         &lt;element name="Categories" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfCategory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Categorization", propOrder = {
    "project",
    "overrideTexts",
    "name",
    "categories"
})
@XmlSeeAlso({
    NamedCategorization.class,
    QuestionCategorization.class,
    FunctionCategorization.class
})
public class Categorization {

    @XmlElement(name = "Project")
    protected QueryProject project;
    @XmlElement(name = "OverrideTexts")
    protected ArrayOfTextForCategory overrideTexts;
    @XmlElement(name = "Name")
    protected LocaleString name;
    @XmlElement(name = "Categories")
    protected ArrayOfCategory categories;
    @XmlAttribute(name = "Alias")
    protected String alias;

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
     * Gets the value of the overrideTexts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTextForCategory }
     *     
     */
    public ArrayOfTextForCategory getOverrideTexts() {
        return overrideTexts;
    }

    /**
     * Sets the value of the overrideTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTextForCategory }
     *     
     */
    public void setOverrideTexts(ArrayOfTextForCategory value) {
        this.overrideTexts = value;
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
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategory }
     *     
     */
    public ArrayOfCategory getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategory }
     *     
     */
    public void setCategories(ArrayOfCategory value) {
        this.categories = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

}
