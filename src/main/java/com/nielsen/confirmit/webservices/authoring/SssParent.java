
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SssParent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SssParent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ordered" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="linkvar" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="parlev" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SssParent")
public class SssParent {

    @XmlAttribute(name = "ordered")
    protected String ordered;
    @XmlAttribute(name = "linkvar")
    protected String linkvar;
    @XmlAttribute(name = "level")
    protected String level;
    @XmlAttribute(name = "parlev")
    protected String parlev;

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdered(String value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the linkvar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkvar() {
        return linkvar;
    }

    /**
     * Sets the value of the linkvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkvar(String value) {
        this.linkvar = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the parlev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParlev() {
        return parlev;
    }

    /**
     * Sets the value of the parlev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParlev(String value) {
        this.parlev = value;
    }

}
