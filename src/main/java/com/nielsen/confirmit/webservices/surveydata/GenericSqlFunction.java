
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericSqlFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericSqlFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Function"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arguments" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfChoice1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}GenericSqlFunctionType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericSqlFunction", propOrder = {
    "arguments"
})
public class GenericSqlFunction
    extends Function
{

    @XmlElement(name = "Arguments")
    protected ArrayOfChoice1 arguments;
    @XmlAttribute(name = "Type", required = true)
    protected GenericSqlFunctionType type;

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice1 }
     *     
     */
    public ArrayOfChoice1 getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice1 }
     *     
     */
    public void setArguments(ArrayOfChoice1 value) {
        this.arguments = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GenericSqlFunctionType }
     *     
     */
    public GenericSqlFunctionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSqlFunctionType }
     *     
     */
    public void setType(GenericSqlFunctionType value) {
        this.type = value;
    }

}
