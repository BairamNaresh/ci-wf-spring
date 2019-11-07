
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
 *         &lt;element name="GetProjectListResult" type="{http://firmglobal.com/Confirmit/webservices/}ProjectListResultSet" minOccurs="0"/&gt;
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
    "getProjectListResult"
})
@XmlRootElement(name = "GetProjectListResponse")
public class GetProjectListResponse {

    @XmlElement(name = "GetProjectListResult")
    protected ProjectListResultSet getProjectListResult;

    /**
     * Gets the value of the getProjectListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListResultSet }
     *     
     */
    public ProjectListResultSet getGetProjectListResult() {
        return getProjectListResult;
    }

    /**
     * Sets the value of the getProjectListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListResultSet }
     *     
     */
    public void setGetProjectListResult(ProjectListResultSet value) {
        this.getProjectListResult = value;
    }

}
