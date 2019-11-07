
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Block complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Block"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nodes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice13" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString2" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Order" use="required" type="{http://firmglobal.com/Confirmit/webservices/}TraverseOrderType" /&gt;
 *       &lt;attribute name="BlockType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}BlockType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Block", propOrder = {
    "nodes",
    "descriptions",
    "name"
})
public class Block
    extends QuestionnaireNode
{

    @XmlElement(name = "Nodes")
    protected ArrayOfChoice13 nodes;
    @XmlElement(name = "Descriptions")
    protected ArrayOfLanguageString2 descriptions;
    @XmlElement(name = "Name")
    protected String name;
    @XmlAttribute(name = "Order", required = true)
    protected TraverseOrderType order;
    @XmlAttribute(name = "BlockType", required = true)
    protected BlockType blockType;

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice13 }
     *     
     */
    public ArrayOfChoice13 getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice13 }
     *     
     */
    public void setNodes(ArrayOfChoice13 value) {
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
     * Gets the value of the blockType property.
     * 
     * @return
     *     possible object is
     *     {@link BlockType }
     *     
     */
    public BlockType getBlockType() {
        return blockType;
    }

    /**
     * Sets the value of the blockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockType }
     *     
     */
    public void setBlockType(BlockType value) {
        this.blockType = value;
    }

}
