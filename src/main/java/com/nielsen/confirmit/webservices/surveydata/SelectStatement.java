
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectClause" type="{http://firmglobal.com/Confirmit/webservices/8.5/}SelectClause" minOccurs="0"/&gt;
 *         &lt;element name="FromClause" type="{http://firmglobal.com/Confirmit/webservices/8.5/}FromClause" minOccurs="0"/&gt;
 *         &lt;element name="WhereClause" type="{http://firmglobal.com/Confirmit/webservices/8.5/}WhereClause" minOccurs="0"/&gt;
 *         &lt;element name="OrderByClause" type="{http://firmglobal.com/Confirmit/webservices/8.5/}OrderByClause" minOccurs="0"/&gt;
 *         &lt;element name="FilterMissingAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DefaultProject" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryProject" minOccurs="0"/&gt;
 *         &lt;element name="IncludeBaseRow" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GroupBy" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}GroupByTypes" /&gt;
 *       &lt;attribute name="UnionAll" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Distinct" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TopN" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="TopNPercent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectStatement", propOrder = {
    "selectClause",
    "fromClause",
    "whereClause",
    "orderByClause",
    "filterMissingAnswers",
    "defaultProject",
    "includeBaseRow"
})
public class SelectStatement {

    @XmlElement(name = "SelectClause")
    protected SelectClause selectClause;
    @XmlElement(name = "FromClause")
    protected FromClause fromClause;
    @XmlElement(name = "WhereClause")
    protected WhereClause whereClause;
    @XmlElement(name = "OrderByClause")
    protected OrderByClause orderByClause;
    @XmlElement(name = "FilterMissingAnswers")
    protected boolean filterMissingAnswers;
    @XmlElement(name = "DefaultProject")
    protected QueryProject defaultProject;
    @XmlElement(name = "IncludeBaseRow")
    protected boolean includeBaseRow;
    @XmlAttribute(name = "GroupBy", required = true)
    protected GroupByTypes groupBy;
    @XmlAttribute(name = "UnionAll", required = true)
    protected boolean unionAll;
    @XmlAttribute(name = "Distinct", required = true)
    protected boolean distinct;
    @XmlAttribute(name = "TopN", required = true)
    protected int topN;
    @XmlAttribute(name = "TopNPercent", required = true)
    protected boolean topNPercent;

    /**
     * Gets the value of the selectClause property.
     * 
     * @return
     *     possible object is
     *     {@link SelectClause }
     *     
     */
    public SelectClause getSelectClause() {
        return selectClause;
    }

    /**
     * Sets the value of the selectClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectClause }
     *     
     */
    public void setSelectClause(SelectClause value) {
        this.selectClause = value;
    }

    /**
     * Gets the value of the fromClause property.
     * 
     * @return
     *     possible object is
     *     {@link FromClause }
     *     
     */
    public FromClause getFromClause() {
        return fromClause;
    }

    /**
     * Sets the value of the fromClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromClause }
     *     
     */
    public void setFromClause(FromClause value) {
        this.fromClause = value;
    }

    /**
     * Gets the value of the whereClause property.
     * 
     * @return
     *     possible object is
     *     {@link WhereClause }
     *     
     */
    public WhereClause getWhereClause() {
        return whereClause;
    }

    /**
     * Sets the value of the whereClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhereClause }
     *     
     */
    public void setWhereClause(WhereClause value) {
        this.whereClause = value;
    }

    /**
     * Gets the value of the orderByClause property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByClause }
     *     
     */
    public OrderByClause getOrderByClause() {
        return orderByClause;
    }

    /**
     * Sets the value of the orderByClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByClause }
     *     
     */
    public void setOrderByClause(OrderByClause value) {
        this.orderByClause = value;
    }

    /**
     * Gets the value of the filterMissingAnswers property.
     * 
     */
    public boolean isFilterMissingAnswers() {
        return filterMissingAnswers;
    }

    /**
     * Sets the value of the filterMissingAnswers property.
     * 
     */
    public void setFilterMissingAnswers(boolean value) {
        this.filterMissingAnswers = value;
    }

    /**
     * Gets the value of the defaultProject property.
     * 
     * @return
     *     possible object is
     *     {@link QueryProject }
     *     
     */
    public QueryProject getDefaultProject() {
        return defaultProject;
    }

    /**
     * Sets the value of the defaultProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProject }
     *     
     */
    public void setDefaultProject(QueryProject value) {
        this.defaultProject = value;
    }

    /**
     * Gets the value of the includeBaseRow property.
     * 
     */
    public boolean isIncludeBaseRow() {
        return includeBaseRow;
    }

    /**
     * Sets the value of the includeBaseRow property.
     * 
     */
    public void setIncludeBaseRow(boolean value) {
        this.includeBaseRow = value;
    }

    /**
     * Gets the value of the groupBy property.
     * 
     * @return
     *     possible object is
     *     {@link GroupByTypes }
     *     
     */
    public GroupByTypes getGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupByTypes }
     *     
     */
    public void setGroupBy(GroupByTypes value) {
        this.groupBy = value;
    }

    /**
     * Gets the value of the unionAll property.
     * 
     */
    public boolean isUnionAll() {
        return unionAll;
    }

    /**
     * Sets the value of the unionAll property.
     * 
     */
    public void setUnionAll(boolean value) {
        this.unionAll = value;
    }

    /**
     * Gets the value of the distinct property.
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Sets the value of the distinct property.
     * 
     */
    public void setDistinct(boolean value) {
        this.distinct = value;
    }

    /**
     * Gets the value of the topN property.
     * 
     */
    public int getTopN() {
        return topN;
    }

    /**
     * Sets the value of the topN property.
     * 
     */
    public void setTopN(int value) {
        this.topN = value;
    }

    /**
     * Gets the value of the topNPercent property.
     * 
     */
    public boolean isTopNPercent() {
        return topNPercent;
    }

    /**
     * Sets the value of the topNPercent property.
     * 
     */
    public void setTopNPercent(boolean value) {
        this.topNPercent = value;
    }

}
