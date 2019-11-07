
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncludeExclude complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncludeExclude"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludeExclude1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="QuestionA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeExclude2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="QuestionB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludeExclude", propOrder = {
    "includeExclude1",
    "questionA",
    "includeExclude2",
    "questionB"
})
public class IncludeExclude
    extends PredefinedScriptBase
{

    @XmlElement(name = "IncludeExclude1")
    protected boolean includeExclude1;
    @XmlElement(name = "QuestionA")
    protected String questionA;
    @XmlElement(name = "IncludeExclude2")
    protected boolean includeExclude2;
    @XmlElement(name = "QuestionB")
    protected String questionB;

    /**
     * Gets the value of the includeExclude1 property.
     * 
     */
    public boolean isIncludeExclude1() {
        return includeExclude1;
    }

    /**
     * Sets the value of the includeExclude1 property.
     * 
     */
    public void setIncludeExclude1(boolean value) {
        this.includeExclude1 = value;
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
     * Gets the value of the includeExclude2 property.
     * 
     */
    public boolean isIncludeExclude2() {
        return includeExclude2;
    }

    /**
     * Sets the value of the includeExclude2 property.
     * 
     */
    public void setIncludeExclude2(boolean value) {
        this.includeExclude2 = value;
    }

    /**
     * Gets the value of the questionB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionB() {
        return questionB;
    }

    /**
     * Sets the value of the questionB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionB(String value) {
        this.questionB = value;
    }

}
