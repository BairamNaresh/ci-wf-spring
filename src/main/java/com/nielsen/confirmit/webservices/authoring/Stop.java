
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Stop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageMasterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompleteTexts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString" minOccurs="0"/&gt;
 *         &lt;element name="CompleteTitles" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString1" minOccurs="0"/&gt;
 *         &lt;element name="TranslationStatuses" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfTranslationStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StopType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}StopDataType" /&gt;
 *       &lt;attribute name="ITS" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ExcludeTranslation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stop", propOrder = {
    "pageMasterName",
    "completeTexts",
    "completeTitles",
    "translationStatuses"
})
public class Stop
    extends QuestionnaireNode
{

    @XmlElement(name = "PageMasterName")
    protected String pageMasterName;
    @XmlElement(name = "CompleteTexts")
    protected ArrayOfLanguageString completeTexts;
    @XmlElement(name = "CompleteTitles")
    protected ArrayOfLanguageString1 completeTitles;
    @XmlElement(name = "TranslationStatuses")
    protected ArrayOfTranslationStatus translationStatuses;
    @XmlAttribute(name = "StopType", required = true)
    protected StopDataType stopType;
    @XmlAttribute(name = "ITS", required = true)
    protected int its;
    @XmlAttribute(name = "ExcludeTranslation", required = true)
    protected boolean excludeTranslation;

    /**
     * Gets the value of the pageMasterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageMasterName() {
        return pageMasterName;
    }

    /**
     * Sets the value of the pageMasterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageMasterName(String value) {
        this.pageMasterName = value;
    }

    /**
     * Gets the value of the completeTexts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString }
     *     
     */
    public ArrayOfLanguageString getCompleteTexts() {
        return completeTexts;
    }

    /**
     * Sets the value of the completeTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString }
     *     
     */
    public void setCompleteTexts(ArrayOfLanguageString value) {
        this.completeTexts = value;
    }

    /**
     * Gets the value of the completeTitles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString1 }
     *     
     */
    public ArrayOfLanguageString1 getCompleteTitles() {
        return completeTitles;
    }

    /**
     * Sets the value of the completeTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString1 }
     *     
     */
    public void setCompleteTitles(ArrayOfLanguageString1 value) {
        this.completeTitles = value;
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
     * Gets the value of the stopType property.
     * 
     * @return
     *     possible object is
     *     {@link StopDataType }
     *     
     */
    public StopDataType getStopType() {
        return stopType;
    }

    /**
     * Sets the value of the stopType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopDataType }
     *     
     */
    public void setStopType(StopDataType value) {
        this.stopType = value;
    }

    /**
     * Gets the value of the its property.
     * 
     */
    public int getITS() {
        return its;
    }

    /**
     * Sets the value of the its property.
     * 
     */
    public void setITS(int value) {
        this.its = value;
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

}
