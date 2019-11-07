
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Folder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Folder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNodeFlexSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nodes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice10" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString2" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReadOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsView" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LocallyScoped" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Folder", propOrder = {
    "nodes",
    "descriptions",
    "name"
})
public class Folder
    extends QuestionnaireNodeFlexSupport
{

    @XmlElement(name = "Nodes")
    protected ArrayOfChoice10 nodes;
    @XmlElement(name = "Descriptions")
    protected ArrayOfLanguageString2 descriptions;
    @XmlElement(name = "Name")
    protected String name;
    @XmlAttribute(name = "ReadOnly", required = true)
    protected boolean readOnly;
    @XmlAttribute(name = "IsView", required = true)
    protected boolean isView;
    @XmlAttribute(name = "LocallyScoped", required = true)
    protected boolean locallyScoped;

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice10 }
     *     
     */
    public ArrayOfChoice10 getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice10 }
     *     
     */
    public void setNodes(ArrayOfChoice10 value) {
        this.nodes = value;
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
     * Gets the value of the isView property.
     * 
     */
    public boolean isIsView() {
        return isView;
    }

    /**
     * Sets the value of the isView property.
     * 
     */
    public void setIsView(boolean value) {
        this.isView = value;
    }

    /**
     * Gets the value of the locallyScoped property.
     * 
     */
    public boolean isLocallyScoped() {
        return locallyScoped;
    }

    /**
     * Sets the value of the locallyScoped property.
     * 
     */
    public void setLocallyScoped(boolean value) {
        this.locallyScoped = value;
    }

}
