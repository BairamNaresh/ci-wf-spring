
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HieararchyAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HieararchyAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}AnswerBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HierarchyRootNodes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfHierarchyNode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HieararchyAnswer", propOrder = {
    "hierarchyRootNodes"
})
public class HieararchyAnswer
    extends AnswerBase
{

    @XmlElement(name = "HierarchyRootNodes")
    protected ArrayOfHierarchyNode hierarchyRootNodes;

    /**
     * Gets the value of the hierarchyRootNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHierarchyNode }
     *     
     */
    public ArrayOfHierarchyNode getHierarchyRootNodes() {
        return hierarchyRootNodes;
    }

    /**
     * Sets the value of the hierarchyRootNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHierarchyNode }
     *     
     */
    public void setHierarchyRootNodes(ArrayOfHierarchyNode value) {
        this.hierarchyRootNodes = value;
    }

}
