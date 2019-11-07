
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNodeFlexSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DbType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormTexts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfFormText" minOccurs="0"/&gt;
 *         &lt;element name="TranslationStatuses" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfTranslationStatus" minOccurs="0"/&gt;
 *         &lt;element name="QuestionTriggers" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfString2" minOccurs="0"/&gt;
 *         &lt;element name="StartupScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NotRequired" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FieldWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="QuestionLayoutName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Disabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExcludeTranslation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LoopLevelId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VariableType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}VariableDataType" /&gt;
 *       &lt;attribute name="DataWriteAccessLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PersistentObjectId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="QuestionCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HasLoopLevelReference" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormBase", propOrder = {
    "dbType",
    "name",
    "formTexts",
    "translationStatuses",
    "questionTriggers",
    "startupScript",
    "questionMask"
})
@XmlSeeAlso({
    QuestionFormBase.class,
    Grid3DForm.class,
    InfoForm.class
})
public abstract class FormBase
    extends QuestionnaireNodeFlexSupport
{

    @XmlElement(name = "DbType")
    protected String dbType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FormTexts")
    protected ArrayOfFormText formTexts;
    @XmlElement(name = "TranslationStatuses")
    protected ArrayOfTranslationStatus translationStatuses;
    @XmlElement(name = "QuestionTriggers")
    protected ArrayOfString2 questionTriggers;
    @XmlElement(name = "StartupScript")
    protected String startupScript;
    @XmlElement(name = "QuestionMask")
    protected String questionMask;
    @XmlAttribute(name = "NotRequired", required = true)
    protected boolean notRequired;
    @XmlAttribute(name = "FieldWidth", required = true)
    protected int fieldWidth;
    @XmlAttribute(name = "QuestionLayoutName")
    protected String questionLayoutName;
    @XmlAttribute(name = "Disabled", required = true)
    protected boolean disabled;
    @XmlAttribute(name = "ExcludeTranslation", required = true)
    protected boolean excludeTranslation;
    @XmlAttribute(name = "LoopLevelId")
    protected String loopLevelId;
    @XmlAttribute(name = "VariableType", required = true)
    protected VariableDataType variableType;
    @XmlAttribute(name = "DataWriteAccessLevel", required = true)
    protected int dataWriteAccessLevel;
    @XmlAttribute(name = "PersistentObjectId")
    protected String persistentObjectId;
    @XmlAttribute(name = "QuestionCategory")
    protected String questionCategory;
    @XmlAttribute(name = "DefaultValue")
    protected String defaultValue;
    @XmlAttribute(name = "HasLoopLevelReference", required = true)
    protected boolean hasLoopLevelReference;

    /**
     * Gets the value of the dbType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * Sets the value of the dbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbType(String value) {
        this.dbType = value;
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
     * Gets the value of the formTexts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormText }
     *     
     */
    public ArrayOfFormText getFormTexts() {
        return formTexts;
    }

    /**
     * Sets the value of the formTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormText }
     *     
     */
    public void setFormTexts(ArrayOfFormText value) {
        this.formTexts = value;
    }

    /**
     * Gets the value of the translationStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTranslationStatus }
     *     
     */
    public ArrayOfTranslationStatus getTranslationStatuses() {
        return translationStatuses;
    }

    /**
     * Sets the value of the translationStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTranslationStatus }
     *     
     */
    public void setTranslationStatuses(ArrayOfTranslationStatus value) {
        this.translationStatuses = value;
    }

    /**
     * Gets the value of the questionTriggers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getQuestionTriggers() {
        return questionTriggers;
    }

    /**
     * Sets the value of the questionTriggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setQuestionTriggers(ArrayOfString2 value) {
        this.questionTriggers = value;
    }

    /**
     * Gets the value of the startupScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartupScript() {
        return startupScript;
    }

    /**
     * Sets the value of the startupScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartupScript(String value) {
        this.startupScript = value;
    }

    /**
     * Gets the value of the questionMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionMask() {
        return questionMask;
    }

    /**
     * Sets the value of the questionMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionMask(String value) {
        this.questionMask = value;
    }

    /**
     * Gets the value of the notRequired property.
     * 
     */
    public boolean isNotRequired() {
        return notRequired;
    }

    /**
     * Sets the value of the notRequired property.
     * 
     */
    public void setNotRequired(boolean value) {
        this.notRequired = value;
    }

    /**
     * Gets the value of the fieldWidth property.
     * 
     */
    public int getFieldWidth() {
        return fieldWidth;
    }

    /**
     * Sets the value of the fieldWidth property.
     * 
     */
    public void setFieldWidth(int value) {
        this.fieldWidth = value;
    }

    /**
     * Gets the value of the questionLayoutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionLayoutName() {
        return questionLayoutName;
    }

    /**
     * Sets the value of the questionLayoutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionLayoutName(String value) {
        this.questionLayoutName = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     */
    public boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     */
    public void setDisabled(boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the excludeTranslation property.
     * 
     */
    public boolean isExcludeTranslation() {
        return excludeTranslation;
    }

    /**
     * Sets the value of the excludeTranslation property.
     * 
     */
    public void setExcludeTranslation(boolean value) {
        this.excludeTranslation = value;
    }

    /**
     * Gets the value of the loopLevelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopLevelId() {
        return loopLevelId;
    }

    /**
     * Sets the value of the loopLevelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopLevelId(String value) {
        this.loopLevelId = value;
    }

    /**
     * Gets the value of the variableType property.
     * 
     * @return
     *     possible object is
     *     {@link VariableDataType }
     *     
     */
    public VariableDataType getVariableType() {
        return variableType;
    }

    /**
     * Sets the value of the variableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDataType }
     *     
     */
    public void setVariableType(VariableDataType value) {
        this.variableType = value;
    }

    /**
     * Gets the value of the dataWriteAccessLevel property.
     * 
     */
    public int getDataWriteAccessLevel() {
        return dataWriteAccessLevel;
    }

    /**
     * Sets the value of the dataWriteAccessLevel property.
     * 
     */
    public void setDataWriteAccessLevel(int value) {
        this.dataWriteAccessLevel = value;
    }

    /**
     * Gets the value of the persistentObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistentObjectId() {
        return persistentObjectId;
    }

    /**
     * Sets the value of the persistentObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistentObjectId(String value) {
        this.persistentObjectId = value;
    }

    /**
     * Gets the value of the questionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionCategory() {
        return questionCategory;
    }

    /**
     * Sets the value of the questionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionCategory(String value) {
        this.questionCategory = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the hasLoopLevelReference property.
     * 
     */
    public boolean isHasLoopLevelReference() {
        return hasLoopLevelReference;
    }

    /**
     * Sets the value of the hasLoopLevelReference property.
     * 
     */
    public void setHasLoopLevelReference(boolean value) {
        this.hasLoopLevelReference = value;
    }

}
