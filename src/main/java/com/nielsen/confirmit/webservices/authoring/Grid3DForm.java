
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Grid3DForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grid3DForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}FormBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nodes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice7" minOccurs="0"/&gt;
 *         &lt;element name="Answers" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice8" minOccurs="0"/&gt;
 *         &lt;element name="ValidationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrecodeMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrecodeMaskPredefinedScript" type="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase" minOccurs="0"/&gt;
 *         &lt;element name="UsePredefinedScript" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OtherColumns" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="OtherRows" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ScrollBarHorizontal" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ScrollBarWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="AnswerlistOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="SubHeaderOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="TextWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="TextWidthUnit" use="required" type="{http://firmglobal.com/Confirmit/webservices/}WebMeasurementUnitType" /&gt;
 *       &lt;attribute name="ScaleOrder" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="Randomize" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ScrollControlModus" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ScrollControlSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="UseAnswerImages" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ImageWidth" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImageHeight" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RepeatHeaders" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HeaderFrequency" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="BottomHeaders" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerButtonsMode" use="required" type="{http://firmglobal.com/Confirmit/webservices/}AnswerButtonsMode" /&gt;
 *       &lt;attribute name="Transpose" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TransposeQuestionsMask" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NotPerformDataCleaningOnMasking" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grid3DForm", propOrder = {
    "nodes",
    "answers",
    "validationCode",
    "precodeMask",
    "precodeMaskPredefinedScript",
    "usePredefinedScript"
})
public class Grid3DForm
    extends FormBase
{

    @XmlElement(name = "Nodes")
    protected ArrayOfChoice7 nodes;
    @XmlElement(name = "Answers")
    protected ArrayOfChoice8 answers;
    @XmlElement(name = "ValidationCode")
    protected String validationCode;
    @XmlElement(name = "PrecodeMask")
    protected String precodeMask;
    @XmlElement(name = "PrecodeMaskPredefinedScript")
    protected PredefinedScriptBase precodeMaskPredefinedScript;
    @XmlElement(name = "UsePredefinedScript")
    protected boolean usePredefinedScript;
    @XmlAttribute(name = "OtherColumns", required = true)
    protected int otherColumns;
    @XmlAttribute(name = "OtherRows", required = true)
    protected int otherRows;
    @XmlAttribute(name = "ScrollBarHorizontal", required = true)
    protected int scrollBarHorizontal;
    @XmlAttribute(name = "ScrollBarWidth", required = true)
    protected int scrollBarWidth;
    @XmlAttribute(name = "AnswerlistOrder", required = true)
    protected TraverseOrderType answerlistOrder;
    @XmlAttribute(name = "SubHeaderOrder", required = true)
    protected TraverseOrderType subHeaderOrder;
    @XmlAttribute(name = "TextWidth", required = true)
    protected int textWidth;
    @XmlAttribute(name = "TextWidthUnit", required = true)
    protected WebMeasurementUnitType textWidthUnit;
    @XmlAttribute(name = "ScaleOrder", required = true)
    protected TraverseOrderType scaleOrder;
    @XmlAttribute(name = "Randomize", required = true)
    protected boolean randomize;
    @XmlAttribute(name = "ScrollControlModus", required = true)
    protected int scrollControlModus;
    @XmlAttribute(name = "ScrollControlSize", required = true)
    protected int scrollControlSize;
    @XmlAttribute(name = "UseAnswerImages", required = true)
    protected boolean useAnswerImages;
    @XmlAttribute(name = "ImageWidth")
    protected String imageWidth;
    @XmlAttribute(name = "ImageHeight")
    protected String imageHeight;
    @XmlAttribute(name = "RepeatHeaders", required = true)
    protected boolean repeatHeaders;
    @XmlAttribute(name = "HeaderFrequency", required = true)
    protected int headerFrequency;
    @XmlAttribute(name = "BottomHeaders", required = true)
    protected boolean bottomHeaders;
    @XmlAttribute(name = "AnswerButtonsMode", required = true)
    protected AnswerButtonsMode answerButtonsMode;
    @XmlAttribute(name = "Transpose", required = true)
    protected boolean transpose;
    @XmlAttribute(name = "TransposeQuestionsMask")
    protected String transposeQuestionsMask;
    @XmlAttribute(name = "NotPerformDataCleaningOnMasking", required = true)
    protected boolean notPerformDataCleaningOnMasking;

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice7 }
     *     
     */
    public ArrayOfChoice7 getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice7 }
     *     
     */
    public void setNodes(ArrayOfChoice7 value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice8 }
     *     
     */
    public ArrayOfChoice8 getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice8 }
     *     
     */
    public void setAnswers(ArrayOfChoice8 value) {
        this.answers = value;
    }

    /**
     * Gets the value of the validationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationCode() {
        return validationCode;
    }

    /**
     * Sets the value of the validationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationCode(String value) {
        this.validationCode = value;
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
     * Gets the value of the transpose property.
     * 
     */
    public boolean isTranspose() {
        return transpose;
    }

    /**
     * Sets the value of the transpose property.
     * 
     */
    public void setTranspose(boolean value) {
        this.transpose = value;
    }

    /**
     * Gets the value of the transposeQuestionsMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransposeQuestionsMask() {
        return transposeQuestionsMask;
    }

    /**
     * Sets the value of the transposeQuestionsMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransposeQuestionsMask(String value) {
        this.transposeQuestionsMask = value;
    }

    /**
     * Gets the value of the notPerformDataCleaningOnMasking property.
     * 
     */
    public boolean isNotPerformDataCleaningOnMasking() {
        return notPerformDataCleaningOnMasking;
    }

    /**
     * Sets the value of the notPerformDataCleaningOnMasking property.
     * 
     */
    public void setNotPerformDataCleaningOnMasking(boolean value) {
        this.notPerformDataCleaningOnMasking = value;
    }

}
