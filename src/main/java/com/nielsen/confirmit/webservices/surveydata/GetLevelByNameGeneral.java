
package com.nielsen.confirmit.webservices.surveydata;

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
 *         &lt;element name="levelNames" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfString1" minOccurs="0"/&gt;
 *         &lt;element name="includeSystemVariables" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="databaseType" type="{http://firmglobal.com/Confirmit/webservices/8.5/}DatabaseType"/&gt;
 *         &lt;element name="token" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ResponseToken" minOccurs="0"/&gt;
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
    "levelNames",
    "includeSystemVariables",
    "databaseType",
    "token"
})
@XmlRootElement(name = "GetLevelByNameGeneral")
public class GetLevelByNameGeneral {

    protected String key;
    protected String projectId;
    protected ArrayOfString1 levelNames;
    protected boolean includeSystemVariables;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DatabaseType databaseType;
    protected ResponseToken token;

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
     * Gets the value of the levelNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getLevelNames() {
        return levelNames;
    }

    /**
     * Sets the value of the levelNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setLevelNames(ArrayOfString1 value) {
        this.levelNames = value;
    }

    /**
     * Gets the value of the includeSystemVariables property.
     * 
     */
    public boolean isIncludeSystemVariables() {
        return includeSystemVariables;
    }

    /**
     * Sets the value of the includeSystemVariables property.
     * 
     */
    public void setIncludeSystemVariables(boolean value) {
        this.includeSystemVariables = value;
    }

    /**
     * Gets the value of the databaseType property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseType }
     *     
     */
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /**
     * Sets the value of the databaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseType }
     *     
     */
    public void setDatabaseType(DatabaseType value) {
        this.databaseType = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseToken }
     *     
     */
    public ResponseToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseToken }
     *     
     */
    public void setToken(ResponseToken value) {
        this.token = value;
    }

}
