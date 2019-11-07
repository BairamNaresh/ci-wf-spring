
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnswerBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="_Objid_Xml" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Precode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ListSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Other" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="KeepPosition" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ChartColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AnswerStyle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StyleName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerBase")
@XmlSeeAlso({
    HeaderAnswer.class,
    LoopMember.class,
    HeaderAnswerEnd.class,
    LoopLevelReference.class,
    HieararchyAnswer.class,
    Predefined.class,
    GridAnswer.class,
    Answer.class,
    AdditionalColumnAnswer.class
})
public abstract class AnswerBase {

    @XmlAttribute(name = "_Objid_Xml")
    protected String objidXml;
    @XmlAttribute(name = "Precode")
    protected String precode;
    @XmlAttribute(name = "ListSource")
    protected String listSource;
    @XmlAttribute(name = "Other", required = true)
    protected boolean other;
    @XmlAttribute(name = "KeepPosition", required = true)
    protected boolean keepPosition;
    @XmlAttribute(name = "ChartColor")
    protected String chartColor;
    @XmlAttribute(name = "AnswerStyle")
    protected String answerStyle;
    @XmlAttribute(name = "StyleName")
    protected String styleName;

    /**
     * Gets the value of the objidXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjidXml() {
        return objidXml;
    }

    /**
     * Sets the value of the objidXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjidXml(String value) {
        this.objidXml = value;
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
     * Gets the value of the listSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListSource() {
        return listSource;
    }

    /**
     * Sets the value of the listSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListSource(String value) {
        this.listSource = value;
    }

    /**
     * Gets the value of the other property.
     * 
     */
    public boolean isOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     */
    public void setOther(boolean value) {
        this.other = value;
    }

    /**
     * Gets the value of the keepPosition property.
     * 
     */
    public boolean isKeepPosition() {
        return keepPosition;
    }

    /**
     * Sets the value of the keepPosition property.
     * 
     */
    public void setKeepPosition(boolean value) {
        this.keepPosition = value;
    }

    /**
     * Gets the value of the chartColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChartColor() {
        return chartColor;
    }

    /**
     * Sets the value of the chartColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChartColor(String value) {
        this.chartColor = value;
    }

    /**
     * Gets the value of the answerStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerStyle() {
        return answerStyle;
    }

    /**
     * Sets the value of the answerStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerStyle(String value) {
        this.answerStyle = value;
    }

    /**
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

}
