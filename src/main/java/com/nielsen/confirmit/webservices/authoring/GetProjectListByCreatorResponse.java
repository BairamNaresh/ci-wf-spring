
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
 *         &lt;element name="GetProjectListByCreatorResult" type="{http://firmglobal.com/Confirmit/webservices/}ProjectListResultSet" minOccurs="0"/&gt;
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
    "getProjectListByCreatorResult"
})
@XmlRootElement(name = "GetProjectListByCreatorResponse")
public class GetProjectListByCreatorResponse {

    @XmlElement(name = "GetProjectListByCreatorResult")
    protected ProjectListResultSet getProjectListByCreatorResult;

    /**
     * Gets the value of the getProjectListByCreatorResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListResultSet }
     *     
     */
    public ProjectListResultSet getGetProjectListByCreatorResult() {
        return getProjectListByCreatorResult;
    }

    /**
     * Sets the value of the getProjectListByCreatorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListResultSet }
     *     
     */
    public void setGetProjectListByCreatorResult(ProjectListResultSet value) {
        this.getProjectListByCreatorResult = value;
    }

}
