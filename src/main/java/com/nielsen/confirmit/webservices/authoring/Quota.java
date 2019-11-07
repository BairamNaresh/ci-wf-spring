
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quota complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quota"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}Node"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Forms" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfFormReference" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PersistentObjectId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Hidden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsCatiQuota" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsShownInCatiSupervisor" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsOptimisticQuota" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LiveLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="LiveLimitType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ShowInSingleTargetsMode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quota", propOrder = {
    "name",
    "forms",
    "emailAddress"
})
public class Quota
    extends Node
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Forms")
    protected ArrayOfFormReference forms;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlAttribute(name = "PersistentObjectId")
    protected String persistentObjectId;
    @XmlAttribute(name = "Hidden", required = true)
    protected boolean hidden;
    @XmlAttribute(name = "IsCatiQuota", required = true)
    protected boolean isCatiQuota;
    @XmlAttribute(name = "IsShownInCatiSupervisor", required = true)
    protected boolean isShownInCatiSupervisor;
    @XmlAttribute(name = "IsOptimisticQuota", required = true)
    protected boolean isOptimisticQuota;
    @XmlAttribute(name = "LiveLimit", required = true)
    protected int liveLimit;
    @XmlAttribute(name = "LiveLimitType", required = true)
    protected int liveLimitType;
    @XmlAttribute(name = "ShowInSingleTargetsMode", required = true)
    protected boolean showInSingleTargetsMode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the forms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormReference }
     *     
     */
    public ArrayOfFormReference getForms() {
        return forms;
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormReference }
     *     
     */
    public void setForms(ArrayOfFormReference value) {
        this.forms = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the persistentObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistentObjectId() {
        return persistentObjectId;
    }

    /**
     * Sets the value of the persistentObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistentObjectId(String value) {
        this.persistentObjectId = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the isCatiQuota property.
     * 
     */
    public boolean isIsCatiQuota() {
        return isCatiQuota;
    }

    /**
     * Sets the value of the isCatiQuota property.
     * 
     */
    public void setIsCatiQuota(boolean value) {
        this.isCatiQuota = value;
    }

    /**
     * Gets the value of the isShownInCatiSupervisor property.
     * 
     */
    public boolean isIsShownInCatiSupervisor() {
        return isShownInCatiSupervisor;
    }

    /**
     * Sets the value of the isShownInCatiSupervisor property.
     * 
     */
    public void setIsShownInCatiSupervisor(boolean value) {
        this.isShownInCatiSupervisor = value;
    }

    /**
     * Gets the value of the isOptimisticQuota property.
     * 
     */
    public boolean isIsOptimisticQuota() {
        return isOptimisticQuota;
    }

    /**
     * Sets the value of the isOptimisticQuota property.
     * 
     */
    public void setIsOptimisticQuota(boolean value) {
        this.isOptimisticQuota = value;
    }

    /**
     * Gets the value of the liveLimit property.
     * 
     */
    public int getLiveLimit() {
        return liveLimit;
    }

    /**
     * Sets the value of the liveLimit property.
     * 
     */
    public void setLiveLimit(int value) {
        this.liveLimit = value;
    }

    /**
     * Gets the value of the liveLimitType property.
     * 
     */
    public int getLiveLimitType() {
        return liveLimitType;
    }

    /**
     * Sets the value of the liveLimitType property.
     * 
     */
    public void setLiveLimitType(int value) {
        this.liveLimitType = value;
    }

    /**
     * Gets the value of the showInSingleTargetsMode property.
     * 
     */
    public boolean isShowInSingleTargetsMode() {
        return showInSingleTargetsMode;
    }

    /**
     * Sets the value of the showInSingleTargetsMode property.
     * 
     */
    public void setShowInSingleTargetsMode(boolean value) {
        this.showInSingleTargetsMode = value;
    }

}
