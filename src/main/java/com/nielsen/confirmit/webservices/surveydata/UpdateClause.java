
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateClause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateClause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdateItems" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfChoice5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateClause", propOrder = {
    "updateItems"
})
public class UpdateClause {

    @XmlElement(name = "UpdateItems")
    protected ArrayOfChoice5 updateItems;

    /**
     * Gets the value of the updateItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice5 }
     *     
     */
    public ArrayOfChoice5 getUpdateItems() {
        return updateItems;
    }

    /**
     * Sets the value of the updateItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice5 }
     *     
     */
    public void setUpdateItems(ArrayOfChoice5 value) {
        this.updateItems = value;
    }

}
