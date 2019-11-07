
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Loop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Loop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoopMembers" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice2" minOccurs="0"/&gt;
 *         &lt;element name="Nodes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice14" minOccurs="0"/&gt;
 *         &lt;element name="Titles" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString7" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Hierarchy" type="{http://firmglobal.com/Confirmit/webservices/}Hierarchy" minOccurs="0"/&gt;
 *           &lt;element name="CustomTable" type="{http://firmglobal.com/Confirmit/webservices/}CustomTable" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PrecodeMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrecodeMaskPredefinedScript" type="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase" minOccurs="0"/&gt;
 *         &lt;element name="UsePredefinedScript" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TranslationStatuses" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfTranslationStatus" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLookupType" type="{http://firmglobal.com/Confirmit/webservices/}ExternalLookupType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FieldWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="AnswerlistOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="Randomize" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ProgressBarWeight" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ExcludeTranslation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerListType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}AnswerListType" /&gt;
 *       &lt;attribute name="PersistentObjectId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReadOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Loop", propOrder = {
    "loopMembers",
    "nodes",
    "titles",
    "name",
    "hierarchy",
    "customTable",
    "precodeMask",
    "precodeMaskPredefinedScript",
    "usePredefinedScript",
    "translationStatuses",
    "externalLookupType"
})
public class Loop
    extends QuestionnaireNode
{

    @XmlElement(name = "LoopMembers")
    protected ArrayOfChoice2 loopMembers;
    @XmlElement(name = "Nodes")
    protected ArrayOfChoice14 nodes;
    @XmlElement(name = "Titles")
    protected ArrayOfLanguageString7 titles;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Hierarchy")
    protected Hierarchy hierarchy;
    @XmlElement(name = "CustomTable")
    protected CustomTable customTable;
    @XmlElement(name = "PrecodeMask")
    protected String precodeMask;
    @XmlElement(name = "PrecodeMaskPredefinedScript")
    protected PredefinedScriptBase precodeMaskPredefinedScript;
    @XmlElement(name = "UsePredefinedScript")
    protected boolean usePredefinedScript;
    @XmlElement(name = "TranslationStatuses")
    protected ArrayOfTranslationStatus translationStatuses;
    @XmlElement(name = "ExternalLookupType", required = true)
    @XmlSchemaType(name = "string")
    protected ExternalLookupType externalLookupType;
    @XmlAttribute(name = "FieldWidth", required = true)
    protected int fieldWidth;
    @XmlAttribute(name = "AnswerlistOrder", required = true)
    protected TraverseOrderType answerlistOrder;
    @XmlAttribute(name = "Randomize", required = true)
    protected boolean randomize;
    @XmlAttribute(name = "ProgressBarWeight", required = true)
    protected int progressBarWeight;
    @XmlAttribute(name = "ExcludeTranslation", required = true)
    protected boolean excludeTranslation;
    @XmlAttribute(name = "AnswerListType", required = true)
    protected AnswerListType answerListType;
    @XmlAttribute(name = "PersistentObjectId")
    protected String persistentObjectId;
    @XmlAttribute(name = "ReadOnly", required = true)
    protected boolean readOnly;

    /**
     * Gets the value of the loopMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice2 }
     *     
     */
    public ArrayOfChoice2 getLoopMembers() {
        return loopMembers;
    }

    /**
     * Sets the value of the loopMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice2 }
     *     
     */
    public void setLoopMembers(ArrayOfChoice2 value) {
        this.loopMembers = value;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice14 }
     *     
     */
    public ArrayOfChoice14 getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice14 }
     *     
     */
    public void setNodes(ArrayOfChoice14 value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the titles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString7 }
     *     
     */
    public ArrayOfLanguageString7 getTitles() {
        return titles;
    }

    /**
     * Sets the value of the titles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString7 }
     *     
     */
    public void setTitles(ArrayOfLanguageString7 value) {
        this.titles = value;
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
     * Gets the value of the hierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link Hierarchy }
     *     
     */
    public Hierarchy getHierarchy() {
        return hierarchy;
    }

    /**
     * Sets the value of the hierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hierarchy }
     *     
     */
    public void setHierarchy(Hierarchy value) {
        this.hierarchy = value;
    }

    /**
     * Gets the value of the customTable property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTable }
     *     
     */
    public CustomTable getCustomTable() {
        return customTable;
    }

    /**
     * Sets the value of the customTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTable }
     *     
     */
    public void setCustomTable(CustomTable value) {
        this.customTable = value;
    }

    /**
     * Gets the value of the precodeMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecodeMask() {
        return precodeMask;
    }

    /**
     * Sets the value of the precodeMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecodeMask(String value) {
        this.precodeMask = value;
    }

    /**
     * Gets the value of the precodeMaskPredefinedScript property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedScriptBase }
     *     
     */
    public PredefinedScriptBase getPrecodeMaskPredefinedScript() {
        return precodeMaskPredefinedScript;
    }

    /**
     * Sets the value of the precodeMaskPredefinedScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedScriptBase }
     *     
     */
    public void setPrecodeMaskPredefinedScript(PredefinedScriptBase value) {
        this.precodeMaskPredefinedScript = value;
    }

    /**
     * Gets the value of the usePredefinedScript property.
     * 
     */
    public boolean isUsePredefinedScript() {
        return usePredefinedScript;
    }

    /**
     * Sets the value of the usePredefinedScript property.
     * 
     */
    public void setUsePredefinedScript(boolean value) {
        this.usePredefinedScript = value;
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
     * Gets the value of the externalLookupType property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalLookupType }
     *     
     */
    public ExternalLookupType getExternalLookupType() {
        return externalLookupType;
    }

    /**
     * Sets the value of the externalLookupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalLookupType }
     *     
     */
    public void setExternalLookupType(ExternalLookupType value) {
        this.externalLookupType = value;
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
     * Gets the value of the answerlistOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TraverseOrderType }
     *     
     */
    public TraverseOrderType getAnswerlistOrder() {
        return answerlistOrder;
    }

    /**
     * Sets the value of the answerlistOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraverseOrderType }
     *     
     */
    public void setAnswerlistOrder(TraverseOrderType value) {
        this.answerlistOrder = value;
    }

    /**
     * Gets the value of the randomize property.
     * 
     */
    public boolean isRandomize() {
        return randomize;
    }

    /**
     * Sets the value of the randomize property.
     * 
     */
    public void setRandomize(boolean value) {
        this.randomize = value;
    }

    /**
     * Gets the value of the progressBarWeight property.
     * 
     */
    public int getProgressBarWeight() {
        return progressBarWeight;
    }

    /**
     * Sets the value of the progressBarWeight property.
     * 
     */
    public void setProgressBarWeight(int value) {
        this.progressBarWeight = value;
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
     * Gets the value of the answerListType property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerListType }
     *     
     */
    public AnswerListType getAnswerListType() {
        return answerListType;
    }

    /**
     * Sets the value of the answerListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerListType }
     *     
     */
    public void setAnswerListType(AnswerListType value) {
        this.answerListType = value;
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
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

}
