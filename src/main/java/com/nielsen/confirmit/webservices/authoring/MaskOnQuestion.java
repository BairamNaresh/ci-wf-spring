
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaskOnQuestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaskOnQuestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Question1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeExclude" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaskOnQuestion", propOrder = {
    "question1",
    "includeExclude"
})
public class MaskOnQuestion
    extends PredefinedScriptBase
{

    @XmlElement(name = "Question1")
    protected String question1;
    @XmlElement(name = "IncludeExclude")
    protected boolean includeExclude;

    /**
     * Gets the value of the question1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion1() {
        return question1;
    }

    /**
     * Sets the value of the question1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion1(String value) {
        this.question1 = value;
    }

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

}
