
package com.nielsen.confirmit.webservices.authoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="LoopMember" type="{http://firmglobal.com/Confirmit/webservices/}LoopMember"/&gt;
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
@XmlType(name = "ArrayOfChoice2", propOrder = {
    "loopMemberOrPredefined"
})
public class ArrayOfChoice2 {

    @XmlElements({
        @XmlElement(name = "LoopMember", type = LoopMember.class, nillable = true),
        @XmlElement(name = "Predefined", type = Predefined.class, nillable = true)
    })
    protected List<AnswerBase> loopMemberOrPredefined;

    /**
     * Gets the value of the loopMemberOrPredefined property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loopMemberOrPredefined property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoopMemberOrPredefined().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoopMember }
     * {@link Predefined }
     * 
     * 
     */
    public List<AnswerBase> getLoopMemberOrPredefined() {
        if (loopMemberOrPredefined == null) {
            loopMemberOrPredefined = new ArrayList<AnswerBase>();
        }
        return this.loopMemberOrPredefined;
    }

}
