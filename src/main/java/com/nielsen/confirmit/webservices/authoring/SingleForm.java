
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionFormBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Answers" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice3" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Hierarchy" type="{http://firmglobal.com/Confirmit/webservices/}Hierarchy" minOccurs="0"/&gt;
 *           &lt;element name="CustomTable" type="{http://firmglobal.com/Confirmit/webservices/}CustomTable" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PrecodeMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrecodeMaskPredefinedScript" type="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase" minOccurs="0"/&gt;
 *         &lt;element name="UsePredefinedScript" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HasWeights" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ColumnMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageSelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SliderColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsBoolean" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DBStorageType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}SqlDbType" /&gt;
 *       &lt;attribute name="Characteristic" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="OtherColumns" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="OtherRows" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Indexed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseAnswerImages" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ImageWidth" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImageHeight" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ListRows" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ListColumns" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Dropdown" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CustomDropdownTitle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReplicateDataForMultimode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerButtonsMode" use="required" type="{http://firmglobal.com/Confirmit/webservices/}AnswerButtonsMode" /&gt;
 *       &lt;attribute name="KeepPos" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Custom" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReadOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerlistOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="SubHeaderOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="Randomize" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AutoCheckOther" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerListType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}AnswerListType" /&gt;
 *       &lt;attribute name="ForceLeafSelection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HierarchyMode" use="required" type="{http://firmglobal.com/Confirmit/webservices/}HierarchyUIMode" /&gt;
 *       &lt;attribute name="AnswerImageModus" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Slider" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DefaultAnswerPrecode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RefusedAnswerPrecode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OpenTextCodingField" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsCodingField" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleForm", propOrder = {
    "answers",
    "hierarchy",
    "customTable",
    "precodeMask",
    "precodeMaskPredefinedScript",
    "usePredefinedScript",
    "hasWeights",
    "columnMask",
    "answerImageDefault",
    "answerImageOver",
    "answerImageSelected",
    "answerImageHeight",
    "answerImageWidth",
    "sliderColor"
})
public class SingleForm
    extends QuestionFormBase
{

    @XmlElement(name = "Answers")
    protected ArrayOfChoice3 answers;
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
    @XmlElement(name = "HasWeights")
    protected boolean hasWeights;
    @XmlElement(name = "ColumnMask")
    protected String columnMask;
    @XmlElement(name = "AnswerImageDefault")
    protected String answerImageDefault;
    @XmlElement(name = "AnswerImageOver")
    protected String answerImageOver;
    @XmlElement(name = "AnswerImageSelected")
    protected String answerImageSelected;
    @XmlElement(name = "AnswerImageHeight")
    protected String answerImageHeight;
    @XmlElement(name = "AnswerImageWidth")
    protected String answerImageWidth;
    @XmlElement(name = "SliderColor")
    protected String sliderColor;
    @XmlAttribute(name = "IsBoolean", required = true)
    protected boolean isBoolean;
    @XmlAttribute(name = "DBStorageType", required = true)
    protected SqlDbType dbStorageType;
    @XmlAttribute(name = "Characteristic", required = true)
    protected int characteristic;
    @XmlAttribute(name = "OtherColumns", required = true)
    protected int otherColumns;
    @XmlAttribute(name = "OtherRows", required = true)
    protected int otherRows;
    @XmlAttribute(name = "Indexed", required = true)
    protected boolean indexed;
    @XmlAttribute(name = "UseAnswerImages", required = true)
    protected boolean useAnswerImages;
    @XmlAttribute(name = "ImageWidth")
    protected String imageWidth;
    @XmlAttribute(name = "ImageHeight")
    protected String imageHeight;
    @XmlAttribute(name = "ListRows", required = true)
    protected int listRows;
    @XmlAttribute(name = "ListColumns", required = true)
    protected int listColumns;
    @XmlAttribute(name = "Dropdown", required = true)
    protected boolean dropdown;
    @XmlAttribute(name = "CustomDropdownTitle", required = true)
    protected boolean customDropdownTitle;
    @XmlAttribute(name = "ReplicateDataForMultimode", required = true)
    protected boolean replicateDataForMultimode;
    @XmlAttribute(name = "AnswerButtonsMode", required = true)
    protected AnswerButtonsMode answerButtonsMode;
    @XmlAttribute(name = "KeepPos", required = true)
    protected boolean keepPos;
    @XmlAttribute(name = "Custom", required = true)
    protected boolean custom;
    @XmlAttribute(name = "ReadOnly", required = true)
    protected boolean readOnly;
    @XmlAttribute(name = "AnswerlistOrder", required = true)
    protected TraverseOrderType answerlistOrder;
    @XmlAttribute(name = "SubHeaderOrder", required = true)
    protected TraverseOrderType subHeaderOrder;
    @XmlAttribute(name = "Randomize", required = true)
    protected boolean randomize;
    @XmlAttribute(name = "AutoCheckOther", required = true)
    protected boolean autoCheckOther;
    @XmlAttribute(name = "AnswerListType", required = true)
    protected AnswerListType answerListType;
    @XmlAttribute(name = "ForceLeafSelection", required = true)
    protected boolean forceLeafSelection;
    @XmlAttribute(name = "HierarchyMode", required = true)
    protected HierarchyUIMode hierarchyMode;
    @XmlAttribute(name = "AnswerImageModus", required = true)
    protected int answerImageModus;
    @XmlAttribute(name = "Slider", required = true)
    protected boolean slider;
    @XmlAttribute(name = "DefaultAnswerPrecode")
    protected String defaultAnswerPrecode;
    @XmlAttribute(name = "RefusedAnswerPrecode")
    protected String refusedAnswerPrecode;
    @XmlAttribute(name = "OpenTextCodingField")
    protected String openTextCodingField;
    @XmlAttribute(name = "IsCodingField", required = true)
    protected boolean isCodingField;

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice3 }
     *     
     */
    public ArrayOfChoice3 getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice3 }
     *     
     */
    public void setAnswers(ArrayOfChoice3 value) {
        this.answers = value;
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
     * Gets the value of the hasWeights property.
     * 
     */
    public boolean isHasWeights() {
        return hasWeights;
    }

    /**
     * Sets the value of the hasWeights property.
     * 
     */
    public void setHasWeights(boolean value) {
        this.hasWeights = value;
    }

    /**
     * Gets the value of the columnMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnMask() {
        return columnMask;
    }

    /**
     * Sets the value of the columnMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnMask(String value) {
        this.columnMask = value;
    }

    /**
     * Gets the value of the answerImageDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageDefault() {
        return answerImageDefault;
    }

    /**
     * Sets the value of the answerImageDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageDefault(String value) {
        this.answerImageDefault = value;
    }

    /**
     * Gets the value of the answerImageOver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageOver() {
        return answerImageOver;
    }

    /**
     * Sets the value of the answerImageOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageOver(String value) {
        this.answerImageOver = value;
    }

    /**
     * Gets the value of the answerImageSelected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageSelected() {
        return answerImageSelected;
    }

    /**
     * Sets the value of the answerImageSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageSelected(String value) {
        this.answerImageSelected = value;
    }

    /**
     * Gets the value of the answerImageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageHeight() {
        return answerImageHeight;
    }

    /**
     * Sets the value of the answerImageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageHeight(String value) {
        this.answerImageHeight = value;
    }

    /**
     * Gets the value of the answerImageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageWidth() {
        return answerImageWidth;
    }

    /**
     * Sets the value of the answerImageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageWidth(String value) {
        this.answerImageWidth = value;
    }

    /**
     * Gets the value of the sliderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSliderColor() {
        return sliderColor;
    }

    /**
     * Sets the value of the sliderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSliderColor(String value) {
        this.sliderColor = value;
    }

    /**
     * Gets the value of the isBoolean property.
     * 
     */
    public boolean isIsBoolean() {
        return isBoolean;
    }

    /**
     * Sets the value of the isBoolean property.
     * 
     */
    public void setIsBoolean(boolean value) {
        this.isBoolean = value;
    }

    /**
     * Gets the value of the dbStorageType property.
     * 
     * @return
     *     possible object is
     *     {@link SqlDbType }
     *     
     */
    public SqlDbType getDBStorageType() {
        return dbStorageType;
    }

    /**
     * Sets the value of the dbStorageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlDbType }
     *     
     */
    public void setDBStorageType(SqlDbType value) {
        this.dbStorageType = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     */
    public int getCharacteristic() {
        return characteristic;
    }

    /**
     * Sets the value of the characteristic property.
     * 
     */
    public void setCharacteristic(int value) {
        this.characteristic = value;
    }

    /**
     * Gets the value of the otherColumns property.
     * 
     */
    public int getOtherColumns() {
        return otherColumns;
    }

    /**
     * Sets the value of the otherColumns property.
     * 
     */
    public void setOtherColumns(int value) {
        this.otherColumns = value;
    }

    /**
     * Gets the value of the otherRows property.
     * 
     */
    public int getOtherRows() {
        return otherRows;
    }

    /**
     * Sets the value of the otherRows property.
     * 
     */
    public void setOtherRows(int value) {
        this.otherRows = value;
    }

    /**
     * Gets the value of the indexed property.
     * 
     */
    public boolean isIndexed() {
        return indexed;
    }

    /**
     * Sets the value of the indexed property.
     * 
     */
    public void setIndexed(boolean value) {
        this.indexed = value;
    }

    /**
     * Gets the value of the useAnswerImages property.
     * 
     */
    public boolean isUseAnswerImages() {
        return useAnswerImages;
    }

    /**
     * Sets the value of the useAnswerImages property.
     * 
     */
    public void setUseAnswerImages(boolean value) {
        this.useAnswerImages = value;
    }

    /**
     * Gets the value of the imageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageWidth(String value) {
        this.imageWidth = value;
    }

    /**
     * Gets the value of the imageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageHeight(String value) {
        this.imageHeight = value;
    }

    /**
     * Gets the value of the listRows property.
     * 
     */
    public int getListRows() {
        return listRows;
    }

    /**
     * Sets the value of the listRows property.
     * 
     */
    public void setListRows(int value) {
        this.listRows = value;
    }

    /**
     * Gets the value of the listColumns property.
     * 
     */
    public int getListColumns() {
        return listColumns;
    }

    /**
     * Sets the value of the listColumns property.
     * 
     */
    public void setListColumns(int value) {
        this.listColumns = value;
    }

    /**
     * Gets the value of the dropdown property.
     * 
     */
    public boolean isDropdown() {
        return dropdown;
    }

    /**
     * Sets the value of the dropdown property.
     * 
     */
    public void setDropdown(boolean value) {
        this.dropdown = value;
    }

    /**
     * Gets the value of the customDropdownTitle property.
     * 
     */
    public boolean isCustomDropdownTitle() {
        return customDropdownTitle;
    }

    /**
     * Sets the value of the customDropdownTitle property.
     * 
     */
    public void setCustomDropdownTitle(boolean value) {
        this.customDropdownTitle = value;
    }

    /**
     * Gets the value of the replicateDataForMultimode property.
     * 
     */
    public boolean isReplicateDataForMultimode() {
        return replicateDataForMultimode;
    }

    /**
     * Sets the value of the replicateDataForMultimode property.
     * 
     */
    public void setReplicateDataForMultimode(boolean value) {
        this.replicateDataForMultimode = value;
    }

    /**
     * Gets the value of the answerButtonsMode property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerButtonsMode }
     *     
     */
    public AnswerButtonsMode getAnswerButtonsMode() {
        return answerButtonsMode;
    }

    /**
     * Sets the value of the answerButtonsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerButtonsMode }
     *     
     */
    public void setAnswerButtonsMode(AnswerButtonsMode value) {
        this.answerButtonsMode = value;
    }

    /**
     * Gets the value of the keepPos property.
     * 
     */
    public boolean isKeepPos() {
        return keepPos;
    }

    /**
     * Sets the value of the keepPos property.
     * 
     */
    public void setKeepPos(boolean value) {
        this.keepPos = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     */
    public void setCustom(boolean value) {
        this.custom = value;
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
     * Gets the value of the subHeaderOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TraverseOrderType }
     *     
     */
    public TraverseOrderType getSubHeaderOrder() {
        return subHeaderOrder;
    }

    /**
     * Sets the value of the subHeaderOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraverseOrderType }
     *     
     */
    public void setSubHeaderOrder(TraverseOrderType value) {
        this.subHeaderOrder = value;
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
     * Gets the value of the autoCheckOther property.
     * 
     */
    public boolean isAutoCheckOther() {
        return autoCheckOther;
    }

    /**
     * Sets the value of the autoCheckOther property.
     * 
     */
    public void setAutoCheckOther(boolean value) {
        this.autoCheckOther = value;
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
     * Gets the value of the forceLeafSelection property.
     * 
     */
    public boolean isForceLeafSelection() {
        return forceLeafSelection;
    }

    /**
     * Sets the value of the forceLeafSelection property.
     * 
     */
    public void setForceLeafSelection(boolean value) {
        this.forceLeafSelection = value;
    }

    /**
     * Gets the value of the hierarchyMode property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyUIMode }
     *     
     */
    public HierarchyUIMode getHierarchyMode() {
        return hierarchyMode;
    }

    /**
     * Sets the value of the hierarchyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyUIMode }
     *     
     */
    public void setHierarchyMode(HierarchyUIMode value) {
        this.hierarchyMode = value;
    }

    /**
     * Gets the value of the answerImageModus property.
     * 
     */
    public int getAnswerImageModus() {
        return answerImageModus;
    }

    /**
     * Sets the value of the answerImageModus property.
     * 
     */
    public void setAnswerImageModus(int value) {
        this.answerImageModus = value;
    }

    /**
     * Gets the value of the slider property.
     * 
     */
    public boolean isSlider() {
        return slider;
    }

    /**
     * Sets the value of the slider property.
     * 
     */
    public void setSlider(boolean value) {
        this.slider = value;
    }

    /**
     * Gets the value of the defaultAnswerPrecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAnswerPrecode() {
        return defaultAnswerPrecode;
    }

    /**
     * Sets the value of the defaultAnswerPrecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAnswerPrecode(String value) {
        this.defaultAnswerPrecode = value;
    }

    /**
     * Gets the value of the refusedAnswerPrecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefusedAnswerPrecode() {
        return refusedAnswerPrecode;
    }

    /**
     * Sets the value of the refusedAnswerPrecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefusedAnswerPrecode(String value) {
        this.refusedAnswerPrecode = value;
    }

    /**
     * Gets the value of the openTextCodingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenTextCodingField() {
        return openTextCodingField;
    }

    /**
     * Sets the value of the openTextCodingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenTextCodingField(String value) {
        this.openTextCodingField = value;
    }

    /**
     * Gets the value of the isCodingField property.
     * 
     */
    public boolean isIsCodingField() {
        return isCodingField;
    }

    /**
     * Sets the value of the isCodingField property.
     * 
     */
    public void setIsCodingField(boolean value) {
        this.isCodingField = value;
    }

}
