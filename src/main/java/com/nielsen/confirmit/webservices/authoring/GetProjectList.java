
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
 *         &lt;element name="projectType" type="{http://firmglobal.com/Confirmit/webservices/}ProjectType"/&gt;
 *         &lt;element name="allProjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="token" type="{http://firmglobal.com/Confirmit/webservices/}ProjectListToken" minOccurs="0"/&gt;
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
    "projectType",
    "allProjects",
    "token"
})
@XmlRootElement(name = "GetProjectList")
public class GetProjectList {

    protected String key;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProjectType projectType;
    protected boolean allProjects;
    protected ProjectListToken token;

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
     * Gets the value of the projectType property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectType }
     *     
     */
    public ProjectType getProjectType() {
        return projectType;
    }

    /**
     * Sets the value of the projectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectType }
     *     
     */
    public void setProjectType(ProjectType value) {
        this.projectType = value;
    }

    /**
     * Gets the value of the allProjects property.
     * 
     */
    public boolean isAllProjects() {
        return allProjects;
    }

    /**
     * Sets the value of the allProjects property.
     * 
     */
    public void setAllProjects(boolean value) {
        this.allProjects = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListToken }
     *     
     */
    public ProjectListToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListToken }
     *     
     */
    public void setToken(ProjectListToken value) {
        this.token = value;
    }

}
