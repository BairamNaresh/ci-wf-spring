
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinaryArithmetic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryArithmetic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary"&gt;
 *       &lt;attribute name="Type" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArithmeticType" /&gt;
 *       &lt;attribute name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GroupBy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryArithmetic")
public class BinaryArithmetic
    extends Binary
{

    @XmlAttribute(name = "Type", required = true)
    protected ArithmeticType type;
    @XmlAttribute(name = "Alias")
    protected String alias;
    @XmlAttribute(name = "GroupBy", required = true)
    protected boolean groupBy;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ArithmeticType }
     *     
     */
    public ArithmeticType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArithmeticType }
     *     
     */
    public void setType(ArithmeticType value) {
        this.type = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
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

}
