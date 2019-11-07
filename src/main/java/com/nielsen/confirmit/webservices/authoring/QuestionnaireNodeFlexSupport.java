
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuestionnaireNodeFlexSupport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionnaireNodeFlexSupport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;attribute name="QuestionPackItemId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShowDownloadLink" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FallbackStrategy" use="required" type="{http://firmglobal.com/Confirmit/webservices/}FlexFallbackStrategy" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionnaireNodeFlexSupport")
@XmlSeeAlso({
    FormBase.class,
    Folder.class
})
public abstract class QuestionnaireNodeFlexSupport
    extends QuestionnaireNode
{

    @XmlAttribute(name = "QuestionPackItemId")
    protected String questionPackItemId;
    @XmlAttribute(name = "ShowDownloadLink", required = true)
    protected boolean showDownloadLink;
    @XmlAttribute(name = "FallbackStrategy", required = true)
    protected FlexFallbackStrategy fallbackStrategy;

    /**
     * Gets the value of the questionPackItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionPackItemId() {
        return questionPackItemId;
    }

    /**
     * Sets the value of the questionPackItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionPackItemId(String value) {
        this.questionPackItemId = value;
    }

    /**
     * Gets the value of the showDownloadLink property.
     * 
     */
    public boolean isShowDownloadLink() {
        return showDownloadLink;
    }

    /**
     * Sets the value of the showDownloadLink property.
     * 
     */
    public void setShowDownloadLink(boolean value) {
        this.showDownloadLink = value;
    }

    /**
     * Gets the value of the fallbackStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link FlexFallbackStrategy }
     *     
     */
    public FlexFallbackStrategy getFallbackStrategy() {
        return fallbackStrategy;
    }

    /**
     * Sets the value of the fallbackStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexFallbackStrategy }
     *     
     */
    public void setFallbackStrategy(FlexFallbackStrategy value) {
        this.fallbackStrategy = value;
    }

}
