
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespondentTransferDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondentTransferDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatabaseType" type="{http://firmglobal.com/Confirmit/webservices/8.5/}DatabaseType"/&gt;
 *         &lt;element name="Where" type="{http://firmglobal.com/Confirmit/webservices/8.5/}WhereClause" minOccurs="0"/&gt;
 *         &lt;element name="SystemVariables" type="{http://firmglobal.com/Confirmit/webservices/8.5/}RespondentSystemVariables" minOccurs="0"/&gt;
 *         &lt;element name="GenerateSurveyLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FieldNames" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfString1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AllFields" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OnlySchema" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondentTransferDef", propOrder = {
    "projectId",
    "databaseType",
    "where",
    "systemVariables",
    "generateSurveyLink",
    "fieldNames"
})
public class RespondentTransferDef {

    @XmlElement(name = "ProjectId")
    protected String projectId;
    @XmlElement(name = "DatabaseType", required = true)
    @XmlSchemaType(name = "string")
    protected DatabaseType databaseType;
    @XmlElement(name = "Where")
    protected WhereClause where;
    @XmlElement(name = "SystemVariables")
    protected RespondentSystemVariables systemVariables;
    @XmlElement(name = "GenerateSurveyLink")
    protected boolean generateSurveyLink;
    @XmlElement(name = "FieldNames")
    protected ArrayOfString1 fieldNames;
    @XmlAttribute(name = "AllFields", required = true)
    protected boolean allFields;
    @XmlAttribute(name = "OnlySchema", required = true)
    protected boolean onlySchema;

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
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link WhereClause }
     *     
     */
    public WhereClause getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhereClause }
     *     
     */
    public void setWhere(WhereClause value) {
        this.where = value;
    }

    /**
     * Gets the value of the systemVariables property.
     * 
     * @return
     *     possible object is
     *     {@link RespondentSystemVariables }
     *     
     */
    public RespondentSystemVariables getSystemVariables() {
        return systemVariables;
    }

    /**
     * Sets the value of the systemVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondentSystemVariables }
     *     
     */
    public void setSystemVariables(RespondentSystemVariables value) {
        this.systemVariables = value;
    }

    /**
     * Gets the value of the generateSurveyLink property.
     * 
     */
    public boolean isGenerateSurveyLink() {
        return generateSurveyLink;
    }

    /**
     * Sets the value of the generateSurveyLink property.
     * 
     */
    public void setGenerateSurveyLink(boolean value) {
        this.generateSurveyLink = value;
    }

    /**
     * Gets the value of the fieldNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getFieldNames() {
        return fieldNames;
    }

    /**
     * Sets the value of the fieldNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setFieldNames(ArrayOfString1 value) {
        this.fieldNames = value;
    }

    /**
     * Gets the value of the allFields property.
     * 
     */
    public boolean isAllFields() {
        return allFields;
    }

    /**
     * Sets the value of the allFields property.
     * 
     */
    public void setAllFields(boolean value) {
        this.allFields = value;
    }

    /**
     * Gets the value of the onlySchema property.
     * 
     */
    public boolean isOnlySchema() {
        return onlySchema;
    }

    /**
     * Sets the value of the onlySchema property.
     * 
     */
    public void setOnlySchema(boolean value) {
        this.onlySchema = value;
    }

}
