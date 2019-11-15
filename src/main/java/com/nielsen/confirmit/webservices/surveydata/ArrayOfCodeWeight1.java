
package com.nielsen.confirmit.webservices.surveydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCodeWeight1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCodeWeight1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Weights" type="{http://firmglobal.com/Confirmit/webservices/8.5/}CodeWeight" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCodeWeight1", propOrder = {
    "weights"
})
public class ArrayOfCodeWeight1 {

    @XmlElement(name = "Weights", nillable = true)
    protected List<CodeWeight> weights;

    /**
     * Gets the value of the weights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeWeight }
     * 
     * 
     */
    public List<CodeWeight> getWeights() {
        if (weights == null) {
            weights = new ArrayList<CodeWeight>();
        }
        return this.weights;
    }

}
