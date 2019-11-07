
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignRequestValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignRequestValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuestionIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignRequestValues", propOrder = {
    "questionIDs"
})
public class AssignRequestValues
    extends PredefinedScriptBase
{

    @XmlElement(name = "QuestionIDs")
    protected String questionIDs;

    /**
     * Gets the value of the questionIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionIDs() {
        return questionIDs;
    }

    /**
     * Sets the value of the questionIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionIDs(String value) {
        this.questionIDs = value;
    }

}
