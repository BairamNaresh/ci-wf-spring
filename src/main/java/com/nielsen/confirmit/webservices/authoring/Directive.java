
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Directive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Directive"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageMasterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DirectiveType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}DirectiveDataType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Directive", propOrder = {
    "pageMasterName"
})
public class Directive
    extends QuestionnaireNode
{

    @XmlElement(name = "PageMasterName")
    protected String pageMasterName;
    @XmlAttribute(name = "DirectiveType", required = true)
    protected DirectiveDataType directiveType;

    /**
     * Gets the value of the pageMasterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageMasterName() {
        return pageMasterName;
    }

    /**
     * Sets the value of the pageMasterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageMasterName(String value) {
        this.pageMasterName = value;
    }

    /**
     * Gets the value of the directiveType property.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveDataType }
     *     
     */
    public DirectiveDataType getDirectiveType() {
        return directiveType;
    }

    /**
     * Sets the value of the directiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveDataType }
     *     
     */
    public void setDirectiveType(DirectiveDataType value) {
        this.directiveType = value;
    }

}
