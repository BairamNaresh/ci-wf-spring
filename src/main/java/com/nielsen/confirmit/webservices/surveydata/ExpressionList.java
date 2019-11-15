
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Expressions" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfChoice2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionList", propOrder = {
    "expressions"
})
public class ExpressionList {

    @XmlElement(name = "Expressions")
    protected ArrayOfChoice2 expressions;

    /**
     * Gets the value of the expressions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice2 }
     *     
     */
    public ArrayOfChoice2 getExpressions() {
        return expressions;
    }

    /**
     * Sets the value of the expressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice2 }
     *     
     */
    public void setExpressions(ArrayOfChoice2 value) {
        this.expressions = value;
    }

}
