
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinaryLogic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryLogic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary"&gt;
 *       &lt;attribute name="Type" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}LogicType" /&gt;
 *       &lt;attribute name="Not" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryLogic")
public class BinaryLogic
    extends Binary
{

    @XmlAttribute(name = "Type", required = true)
    protected LogicType type;
    @XmlAttribute(name = "Not", required = true)
    protected boolean not;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LogicType }
     *     
     */
    public LogicType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicType }
     *     
     */
    public void setType(LogicType value) {
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
