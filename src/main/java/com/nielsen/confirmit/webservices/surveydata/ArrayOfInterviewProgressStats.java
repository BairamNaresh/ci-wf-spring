
package com.nielsen.confirmit.webservices.surveydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInterviewProgressStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInterviewProgressStats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterviewProgressStats" type="{http://firmglobal.com/Confirmit/webservices/8.5/}InterviewProgressStats" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInterviewProgressStats", propOrder = {
    "interviewProgressStats"
})
public class ArrayOfInterviewProgressStats {

    @XmlElement(name = "InterviewProgressStats", nillable = true)
    protected List<InterviewProgressStats> interviewProgressStats;

    /**
     * Gets the value of the interviewProgressStats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interviewProgressStats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterviewProgressStats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterviewProgressStats }
     * 
     * 
     */
    public List<InterviewProgressStats> getInterviewProgressStats() {
        if (interviewProgressStats == null) {
            interviewProgressStats = new ArrayList<InterviewProgressStats>();
        }
        return this.interviewProgressStats;
    }

}
