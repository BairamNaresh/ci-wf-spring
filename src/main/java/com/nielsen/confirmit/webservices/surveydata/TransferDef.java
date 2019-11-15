
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}TransferDefBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SystemVariables" type="{http://firmglobal.com/Confirmit/webservices/8.5/}SystemVariables" minOccurs="0"/&gt;
 *         &lt;element name="CollapseLoopReferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Levels" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfTransferLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AllChildrenLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncludeRecodedVariables" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AddRespondents" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferDef", propOrder = {
    "systemVariables",
    "collapseLoopReferences",
    "levels"
})
public class TransferDef
    extends TransferDefBase
{

    @XmlElement(name = "SystemVariables")
    protected SystemVariables systemVariables;
    @XmlElement(name = "CollapseLoopReferences")
    protected boolean collapseLoopReferences;
    @XmlElement(name = "Levels")
    protected ArrayOfTransferLevel levels;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "AllChildrenLevels", required = true)
    protected boolean allChildrenLevels;
    @XmlAttribute(name = "IncludeRecodedVariables", required = true)
    protected boolean includeRecodedVariables;
    @XmlAttribute(name = "AddRespondents", required = true)
    protected boolean addRespondents;

    /**
     * Gets the value of the systemVariables property.
     * 
     * @return
     *     possible object is
     *     {@link SystemVariables }
     *     
     */
    public SystemVariables getSystemVariables() {
        return systemVariables;
    }

    /**
     * Sets the value of the systemVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemVariables }
     *     
     */
    public void setSystemVariables(SystemVariables value) {
        this.systemVariables = value;
    }

    /**
     * Gets the value of the collapseLoopReferences property.
     * 
     */
    public boolean isCollapseLoopReferences() {
        return collapseLoopReferences;
    }

    /**
     * Sets the value of the collapseLoopReferences property.
     * 
     */
    public void setCollapseLoopReferences(boolean value) {
        this.collapseLoopReferences = value;
    }

    /**
     * Gets the value of the levels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransferLevel }
     *     
     */
    public ArrayOfTransferLevel getLevels() {
        return levels;
    }

    /**
     * Sets the value of the levels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransferLevel }
     *     
     */
    public void setLevels(ArrayOfTransferLevel value) {
        this.levels = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the allChildrenLevels property.
     * 
     */
    public boolean isAllChildrenLevels() {
        return allChildrenLevels;
    }

    /**
     * Sets the value of the allChildrenLevels property.
     * 
     */
    public void setAllChildrenLevels(boolean value) {
        this.allChildrenLevels = value;
    }

    /**
     * Gets the value of the includeRecodedVariables property.
     * 
     */
    public boolean isIncludeRecodedVariables() {
        return includeRecodedVariables;
    }

    /**
     * Sets the value of the includeRecodedVariables property.
     * 
     */
    public void setIncludeRecodedVariables(boolean value) {
        this.includeRecodedVariables = value;
    }

    /**
     * Gets the value of the addRespondents property.
     * 
     */
    public boolean isAddRespondents() {
        return addRespondents;
    }

    /**
     * Sets the value of the addRespondents property.
     * 
     */
    public void setAddRespondents(boolean value) {
        this.addRespondents = value;
    }

}
