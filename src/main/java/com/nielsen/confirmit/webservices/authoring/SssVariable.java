
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SssVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SssVariable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://firmglobal.com/Confirmit/webservices/}SpecializedTexts" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://firmglobal.com/Confirmit/webservices/}SssPosition" minOccurs="0"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spread" type="{http://firmglobal.com/Confirmit/webservices/}SssSpread" minOccurs="0"/&gt;
 *         &lt;element name="values" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice1" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="parenttype" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="formtype" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="formlabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="parentlabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="routingid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="questioncategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fieldwidth" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="other" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="precode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="parentname" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ident" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://firmglobal.com/Confirmit/webservices/}SssVariableType" /&gt;
 *       &lt;attribute name="fixtype" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="loopiterationid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="formname" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="loopid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SssVariable", propOrder = {
    "name",
    "label",
    "position",
    "size",
    "spread",
    "values",
    "filter"
})
public class SssVariable {

    protected String name;
    protected SpecializedTexts label;
    protected SssPosition position;
    protected String size;
    protected SssSpread spread;
    protected ArrayOfChoice1 values;
    protected String filter;
    @XmlAttribute(name = "parenttype")
    protected String parenttype;
    @XmlAttribute(name = "formtype")
    protected String formtype;
    @XmlAttribute(name = "formlabel")
    protected String formlabel;
    @XmlAttribute(name = "parentlabel")
    protected String parentlabel;
    @XmlAttribute(name = "routingid")
    protected String routingid;
    @XmlAttribute(name = "questioncategory")
    protected String questioncategory;
    @XmlAttribute(name = "fieldwidth")
    protected String fieldwidth;
    @XmlAttribute(name = "other")
    protected String other;
    @XmlAttribute(name = "precode")
    protected String precode;
    @XmlAttribute(name = "parentname")
    protected String parentname;
    @XmlAttribute(name = "use")
    protected String use;
    @XmlAttribute(name = "ident")
    protected String ident;
    @XmlAttribute(name = "format")
    protected String format;
    @XmlAttribute(name = "type", required = true)
    protected SssVariableType type;
    @XmlAttribute(name = "fixtype")
    protected String fixtype;
    @XmlAttribute(name = "loopiterationid")
    protected String loopiterationid;
    @XmlAttribute(name = "formname")
    protected String formname;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "loopid")
    protected String loopid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link SpecializedTexts }
     *     
     */
    public SpecializedTexts getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecializedTexts }
     *     
     */
    public void setLabel(SpecializedTexts value) {
        this.label = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link SssPosition }
     *     
     */
    public SssPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link SssPosition }
     *     
     */
    public void setPosition(SssPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the spread property.
     * 
     * @return
     *     possible object is
     *     {@link SssSpread }
     *     
     */
    public SssSpread getSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     * @param value
     *     allowed object is
     *     {@link SssSpread }
     *     
     */
    public void setSpread(SssSpread value) {
        this.spread = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice1 }
     *     
     */
    public ArrayOfChoice1 getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice1 }
     *     
     */
    public void setValues(ArrayOfChoice1 value) {
        this.values = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the parenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParenttype() {
        return parenttype;
    }

    /**
     * Sets the value of the parenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParenttype(String value) {
        this.parenttype = value;
    }

    /**
     * Gets the value of the formtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormtype() {
        return formtype;
    }

    /**
     * Sets the value of the formtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormtype(String value) {
        this.formtype = value;
    }

    /**
     * Gets the value of the formlabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormlabel() {
        return formlabel;
    }

    /**
     * Sets the value of the formlabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormlabel(String value) {
        this.formlabel = value;
    }

    /**
     * Gets the value of the parentlabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentlabel() {
        return parentlabel;
    }

    /**
     * Sets the value of the parentlabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentlabel(String value) {
        this.parentlabel = value;
    }

    /**
     * Gets the value of the routingid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingid() {
        return routingid;
    }

    /**
     * Sets the value of the routingid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingid(String value) {
        this.routingid = value;
    }

    /**
     * Gets the value of the questioncategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestioncategory() {
        return questioncategory;
    }

    /**
     * Sets the value of the questioncategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestioncategory(String value) {
        this.questioncategory = value;
    }

    /**
     * Gets the value of the fieldwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldwidth() {
        return fieldwidth;
    }

    /**
     * Sets the value of the fieldwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldwidth(String value) {
        this.fieldwidth = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the precode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecode() {
        return precode;
    }

    /**
     * Sets the value of the precode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecode(String value) {
        this.precode = value;
    }

    /**
     * Gets the value of the parentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentname() {
        return parentname;
    }

    /**
     * Sets the value of the parentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentname(String value) {
        this.parentname = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUse(String value) {
        this.use = value;
    }

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SssVariableType }
     *     
     */
    public SssVariableType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SssVariableType }
     *     
     */
    public void setType(SssVariableType value) {
        this.type = value;
    }

    /**
     * Gets the value of the fixtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixtype() {
        return fixtype;
    }

    /**
     * Sets the value of the fixtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixtype(String value) {
        this.fixtype = value;
    }

    /**
     * Gets the value of the loopiterationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopiterationid() {
        return loopiterationid;
    }

    /**
     * Sets the value of the loopiterationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopiterationid(String value) {
        this.loopiterationid = value;
    }

    /**
     * Gets the value of the formname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormname() {
        return formname;
    }

    /**
     * Sets the value of the formname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormname(String value) {
        this.formname = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the loopid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopid() {
        return loopid;
    }

    /**
     * Sets the value of the loopid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopid(String value) {
        this.loopid = value;
    }

}
