
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespondentToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondentToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="LastRespIdReturned" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FirstRespIdReturned" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="NumberOfRespondentsReturned" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DatasetsReturned" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LastDataSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondentToken", propOrder = {
    "id",
    "lastRespIdReturned",
    "firstRespIdReturned",
    "numberOfRespondentsReturned",
    "datasetsReturned",
    "lastDataSet",
    "projectId"
})
public class RespondentToken {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "LastRespIdReturned")
    protected long lastRespIdReturned;
    @XmlElement(name = "FirstRespIdReturned")
    protected long firstRespIdReturned;
    @XmlElement(name = "NumberOfRespondentsReturned")
    protected long numberOfRespondentsReturned;
    @XmlElement(name = "DatasetsReturned")
    protected long datasetsReturned;
    @XmlElement(name = "LastDataSet")
    protected boolean lastDataSet;
    @XmlElement(name = "ProjectId")
    protected String projectId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastRespIdReturned property.
     * 
     */
    public long getLastRespIdReturned() {
        return lastRespIdReturned;
    }

    /**
     * Sets the value of the lastRespIdReturned property.
     * 
     */
    public void setLastRespIdReturned(long value) {
        this.lastRespIdReturned = value;
    }

    /**
     * Gets the value of the firstRespIdReturned property.
     * 
     */
    public long getFirstRespIdReturned() {
        return firstRespIdReturned;
    }

    /**
     * Sets the value of the firstRespIdReturned property.
     * 
     */
    public void setFirstRespIdReturned(long value) {
        this.firstRespIdReturned = value;
    }

    /**
     * Gets the value of the numberOfRespondentsReturned property.
     * 
     */
    public long getNumberOfRespondentsReturned() {
        return numberOfRespondentsReturned;
    }

    /**
     * Sets the value of the numberOfRespondentsReturned property.
     * 
     */
    public void setNumberOfRespondentsReturned(long value) {
        this.numberOfRespondentsReturned = value;
    }

    /**
     * Gets the value of the datasetsReturned property.
     * 
     */
    public long getDatasetsReturned() {
        return datasetsReturned;
    }

    /**
     * Sets the value of the datasetsReturned property.
     * 
     */
    public void setDatasetsReturned(long value) {
        this.datasetsReturned = value;
    }

    /**
     * Gets the value of the lastDataSet property.
     * 
     */
    public boolean isLastDataSet() {
        return lastDataSet;
    }

    /**
     * Sets the value of the lastDataSet property.
     * 
     */
    public void setLastDataSet(boolean value) {
        this.lastDataSet = value;
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

}
