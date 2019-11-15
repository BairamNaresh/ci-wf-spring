
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="LastResponseIdReturned" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FirstResponseIdReturned" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="NumberOfResponsesReturned" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DatasetsReturned" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LastDataSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangeTrackingVersion" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseToken", propOrder = {
    "id",
    "lastResponseIdReturned",
    "firstResponseIdReturned",
    "numberOfResponsesReturned",
    "datasetsReturned",
    "lastDataSet",
    "projectId",
    "changeTrackingVersion"
})
public class ResponseToken {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "LastResponseIdReturned")
    protected long lastResponseIdReturned;
    @XmlElement(name = "FirstResponseIdReturned")
    protected long firstResponseIdReturned;
    @XmlElement(name = "NumberOfResponsesReturned")
    protected long numberOfResponsesReturned;
    @XmlElement(name = "DatasetsReturned")
    protected long datasetsReturned;
    @XmlElement(name = "LastDataSet")
    protected boolean lastDataSet;
    @XmlElement(name = "ProjectId")
    protected String projectId;
    @XmlElement(name = "ChangeTrackingVersion")
    protected long changeTrackingVersion;

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
     * Gets the value of the lastResponseIdReturned property.
     * 
     */
    public long getLastResponseIdReturned() {
        return lastResponseIdReturned;
    }

    /**
     * Sets the value of the lastResponseIdReturned property.
     * 
     */
    public void setLastResponseIdReturned(long value) {
        this.lastResponseIdReturned = value;
    }

    /**
     * Gets the value of the firstResponseIdReturned property.
     * 
     */
    public long getFirstResponseIdReturned() {
        return firstResponseIdReturned;
    }

    /**
     * Sets the value of the firstResponseIdReturned property.
     * 
     */
    public void setFirstResponseIdReturned(long value) {
        this.firstResponseIdReturned = value;
    }

    /**
     * Gets the value of the numberOfResponsesReturned property.
     * 
     */
    public long getNumberOfResponsesReturned() {
        return numberOfResponsesReturned;
    }

    /**
     * Sets the value of the numberOfResponsesReturned property.
     * 
     */
    public void setNumberOfResponsesReturned(long value) {
        this.numberOfResponsesReturned = value;
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

    /**
     * Gets the value of the changeTrackingVersion property.
     * 
     */
    public long getChangeTrackingVersion() {
        return changeTrackingVersion;
    }

    /**
     * Sets the value of the changeTrackingVersion property.
     * 
     */
    public void setChangeTrackingVersion(long value) {
        this.changeTrackingVersion = value;
    }

}
