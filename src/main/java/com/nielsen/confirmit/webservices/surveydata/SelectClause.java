
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectClause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectClause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectItems" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfChoice3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Star" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectClause", propOrder = {
    "selectItems"
})
public class SelectClause {

    @XmlElement(name = "SelectItems")
    protected ArrayOfChoice3 selectItems;
    @XmlAttribute(name = "Star", required = true)
    protected boolean star;

    /**
     * Gets the value of the selectItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice3 }
     *     
     */
    public ArrayOfChoice3 getSelectItems() {
        return selectItems;
    }

    /**
     * Sets the value of the selectItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice3 }
     *     
     */
    public void setSelectItems(ArrayOfChoice3 value) {
        this.selectItems = value;
    }

    /**
     * Gets the value of the star property.
     * 
     */
    public boolean isStar() {
        return star;
    }

    /**
     * Sets the value of the star property.
     * 
     */
    public void setStar(boolean value) {
        this.star = value;
    }

}
