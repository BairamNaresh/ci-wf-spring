
package com.nielsen.confirmit.webservices.surveydata;

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
 *         &lt;element name="Function" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"/&gt;
 *         &lt;element name="Categorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization"/&gt;
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
    "functionOrCategorization"
})
public class ArrayOfChoice5 {

    @XmlElements({
        @XmlElement(name = "Function", type = Function.class, nillable = true),
        @XmlElement(name = "Categorization", type = Categorization.class, nillable = true)
    })
    protected List<Object> functionOrCategorization;

    /**
     * Gets the value of the functionOrCategorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionOrCategorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionOrCategorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Function }
     * {@link Categorization }
     * 
     * 
     */
    public List<Object> getFunctionOrCategorization() {
        if (functionOrCategorization == null) {
            functionOrCategorization = new ArrayList<Object>();
        }
        return this.functionOrCategorization;
    }

}
