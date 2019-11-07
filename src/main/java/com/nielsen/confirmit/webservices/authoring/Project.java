
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Project"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IsPanel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSurveyPoll" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="KeyWords" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfString" minOccurs="0"/&gt;
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
@XmlType(name = "Project", propOrder = {
    "name",
    "id",
    "company",
    "creator",
    "closed",
    "created",
    "isPanel",
    "isSurveyPoll",
    "keyWords"
})
public class Project {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "Creator")
    protected String creator;
    @XmlElement(name = "Closed")
    protected String closed;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "IsPanel")
    protected boolean isPanel;
    @XmlElement(name = "IsSurveyPoll")
    protected boolean isSurveyPoll;
    @XmlElement(name = "KeyWords")
    protected ArrayOfString keyWords;
    @XmlAttribute(name = "_Objid_Xml")
    protected String objidXml;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosed(String value) {
        this.closed = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the isPanel property.
     * 
     */
    public boolean isIsPanel() {
        return isPanel;
    }

    /**
     * Sets the value of the isPanel property.
     * 
     */
    public void setIsPanel(boolean value) {
        this.isPanel = value;
    }

    /**
     * Gets the value of the isSurveyPoll property.
     * 
     */
    public boolean isIsSurveyPoll() {
        return isSurveyPoll;
    }

    /**
     * Sets the value of the isSurveyPoll property.
     * 
     */
    public void setIsSurveyPoll(boolean value) {
        this.isSurveyPoll = value;
    }

    /**
     * Gets the value of the keyWords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getKeyWords() {
        return keyWords;
    }

    /**
     * Sets the value of the keyWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setKeyWords(ArrayOfString value) {
        this.keyWords = value;
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
