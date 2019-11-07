
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}Node"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Answers" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice15" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TranslationStatuses" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfTranslationStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ExcludeTranslation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReadOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncludeRightText" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseAnswerImages" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ImageWidth" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImageHeight" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Seed" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedList", propOrder = {
    "answers",
    "name",
    "translationStatuses"
})
public class PredefinedList
    extends Node
{

    @XmlElement(name = "Answers")
    protected ArrayOfChoice15 answers;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TranslationStatuses")
    protected ArrayOfTranslationStatus translationStatuses;
    @XmlAttribute(name = "ExcludeTranslation", required = true)
    protected boolean excludeTranslation;
    @XmlAttribute(name = "ReadOnly", required = true)
    protected boolean readOnly;
    @XmlAttribute(name = "IncludeRightText", required = true)
    protected boolean includeRightText;
    @XmlAttribute(name = "UseAnswerImages", required = true)
    protected boolean useAnswerImages;
    @XmlAttribute(name = "ImageWidth")
    protected String imageWidth;
    @XmlAttribute(name = "ImageHeight")
    protected String imageHeight;
    @XmlAttribute(name = "Seed", required = true)
    protected int seed;

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice15 }
     *     
     */
    public ArrayOfChoice15 getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice15 }
     *     
     */
    public void setAnswers(ArrayOfChoice15 value) {
        this.answers = value;
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
     * Gets the value of the includeRightText property.
     * 
     */
    public boolean isIncludeRightText() {
        return includeRightText;
    }

    /**
     * Sets the value of the includeRightText property.
     * 
     */
    public void setIncludeRightText(boolean value) {
        this.includeRightText = value;
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
     * Gets the value of the seed property.
     * 
     */
    public int getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     */
    public void setSeed(int value) {
        this.seed = value;
    }

}
