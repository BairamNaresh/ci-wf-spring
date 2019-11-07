
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
 *         &lt;element name="GetProjectListByKeywordsResult" type="{http://firmglobal.com/Confirmit/webservices/}ProjectListResultSet" minOccurs="0"/&gt;
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
    "getProjectListByKeywordsResult"
})
@XmlRootElement(name = "GetProjectListByKeywordsResponse")
public class GetProjectListByKeywordsResponse {

    @XmlElement(name = "GetProjectListByKeywordsResult")
    protected ProjectListResultSet getProjectListByKeywordsResult;

    /**
     * Gets the value of the getProjectListByKeywordsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListResultSet }
     *     
     */
    public ProjectListResultSet getGetProjectListByKeywordsResult() {
        return getProjectListByKeywordsResult;
    }

    /**
     * Sets the value of the getProjectListByKeywordsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListResultSet }
     *     
     */
    public void setGetProjectListByKeywordsResult(ProjectListResultSet value) {
        this.getProjectListByKeywordsResult = value;
    }

}
