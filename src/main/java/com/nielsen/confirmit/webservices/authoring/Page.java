
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Page complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Page"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageMasterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PageLayoutName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nodes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice9" minOccurs="0"/&gt;
 *         &lt;element name="Titles" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString7" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString2" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TranslationStatuses" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfTranslationStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Order" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="ForceDesktop" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Page", propOrder = {
    "pageMasterName",
    "pageLayoutName",
    "nodes",
    "titles",
    "descriptions",
    "name",
    "translationStatuses"
})
public class Page
    extends QuestionnaireNode
{

    @XmlElement(name = "PageMasterName")
    protected String pageMasterName;
    @XmlElement(name = "PageLayoutName")
    protected String pageLayoutName;
    @XmlElement(name = "Nodes")
    protected ArrayOfChoice9 nodes;
    @XmlElement(name = "Titles")
    protected ArrayOfLanguageString7 titles;
    @XmlElement(name = "Descriptions")
    protected ArrayOfLanguageString2 descriptions;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TranslationStatuses")
    protected ArrayOfTranslationStatus translationStatuses;
    @XmlAttribute(name = "Order", required = true)
    protected TraverseOrderType order;
    @XmlAttribute(name = "ForceDesktop", required = true)
    protected boolean forceDesktop;

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
     * Gets the value of the pageLayoutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageLayoutName() {
        return pageLayoutName;
    }

    /**
     * Sets the value of the pageLayoutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageLayoutName(String value) {
        this.pageLayoutName = value;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice9 }
     *     
     */
    public ArrayOfChoice9 getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice9 }
     *     
     */
    public void setNodes(ArrayOfChoice9 value) {
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
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString2 }
     *     
     */
    public ArrayOfLanguageString2 getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString2 }
     *     
     */
    public void setDescriptions(ArrayOfLanguageString2 value) {
        this.descriptions = value;
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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link TraverseOrderType }
     *     
     */
    public TraverseOrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraverseOrderType }
     *     
     */
    public void setOrder(TraverseOrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the forceDesktop property.
     * 
     */
    public boolean isForceDesktop() {
        return forceDesktop;
    }

    /**
     * Sets the value of the forceDesktop property.
     * 
     */
    public void setForceDesktop(boolean value) {
        this.forceDesktop = value;
    }

}
