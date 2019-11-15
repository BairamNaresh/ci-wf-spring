
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryHierarchyLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryHierarchyLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelfRelLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SelfRelLevelKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryHierarchyLevel", propOrder = {
    "selfRelLevel",
    "selfRelLevelKey",
    "relationName",
    "tableName",
    "parentMask"
})
public class QueryHierarchyLevel {

    @XmlElement(name = "SelfRelLevel")
    protected int selfRelLevel;
    @XmlElement(name = "SelfRelLevelKey")
    protected String selfRelLevelKey;
    @XmlElement(name = "RelationName")
    protected String relationName;
    @XmlElement(name = "TableName")
    protected String tableName;
    @XmlElement(name = "ParentMask")
    protected String parentMask;

    /**
     * Gets the value of the selfRelLevel property.
     * 
     */
    public int getSelfRelLevel() {
        return selfRelLevel;
    }

    /**
     * Sets the value of the selfRelLevel property.
     * 
     */
    public void setSelfRelLevel(int value) {
        this.selfRelLevel = value;
    }

    /**
     * Gets the value of the selfRelLevelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfRelLevelKey() {
        return selfRelLevelKey;
    }

    /**
     * Sets the value of the selfRelLevelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfRelLevelKey(String value) {
        this.selfRelLevelKey = value;
    }

    /**
     * Gets the value of the relationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationName() {
        return relationName;
    }

    /**
     * Sets the value of the relationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationName(String value) {
        this.relationName = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the parentMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMask() {
        return parentMask;
    }

    /**
     * Sets the value of the parentMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMask(String value) {
        this.parentMask = value;
    }

}
