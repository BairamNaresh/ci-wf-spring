
package com.nielsen.confirmit.webservices.surveydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="QueryForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm"/&gt;
 *         &lt;element name="Function" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"/&gt;
 *         &lt;element name="Categorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization"/&gt;
 *         &lt;element name="QueryField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField"/&gt;
 *         &lt;element name="BinaryArithmetic" type="{http://firmglobal.com/Confirmit/webservices/8.5/}BinaryArithmetic"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChoice4", propOrder = {
    "queryFormOrFunctionOrCategorization"
})
public class ArrayOfChoice4 {

    @XmlElements({
        @XmlElement(name = "QueryForm", type = QueryForm.class, nillable = true),
        @XmlElement(name = "Function", type = Function.class, nillable = true),
        @XmlElement(name = "Categorization", type = Categorization.class, nillable = true),
        @XmlElement(name = "QueryField", type = QueryField.class, nillable = true),
        @XmlElement(name = "BinaryArithmetic", type = BinaryArithmetic.class, nillable = true)
    })
    protected List<Object> queryFormOrFunctionOrCategorization;

    /**
     * Gets the value of the queryFormOrFunctionOrCategorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryFormOrFunctionOrCategorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryFormOrFunctionOrCategorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryForm }
     * {@link Function }
     * {@link Categorization }
     * {@link QueryField }
     * {@link BinaryArithmetic }
     * 
     * 
     */
    public List<Object> getQueryFormOrFunctionOrCategorization() {
        if (queryFormOrFunctionOrCategorization == null) {
            queryFormOrFunctionOrCategorization = new ArrayList<Object>();
        }
        return this.queryFormOrFunctionOrCategorization;
    }

}
