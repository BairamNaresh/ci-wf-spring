
package com.nielsen.confirmit.webservices.authoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Grid3D" type="{http://firmglobal.com/Confirmit/webservices/}Grid3DForm"/&gt;
 *         &lt;element name="Open" type="{http://firmglobal.com/Confirmit/webservices/}OpenForm"/&gt;
 *         &lt;element name="Grid" type="{http://firmglobal.com/Confirmit/webservices/}GridForm"/&gt;
 *         &lt;element name="Multi" type="{http://firmglobal.com/Confirmit/webservices/}MultiForm"/&gt;
 *         &lt;element name="Info" type="{http://firmglobal.com/Confirmit/webservices/}InfoForm"/&gt;
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
@XmlType(name = "ArrayOfChoice9", propOrder = {
    "grid3DOrOpenOrGrid"
})
public class ArrayOfChoice9 {

    @XmlElements({
        @XmlElement(name = "Grid3D", type = Grid3DForm.class, nillable = true),
        @XmlElement(name = "Open", type = OpenForm.class, nillable = true),
        @XmlElement(name = "Grid", type = GridForm.class, nillable = true),
        @XmlElement(name = "Multi", type = MultiForm.class, nillable = true),
        @XmlElement(name = "Info", type = InfoForm.class, nillable = true),
        @XmlElement(name = "Single", type = SingleForm.class, nillable = true)
    })
    protected List<FormBase> grid3DOrOpenOrGrid;

    /**
     * Gets the value of the grid3DOrOpenOrGrid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grid3DOrOpenOrGrid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrid3DOrOpenOrGrid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Grid3DForm }
     * {@link OpenForm }
     * {@link GridForm }
     * {@link MultiForm }
     * {@link InfoForm }
     * {@link SingleForm }
     * 
     * 
     */
    public List<FormBase> getGrid3DOrOpenOrGrid() {
        if (grid3DOrOpenOrGrid == null) {
            grid3DOrOpenOrGrid = new ArrayList<FormBase>();
        }
        return this.grid3DOrOpenOrGrid;
    }

}
