
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Answer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Answer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}AnswerBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Texts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfAnswerText" minOccurs="0"/&gt;
 *         &lt;element name="TextsRight" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfAnswerText" minOccurs="0"/&gt;
 *         &lt;element name="Expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ColumnWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="LookupId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Weight" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="BackgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Punch" use="required" type="{http://firmglobal.com/Confirmit/webservices/}PunchType" /&gt;
 *       &lt;attribute name="SkipType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}SkipType" /&gt;
 *       &lt;attribute name="SkipEndStatus" use="required" type="{http://firmglobal.com/Confirmit/webservices/}StopDataType" /&gt;
 *       &lt;attribute name="SkipPageName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DefaultImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HoverImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SelectedImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RdgSingleProportion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="RdgMultiProportion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="BarHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Answer", propOrder = {
    "texts",
    "textsRight",
    "expression"
})
public class Answer
    extends AnswerBase
{

    @XmlElement(name = "Texts")
    protected ArrayOfAnswerText texts;
    @XmlElement(name = "TextsRight")
    protected ArrayOfAnswerText textsRight;
    @XmlElement(name = "Expression")
    protected String expression;
    @XmlAttribute(name = "ColumnWidth", required = true)
    protected int columnWidth;
    @XmlAttribute(name = "LookupId", required = true)
    protected int lookupId;
    @XmlAttribute(name = "Weight", required = true)
    protected double weight;
    @XmlAttribute(name = "BackgroundColor")
    protected String backgroundColor;
    @XmlAttribute(name = "Punch", required = true)
    protected PunchType punch;
    @XmlAttribute(name = "SkipType", required = true)
    protected SkipType skipType;
    @XmlAttribute(name = "SkipEndStatus", required = true)
    protected StopDataType skipEndStatus;
    @XmlAttribute(name = "SkipPageName")
    protected String skipPageName;
    @XmlAttribute(name = "DefaultImageUrl")
    protected String defaultImageUrl;
    @XmlAttribute(name = "HoverImageUrl")
    protected String hoverImageUrl;
    @XmlAttribute(name = "SelectedImageUrl")
    protected String selectedImageUrl;
    @XmlAttribute(name = "RdgSingleProportion", required = true)
    protected int rdgSingleProportion;
    @XmlAttribute(name = "RdgMultiProportion", required = true)
    protected int rdgMultiProportion;
    @XmlAttribute(name = "BarHeight", required = true)
    protected int barHeight;

    /**
     * Gets the value of the texts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnswerText }
     *     
     */
    public ArrayOfAnswerText getTexts() {
        return texts;
    }

    /**
     * Sets the value of the texts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnswerText }
     *     
     */
    public void setTexts(ArrayOfAnswerText value) {
        this.texts = value;
    }

    /**
     * Gets the value of the textsRight property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnswerText }
     *     
     */
    public ArrayOfAnswerText getTextsRight() {
        return textsRight;
    }

    /**
     * Sets the value of the textsRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnswerText }
     *     
     */
    public void setTextsRight(ArrayOfAnswerText value) {
        this.textsRight = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the columnWidth property.
     * 
     */
    public int getColumnWidth() {
        return columnWidth;
    }

    /**
     * Sets the value of the columnWidth property.
     * 
     */
    public void setColumnWidth(int value) {
        this.columnWidth = value;
    }

    /**
     * Gets the value of the lookupId property.
     * 
     */
    public int getLookupId() {
        return lookupId;
    }

    /**
     * Sets the value of the lookupId property.
     * 
     */
    public void setLookupId(int value) {
        this.lookupId = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the punch property.
     * 
     * @return
     *     possible object is
     *     {@link PunchType }
     *     
     */
    public PunchType getPunch() {
        return punch;
    }

    /**
     * Sets the value of the punch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PunchType }
     *     
     */
    public void setPunch(PunchType value) {
        this.punch = value;
    }

    /**
     * Gets the value of the skipType property.
     * 
     * @return
     *     possible object is
     *     {@link SkipType }
     *     
     */
    public SkipType getSkipType() {
        return skipType;
    }

    /**
     * Sets the value of the skipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkipType }
     *     
     */
    public void setSkipType(SkipType value) {
        this.skipType = value;
    }

    /**
     * Gets the value of the skipEndStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StopDataType }
     *     
     */
    public StopDataType getSkipEndStatus() {
        return skipEndStatus;
    }

    /**
     * Sets the value of the skipEndStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopDataType }
     *     
     */
    public void setSkipEndStatus(StopDataType value) {
        this.skipEndStatus = value;
    }

    /**
     * Gets the value of the skipPageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipPageName() {
        return skipPageName;
    }

    /**
     * Sets the value of the skipPageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipPageName(String value) {
        this.skipPageName = value;
    }

    /**
     * Gets the value of the defaultImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultImageUrl() {
        return defaultImageUrl;
    }

    /**
     * Sets the value of the defaultImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultImageUrl(String value) {
        this.defaultImageUrl = value;
    }

    /**
     * Gets the value of the hoverImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoverImageUrl() {
        return hoverImageUrl;
    }

    /**
     * Sets the value of the hoverImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoverImageUrl(String value) {
        this.hoverImageUrl = value;
    }

    /**
     * Gets the value of the selectedImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedImageUrl() {
        return selectedImageUrl;
    }

    /**
     * Sets the value of the selectedImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedImageUrl(String value) {
        this.selectedImageUrl = value;
    }

    /**
     * Gets the value of the rdgSingleProportion property.
     * 
     */
    public int getRdgSingleProportion() {
        return rdgSingleProportion;
    }

    /**
     * Sets the value of the rdgSingleProportion property.
     * 
     */
    public void setRdgSingleProportion(int value) {
        this.rdgSingleProportion = value;
    }

    /**
     * Gets the value of the rdgMultiProportion property.
     * 
     */
    public int getRdgMultiProportion() {
        return rdgMultiProportion;
    }

    /**
     * Sets the value of the rdgMultiProportion property.
     * 
     */
    public void setRdgMultiProportion(int value) {
        this.rdgMultiProportion = value;
    }

    /**
     * Gets the value of the barHeight property.
     * 
     */
    public int getBarHeight() {
        return barHeight;
    }

    /**
     * Sets the value of the barHeight property.
     * 
     */
    public void setBarHeight(int value) {
        this.barHeight = value;
    }

}
