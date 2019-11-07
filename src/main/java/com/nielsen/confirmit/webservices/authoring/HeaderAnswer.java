
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}AnswerBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Texts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfAnswerText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderAnswer", propOrder = {
    "texts"
})
public class HeaderAnswer
    extends AnswerBase
{

    @XmlElement(name = "Texts")
    protected ArrayOfAnswerText texts;

    /**
     * Gets the value of the texts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnswerText }
     *     
     */
    public ArrayOfAnswerText getTexts() {
        return texts;
    }

    /**
     * Sets the value of the texts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnswerText }
     *     
     */
    public void setTexts(ArrayOfAnswerText value) {
        this.texts = value;
    }

}
