
package com.nielsen.confirmit.webservices.surveydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="QueryConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant"/&gt;
 *         &lt;element name="Categorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization"/&gt;
 *         &lt;element name="QueryField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField"/&gt;
 *         &lt;element name="Binary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary"/&gt;
 *         &lt;element name="Function" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"/&gt;
 *         &lt;element name="QueryForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChoice1", propOrder = {
    "queryConstantOrCategorizationOrQueryField"
})
public class ArrayOfChoice1 {

    @XmlElements({
        @XmlElement(name = "QueryConstant", type = QueryConstant.class, nillable = true),
        @XmlElement(name = "Categorization", type = Categorization.class, nillable = true),
        @XmlElement(name = "QueryField", type = QueryField.class, nillable = true),
        @XmlElement(name = "Binary", type = Binary.class, nillable = true),
        @XmlElement(name = "Function", type = Function.class, nillable = true),
        @XmlElement(name = "QueryForm", type = QueryForm.class, nillable = true)
    })
    protected List<Object> queryConstantOrCategorizationOrQueryField;

    /**
     * Gets the value of the queryConstantOrCategorizationOrQueryField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryConstantOrCategorizationOrQueryField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryConstantOrCategorizationOrQueryField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryConstant }
     * {@link Categorization }
     * {@link QueryField }
     * {@link Binary }
     * {@link Function }
     * {@link QueryForm }
     * 
     * 
     */
    public List<Object> getQueryConstantOrCategorizationOrQueryField() {
        if (queryConstantOrCategorizationOrQueryField == null) {
            queryConstantOrCategorizationOrQueryField = new ArrayList<Object>();
        }
        return this.queryConstantOrCategorizationOrQueryField;
    }

}
