
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Script complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Script"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScriptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PredefinedScript" type="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase" minOccurs="0"/&gt;
 *         &lt;element name="UsePredefinedScript" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Script", propOrder = {
    "name",
    "scriptCode",
    "predefinedScript",
    "usePredefinedScript"
})
public class Script
    extends QuestionnaireNode
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ScriptCode")
    protected String scriptCode;
    @XmlElement(name = "PredefinedScript")
    protected PredefinedScriptBase predefinedScript;
    @XmlElement(name = "UsePredefinedScript")
    protected boolean usePredefinedScript;

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
     * Gets the value of the scriptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptCode() {
        return scriptCode;
    }

    /**
     * Sets the value of the scriptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptCode(String value) {
        this.scriptCode = value;
    }

    /**
     * Gets the value of the predefinedScript property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedScriptBase }
     *     
     */
    public PredefinedScriptBase getPredefinedScript() {
        return predefinedScript;
    }

    /**
     * Sets the value of the predefinedScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedScriptBase }
     *     
     */
    public void setPredefinedScript(PredefinedScriptBase value) {
        this.predefinedScript = value;
    }

    /**
     * Gets the value of the usePredefinedScript property.
     * 
     */
    public boolean isUsePredefinedScript() {
        return usePredefinedScript;
    }

    /**
     * Sets the value of the usePredefinedScript property.
     * 
     */
    public void setUsePredefinedScript(boolean value) {
        this.usePredefinedScript = value;
    }

}
