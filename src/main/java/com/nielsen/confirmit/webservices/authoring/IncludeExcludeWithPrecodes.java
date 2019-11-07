
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncludeExcludeWithPrecodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncludeExcludeWithPrecodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludeExclude" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="QuestionA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForceInclude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForceExclude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludeExcludeWithPrecodes", propOrder = {
    "includeExclude",
    "questionA",
    "forceInclude",
    "forceExclude"
})
public class IncludeExcludeWithPrecodes
    extends PredefinedScriptBase
{

    @XmlElement(name = "IncludeExclude")
    protected boolean includeExclude;
    @XmlElement(name = "QuestionA")
    protected String questionA;
    @XmlElement(name = "ForceInclude")
    protected String forceInclude;
    @XmlElement(name = "ForceExclude")
    protected String forceExclude;

    /**
     * Gets the value of the includeExclude property.
     * 
     */
    public boolean isIncludeExclude() {
        return includeExclude;
    }

    /**
     * Sets the value of the includeExclude property.
     * 
     */
    public void setIncludeExclude(boolean value) {
        this.includeExclude = value;
    }

    /**
     * Gets the value of the questionA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionA() {
        return questionA;
    }

    /**
     * Sets the value of the questionA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionA(String value) {
        this.questionA = value;
    }

    /**
     * Gets the value of the forceInclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceInclude() {
        return forceInclude;
    }

    /**
     * Sets the value of the forceInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceInclude(String value) {
        this.forceInclude = value;
    }

    /**
     * Gets the value of the forceExclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceExclude() {
        return forceExclude;
    }

    /**
     * Sets the value of the forceExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceExclude(String value) {
        this.forceExclude = value;
    }

}
