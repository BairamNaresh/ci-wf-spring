
package com.nielsen.confirmit.webservices.surveydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChangedDataLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChangedDataLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangedDataLevel" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ChangedDataLevel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChangedDataLevel", propOrder = {
    "changedDataLevel"
})
public class ArrayOfChangedDataLevel {

    @XmlElement(name = "ChangedDataLevel", nillable = true)
    protected List<ChangedDataLevel> changedDataLevel;

    /**
     * Gets the value of the changedDataLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedDataLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedDataLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangedDataLevel }
     * 
     * 
     */
    public List<ChangedDataLevel> getChangedDataLevel() {
        if (changedDataLevel == null) {
            changedDataLevel = new ArrayList<ChangedDataLevel>();
        }
        return this.changedDataLevel;
    }

}
