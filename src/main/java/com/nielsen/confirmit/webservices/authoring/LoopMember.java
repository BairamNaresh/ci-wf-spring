
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoopMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoopMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}AnswerBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Texts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfAnswerText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Active" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LookupId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="DefaultImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HoverImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SelectedImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoopMember", propOrder = {
    "texts"
})
public class LoopMember
    extends AnswerBase
{

    @XmlElement(name = "Texts")
    protected ArrayOfAnswerText texts;
    @XmlAttribute(name = "Active", required = true)
    protected boolean active;
    @XmlAttribute(name = "LookupId", required = true)
    protected int lookupId;
    @XmlAttribute(name = "DefaultImageUrl")
    protected String defaultImageUrl;
    @XmlAttribute(name = "HoverImageUrl")
    protected String hoverImageUrl;
    @XmlAttribute(name = "SelectedImageUrl")
    protected String selectedImageUrl;

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
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
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

}
