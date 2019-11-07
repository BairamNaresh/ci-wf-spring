
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectListResultSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectListResultSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="List" type="{http://firmglobal.com/Confirmit/webservices/}ProjectList" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://firmglobal.com/Confirmit/webservices/}ProjectListToken" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectListResultSet", propOrder = {
    "list",
    "token"
})
public class ProjectListResultSet {

    @XmlElement(name = "List")
    protected ProjectList list;
    @XmlElement(name = "Token")
    protected ProjectListToken token;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectList }
     *     
     */
    public ProjectList getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectList }
     *     
     */
    public void setList(ProjectList value) {
        this.list = value;
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
