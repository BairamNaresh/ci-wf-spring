
package com.nielsen.confirmit.webservices.authoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="HeaderAnswer" type="{http://firmglobal.com/Confirmit/webservices/}HeaderAnswer"/&gt;
 *         &lt;element name="HeaderAnswerEnd" type="{http://firmglobal.com/Confirmit/webservices/}HeaderAnswerEnd"/&gt;
 *         &lt;element name="LoopLevelReference" type="{http://firmglobal.com/Confirmit/webservices/}LoopLevelReference"/&gt;
 *         &lt;element name="Predefined" type="{http://firmglobal.com/Confirmit/webservices/}Predefined"/&gt;
 *         &lt;element name="Answer" type="{http://firmglobal.com/Confirmit/webservices/}Answer"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChoice8", propOrder = {
    "headerAnswerOrHeaderAnswerEndOrLoopLevelReference"
})
public class ArrayOfChoice8 {

    @XmlElements({
        @XmlElement(name = "HeaderAnswer", type = HeaderAnswer.class, nillable = true),
        @XmlElement(name = "HeaderAnswerEnd", type = HeaderAnswerEnd.class, nillable = true),
        @XmlElement(name = "LoopLevelReference", type = LoopLevelReference.class, nillable = true),
        @XmlElement(name = "Predefined", type = Predefined.class, nillable = true),
        @XmlElement(name = "Answer", type = Answer.class, nillable = true)
    })
    protected List<AnswerBase> headerAnswerOrHeaderAnswerEndOrLoopLevelReference;

    /**
     * Gets the value of the headerAnswerOrHeaderAnswerEndOrLoopLevelReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerAnswerOrHeaderAnswerEndOrLoopLevelReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderAnswerOrHeaderAnswerEndOrLoopLevelReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderAnswer }
     * {@link HeaderAnswerEnd }
     * {@link LoopLevelReference }
     * {@link Predefined }
     * {@link Answer }
     * 
     * 
     */
    public List<AnswerBase> getHeaderAnswerOrHeaderAnswerEndOrLoopLevelReference() {
        if (headerAnswerOrHeaderAnswerEndOrLoopLevelReference == null) {
            headerAnswerOrHeaderAnswerEndOrLoopLevelReference = new ArrayList<AnswerBase>();
        }
        return this.headerAnswerOrHeaderAnswerEndOrLoopLevelReference;
    }

}
