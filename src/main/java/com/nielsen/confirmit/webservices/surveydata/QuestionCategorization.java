
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuestionCategorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionCategorization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mask" type="{http://firmglobal.com/Confirmit/webservices/8.5/}CodeMask" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NameSource" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}NameSourceType" /&gt;
 *       &lt;attribute name="GroupBy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FormName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OrderBy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionCategorization", propOrder = {
    "mask"
})
@XmlSeeAlso({
    Dimension.class,
    FieldCategorization.class
})
public abstract class QuestionCategorization
    extends Categorization
{

    @XmlElement(name = "Mask")
    protected CodeMask mask;
    @XmlAttribute(name = "NameSource", required = true)
    protected NameSourceType nameSource;
    @XmlAttribute(name = "GroupBy", required = true)
    protected boolean groupBy;
    @XmlAttribute(name = "FormName")
    protected String formName;
    @XmlAttribute(name = "OrderBy", required = true)
    protected boolean orderBy;

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
     * Gets the value of the nameSource property.
     * 
     * @return
     *     possible object is
     *     {@link NameSourceType }
     *     
     */
    public NameSourceType getNameSource() {
        return nameSource;
    }

    /**
     * Sets the value of the nameSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSourceType }
     *     
     */
    public void setNameSource(NameSourceType value) {
        this.nameSource = value;
    }

    /**
     * Gets the value of the groupBy property.
     * 
     */
    public boolean isGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     * 
     */
    public void setGroupBy(boolean value) {
        this.groupBy = value;
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
     * Gets the value of the orderBy property.
     * 
     */
    public boolean isOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     */
    public void setOrderBy(boolean value) {
        this.orderBy = value;
    }

}
