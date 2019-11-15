
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangedDataLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangedDataLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Records" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfChangedDataRecord" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LevelId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangedDataLevel", propOrder = {
    "records"
})
public class ChangedDataLevel {

    @XmlElement(name = "Records")
    protected ArrayOfChangedDataRecord records;
    @XmlAttribute(name = "LevelId")
    protected String levelId;

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChangedDataRecord }
     *     
     */
    public ArrayOfChangedDataRecord getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChangedDataRecord }
     *     
     */
    public void setRecords(ArrayOfChangedDataRecord value) {
        this.records = value;
    }

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

}
