
package com.nielsen.confirmit.webservices.surveydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDataCell complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDataCell"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataCell" type="{http://firmglobal.com/Confirmit/webservices/8.5/}DataCell" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataCell", propOrder = {
    "dataCell"
})
public class ArrayOfDataCell {

    @XmlElement(name = "DataCell", nillable = true)
    protected List<DataCell> dataCell;

    /**
     * Gets the value of the dataCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataCell }
     * 
     * 
     */
    public List<DataCell> getDataCell() {
        if (dataCell == null) {
            dataCell = new ArrayList<DataCell>();
        }
        return this.dataCell;
    }

}
