
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Questionnaire complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Questionnaire"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}Node"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectInfo" type="{http://firmglobal.com/Confirmit/webservices/}ProjectInfo" minOccurs="0"/&gt;
 *         &lt;element name="PredefinedLists" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfPredefinedList" minOccurs="0"/&gt;
 *         &lt;element name="Emails" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfEmail" minOccurs="0"/&gt;
 *         &lt;element name="Routing" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfChoice16" minOccurs="0"/&gt;
 *         &lt;element name="Blocks" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfBlock" minOccurs="0"/&gt;
 *         &lt;element name="Quotas" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfQuota" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Questionnaire", propOrder = {
    "projectInfo",
    "predefinedLists",
    "emails",
    "routing",
    "blocks",
    "quotas"
})
public class Questionnaire
    extends Node
{

    @XmlElement(name = "ProjectInfo")
    protected ProjectInfo projectInfo;
    @XmlElement(name = "PredefinedLists")
    protected ArrayOfPredefinedList predefinedLists;
    @XmlElement(name = "Emails")
    protected ArrayOfEmail emails;
    @XmlElement(name = "Routing")
    protected ArrayOfChoice16 routing;
    @XmlElement(name = "Blocks")
    protected ArrayOfBlock blocks;
    @XmlElement(name = "Quotas")
    protected ArrayOfQuota quotas;

    /**
     * Gets the value of the projectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectInfo }
     *     
     */
    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    /**
     * Sets the value of the projectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectInfo }
     *     
     */
    public void setProjectInfo(ProjectInfo value) {
        this.projectInfo = value;
    }

    /**
     * Gets the value of the predefinedLists property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPredefinedList }
     *     
     */
    public ArrayOfPredefinedList getPredefinedLists() {
        return predefinedLists;
    }

    /**
     * Sets the value of the predefinedLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPredefinedList }
     *     
     */
    public void setPredefinedLists(ArrayOfPredefinedList value) {
        this.predefinedLists = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmail }
     *     
     */
    public ArrayOfEmail getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmail }
     *     
     */
    public void setEmails(ArrayOfEmail value) {
        this.emails = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice16 }
     *     
     */
    public ArrayOfChoice16 getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice16 }
     *     
     */
    public void setRouting(ArrayOfChoice16 value) {
        this.routing = value;
    }

    /**
     * Gets the value of the blocks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBlock }
     *     
     */
    public ArrayOfBlock getBlocks() {
        return blocks;
    }

    /**
     * Sets the value of the blocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBlock }
     *     
     */
    public void setBlocks(ArrayOfBlock value) {
        this.blocks = value;
    }

    /**
     * Gets the value of the quotas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuota }
     *     
     */
    public ArrayOfQuota getQuotas() {
        return quotas;
    }

    /**
     * Sets the value of the quotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuota }
     *     
     */
    public void setQuotas(ArrayOfQuota value) {
        this.quotas = value;
    }

}
