
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryProject" minOccurs="0"/&gt;
 *         &lt;element name="Precodes" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfString1" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfCodeWeight1" minOccurs="0"/&gt;
 *         &lt;element name="SubQueryField" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HierLevel" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryHierarchyLevel" minOccurs="0"/&gt;
 *         &lt;element name="Scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Namespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GroupBy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OrderDirection" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}OrderByTypes" /&gt;
 *       &lt;attribute name="Weighting" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}WeightingType" /&gt;
 *       &lt;attribute name="OrderBy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryField", propOrder = {
    "project",
    "precodes",
    "weight",
    "subQueryField",
    "hierLevel",
    "scope",
    "level",
    "namespace"
})
public class QueryField {

    @XmlElement(name = "Project")
    protected QueryProject project;
    @XmlElement(name = "Precodes")
    protected ArrayOfString1 precodes;
    @XmlElement(name = "Weight")
    protected ArrayOfCodeWeight1 weight;
    @XmlElement(name = "SubQueryField")
    protected boolean subQueryField;
    @XmlElement(name = "HierLevel")
    protected QueryHierarchyLevel hierLevel;
    @XmlElement(name = "Scope")
    protected String scope;
    @XmlElement(name = "Level")
    protected String level;
    @XmlElement(name = "Namespace")
    protected String namespace;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Alias")
    protected String alias;
    @XmlAttribute(name = "GroupBy", required = true)
    protected boolean groupBy;
    @XmlAttribute(name = "OrderDirection", required = true)
    protected OrderByTypes orderDirection;
    @XmlAttribute(name = "Weighting", required = true)
    protected WeightingType weighting;
    @XmlAttribute(name = "OrderBy", required = true)
    protected boolean orderBy;

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
     * Gets the value of the precodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getPrecodes() {
        return precodes;
    }

    /**
     * Sets the value of the precodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setPrecodes(ArrayOfString1 value) {
        this.precodes = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCodeWeight1 }
     *     
     */
    public ArrayOfCodeWeight1 getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCodeWeight1 }
     *     
     */
    public void setWeight(ArrayOfCodeWeight1 value) {
        this.weight = value;
    }

    /**
     * Gets the value of the subQueryField property.
     * 
     */
    public boolean isSubQueryField() {
        return subQueryField;
    }

    /**
     * Sets the value of the subQueryField property.
     * 
     */
    public void setSubQueryField(boolean value) {
        this.subQueryField = value;
    }

    /**
     * Gets the value of the hierLevel property.
     * 
     * @return
     *     possible object is
     *     {@link QueryHierarchyLevel }
     *     
     */
    public QueryHierarchyLevel getHierLevel() {
        return hierLevel;
    }

    /**
     * Sets the value of the hierLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryHierarchyLevel }
     *     
     */
    public void setHierLevel(QueryHierarchyLevel value) {
        this.hierLevel = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
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

    /**
     * Gets the value of the groupBy property.
     * 
     */
    public boolean isGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     * 
     */
    public void setGroupBy(boolean value) {
        this.groupBy = value;
    }

    /**
     * Gets the value of the orderDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByTypes }
     *     
     */
    public OrderByTypes getOrderDirection() {
        return orderDirection;
    }

    /**
     * Sets the value of the orderDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByTypes }
     *     
     */
    public void setOrderDirection(OrderByTypes value) {
        this.orderDirection = value;
    }

    /**
     * Gets the value of the weighting property.
     * 
     * @return
     *     possible object is
     *     {@link WeightingType }
     *     
     */
    public WeightingType getWeighting() {
        return weighting;
    }

    /**
     * Sets the value of the weighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightingType }
     *     
     */
    public void setWeighting(WeightingType value) {
        this.weighting = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     */
    public boolean isOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     */
    public void setOrderBy(boolean value) {
        this.orderBy = value;
    }

}
