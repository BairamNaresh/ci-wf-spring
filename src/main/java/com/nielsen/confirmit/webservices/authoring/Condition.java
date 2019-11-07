
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Condition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Condition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrueNodes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice11" minOccurs="0"/&gt;
 *         &lt;element name="FalseNodes" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice12" minOccurs="0"/&gt;
 *         &lt;element name="Expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PerformDelete" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ElseEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReadOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", propOrder = {
    "trueNodes",
    "falseNodes",
    "expression"
})
public class Condition
    extends QuestionnaireNode
{

    @XmlElement(name = "TrueNodes")
    protected ArrayOfChoice11 trueNodes;
    @XmlElement(name = "FalseNodes")
    protected ArrayOfChoice12 falseNodes;
    @XmlElement(name = "Expression")
    protected String expression;
    @XmlAttribute(name = "PerformDelete", required = true)
    protected boolean performDelete;
    @XmlAttribute(name = "ElseEnabled", required = true)
    protected boolean elseEnabled;
    @XmlAttribute(name = "ReadOnly", required = true)
    protected boolean readOnly;

    /**
     * Gets the value of the trueNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice11 }
     *     
     */
    public ArrayOfChoice11 getTrueNodes() {
        return trueNodes;
    }

    /**
     * Sets the value of the trueNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice11 }
     *     
     */
    public void setTrueNodes(ArrayOfChoice11 value) {
        this.trueNodes = value;
    }

    /**
     * Gets the value of the falseNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice12 }
     *     
     */
    public ArrayOfChoice12 getFalseNodes() {
        return falseNodes;
    }

    /**
     * Sets the value of the falseNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice12 }
     *     
     */
    public void setFalseNodes(ArrayOfChoice12 value) {
        this.falseNodes = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the performDelete property.
     * 
     */
    public boolean isPerformDelete() {
        return performDelete;
    }

    /**
     * Sets the value of the performDelete property.
     * 
     */
    public void setPerformDelete(boolean value) {
        this.performDelete = value;
    }

    /**
     * Gets the value of the elseEnabled property.
     * 
     */
    public boolean isElseEnabled() {
        return elseEnabled;
    }

    /**
     * Sets the value of the elseEnabled property.
     * 
     */
    public void setElseEnabled(boolean value) {
        this.elseEnabled = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

}
