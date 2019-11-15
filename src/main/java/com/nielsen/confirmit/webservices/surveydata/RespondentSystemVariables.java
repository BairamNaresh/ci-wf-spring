
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespondentSystemVariables complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondentSystemVariables"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludeRespId" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeSID" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeUserId" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeNoOfEmailsSent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeLastUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondentSystemVariables", propOrder = {
    "includeRespId",
    "includeSID",
    "includeUserId",
    "includeNoOfEmailsSent",
    "includeLastUpdated"
})
public class RespondentSystemVariables {

    @XmlElement(name = "IncludeRespId")
    protected boolean includeRespId;
    @XmlElement(name = "IncludeSID")
    protected boolean includeSID;
    @XmlElement(name = "IncludeUserId")
    protected boolean includeUserId;
    @XmlElement(name = "IncludeNoOfEmailsSent")
    protected boolean includeNoOfEmailsSent;
    @XmlElement(name = "IncludeLastUpdated")
    protected boolean includeLastUpdated;

    /**
     * Gets the value of the includeRespId property.
     * 
     */
    public boolean isIncludeRespId() {
        return includeRespId;
    }

    /**
     * Sets the value of the includeRespId property.
     * 
     */
    public void setIncludeRespId(boolean value) {
        this.includeRespId = value;
    }

    /**
     * Gets the value of the includeSID property.
     * 
     */
    public boolean isIncludeSID() {
        return includeSID;
    }

    /**
     * Sets the value of the includeSID property.
     * 
     */
    public void setIncludeSID(boolean value) {
        this.includeSID = value;
    }

    /**
     * Gets the value of the includeUserId property.
     * 
     */
    public boolean isIncludeUserId() {
        return includeUserId;
    }

    /**
     * Sets the value of the includeUserId property.
     * 
     */
    public void setIncludeUserId(boolean value) {
        this.includeUserId = value;
    }

    /**
     * Gets the value of the includeNoOfEmailsSent property.
     * 
     */
    public boolean isIncludeNoOfEmailsSent() {
        return includeNoOfEmailsSent;
    }

    /**
     * Sets the value of the includeNoOfEmailsSent property.
     * 
     */
    public void setIncludeNoOfEmailsSent(boolean value) {
        this.includeNoOfEmailsSent = value;
    }

    /**
     * Gets the value of the includeLastUpdated property.
     * 
     */
    public boolean isIncludeLastUpdated() {
        return includeLastUpdated;
    }

    /**
     * Sets the value of the includeLastUpdated property.
     * 
     */
    public void setIncludeLastUpdated(boolean value) {
        this.includeLastUpdated = value;
    }

}
