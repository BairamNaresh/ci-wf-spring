
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RandomCategorySelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RandomCategorySelection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}PredefinedScriptBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RandomCategorySelection", propOrder = {
    "numberOfItems",
    "questionID"
})
public class RandomCategorySelection
    extends PredefinedScriptBase
{

    @XmlElement(name = "NumberOfItems")
    protected int numberOfItems;
    @XmlElement(name = "QuestionID")
    protected String questionID;

    /**
     * Gets the value of the numberOfItems property.
     * 
     */
    public int getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     */
    public void setNumberOfItems(int value) {
        this.numberOfItems = value;
    }

    /**
     * Gets the value of the questionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionID() {
        return questionID;
    }

    /**
     * Sets the value of the questionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionID(String value) {
        this.questionID = value;
    }

}
