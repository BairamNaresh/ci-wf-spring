
package com.nielsen.confirmit.webservices.authoring;

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
 *         &lt;element name="range" type="{http://firmglobal.com/Confirmit/webservices/}SssRange"/&gt;
 *         &lt;element name="value" type="{http://firmglobal.com/Confirmit/webservices/}SssValue"/&gt;
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
    "rangeOrValue"
})
public class ArrayOfChoice1 {

    @XmlElements({
        @XmlElement(name = "range", type = SssRange.class, nillable = true),
        @XmlElement(name = "value", type = SssValue.class, nillable = true)
    })
    protected List<SssValueBase> rangeOrValue;

    /**
     * Gets the value of the rangeOrValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangeOrValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangeOrValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SssRange }
     * {@link SssValue }
     * 
     * 
     */
    public List<SssValueBase> getRangeOrValue() {
        if (rangeOrValue == null) {
            rangeOrValue = new ArrayList<SssValueBase>();
        }
        return this.rangeOrValue;
    }

}
