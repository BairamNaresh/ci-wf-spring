
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hierarchy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}ExternalLookup"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HierarchyElements" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfHierarchyElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HierarchyId" use="required" type="{http://microsoft.com/wsdl/types/}guid" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hierarchy", propOrder = {
    "hierarchyElements"
})
public class Hierarchy
    extends ExternalLookup
{

    @XmlElement(name = "HierarchyElements")
    protected ArrayOfHierarchyElement hierarchyElements;
    @XmlAttribute(name = "HierarchyId", required = true)
    protected String hierarchyId;

    /**
     * Gets the value of the hierarchyElements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHierarchyElement }
     *     
     */
    public ArrayOfHierarchyElement getHierarchyElements() {
        return hierarchyElements;
    }

    /**
     * Sets the value of the hierarchyElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHierarchyElement }
     *     
     */
    public void setHierarchyElements(ArrayOfHierarchyElement value) {
        this.hierarchyElements = value;
    }

    /**
     * Gets the value of the hierarchyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyId() {
        return hierarchyId;
    }

    /**
     * Sets the value of the hierarchyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyId(String value) {
        this.hierarchyId = value;
    }

}
