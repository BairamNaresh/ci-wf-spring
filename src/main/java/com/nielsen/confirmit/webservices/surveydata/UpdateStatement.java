
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="update" type="{http://firmglobal.com/Confirmit/webservices/8.5/}UpdateClause" minOccurs="0"/&gt;
 *         &lt;element name="where" type="{http://firmglobal.com/Confirmit/webservices/8.5/}WhereClause" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FromTable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStatement", propOrder = {
    "update",
    "where"
})
public class UpdateStatement {

    protected UpdateClause update;
    protected WhereClause where;
    @XmlAttribute(name = "FromTable")
    protected String fromTable;

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateClause }
     *     
     */
    public UpdateClause getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateClause }
     *     
     */
    public void setUpdate(UpdateClause value) {
        this.update = value;
    }

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link WhereClause }
     *     
     */
    public WhereClause getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhereClause }
     *     
     */
    public void setWhere(WhereClause value) {
        this.where = value;
    }

    /**
     * Gets the value of the fromTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTable() {
        return fromTable;
    }

    /**
     * Sets the value of the fromTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTable(String value) {
        this.fromTable = value;
    }

}
