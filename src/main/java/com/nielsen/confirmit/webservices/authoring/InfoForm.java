
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}FormBase"&gt;
 *       &lt;attribute name="ChartAPI" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ChartType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ChartCopySourceTexts" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ChartFor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoForm")
public class InfoForm
    extends FormBase
{

    @XmlAttribute(name = "ChartAPI", required = true)
    protected int chartAPI;
    @XmlAttribute(name = "ChartType", required = true)
    protected int chartType;
    @XmlAttribute(name = "ChartCopySourceTexts", required = true)
    protected boolean chartCopySourceTexts;
    @XmlAttribute(name = "ChartFor")
    protected String chartFor;

    /**
     * Gets the value of the chartAPI property.
     * 
     */
    public int getChartAPI() {
        return chartAPI;
    }

    /**
     * Sets the value of the chartAPI property.
     * 
     */
    public void setChartAPI(int value) {
        this.chartAPI = value;
    }

    /**
     * Gets the value of the chartType property.
     * 
     */
    public int getChartType() {
        return chartType;
    }

    /**
     * Sets the value of the chartType property.
     * 
     */
    public void setChartType(int value) {
        this.chartType = value;
    }

    /**
     * Gets the value of the chartCopySourceTexts property.
     * 
     */
    public boolean isChartCopySourceTexts() {
        return chartCopySourceTexts;
    }

    /**
     * Sets the value of the chartCopySourceTexts property.
     * 
     */
    public void setChartCopySourceTexts(boolean value) {
        this.chartCopySourceTexts = value;
    }

    /**
     * Gets the value of the chartFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChartFor() {
        return chartFor;
    }

    /**
     * Sets the value of the chartFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChartFor(String value) {
        this.chartFor = value;
    }

}
