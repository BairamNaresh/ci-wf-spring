
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderByClause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderByClause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderByItems" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfChoice4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderByClause", propOrder = {
    "orderByItems"
})
public class OrderByClause {

    @XmlElement(name = "OrderByItems")
    protected ArrayOfChoice4 orderByItems;

    /**
     * Gets the value of the orderByItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice4 }
     *     
     */
    public ArrayOfChoice4 getOrderByItems() {
        return orderByItems;
    }

    /**
     * Sets the value of the orderByItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice4 }
     *     
     */
    public void setOrderByItems(ArrayOfChoice4 value) {
        this.orderByItems = value;
    }

}
