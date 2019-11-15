
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryFormElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryFormElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Category"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mask" type="{http://firmglobal.com/Confirmit/webservices/8.5/}CodeMask" minOccurs="0"/&gt;
 *         &lt;element name="List" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ListType"/&gt;
 *         &lt;element name="FormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryFormElements", propOrder = {
    "mask",
    "list",
    "formName"
})
public class CategoryFormElements
    extends Category
{

    @XmlElement(name = "Mask")
    protected CodeMask mask;
    @XmlElement(name = "List", required = true)
    @XmlSchemaType(name = "string")
    protected ListType list;
    @XmlElement(name = "FormName")
    protected String formName;

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link CodeMask }
     *     
     */
    public CodeMask getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeMask }
     *     
     */
    public void setMask(CodeMask value) {
        this.mask = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ListType }
     *     
     */
    public ListType getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListType }
     *     
     */
    public void setList(ListType value) {
        this.list = value;
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

}
