
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}QuestionCategorization"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCategoryName" type="{http://firmglobal.com/Confirmit/webservices/8.5/}LocaleString" minOccurs="0"/&gt;
 *         &lt;element name="UnweightedTotalCategoryName" type="{http://firmglobal.com/Confirmit/webservices/8.5/}LocaleString" minOccurs="0"/&gt;
 *         &lt;element name="NotAnsweredCategoryName" type="{http://firmglobal.com/Confirmit/webservices/8.5/}LocaleString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TotalsFirst" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CreateNotAnsweredCategory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CreateTotalCategory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CreateUnweightedTotalCategory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SuffixTotalCatWithParent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dimension", propOrder = {
    "totalCategoryName",
    "unweightedTotalCategoryName",
    "notAnsweredCategoryName"
})
@XmlSeeAlso({
    SnowflakeDimension.class,
    SimpleDimension.class,
    CyclicDimension.class
})
public abstract class Dimension
    extends QuestionCategorization
{

    @XmlElement(name = "TotalCategoryName")
    protected LocaleString totalCategoryName;
    @XmlElement(name = "UnweightedTotalCategoryName")
    protected LocaleString unweightedTotalCategoryName;
    @XmlElement(name = "NotAnsweredCategoryName")
    protected LocaleString notAnsweredCategoryName;
    @XmlAttribute(name = "TotalsFirst", required = true)
    protected boolean totalsFirst;
    @XmlAttribute(name = "CreateNotAnsweredCategory", required = true)
    protected boolean createNotAnsweredCategory;
    @XmlAttribute(name = "CreateTotalCategory", required = true)
    protected boolean createTotalCategory;
    @XmlAttribute(name = "CreateUnweightedTotalCategory", required = true)
    protected boolean createUnweightedTotalCategory;
    @XmlAttribute(name = "SuffixTotalCatWithParent", required = true)
    protected boolean suffixTotalCatWithParent;

    /**
     * Gets the value of the totalCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleString }
     *     
     */
    public LocaleString getTotalCategoryName() {
        return totalCategoryName;
    }

    /**
     * Sets the value of the totalCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleString }
     *     
     */
    public void setTotalCategoryName(LocaleString value) {
        this.totalCategoryName = value;
    }

    /**
     * Gets the value of the unweightedTotalCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleString }
     *     
     */
    public LocaleString getUnweightedTotalCategoryName() {
        return unweightedTotalCategoryName;
    }

    /**
     * Sets the value of the unweightedTotalCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleString }
     *     
     */
    public void setUnweightedTotalCategoryName(LocaleString value) {
        this.unweightedTotalCategoryName = value;
    }

    /**
     * Gets the value of the notAnsweredCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleString }
     *     
     */
    public LocaleString getNotAnsweredCategoryName() {
        return notAnsweredCategoryName;
    }

    /**
     * Sets the value of the notAnsweredCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleString }
     *     
     */
    public void setNotAnsweredCategoryName(LocaleString value) {
        this.notAnsweredCategoryName = value;
    }

    /**
     * Gets the value of the totalsFirst property.
     * 
     */
    public boolean isTotalsFirst() {
        return totalsFirst;
    }

    /**
     * Sets the value of the totalsFirst property.
     * 
     */
    public void setTotalsFirst(boolean value) {
        this.totalsFirst = value;
    }

    /**
     * Gets the value of the createNotAnsweredCategory property.
     * 
     */
    public boolean isCreateNotAnsweredCategory() {
        return createNotAnsweredCategory;
    }

    /**
     * Sets the value of the createNotAnsweredCategory property.
     * 
     */
    public void setCreateNotAnsweredCategory(boolean value) {
        this.createNotAnsweredCategory = value;
    }

    /**
     * Gets the value of the createTotalCategory property.
     * 
     */
    public boolean isCreateTotalCategory() {
        return createTotalCategory;
    }

    /**
     * Sets the value of the createTotalCategory property.
     * 
     */
    public void setCreateTotalCategory(boolean value) {
        this.createTotalCategory = value;
    }

    /**
     * Gets the value of the createUnweightedTotalCategory property.
     * 
     */
    public boolean isCreateUnweightedTotalCategory() {
        return createUnweightedTotalCategory;
    }

    /**
     * Sets the value of the createUnweightedTotalCategory property.
     * 
     */
    public void setCreateUnweightedTotalCategory(boolean value) {
        this.createUnweightedTotalCategory = value;
    }

    /**
     * Gets the value of the suffixTotalCatWithParent property.
     * 
     */
    public boolean isSuffixTotalCatWithParent() {
        return suffixTotalCatWithParent;
    }

    /**
     * Sets the value of the suffixTotalCatWithParent property.
     * 
     */
    public void setSuffixTotalCatWithParent(boolean value) {
        this.suffixTotalCatWithParent = value;
    }

}
