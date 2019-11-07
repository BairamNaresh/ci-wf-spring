
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Node complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Node"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="_Objid_Xml" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Node")
@XmlSeeAlso({
    Root.class,
    PredefinedList.class,
    ProjectInfo.class,
    Questionnaire.class,
    QuestionnaireNode.class,
    Quota.class
})
public abstract class Node {

    @XmlAttribute(name = "_Objid_Xml")
    protected String objidXml;

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

}
