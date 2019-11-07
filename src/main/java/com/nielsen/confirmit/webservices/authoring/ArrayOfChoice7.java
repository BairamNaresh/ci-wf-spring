
package com.nielsen.confirmit.webservices.authoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Grid" type="{http://firmglobal.com/Confirmit/webservices/}GridForm"/&gt;
 *         &lt;element name="Multi" type="{http://firmglobal.com/Confirmit/webservices/}MultiForm"/&gt;
 *         &lt;element name="Single" type="{http://firmglobal.com/Confirmit/webservices/}SingleForm"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChoice7", propOrder = {
    "gridOrMultiOrSingle"
})
public class ArrayOfChoice7 {

    @XmlElements({
        @XmlElement(name = "Grid", type = GridForm.class, nillable = true),
        @XmlElement(name = "Multi", type = MultiForm.class, nillable = true),
        @XmlElement(name = "Single", type = SingleForm.class, nillable = true)
    })
    protected List<QuestionFormBase> gridOrMultiOrSingle;

    /**
     * Gets the value of the gridOrMultiOrSingle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gridOrMultiOrSingle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGridOrMultiOrSingle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GridForm }
     * {@link MultiForm }
     * {@link SingleForm }
     * 
     * 
     */
    public List<QuestionFormBase> getGridOrMultiOrSingle() {
        if (gridOrMultiOrSingle == null) {
            gridOrMultiOrSingle = new ArrayList<QuestionFormBase>();
        }
        return this.gridOrMultiOrSingle;
    }

}
