
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinaryComparison complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryComparison"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary"&gt;
 *       &lt;attribute name="Type" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ComparisonType" /&gt;
 *       &lt;attribute name="Not" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryComparison")
public class BinaryComparison
    extends Binary
{

    @XmlAttribute(name = "Type", required = true)
    protected ComparisonType type;
    @XmlAttribute(name = "Not", required = true)
    protected boolean not;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonType }
     *     
     */
    public ComparisonType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonType }
     *     
     */
    public void setType(ComparisonType value) {
        this.type = value;
    }

    /**
     * Gets the value of the not property.
     * 
     */
    public boolean isNot() {
        return not;
    }

    /**
     * Sets the value of the not property.
     * 
     */
    public void setNot(boolean value) {
        this.not = value;
    }

}
