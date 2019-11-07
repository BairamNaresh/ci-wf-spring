
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HierarchyNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HierarchyNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Level" type="{http://firmglobal.com/Confirmit/webservices/}HierarchyLevel" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfHierarchyNode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsLeaf" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HasChildren" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchyNode", propOrder = {
    "level",
    "children"
})
public class HierarchyNode {

    @XmlElement(name = "Level")
    protected HierarchyLevel level;
    @XmlElement(name = "Children")
    protected ArrayOfHierarchyNode children;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "IsLeaf", required = true)
    protected boolean isLeaf;
    @XmlAttribute(name = "HasChildren", required = true)
    protected boolean hasChildren;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyLevel }
     *     
     */
    public HierarchyLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyLevel }
     *     
     */
    public void setLevel(HierarchyLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHierarchyNode }
     *     
     */
    public ArrayOfHierarchyNode getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHierarchyNode }
     *     
     */
    public void setChildren(ArrayOfHierarchyNode value) {
        this.children = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isLeaf property.
     * 
     */
    public boolean isIsLeaf() {
        return isLeaf;
    }

    /**
     * Sets the value of the isLeaf property.
     * 
     */
    public void setIsLeaf(boolean value) {
        this.isLeaf = value;
    }

    /**
     * Gets the value of the hasChildren property.
     * 
     */
    public boolean isHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     */
    public void setHasChildren(boolean value) {
        this.hasChildren = value;
    }

}
