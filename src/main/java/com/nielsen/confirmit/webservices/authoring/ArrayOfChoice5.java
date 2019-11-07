
package com.nielsen.confirmit.webservices.authoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Scale" type="{http://firmglobal.com/Confirmit/webservices/}Answer"/&gt;
 *         &lt;element name="HeaderAnswer" type="{http://firmglobal.com/Confirmit/webservices/}HeaderAnswer"/&gt;
 *         &lt;element name="HeaderAnswerEnd" type="{http://firmglobal.com/Confirmit/webservices/}HeaderAnswerEnd"/&gt;
 *         &lt;element name="Predefined" type="{http://firmglobal.com/Confirmit/webservices/}Predefined"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChoice5", propOrder = {
    "scaleOrHeaderAnswerOrHeaderAnswerEnd"
})
public class ArrayOfChoice5 {

    @XmlElements({
        @XmlElement(name = "Scale", type = Answer.class, nillable = true),
        @XmlElement(name = "HeaderAnswer", type = HeaderAnswer.class, nillable = true),
        @XmlElement(name = "HeaderAnswerEnd", type = HeaderAnswerEnd.class, nillable = true),
        @XmlElement(name = "Predefined", type = Predefined.class, nillable = true)
    })
    protected List<AnswerBase> scaleOrHeaderAnswerOrHeaderAnswerEnd;

    /**
     * Gets the value of the scaleOrHeaderAnswerOrHeaderAnswerEnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scaleOrHeaderAnswerOrHeaderAnswerEnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScaleOrHeaderAnswerOrHeaderAnswerEnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Answer }
     * {@link HeaderAnswer }
     * {@link HeaderAnswerEnd }
     * {@link Predefined }
     * 
     * 
     */
    public List<AnswerBase> getScaleOrHeaderAnswerOrHeaderAnswerEnd() {
        if (scaleOrHeaderAnswerOrHeaderAnswerEnd == null) {
            scaleOrHeaderAnswerOrHeaderAnswerEnd = new ArrayList<AnswerBase>();
        }
        return this.scaleOrHeaderAnswerOrHeaderAnswerEnd;
    }

}
