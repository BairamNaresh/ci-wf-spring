
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionFormBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Answers" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice6" minOccurs="0"/&gt;
 *         &lt;element name="HasWeights" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PrecodeMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrecodeMaskPredefinedScript" type="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase" minOccurs="0"/&gt;
 *         &lt;element name="UsePredefinedScript" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ColumnMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageSelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Slider" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsCodingField" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="VerticalSlider" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SliderSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="FormattingAssistance" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OtherColumns" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="OtherRows" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Columns" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Rows" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Precision" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Scale" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="LowerLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="UpperLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="ListRows" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ListColumns" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="KeepPos" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SearchableAnswerlist" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerButtonsMode" use="required" type="{http://firmglobal.com/Confirmit/webservices/}AnswerButtonsMode" /&gt;
 *       &lt;attribute name="Numeric" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RightText" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerlistOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="Randomize" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseAnswerImages" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ResizableMode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ImageWidth" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImageHeight" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubHeaderOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="OpenText" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Ordered" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CaptureOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AutoCheckOther" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AutoSum" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DragDropRanking" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RankByClick" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LowerLimitType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}LowerLimitDataType" /&gt;
 *       &lt;attribute name="UpperLimitType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}UpperLimitDataType" /&gt;
 *       &lt;attribute name="OpenTextCodingField" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Custom" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerImageModus" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="TextWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="TextWidthUnit" use="required" type="{http://firmglobal.com/Confirmit/webservices/}WebMeasurementUnitType" /&gt;
 *       &lt;attribute name="MultiItemsSelectedEqual" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MultiItemsSelectedMinimum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MultiItemsSelectedMaximum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MultiSumEqual" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="MultiSumMinimum" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="MultiSumMaximum" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="DefaultAnswerPrecode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RefusedAnswerPrecode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InputPrefix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InputSuffix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EqualsRepresentation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Characteristic" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="AnswerRequiredType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}AnswerRequiredType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiForm", propOrder = {
    "answers",
    "hasWeights",
    "precodeMask",
    "precodeMaskPredefinedScript",
    "usePredefinedScript",
    "columnMask",
    "answerImageDefault",
    "answerImageHeight",
    "answerImageWidth",
    "answerImageOver",
    "answerImageSelected"
})
public class MultiForm
    extends QuestionFormBase
{

    @XmlElement(name = "Answers")
    protected ArrayOfChoice6 answers;
    @XmlElement(name = "HasWeights")
    protected boolean hasWeights;
    @XmlElement(name = "PrecodeMask")
    protected String precodeMask;
    @XmlElement(name = "PrecodeMaskPredefinedScript")
    protected PredefinedScriptBase precodeMaskPredefinedScript;
    @XmlElement(name = "UsePredefinedScript")
    protected boolean usePredefinedScript;
    @XmlElement(name = "ColumnMask")
    protected String columnMask;
    @XmlElement(name = "AnswerImageDefault")
    protected String answerImageDefault;
    @XmlElement(name = "AnswerImageHeight")
    protected String answerImageHeight;
    @XmlElement(name = "AnswerImageWidth")
    protected String answerImageWidth;
    @XmlElement(name = "AnswerImageOver")
    protected String answerImageOver;
    @XmlElement(name = "AnswerImageSelected")
    protected String answerImageSelected;
    @XmlAttribute(name = "Slider", required = true)
    protected boolean slider;
    @XmlAttribute(name = "IsCodingField", required = true)
    protected boolean isCodingField;
    @XmlAttribute(name = "VerticalSlider", required = true)
    protected boolean verticalSlider;
    @XmlAttribute(name = "SliderSize", required = true)
    protected int sliderSize;
    @XmlAttribute(name = "FormattingAssistance", required = true)
    protected boolean formattingAssistance;
    @XmlAttribute(name = "OtherColumns", required = true)
    protected int otherColumns;
    @XmlAttribute(name = "OtherRows", required = true)
    protected int otherRows;
    @XmlAttribute(name = "Columns", required = true)
    protected int columns;
    @XmlAttribute(name = "Rows", required = true)
    protected int rows;
    @XmlAttribute(name = "Precision", required = true)
    protected int precision;
    @XmlAttribute(name = "Scale", required = true)
    protected int scale;
    @XmlAttribute(name = "LowerLimit", required = true)
    protected double lowerLimit;
    @XmlAttribute(name = "UpperLimit", required = true)
    protected double upperLimit;
    @XmlAttribute(name = "ListRows", required = true)
    protected int listRows;
    @XmlAttribute(name = "ListColumns", required = true)
    protected int listColumns;
    @XmlAttribute(name = "KeepPos", required = true)
    protected boolean keepPos;
    @XmlAttribute(name = "SearchableAnswerlist", required = true)
    protected boolean searchableAnswerlist;
    @XmlAttribute(name = "AnswerButtonsMode", required = true)
    protected AnswerButtonsMode answerButtonsMode;
    @XmlAttribute(name = "Numeric", required = true)
    protected boolean numeric;
    @XmlAttribute(name = "RightText", required = true)
    protected boolean rightText;
    @XmlAttribute(name = "AnswerlistOrder", required = true)
    protected TraverseOrderType answerlistOrder;
    @XmlAttribute(name = "Randomize", required = true)
    protected boolean randomize;
    @XmlAttribute(name = "UseAnswerImages", required = true)
    protected boolean useAnswerImages;
    @XmlAttribute(name = "ResizableMode", required = true)
    protected int resizableMode;
    @XmlAttribute(name = "ImageWidth")
    protected String imageWidth;
    @XmlAttribute(name = "ImageHeight")
    protected String imageHeight;
    @XmlAttribute(name = "SubHeaderOrder", required = true)
    protected TraverseOrderType subHeaderOrder;
    @XmlAttribute(name = "OpenText", required = true)
    protected boolean openText;
    @XmlAttribute(name = "Ordered", required = true)
    protected boolean ordered;
    @XmlAttribute(name = "CaptureOrder", required = true)
    protected boolean captureOrder;
    @XmlAttribute(name = "AutoCheckOther", required = true)
    protected boolean autoCheckOther;
    @XmlAttribute(name = "AutoSum", required = true)
    protected boolean autoSum;
    @XmlAttribute(name = "DragDropRanking", required = true)
    protected boolean dragDropRanking;
    @XmlAttribute(name = "RankByClick", required = true)
    protected boolean rankByClick;
    @XmlAttribute(name = "LowerLimitType", required = true)
    protected LowerLimitDataType lowerLimitType;
    @XmlAttribute(name = "UpperLimitType", required = true)
    protected UpperLimitDataType upperLimitType;
    @XmlAttribute(name = "OpenTextCodingField")
    protected String openTextCodingField;
    @XmlAttribute(name = "Custom", required = true)
    protected boolean custom;
    @XmlAttribute(name = "AnswerImageModus", required = true)
    protected int answerImageModus;
    @XmlAttribute(name = "TextWidth", required = true)
    protected int textWidth;
    @XmlAttribute(name = "TextWidthUnit", required = true)
    protected WebMeasurementUnitType textWidthUnit;
    @XmlAttribute(name = "MultiItemsSelectedEqual", required = true)
    protected int multiItemsSelectedEqual;
    @XmlAttribute(name = "MultiItemsSelectedMinimum", required = true)
    protected int multiItemsSelectedMinimum;
    @XmlAttribute(name = "MultiItemsSelectedMaximum", required = true)
    protected int multiItemsSelectedMaximum;
    @XmlAttribute(name = "MultiSumEqual", required = true)
    protected double multiSumEqual;
    @XmlAttribute(name = "MultiSumMinimum", required = true)
    protected double multiSumMinimum;
    @XmlAttribute(name = "MultiSumMaximum", required = true)
    protected double multiSumMaximum;
    @XmlAttribute(name = "DefaultAnswerPrecode")
    protected String defaultAnswerPrecode;
    @XmlAttribute(name = "RefusedAnswerPrecode")
    protected String refusedAnswerPrecode;
    @XmlAttribute(name = "InputPrefix")
    protected String inputPrefix;
    @XmlAttribute(name = "InputSuffix")
    protected String inputSuffix;
    @XmlAttribute(name = "EqualsRepresentation")
    protected String equalsRepresentation;
    @XmlAttribute(name = "Characteristic", required = true)
    protected int characteristic;
    @XmlAttribute(name = "AnswerRequiredType", required = true)
    protected AnswerRequiredType answerRequiredType;

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice6 }
     *     
     */
    public ArrayOfChoice6 getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice6 }
     *     
     */
    public void setAnswers(ArrayOfChoice6 value) {
        this.answers = value;
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

    /**
     * Gets the value of the verticalSlider property.
     * 
     */
    public boolean isVerticalSlider() {
        return verticalSlider;
    }

    /**
     * Sets the value of the verticalSlider property.
     * 
     */
    public void setVerticalSlider(boolean value) {
        this.verticalSlider = value;
    }

    /**
     * Gets the value of the sliderSize property.
     * 
     */
    public int getSliderSize() {
        return sliderSize;
    }

    /**
     * Sets the value of the sliderSize property.
     * 
     */
    public void setSliderSize(int value) {
        this.sliderSize = value;
    }

    /**
     * Gets the value of the formattingAssistance property.
     * 
     */
    public boolean isFormattingAssistance() {
        return formattingAssistance;
    }

    /**
     * Sets the value of the formattingAssistance property.
     * 
     */
    public void setFormattingAssistance(boolean value) {
        this.formattingAssistance = value;
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
     * Gets the value of the columns property.
     * 
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     */
    public void setColumns(int value) {
        this.columns = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     */
    public int getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     */
    public void setRows(int value) {
        this.rows = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     */
    public int getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     */
    public void setScale(int value) {
        this.scale = value;
    }

    /**
     * Gets the value of the lowerLimit property.
     * 
     */
    public double getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     */
    public void setLowerLimit(double value) {
        this.lowerLimit = value;
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     */
    public double getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     */
    public void setUpperLimit(double value) {
        this.upperLimit = value;
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
     * Gets the value of the searchableAnswerlist property.
     * 
     */
    public boolean isSearchableAnswerlist() {
        return searchableAnswerlist;
    }

    /**
     * Sets the value of the searchableAnswerlist property.
     * 
     */
    public void setSearchableAnswerlist(boolean value) {
        this.searchableAnswerlist = value;
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
     * Gets the value of the numeric property.
     * 
     */
    public boolean isNumeric() {
        return numeric;
    }

    /**
     * Sets the value of the numeric property.
     * 
     */
    public void setNumeric(boolean value) {
        this.numeric = value;
    }

    /**
     * Gets the value of the rightText property.
     * 
     */
    public boolean isRightText() {
        return rightText;
    }

    /**
     * Sets the value of the rightText property.
     * 
     */
    public void setRightText(boolean value) {
        this.rightText = value;
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
     * Gets the value of the resizableMode property.
     * 
     */
    public int getResizableMode() {
        return resizableMode;
    }

    /**
     * Sets the value of the resizableMode property.
     * 
     */
    public void setResizableMode(int value) {
        this.resizableMode = value;
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
     * Gets the value of the openText property.
     * 
     */
    public boolean isOpenText() {
        return openText;
    }

    /**
     * Sets the value of the openText property.
     * 
     */
    public void setOpenText(boolean value) {
        this.openText = value;
    }

    /**
     * Gets the value of the ordered property.
     * 
     */
    public boolean isOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     */
    public void setOrdered(boolean value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the captureOrder property.
     * 
     */
    public boolean isCaptureOrder() {
        return captureOrder;
    }

    /**
     * Sets the value of the captureOrder property.
     * 
     */
    public void setCaptureOrder(boolean value) {
        this.captureOrder = value;
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
     * Gets the value of the autoSum property.
     * 
     */
    public boolean isAutoSum() {
        return autoSum;
    }

    /**
     * Sets the value of the autoSum property.
     * 
     */
    public void setAutoSum(boolean value) {
        this.autoSum = value;
    }

    /**
     * Gets the value of the dragDropRanking property.
     * 
     */
    public boolean isDragDropRanking() {
        return dragDropRanking;
    }

    /**
     * Sets the value of the dragDropRanking property.
     * 
     */
    public void setDragDropRanking(boolean value) {
        this.dragDropRanking = value;
    }

    /**
     * Gets the value of the rankByClick property.
     * 
     */
    public boolean isRankByClick() {
        return rankByClick;
    }

    /**
     * Sets the value of the rankByClick property.
     * 
     */
    public void setRankByClick(boolean value) {
        this.rankByClick = value;
    }

    /**
     * Gets the value of the lowerLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link LowerLimitDataType }
     *     
     */
    public LowerLimitDataType getLowerLimitType() {
        return lowerLimitType;
    }

    /**
     * Sets the value of the lowerLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerLimitDataType }
     *     
     */
    public void setLowerLimitType(LowerLimitDataType value) {
        this.lowerLimitType = value;
    }

    /**
     * Gets the value of the upperLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link UpperLimitDataType }
     *     
     */
    public UpperLimitDataType getUpperLimitType() {
        return upperLimitType;
    }

    /**
     * Sets the value of the upperLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperLimitDataType }
     *     
     */
    public void setUpperLimitType(UpperLimitDataType value) {
        this.upperLimitType = value;
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
     * Gets the value of the textWidth property.
     * 
     */
    public int getTextWidth() {
        return textWidth;
    }

    /**
     * Sets the value of the textWidth property.
     * 
     */
    public void setTextWidth(int value) {
        this.textWidth = value;
    }

    /**
     * Gets the value of the textWidthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link WebMeasurementUnitType }
     *     
     */
    public WebMeasurementUnitType getTextWidthUnit() {
        return textWidthUnit;
    }

    /**
     * Sets the value of the textWidthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebMeasurementUnitType }
     *     
     */
    public void setTextWidthUnit(WebMeasurementUnitType value) {
        this.textWidthUnit = value;
    }

    /**
     * Gets the value of the multiItemsSelectedEqual property.
     * 
     */
    public int getMultiItemsSelectedEqual() {
        return multiItemsSelectedEqual;
    }

    /**
     * Sets the value of the multiItemsSelectedEqual property.
     * 
     */
    public void setMultiItemsSelectedEqual(int value) {
        this.multiItemsSelectedEqual = value;
    }

    /**
     * Gets the value of the multiItemsSelectedMinimum property.
     * 
     */
    public int getMultiItemsSelectedMinimum() {
        return multiItemsSelectedMinimum;
    }

    /**
     * Sets the value of the multiItemsSelectedMinimum property.
     * 
     */
    public void setMultiItemsSelectedMinimum(int value) {
        this.multiItemsSelectedMinimum = value;
    }

    /**
     * Gets the value of the multiItemsSelectedMaximum property.
     * 
     */
    public int getMultiItemsSelectedMaximum() {
        return multiItemsSelectedMaximum;
    }

    /**
     * Sets the value of the multiItemsSelectedMaximum property.
     * 
     */
    public void setMultiItemsSelectedMaximum(int value) {
        this.multiItemsSelectedMaximum = value;
    }

    /**
     * Gets the value of the multiSumEqual property.
     * 
     */
    public double getMultiSumEqual() {
        return multiSumEqual;
    }

    /**
     * Sets the value of the multiSumEqual property.
     * 
     */
    public void setMultiSumEqual(double value) {
        this.multiSumEqual = value;
    }

    /**
     * Gets the value of the multiSumMinimum property.
     * 
     */
    public double getMultiSumMinimum() {
        return multiSumMinimum;
    }

    /**
     * Sets the value of the multiSumMinimum property.
     * 
     */
    public void setMultiSumMinimum(double value) {
        this.multiSumMinimum = value;
    }

    /**
     * Gets the value of the multiSumMaximum property.
     * 
     */
    public double getMultiSumMaximum() {
        return multiSumMaximum;
    }

    /**
     * Sets the value of the multiSumMaximum property.
     * 
     */
    public void setMultiSumMaximum(double value) {
        this.multiSumMaximum = value;
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
     * Gets the value of the inputPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputPrefix() {
        return inputPrefix;
    }

    /**
     * Sets the value of the inputPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputPrefix(String value) {
        this.inputPrefix = value;
    }

    /**
     * Gets the value of the inputSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputSuffix() {
        return inputSuffix;
    }

    /**
     * Sets the value of the inputSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputSuffix(String value) {
        this.inputSuffix = value;
    }

    /**
     * Gets the value of the equalsRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualsRepresentation() {
        return equalsRepresentation;
    }

    /**
     * Sets the value of the equalsRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualsRepresentation(String value) {
        this.equalsRepresentation = value;
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
     * Gets the value of the answerRequiredType property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerRequiredType }
     *     
     */
    public AnswerRequiredType getAnswerRequiredType() {
        return answerRequiredType;
    }

    /**
     * Sets the value of the answerRequiredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerRequiredType }
     *     
     */
    public void setAnswerRequiredType(AnswerRequiredType value) {
        this.answerRequiredType = value;
    }

}
