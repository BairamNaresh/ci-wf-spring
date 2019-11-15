
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mask" type="{http://firmglobal.com/Confirmit/webservices/8.5/}CodeMask" minOccurs="0"/&gt;
 *         &lt;element name="Project" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryProject" minOccurs="0"/&gt;
 *         &lt;element name="Weights" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfCodeWeight" minOccurs="0"/&gt;
 *         &lt;element name="HierLevel" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryHierarchyLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OnlyBasicFields" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "QueryForm", propOrder = {
    "mask",
    "project",
    "weights",
    "hierLevel"
})
public class QueryForm {

    @XmlElement(name = "Mask")
    protected CodeMask mask;
    @XmlElement(name = "Project")
    protected QueryProject project;
    @XmlElement(name = "Weights")
    protected ArrayOfCodeWeight weights;
    @XmlElement(name = "HierLevel")
    protected QueryHierarchyLevel hierLevel;
    @XmlAttribute(name = "OnlyBasicFields", required = true)
    protected boolean onlyBasicFields;
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
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link CodeMask }
     *     
     */
    public CodeMask getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeMask }
     *     
     */
    public void setMask(CodeMask value) {
        this.mask = value;
    }

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
     * Gets the value of the weights property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCodeWeight }
     *     
     */
    public ArrayOfCodeWeight getWeights() {
        return weights;
    }

    /**
     * Sets the value of the weights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCodeWeight }
     *     
     */
    public void setWeights(ArrayOfCodeWeight value) {
        this.weights = value;
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
     * Gets the value of the onlyBasicFields property.
     * 
     */
    public boolean isOnlyBasicFields() {
        return onlyBasicFields;
    }

    /**
     * Sets the value of the onlyBasicFields property.
     * 
     */
    public void setOnlyBasicFields(boolean value) {
        this.onlyBasicFields = value;
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
