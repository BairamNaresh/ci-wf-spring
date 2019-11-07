
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Root complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Root"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}Node"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nodes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice17" minOccurs="0"/&gt;
 *         &lt;element name="NewChildrenAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NodeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Root", propOrder = {
    "nodes",
    "newChildrenAllowed"
})
public class Root
    extends Node
{

    @XmlElement(name = "Nodes")
    protected ArrayOfChoice17 nodes;
    @XmlElement(name = "NewChildrenAllowed")
    protected boolean newChildrenAllowed;
    @XmlAttribute(name = "NodeType")
    protected String nodeType;

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice17 }
     *     
     */
    public ArrayOfChoice17 getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice17 }
     *     
     */
    public void setNodes(ArrayOfChoice17 value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the newChildrenAllowed property.
     * 
     */
    public boolean isNewChildrenAllowed() {
        return newChildrenAllowed;
    }

    /**
     * Sets the value of the newChildrenAllowed property.
     * 
     */
    public void setNewChildrenAllowed(boolean value) {
        this.newChildrenAllowed = value;
    }

    /**
     * Gets the value of the nodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * Sets the value of the nodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeType(String value) {
        this.nodeType = value;
    }

}
