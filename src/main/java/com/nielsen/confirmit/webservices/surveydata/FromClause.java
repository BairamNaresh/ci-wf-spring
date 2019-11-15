
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FromClause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FromClause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogicalTables" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfString2" minOccurs="0"/&gt;
 *         &lt;element name="JoinProjects" type="{http://firmglobal.com/Confirmit/webservices/8.5/}JoinProjects" minOccurs="0"/&gt;
 *         &lt;element name="SubQuery" type="{http://firmglobal.com/Confirmit/webservices/8.5/}SurveyQuery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromClause", propOrder = {
    "logicalTables",
    "joinProjects",
    "subQuery"
})
public class FromClause {

    @XmlElement(name = "LogicalTables")
    protected ArrayOfString2 logicalTables;
    @XmlElement(name = "JoinProjects")
    protected JoinProjects joinProjects;
    @XmlElement(name = "SubQuery")
    protected SurveyQuery subQuery;

    /**
     * Gets the value of the logicalTables property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getLogicalTables() {
        return logicalTables;
    }

    /**
     * Sets the value of the logicalTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setLogicalTables(ArrayOfString2 value) {
        this.logicalTables = value;
    }

    /**
     * Gets the value of the joinProjects property.
     * 
     * @return
     *     possible object is
     *     {@link JoinProjects }
     *     
     */
    public JoinProjects getJoinProjects() {
        return joinProjects;
    }

    /**
     * Sets the value of the joinProjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinProjects }
     *     
     */
    public void setJoinProjects(JoinProjects value) {
        this.joinProjects = value;
    }

    /**
     * Gets the value of the subQuery property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyQuery }
     *     
     */
    public SurveyQuery getSubQuery() {
        return subQuery;
    }

    /**
     * Sets the value of the subQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyQuery }
     *     
     */
    public void setSubQuery(SurveyQuery value) {
        this.subQuery = value;
    }

}
