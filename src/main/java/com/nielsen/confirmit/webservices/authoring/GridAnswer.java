
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GridAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GridAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}AnswerBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Texts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfGridAnswerText" minOccurs="0"/&gt;
 *         &lt;element name="TextsRight" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfGridAnswerText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FieldId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="RdgSingleProportion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridAnswer", propOrder = {
    "texts",
    "textsRight"
})
public class GridAnswer
    extends AnswerBase
{

    @XmlElement(name = "Texts")
    protected ArrayOfGridAnswerText texts;
    @XmlElement(name = "TextsRight")
    protected ArrayOfGridAnswerText textsRight;
    @XmlAttribute(name = "FieldId", required = true)
    protected int fieldId;
    @XmlAttribute(name = "RdgSingleProportion", required = true)
    protected int rdgSingleProportion;

    /**
     * Gets the value of the texts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGridAnswerText }
     *     
     */
    public ArrayOfGridAnswerText getTexts() {
        return texts;
    }

    /**
     * Sets the value of the texts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGridAnswerText }
     *     
     */
    public void setTexts(ArrayOfGridAnswerText value) {
        this.texts = value;
    }

    /**
     * Gets the value of the textsRight property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGridAnswerText }
     *     
     */
    public ArrayOfGridAnswerText getTextsRight() {
        return textsRight;
    }

    /**
     * Sets the value of the textsRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGridAnswerText }
     *     
     */
    public void setTextsRight(ArrayOfGridAnswerText value) {
        this.textsRight = value;
    }

    /**
     * Gets the value of the fieldId property.
     * 
     */
    public int getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     * 
     */
    public void setFieldId(int value) {
        this.fieldId = value;
    }

    /**
     * Gets the value of the rdgSingleProportion property.
     * 
     */
    public int getRdgSingleProportion() {
        return rdgSingleProportion;
    }

    /**
     * Sets the value of the rdgSingleProportion property.
     * 
     */
    public void setRdgSingleProportion(int value) {
        this.rdgSingleProportion = value;
    }

}
