
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
 *         &lt;element name="GetProjectListByProjectNameResult" type="{http://firmglobal.com/Confirmit/webservices/}ProjectListResultSet" minOccurs="0"/&gt;
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
    "getProjectListByProjectNameResult"
})
@XmlRootElement(name = "GetProjectListByProjectNameResponse")
public class GetProjectListByProjectNameResponse {

    @XmlElement(name = "GetProjectListByProjectNameResult")
    protected ProjectListResultSet getProjectListByProjectNameResult;

    /**
     * Gets the value of the getProjectListByProjectNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListResultSet }
     *     
     */
    public ProjectListResultSet getGetProjectListByProjectNameResult() {
        return getProjectListByProjectNameResult;
    }

    /**
     * Sets the value of the getProjectListByProjectNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListResultSet }
     *     
     */
    public void setGetProjectListByProjectNameResult(ProjectListResultSet value) {
        this.getProjectListByProjectNameResult = value;
    }

}
