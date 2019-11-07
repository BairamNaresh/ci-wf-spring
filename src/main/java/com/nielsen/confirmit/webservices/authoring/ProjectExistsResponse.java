
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ProjectExistsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "projectExistsResult"
})
@XmlRootElement(name = "ProjectExistsResponse")
public class ProjectExistsResponse {

    @XmlElement(name = "ProjectExistsResult")
    protected boolean projectExistsResult;

    /**
     * Gets the value of the projectExistsResult property.
     * 
     */
    public boolean isProjectExistsResult() {
        return projectExistsResult;
    }

    /**
     * Sets the value of the projectExistsResult property.
     * 
     */
    public void setProjectExistsResult(boolean value) {
        this.projectExistsResult = value;
    }

}
