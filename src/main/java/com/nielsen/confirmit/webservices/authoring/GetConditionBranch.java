
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{http://firmglobal.com/Confirmit/webservices/}Condition" minOccurs="0"/&gt;
 *         &lt;element name="poetReadFilter" type="{http://firmglobal.com/Confirmit/webservices/}PoetReadFilter" minOccurs="0"/&gt;
 *         &lt;element name="trueBranch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "key",
    "projectId",
    "parent",
    "poetReadFilter",
    "trueBranch"
})
@XmlRootElement(name = "GetConditionBranch")
public class GetConditionBranch {

    protected String key;
    protected String projectId;
    protected Condition parent;
    protected PoetReadFilter poetReadFilter;
    protected boolean trueBranch;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setParent(Condition value) {
        this.parent = value;
    }

    /**
     * Gets the value of the poetReadFilter property.
     * 
     * @return
     *     possible object is
     *     {@link PoetReadFilter }
     *     
     */
    public PoetReadFilter getPoetReadFilter() {
        return poetReadFilter;
    }

    /**
     * Sets the value of the poetReadFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoetReadFilter }
     *     
     */
    public void setPoetReadFilter(PoetReadFilter value) {
        this.poetReadFilter = value;
    }

    /**
     * Gets the value of the trueBranch property.
     * 
     */
    public boolean isTrueBranch() {
        return trueBranch;
    }

    /**
     * Sets the value of the trueBranch property.
     * 
     */
    public void setTrueBranch(boolean value) {
        this.trueBranch = value;
    }

}
