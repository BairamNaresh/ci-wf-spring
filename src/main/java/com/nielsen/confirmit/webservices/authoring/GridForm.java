
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GridForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GridForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionFormBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Answers" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice4" minOccurs="0"/&gt;
 *         &lt;element name="Scales" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice5" minOccurs="0"/&gt;
 *         &lt;element name="PrecodeMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrecodeMaskPredefinedScript" type="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase" minOccurs="0"/&gt;
 *         &lt;element name="UsePredefinedScript" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ScalePrecodeMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ColumnMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageSelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SliderColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasWeights" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OtherColumns" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="OtherRows" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="TextWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="TextWidthUnit" use="required" type="{http://firmglobal.com/Confirmit/webservices/}WebMeasurementUnitType" /&gt;
 *       &lt;attribute name="ListRows" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ListColumns" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="AnswerlistOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="SubHeaderOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="ScaleOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="UseAnswerImages" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ImageWidth" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImageHeight" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Randomize" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Ordered" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Dropdown" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CustomDropdownTitle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="KeepPos" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerImageModus" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ScrollControlModus" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Custom" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ScrollControlSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Slider" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RepeatHeaders" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HeaderFrequency" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="BottomHeaders" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LeftAndRightGridText" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShowScaleBars" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AutoScaleWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GridBars" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Carousel" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="StarRating" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GridBarsExcludeWeighted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CardSort" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CardSortIncrement" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="CardSortDroppedIncrement" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="CardSortVerticalDirection" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ScrollBarHorizontal" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ScrollBarWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="AnswerButtonsMode" use="required" type="{http://firmglobal.com/Confirmit/webservices/}AnswerButtonsMode" /&gt;
 *       &lt;attribute name="GrayoutSelected" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Characteristic" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridForm", propOrder = {
    "answers",
    "scales",
    "precodeMask",
    "precodeMaskPredefinedScript",
    "usePredefinedScript",
    "scalePrecodeMask",
    "columnMask",
    "answerImageDefault",
    "answerImageOver",
    "answerImageSelected",
    "answerImageHeight",
    "answerImageWidth",
    "sliderColor",
    "hasWeights"
})
public class GridForm
    extends QuestionFormBase
{

    @XmlElement(name = "Answers")
    protected ArrayOfChoice4 answers;
    @XmlElement(name = "Scales")
    protected ArrayOfChoice5 scales;
    @XmlElement(name = "PrecodeMask")
    protected String precodeMask;
    @XmlElement(name = "PrecodeMaskPredefinedScript")
    protected PredefinedScriptBase precodeMaskPredefinedScript;
    @XmlElement(name = "UsePredefinedScript")
    protected boolean usePredefinedScript;
    @XmlElement(name = "ScalePrecodeMask")
    protected String scalePrecodeMask;
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
    @XmlElement(name = "HasWeights")
    protected boolean hasWeights;
    @XmlAttribute(name = "OtherColumns", required = true)
    protected int otherColumns;
    @XmlAttribute(name = "OtherRows", required = true)
    protected int otherRows;
    @XmlAttribute(name = "TextWidth", required = true)
    protected int textWidth;
    @XmlAttribute(name = "TextWidthUnit", required = true)
    protected WebMeasurementUnitType textWidthUnit;
    @XmlAttribute(name = "ListRows", required = true)
    protected int listRows;
    @XmlAttribute(name = "ListColumns", required = true)
    protected int listColumns;
    @XmlAttribute(name = "AnswerlistOrder", required = true)
    protected TraverseOrderType answerlistOrder;
    @XmlAttribute(name = "SubHeaderOrder", required = true)
    protected TraverseOrderType subHeaderOrder;
    @XmlAttribute(name = "ScaleOrder", required = true)
    protected TraverseOrderType scaleOrder;
    @XmlAttribute(name = "UseAnswerImages", required = true)
    protected boolean useAnswerImages;
    @XmlAttribute(name = "ImageWidth")
    protected String imageWidth;
    @XmlAttribute(name = "ImageHeight")
    protected String imageHeight;
    @XmlAttribute(name = "Randomize", required = true)
    protected boolean randomize;
    @XmlAttribute(name = "Ordered", required = true)
    protected boolean ordered;
    @XmlAttribute(name = "Dropdown", required = true)
    protected boolean dropdown;
    @XmlAttribute(name = "CustomDropdownTitle", required = true)
    protected boolean customDropdownTitle;
    @XmlAttribute(name = "KeepPos", required = true)
    protected boolean keepPos;
    @XmlAttribute(name = "AnswerImageModus", required = true)
    protected int answerImageModus;
    @XmlAttribute(name = "ScrollControlModus", required = true)
    protected int scrollControlModus;
    @XmlAttribute(name = "Custom", required = true)
    protected boolean custom;
    @XmlAttribute(name = "ScrollControlSize", required = true)
    protected int scrollControlSize;
    @XmlAttribute(name = "Slider", required = true)
    protected boolean slider;
    @XmlAttribute(name = "RepeatHeaders", required = true)
    protected boolean repeatHeaders;
    @XmlAttribute(name = "HeaderFrequency", required = true)
    protected int headerFrequency;
    @XmlAttribute(name = "BottomHeaders", required = true)
    protected boolean bottomHeaders;
    @XmlAttribute(name = "LeftAndRightGridText", required = true)
    protected boolean leftAndRightGridText;
    @XmlAttribute(name = "ShowScaleBars", required = true)
    protected boolean showScaleBars;
    @XmlAttribute(name = "AutoScaleWidth", required = true)
    protected boolean autoScaleWidth;
    @XmlAttribute(name = "GridBars", required = true)
    protected boolean gridBars;
    @XmlAttribute(name = "Carousel", required = true)
    protected boolean carousel;
    @XmlAttribute(name = "StarRating", required = true)
    protected boolean starRating;
    @XmlAttribute(name = "GridBarsExcludeWeighted", required = true)
    protected boolean gridBarsExcludeWeighted;
    @XmlAttribute(name = "CardSort", required = true)
    protected boolean cardSort;
    @XmlAttribute(name = "CardSortIncrement", required = true)
    protected int cardSortIncrement;
    @XmlAttribute(name = "CardSortDroppedIncrement", required = true)
    protected int cardSortDroppedIncrement;
    @XmlAttribute(name = "CardSortVerticalDirection", required = true)
    protected int cardSortVerticalDirection;
    @XmlAttribute(name = "ScrollBarHorizontal", required = true)
    protected int scrollBarHorizontal;
    @XmlAttribute(name = "ScrollBarWidth", required = true)
    protected int scrollBarWidth;
    @XmlAttribute(name = "AnswerButtonsMode", required = true)
    protected AnswerButtonsMode answerButtonsMode;
    @XmlAttribute(name = "GrayoutSelected", required = true)
    protected boolean grayoutSelected;
    @XmlAttribute(name = "Characteristic", required = true)
    protected int characteristic;

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice4 }
     *     
     */
    public ArrayOfChoice4 getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice4 }
     *     
     */
    public void setAnswers(ArrayOfChoice4 value) {
        this.answers = value;
    }

    /**
     * Gets the value of the scales property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice5 }
     *     
     */
    public ArrayOfChoice5 getScales() {
        return scales;
    }

    /**
     * Sets the value of the scales property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice5 }
     *     
     */
    public void setScales(ArrayOfChoice5 value) {
        this.scales = value;
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
     * Gets the value of the scalePrecodeMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScalePrecodeMask() {
        return scalePrecodeMask;
    }

    /**
     * Sets the value of the scalePrecodeMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScalePrecodeMask(String value) {
        this.scalePrecodeMask = value;
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
     * Gets the value of the scaleOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TraverseOrderType }
     *     
     */
    public TraverseOrderType getScaleOrder() {
        return scaleOrder;
    }

    /**
     * Sets the value of the scaleOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraverseOrderType }
     *     
     */
    public void setScaleOrder(TraverseOrderType value) {
        this.scaleOrder = value;
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
     * Gets the value of the scrollControlModus property.
     * 
     */
    public int getScrollControlModus() {
        return scrollControlModus;
    }

    /**
     * Sets the value of the scrollControlModus property.
     * 
     */
    public void setScrollControlModus(int value) {
        this.scrollControlModus = value;
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
     * Gets the value of the scrollControlSize property.
     * 
     */
    public int getScrollControlSize() {
        return scrollControlSize;
    }

    /**
     * Sets the value of the scrollControlSize property.
     * 
     */
    public void setScrollControlSize(int value) {
        this.scrollControlSize = value;
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
     * Gets the value of the repeatHeaders property.
     * 
     */
    public boolean isRepeatHeaders() {
        return repeatHeaders;
    }

    /**
     * Sets the value of the repeatHeaders property.
     * 
     */
    public void setRepeatHeaders(boolean value) {
        this.repeatHeaders = value;
    }

    /**
     * Gets the value of the headerFrequency property.
     * 
     */
    public int getHeaderFrequency() {
        return headerFrequency;
    }

    /**
     * Sets the value of the headerFrequency property.
     * 
     */
    public void setHeaderFrequency(int value) {
        this.headerFrequency = value;
    }

    /**
     * Gets the value of the bottomHeaders property.
     * 
     */
    public boolean isBottomHeaders() {
        return bottomHeaders;
    }

    /**
     * Sets the value of the bottomHeaders property.
     * 
     */
    public void setBottomHeaders(boolean value) {
        this.bottomHeaders = value;
    }

    /**
     * Gets the value of the leftAndRightGridText property.
     * 
     */
    public boolean isLeftAndRightGridText() {
        return leftAndRightGridText;
    }

    /**
     * Sets the value of the leftAndRightGridText property.
     * 
     */
    public void setLeftAndRightGridText(boolean value) {
        this.leftAndRightGridText = value;
    }

    /**
     * Gets the value of the showScaleBars property.
     * 
     */
    public boolean isShowScaleBars() {
        return showScaleBars;
    }

    /**
     * Sets the value of the showScaleBars property.
     * 
     */
    public void setShowScaleBars(boolean value) {
        this.showScaleBars = value;
    }

    /**
     * Gets the value of the autoScaleWidth property.
     * 
     */
    public boolean isAutoScaleWidth() {
        return autoScaleWidth;
    }

    /**
     * Sets the value of the autoScaleWidth property.
     * 
     */
    public void setAutoScaleWidth(boolean value) {
        this.autoScaleWidth = value;
    }

    /**
     * Gets the value of the gridBars property.
     * 
     */
    public boolean isGridBars() {
        return gridBars;
    }

    /**
     * Sets the value of the gridBars property.
     * 
     */
    public void setGridBars(boolean value) {
        this.gridBars = value;
    }

    /**
     * Gets the value of the carousel property.
     * 
     */
    public boolean isCarousel() {
        return carousel;
    }

    /**
     * Sets the value of the carousel property.
     * 
     */
    public void setCarousel(boolean value) {
        this.carousel = value;
    }

    /**
     * Gets the value of the starRating property.
     * 
     */
    public boolean isStarRating() {
        return starRating;
    }

    /**
     * Sets the value of the starRating property.
     * 
     */
    public void setStarRating(boolean value) {
        this.starRating = value;
    }

    /**
     * Gets the value of the gridBarsExcludeWeighted property.
     * 
     */
    public boolean isGridBarsExcludeWeighted() {
        return gridBarsExcludeWeighted;
    }

    /**
     * Sets the value of the gridBarsExcludeWeighted property.
     * 
     */
    public void setGridBarsExcludeWeighted(boolean value) {
        this.gridBarsExcludeWeighted = value;
    }

    /**
     * Gets the value of the cardSort property.
     * 
     */
    public boolean isCardSort() {
        return cardSort;
    }

    /**
     * Sets the value of the cardSort property.
     * 
     */
    public void setCardSort(boolean value) {
        this.cardSort = value;
    }

    /**
     * Gets the value of the cardSortIncrement property.
     * 
     */
    public int getCardSortIncrement() {
        return cardSortIncrement;
    }

    /**
     * Sets the value of the cardSortIncrement property.
     * 
     */
    public void setCardSortIncrement(int value) {
        this.cardSortIncrement = value;
    }

    /**
     * Gets the value of the cardSortDroppedIncrement property.
     * 
     */
    public int getCardSortDroppedIncrement() {
        return cardSortDroppedIncrement;
    }

    /**
     * Sets the value of the cardSortDroppedIncrement property.
     * 
     */
    public void setCardSortDroppedIncrement(int value) {
        this.cardSortDroppedIncrement = value;
    }

    /**
     * Gets the value of the cardSortVerticalDirection property.
     * 
     */
    public int getCardSortVerticalDirection() {
        return cardSortVerticalDirection;
    }

    /**
     * Sets the value of the cardSortVerticalDirection property.
     * 
     */
    public void setCardSortVerticalDirection(int value) {
        this.cardSortVerticalDirection = value;
    }

    /**
     * Gets the value of the scrollBarHorizontal property.
     * 
     */
    public int getScrollBarHorizontal() {
        return scrollBarHorizontal;
    }

    /**
     * Sets the value of the scrollBarHorizontal property.
     * 
     */
    public void setScrollBarHorizontal(int value) {
        this.scrollBarHorizontal = value;
    }

    /**
     * Gets the value of the scrollBarWidth property.
     * 
     */
    public int getScrollBarWidth() {
        return scrollBarWidth;
    }

    /**
     * Sets the value of the scrollBarWidth property.
     * 
     */
    public void setScrollBarWidth(int value) {
        this.scrollBarWidth = value;
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
     * Gets the value of the grayoutSelected property.
     * 
     */
    public boolean isGrayoutSelected() {
        return grayoutSelected;
    }

    /**
     * Sets the value of the grayoutSelected property.
     * 
     */
    public void setGrayoutSelected(boolean value) {
        this.grayoutSelected = value;
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

}
