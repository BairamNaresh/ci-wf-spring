
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LevelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Variables" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfVariable" minOccurs="0"/&gt;
 *         &lt;element name="Records" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfDataRecord" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataLevel", propOrder = {
    "levelId",
    "variables",
    "records"
})
public class DataLevel {

    @XmlElement(name = "LevelId")
    protected String levelId;
    @XmlElement(name = "Variables")
    protected ArrayOfVariable variables;
    @XmlElement(name = "Records")
    protected ArrayOfDataRecord records;

    /**
     * Gets the value of the levelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelId() {
        return levelId;
    }

    /**
     * Sets the value of the levelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelId(String value) {
        this.levelId = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVariable }
     *     
     */
    public ArrayOfVariable getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVariable }
     *     
     */
    public void setVariables(ArrayOfVariable value) {
        this.variables = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDataRecord }
     *     
     */
    public ArrayOfDataRecord getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDataRecord }
     *     
     */
    public void setRecords(ArrayOfDataRecord value) {
        this.records = value;
    }

}
