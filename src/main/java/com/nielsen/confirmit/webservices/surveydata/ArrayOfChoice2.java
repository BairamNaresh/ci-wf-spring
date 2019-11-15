
package com.nielsen.confirmit.webservices.surveydata;

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
 *         &lt;element name="ExprField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField"/&gt;
 *         &lt;element name="ExprForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm"/&gt;
 *         &lt;element name="ExprFieldCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}FieldCategorization"/&gt;
 *         &lt;element name="ExprConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant"/&gt;
 *         &lt;element name="ExprBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}BinaryArithmetic"/&gt;
 *         &lt;element name="ExprFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"/&gt;
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
    "exprFieldOrExprFormOrExprFieldCategorization"
})
public class ArrayOfChoice2 {

    @XmlElements({
        @XmlElement(name = "ExprField", type = QueryField.class, nillable = true),
        @XmlElement(name = "ExprForm", type = QueryForm.class, nillable = true),
        @XmlElement(name = "ExprFieldCategorization", type = FieldCategorization.class, nillable = true),
        @XmlElement(name = "ExprConstant", type = QueryConstant.class, nillable = true),
        @XmlElement(name = "ExprBinary", type = BinaryArithmetic.class, nillable = true),
        @XmlElement(name = "ExprFunction", type = Function.class, nillable = true)
    })
    protected List<Object> exprFieldOrExprFormOrExprFieldCategorization;

    /**
     * Gets the value of the exprFieldOrExprFormOrExprFieldCategorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exprFieldOrExprFormOrExprFieldCategorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExprFieldOrExprFormOrExprFieldCategorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryField }
     * {@link QueryForm }
     * {@link FieldCategorization }
     * {@link QueryConstant }
     * {@link BinaryArithmetic }
     * {@link Function }
     * 
     * 
     */
    public List<Object> getExprFieldOrExprFormOrExprFieldCategorization() {
        if (exprFieldOrExprFormOrExprFieldCategorization == null) {
            exprFieldOrExprFormOrExprFieldCategorization = new ArrayList<Object>();
        }
        return this.exprFieldOrExprFormOrExprFieldCategorization;
    }

}
