
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterviewProgressStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterviewProgressStats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Web" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Capi" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cati" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Mixed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterviewProgressStats", propOrder = {
    "status",
    "web",
    "capi",
    "cati",
    "mixed",
    "total"
})
public class InterviewProgressStats {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Web")
    protected int web;
    @XmlElement(name = "Capi")
    protected int capi;
    @XmlElement(name = "Cati")
    protected int cati;
    @XmlElement(name = "Mixed")
    protected int mixed;
    @XmlElement(name = "Total")
    protected int total;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the web property.
     * 
     */
    public int getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     */
    public void setWeb(int value) {
        this.web = value;
    }

    /**
     * Gets the value of the capi property.
     * 
     */
    public int getCapi() {
        return capi;
    }

    /**
     * Sets the value of the capi property.
     * 
     */
    public void setCapi(int value) {
        this.capi = value;
    }

    /**
     * Gets the value of the cati property.
     * 
     */
    public int getCati() {
        return cati;
    }

    /**
     * Sets the value of the cati property.
     * 
     */
    public void setCati(int value) {
        this.cati = value;
    }

    /**
     * Gets the value of the mixed property.
     * 
     */
    public int getMixed() {
        return mixed;
    }

    /**
     * Sets the value of the mixed property.
     * 
     */
    public void setMixed(int value) {
        this.mixed = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

}
