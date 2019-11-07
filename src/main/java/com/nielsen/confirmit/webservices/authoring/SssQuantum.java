
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SssQuantum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SssQuantum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="quantumoptions" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="maxcardsize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="seriallen" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="cardtypelen" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="exportsingleprecode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="exportmultipleprecode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="splitmultiplesovercardsborder" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="splitcharactersovercardsborder" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SssQuantum")
public class SssQuantum {

    @XmlAttribute(name = "quantumoptions")
    protected String quantumoptions;
    @XmlAttribute(name = "maxcardsize", required = true)
    protected int maxcardsize;
    @XmlAttribute(name = "seriallen", required = true)
    protected int seriallen;
    @XmlAttribute(name = "cardtypelen", required = true)
    protected int cardtypelen;
    @XmlAttribute(name = "exportsingleprecode", required = true)
    protected boolean exportsingleprecode;
    @XmlAttribute(name = "exportmultipleprecode", required = true)
    protected boolean exportmultipleprecode;
    @XmlAttribute(name = "splitmultiplesovercardsborder", required = true)
    protected boolean splitmultiplesovercardsborder;
    @XmlAttribute(name = "splitcharactersovercardsborder", required = true)
    protected boolean splitcharactersovercardsborder;

    /**
     * Gets the value of the quantumoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantumoptions() {
        return quantumoptions;
    }

    /**
     * Sets the value of the quantumoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantumoptions(String value) {
        this.quantumoptions = value;
    }

    /**
     * Gets the value of the maxcardsize property.
     * 
     */
    public int getMaxcardsize() {
        return maxcardsize;
    }

    /**
     * Sets the value of the maxcardsize property.
     * 
     */
    public void setMaxcardsize(int value) {
        this.maxcardsize = value;
    }

    /**
     * Gets the value of the seriallen property.
     * 
     */
    public int getSeriallen() {
        return seriallen;
    }

    /**
     * Sets the value of the seriallen property.
     * 
     */
    public void setSeriallen(int value) {
        this.seriallen = value;
    }

    /**
     * Gets the value of the cardtypelen property.
     * 
     */
    public int getCardtypelen() {
        return cardtypelen;
    }

    /**
     * Sets the value of the cardtypelen property.
     * 
     */
    public void setCardtypelen(int value) {
        this.cardtypelen = value;
    }

    /**
     * Gets the value of the exportsingleprecode property.
     * 
     */
    public boolean isExportsingleprecode() {
        return exportsingleprecode;
    }

    /**
     * Sets the value of the exportsingleprecode property.
     * 
     */
    public void setExportsingleprecode(boolean value) {
        this.exportsingleprecode = value;
    }

    /**
     * Gets the value of the exportmultipleprecode property.
     * 
     */
    public boolean isExportmultipleprecode() {
        return exportmultipleprecode;
    }

    /**
     * Sets the value of the exportmultipleprecode property.
     * 
     */
    public void setExportmultipleprecode(boolean value) {
        this.exportmultipleprecode = value;
    }

    /**
     * Gets the value of the splitmultiplesovercardsborder property.
     * 
     */
    public boolean isSplitmultiplesovercardsborder() {
        return splitmultiplesovercardsborder;
    }

    /**
     * Sets the value of the splitmultiplesovercardsborder property.
     * 
     */
    public void setSplitmultiplesovercardsborder(boolean value) {
        this.splitmultiplesovercardsborder = value;
    }

    /**
     * Gets the value of the splitcharactersovercardsborder property.
     * 
     */
    public boolean isSplitcharactersovercardsborder() {
        return splitcharactersovercardsborder;
    }

    /**
     * Sets the value of the splitcharactersovercardsborder property.
     * 
     */
    public void setSplitcharactersovercardsborder(boolean value) {
        this.splitcharactersovercardsborder = value;
    }

}
