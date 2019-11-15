
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldCategorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldCategorization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}QuestionCategorization"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Weights" type="{http://firmglobal.com/Confirmit/webservices/8.5/}ArrayOfCodeWeight" minOccurs="0"/&gt;
 *         &lt;element name="OverrideFieldNames" type="{http://firmglobal.com/Confirmit/webservices/8.5/}OverriddenFields" minOccurs="0"/&gt;
 *         &lt;element name="UnweightedTotalCategoryName" type="{http://firmglobal.com/Confirmit/webservices/8.5/}LocaleString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Weighting" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}WeightingType" /&gt;
 *       &lt;attribute name="CreateUnweightedTotalCategory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldCategorization", propOrder = {
    "weights",
    "overrideFieldNames",
    "unweightedTotalCategoryName"
})
public class FieldCategorization
    extends QuestionCategorization
{

    @XmlElement(name = "Weights")
    protected ArrayOfCodeWeight weights;
    @XmlElement(name = "OverrideFieldNames")
    protected OverriddenFields overrideFieldNames;
    @XmlElement(name = "UnweightedTotalCategoryName")
    protected LocaleString unweightedTotalCategoryName;
    @XmlAttribute(name = "Weighting", required = true)
    protected WeightingType weighting;
    @XmlAttribute(name = "CreateUnweightedTotalCategory", required = true)
    protected boolean createUnweightedTotalCategory;

    /**
     * Gets the value of the weights property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCodeWeight }
     *     
     */
    public ArrayOfCodeWeight getWeights() {
        return weights;
    }

    /**
     * Sets the value of the weights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCodeWeight }
     *     
     */
    public void setWeights(ArrayOfCodeWeight value) {
        this.weights = value;
    }

    /**
     * Gets the value of the overrideFieldNames property.
     * 
     * @return
     *     possible object is
     *     {@link OverriddenFields }
     *     
     */
    public OverriddenFields getOverrideFieldNames() {
        return overrideFieldNames;
    }

    /**
     * Sets the value of the overrideFieldNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverriddenFields }
     *     
     */
    public void setOverrideFieldNames(OverriddenFields value) {
        this.overrideFieldNames = value;
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
     * Gets the value of the weighting property.
     * 
     * @return
     *     possible object is
     *     {@link WeightingType }
     *     
     */
    public WeightingType getWeighting() {
        return weighting;
    }

    /**
     * Sets the value of the weighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightingType }
     *     
     */
    public void setWeighting(WeightingType value) {
        this.weighting = value;
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

}
