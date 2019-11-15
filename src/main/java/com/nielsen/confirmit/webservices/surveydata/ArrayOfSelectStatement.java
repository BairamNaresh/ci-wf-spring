
package com.nielsen.confirmit.webservices.surveydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSelectStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSelectStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectStatement" type="{http://firmglobal.com/Confirmit/webservices/8.5/}SelectStatement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSelectStatement", propOrder = {
    "selectStatement"
})
public class ArrayOfSelectStatement {

    @XmlElement(name = "SelectStatement", nillable = true)
    protected List<SelectStatement> selectStatement;

    /**
     * Gets the value of the selectStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectStatement }
     * 
     * 
     */
    public List<SelectStatement> getSelectStatement() {
        if (selectStatement == null) {
            selectStatement = new ArrayList<SelectStatement>();
        }
        return this.selectStatement;
    }

}
