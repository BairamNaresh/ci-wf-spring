
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurveyQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurveyQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsMultiProjUnion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UnionProjects" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfString1" minOccurs="0"/&gt;
 *         &lt;element name="SelectStatements" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfSelectStatement" minOccurs="0"/&gt;
 *         &lt;element name="DeleteStatement" type="{http://firmglobal.com/Confirmit/webservices/8.5/}DeleteStatement" minOccurs="0"/&gt;
 *         &lt;element name="UpdateStatement" type="{http://firmglobal.com/Confirmit/webservices/8.5/}UpdateStatement" minOccurs="0"/&gt;
 *         &lt;element name="DefaultProject" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryProject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DayOfWeek" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}DayOfWeekType" /&gt;
 *       &lt;attribute name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurveyQuery", propOrder = {
    "isMultiProjUnion",
    "unionProjects",
    "selectStatements",
    "deleteStatement",
    "updateStatement",
    "defaultProject"
})
public class SurveyQuery {

    @XmlElement(name = "IsMultiProjUnion")
    protected boolean isMultiProjUnion;
    @XmlElement(name = "UnionProjects")
    protected ArrayOfString1 unionProjects;
    @XmlElement(name = "SelectStatements")
    protected ArrayOfSelectStatement selectStatements;
    @XmlElement(name = "DeleteStatement")
    protected DeleteStatement deleteStatement;
    @XmlElement(name = "UpdateStatement")
    protected UpdateStatement updateStatement;
    @XmlElement(name = "DefaultProject")
    protected QueryProject defaultProject;
    @XmlAttribute(name = "DayOfWeek", required = true)
    protected DayOfWeekType dayOfWeek;
    @XmlAttribute(name = "Alias")
    protected String alias;

    /**
     * Gets the value of the isMultiProjUnion property.
     * 
     */
    public boolean isIsMultiProjUnion() {
        return isMultiProjUnion;
    }

    /**
     * Sets the value of the isMultiProjUnion property.
     * 
     */
    public void setIsMultiProjUnion(boolean value) {
        this.isMultiProjUnion = value;
    }

    /**
     * Gets the value of the unionProjects property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getUnionProjects() {
        return unionProjects;
    }

    /**
     * Sets the value of the unionProjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setUnionProjects(ArrayOfString1 value) {
        this.unionProjects = value;
    }

    /**
     * Gets the value of the selectStatements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSelectStatement }
     *     
     */
    public ArrayOfSelectStatement getSelectStatements() {
        return selectStatements;
    }

    /**
     * Sets the value of the selectStatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSelectStatement }
     *     
     */
    public void setSelectStatements(ArrayOfSelectStatement value) {
        this.selectStatements = value;
    }

    /**
     * Gets the value of the deleteStatement property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteStatement }
     *     
     */
    public DeleteStatement getDeleteStatement() {
        return deleteStatement;
    }

    /**
     * Sets the value of the deleteStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteStatement }
     *     
     */
    public void setDeleteStatement(DeleteStatement value) {
        this.deleteStatement = value;
    }

    /**
     * Gets the value of the updateStatement property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatement }
     *     
     */
    public UpdateStatement getUpdateStatement() {
        return updateStatement;
    }

    /**
     * Sets the value of the updateStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatement }
     *     
     */
    public void setUpdateStatement(UpdateStatement value) {
        this.updateStatement = value;
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
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDayOfWeek(DayOfWeekType value) {
        this.dayOfWeek = value;
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
