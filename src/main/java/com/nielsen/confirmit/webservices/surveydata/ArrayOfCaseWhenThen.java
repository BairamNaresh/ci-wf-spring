
package com.nielsen.confirmit.webservices.surveydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCaseWhenThen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCaseWhenThen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WhenThen" type="{http://firmglobal.com/Confirmit/webservices/8.5/}CaseWhenThen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCaseWhenThen", propOrder = {
    "whenThen"
})
public class ArrayOfCaseWhenThen {

    @XmlElement(name = "WhenThen", nillable = true)
    protected List<CaseWhenThen> whenThen;

    /**
     * Gets the value of the whenThen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whenThen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhenThen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseWhenThen }
     * 
     * 
     */
    public List<CaseWhenThen> getWhenThen() {
        if (whenThen == null) {
            whenThen = new ArrayList<CaseWhenThen>();
        }
        return this.whenThen;
    }

}
