
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
 *         &lt;element name="ExportSurveyLayoutResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "exportSurveyLayoutResult"
})
@XmlRootElement(name = "ExportSurveyLayoutResponse")
public class ExportSurveyLayoutResponse {

    @XmlElement(name = "ExportSurveyLayoutResult")
    protected String exportSurveyLayoutResult;

    /**
     * Gets the value of the exportSurveyLayoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportSurveyLayoutResult() {
        return exportSurveyLayoutResult;
    }

    /**
     * Sets the value of the exportSurveyLayoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportSurveyLayoutResult(String value) {
        this.exportSurveyLayoutResult = value;
    }

}
