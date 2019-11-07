
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
 *         &lt;element name="GetProjectListByCreatedDateResult" type="{http://firmglobal.com/Confirmit/webservices/}ProjectListResultSet" minOccurs="0"/&gt;
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
    "getProjectListByCreatedDateResult"
})
@XmlRootElement(name = "GetProjectListByCreatedDateResponse")
public class GetProjectListByCreatedDateResponse {

    @XmlElement(name = "GetProjectListByCreatedDateResult")
    protected ProjectListResultSet getProjectListByCreatedDateResult;

    /**
     * Gets the value of the getProjectListByCreatedDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListResultSet }
     *     
     */
    public ProjectListResultSet getGetProjectListByCreatedDateResult() {
        return getProjectListByCreatedDateResult;
    }

    /**
     * Sets the value of the getProjectListByCreatedDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListResultSet }
     *     
     */
    public void setGetProjectListByCreatedDateResult(ProjectListResultSet value) {
        this.getProjectListByCreatedDateResult = value;
    }

}
