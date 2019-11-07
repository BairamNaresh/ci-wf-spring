
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoetReadFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoetReadFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}ReadFilter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcludeExtendedRoutingNodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeLastModified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeVersionTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DenyDeleteOnMerge" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DisableLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GeneratePrecodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeAllNodeTypes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeDeletedNodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeText" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeProperties" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NodeTypes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfNodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoetReadFilter", propOrder = {
    "excludeExtendedRoutingNodes",
    "includeLastModified",
    "includeVersionTimestamp",
    "denyDeleteOnMerge",
    "disableLogging",
    "generatePrecodes",
    "includeAllNodeTypes",
    "includeDeletedNodes",
    "includeChildren",
    "includeText",
    "includeProperties",
    "includeAnswers",
    "nodeTypes"
})
public class PoetReadFilter
    extends ReadFilter
{

    @XmlElement(name = "ExcludeExtendedRoutingNodes")
    protected boolean excludeExtendedRoutingNodes;
    @XmlElement(name = "IncludeLastModified")
    protected boolean includeLastModified;
    @XmlElement(name = "IncludeVersionTimestamp")
    protected boolean includeVersionTimestamp;
    @XmlElement(name = "DenyDeleteOnMerge")
    protected boolean denyDeleteOnMerge;
    @XmlElement(name = "DisableLogging")
    protected boolean disableLogging;
    @XmlElement(name = "GeneratePrecodes")
    protected boolean generatePrecodes;
    @XmlElement(name = "IncludeAllNodeTypes")
    protected boolean includeAllNodeTypes;
    @XmlElement(name = "IncludeDeletedNodes")
    protected boolean includeDeletedNodes;
    @XmlElement(name = "IncludeChildren")
    protected boolean includeChildren;
    @XmlElement(name = "IncludeText")
    protected boolean includeText;
    @XmlElement(name = "IncludeProperties")
    protected boolean includeProperties;
    @XmlElement(name = "IncludeAnswers")
    protected boolean includeAnswers;
    @XmlElement(name = "NodeTypes")
    protected ArrayOfNodeType nodeTypes;

    /**
     * Gets the value of the excludeExtendedRoutingNodes property.
     * 
     */
    public boolean isExcludeExtendedRoutingNodes() {
        return excludeExtendedRoutingNodes;
    }

    /**
     * Sets the value of the excludeExtendedRoutingNodes property.
     * 
     */
    public void setExcludeExtendedRoutingNodes(boolean value) {
        this.excludeExtendedRoutingNodes = value;
    }

    /**
     * Gets the value of the includeLastModified property.
     * 
     */
    public boolean isIncludeLastModified() {
        return includeLastModified;
    }

    /**
     * Sets the value of the includeLastModified property.
     * 
     */
    public void setIncludeLastModified(boolean value) {
        this.includeLastModified = value;
    }

    /**
     * Gets the value of the includeVersionTimestamp property.
     * 
     */
    public boolean isIncludeVersionTimestamp() {
        return includeVersionTimestamp;
    }

    /**
     * Sets the value of the includeVersionTimestamp property.
     * 
     */
    public void setIncludeVersionTimestamp(boolean value) {
        this.includeVersionTimestamp = value;
    }

    /**
     * Gets the value of the denyDeleteOnMerge property.
     * 
     */
    public boolean isDenyDeleteOnMerge() {
        return denyDeleteOnMerge;
    }

    /**
     * Sets the value of the denyDeleteOnMerge property.
     * 
     */
    public void setDenyDeleteOnMerge(boolean value) {
        this.denyDeleteOnMerge = value;
    }

    /**
     * Gets the value of the disableLogging property.
     * 
     */
    public boolean isDisableLogging() {
        return disableLogging;
    }

    /**
     * Sets the value of the disableLogging property.
     * 
     */
    public void setDisableLogging(boolean value) {
        this.disableLogging = value;
    }

    /**
     * Gets the value of the generatePrecodes property.
     * 
     */
    public boolean isGeneratePrecodes() {
        return generatePrecodes;
    }

    /**
     * Sets the value of the generatePrecodes property.
     * 
     */
    public void setGeneratePrecodes(boolean value) {
        this.generatePrecodes = value;
    }

    /**
     * Gets the value of the includeAllNodeTypes property.
     * 
     */
    public boolean isIncludeAllNodeTypes() {
        return includeAllNodeTypes;
    }

    /**
     * Sets the value of the includeAllNodeTypes property.
     * 
     */
    public void setIncludeAllNodeTypes(boolean value) {
        this.includeAllNodeTypes = value;
    }

    /**
     * Gets the value of the includeDeletedNodes property.
     * 
     */
    public boolean isIncludeDeletedNodes() {
        return includeDeletedNodes;
    }

    /**
     * Sets the value of the includeDeletedNodes property.
     * 
     */
    public void setIncludeDeletedNodes(boolean value) {
        this.includeDeletedNodes = value;
    }

    /**
     * Gets the value of the includeChildren property.
     * 
     */
    public boolean isIncludeChildren() {
        return includeChildren;
    }

    /**
     * Sets the value of the includeChildren property.
     * 
     */
    public void setIncludeChildren(boolean value) {
        this.includeChildren = value;
    }

    /**
     * Gets the value of the includeText property.
     * 
     */
    public boolean isIncludeText() {
        return includeText;
    }

    /**
     * Sets the value of the includeText property.
     * 
     */
    public void setIncludeText(boolean value) {
        this.includeText = value;
    }

    /**
     * Gets the value of the includeProperties property.
     * 
     */
    public boolean isIncludeProperties() {
        return includeProperties;
    }

    /**
     * Sets the value of the includeProperties property.
     * 
     */
    public void setIncludeProperties(boolean value) {
        this.includeProperties = value;
    }

    /**
     * Gets the value of the includeAnswers property.
     * 
     */
    public boolean isIncludeAnswers() {
        return includeAnswers;
    }

    /**
     * Sets the value of the includeAnswers property.
     * 
     */
    public void setIncludeAnswers(boolean value) {
        this.includeAnswers = value;
    }

    /**
     * Gets the value of the nodeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNodeType }
     *     
     */
    public ArrayOfNodeType getNodeTypes() {
        return nodeTypes;
    }

    /**
     * Sets the value of the nodeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNodeType }
     *     
     */
    public void setNodeTypes(ArrayOfNodeType value) {
        this.nodeTypes = value;
    }

}
