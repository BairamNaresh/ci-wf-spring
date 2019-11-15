
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Category"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HierarchyChildMask" type="{http://firmglobal.com/Confirmit/webservices/8.5/}CodeMask" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FormName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LoadCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryAnswer", propOrder = {
    "hierarchyChildMask"
})
@XmlSeeAlso({
    CategoryNotAnswered.class,
    CategoryTotal.class
})
public class CategoryAnswer
    extends Category
{

    @XmlElement(name = "HierarchyChildMask")
    protected CodeMask hierarchyChildMask;
    @XmlAttribute(name = "FormName")
    protected String formName;
    @XmlAttribute(name = "LoadCode")
    protected String loadCode;

    /**
     * Gets the value of the hierarchyChildMask property.
     * 
     * @return
     *     possible object is
     *     {@link CodeMask }
     *     
     */
    public CodeMask getHierarchyChildMask() {
        return hierarchyChildMask;
    }

    /**
     * Sets the value of the hierarchyChildMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeMask }
     *     
     */
    public void setHierarchyChildMask(CodeMask value) {
        this.hierarchyChildMask = value;
    }

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormName(String value) {
        this.formName = value;
    }

    /**
     * Gets the value of the loadCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadCode() {
        return loadCode;
    }

    /**
     * Sets the value of the loadCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadCode(String value) {
        this.loadCode = value;
    }

}
