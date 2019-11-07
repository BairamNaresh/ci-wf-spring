
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFilterSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFilterSimple"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Languages" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAllLanguages" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OverrideTextDataSourceId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="AnswerColorDataSourceId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="ExpandAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExpandLoopReferenceAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExpandLoopRefOption" type="{http://firmglobal.com/Confirmit/webservices/}ExpandLoopReferenceOption"/&gt;
 *         &lt;element name="ProjectSpecific" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFilterSimple", propOrder = {
    "languages",
    "includeAllLanguages",
    "overrideTextDataSourceId",
    "answerColorDataSourceId",
    "expandAnswers",
    "expandLoopReferenceAnswers",
    "expandLoopRefOption",
    "projectSpecific"
})
@XmlSeeAlso({
    ReadFilter.class
})
public class ReadFilterSimple {

    @XmlElement(name = "Languages")
    protected ArrayOfInt languages;
    @XmlElement(name = "IncludeAllLanguages")
    protected boolean includeAllLanguages;
    @XmlElement(name = "OverrideTextDataSourceId", required = true)
    protected String overrideTextDataSourceId;
    @XmlElement(name = "AnswerColorDataSourceId", required = true)
    protected String answerColorDataSourceId;
    @XmlElement(name = "ExpandAnswers")
    protected boolean expandAnswers;
    @XmlElement(name = "ExpandLoopReferenceAnswers")
    protected boolean expandLoopReferenceAnswers;
    @XmlElement(name = "ExpandLoopRefOption", required = true)
    @XmlSchemaType(name = "string")
    protected ExpandLoopReferenceOption expandLoopRefOption;
    @XmlElement(name = "ProjectSpecific")
    protected boolean projectSpecific;

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLanguages(ArrayOfInt value) {
        this.languages = value;
    }

    /**
     * Gets the value of the includeAllLanguages property.
     * 
     */
    public boolean isIncludeAllLanguages() {
        return includeAllLanguages;
    }

    /**
     * Sets the value of the includeAllLanguages property.
     * 
     */
    public void setIncludeAllLanguages(boolean value) {
        this.includeAllLanguages = value;
    }

    /**
     * Gets the value of the overrideTextDataSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideTextDataSourceId() {
        return overrideTextDataSourceId;
    }

    /**
     * Sets the value of the overrideTextDataSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideTextDataSourceId(String value) {
        this.overrideTextDataSourceId = value;
    }

    /**
     * Gets the value of the answerColorDataSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerColorDataSourceId() {
        return answerColorDataSourceId;
    }

    /**
     * Sets the value of the answerColorDataSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerColorDataSourceId(String value) {
        this.answerColorDataSourceId = value;
    }

    /**
     * Gets the value of the expandAnswers property.
     * 
     */
    public boolean isExpandAnswers() {
        return expandAnswers;
    }

    /**
     * Sets the value of the expandAnswers property.
     * 
     */
    public void setExpandAnswers(boolean value) {
        this.expandAnswers = value;
    }

    /**
     * Gets the value of the expandLoopReferenceAnswers property.
     * 
     */
    public boolean isExpandLoopReferenceAnswers() {
        return expandLoopReferenceAnswers;
    }

    /**
     * Sets the value of the expandLoopReferenceAnswers property.
     * 
     */
    public void setExpandLoopReferenceAnswers(boolean value) {
        this.expandLoopReferenceAnswers = value;
    }

    /**
     * Gets the value of the expandLoopRefOption property.
     * 
     * @return
     *     possible object is
     *     {@link ExpandLoopReferenceOption }
     *     
     */
    public ExpandLoopReferenceOption getExpandLoopRefOption() {
        return expandLoopRefOption;
    }

    /**
     * Sets the value of the expandLoopRefOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpandLoopReferenceOption }
     *     
     */
    public void setExpandLoopRefOption(ExpandLoopReferenceOption value) {
        this.expandLoopRefOption = value;
    }

    /**
     * Gets the value of the projectSpecific property.
     * 
     */
    public boolean isProjectSpecific() {
        return projectSpecific;
    }

    /**
     * Sets the value of the projectSpecific property.
     * 
     */
    public void setProjectSpecific(boolean value) {
        this.projectSpecific = value;
    }

}
