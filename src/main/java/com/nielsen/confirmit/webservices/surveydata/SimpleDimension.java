
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}Dimension"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HierLevel" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryHierarchyLevel" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SelectExpressionField" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryField" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionConstant" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryConstant" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionFunction" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Function" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionForm" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryForm" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionBinary" type="{http://firmglobal.com/Confirmit/webservices/8.5/}BinaryArithmetic" minOccurs="0"/&gt;
 *           &lt;element name="SelectExpressionCategorization" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Categorization" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="HierarchyNodeMask" type="{http://firmglobal.com/Confirmit/webservices/8.5/}HierarchyMask" minOccurs="0"/&gt;
 *         &lt;element name="RecodingIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectRecoding" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OrderDirection" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}OrderByTypes" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleDimension", propOrder = {
    "hierLevel",
    "selectExpressionField",
    "selectExpressionConstant",
    "selectExpressionFunction",
    "selectExpressionForm",
    "selectExpressionBinary",
    "selectExpressionCategorization",
    "hierarchyNodeMask",
    "recodingIdent",
    "directRecoding"
})
public class SimpleDimension
    extends Dimension
{

    @XmlElement(name = "HierLevel")
    protected QueryHierarchyLevel hierLevel;
    @XmlElement(name = "SelectExpressionField")
    protected QueryField selectExpressionField;
    @XmlElement(name = "SelectExpressionConstant")
    protected QueryConstant selectExpressionConstant;
    @XmlElement(name = "SelectExpressionFunction")
    protected Function selectExpressionFunction;
    @XmlElement(name = "SelectExpressionForm")
    protected QueryForm selectExpressionForm;
    @XmlElement(name = "SelectExpressionBinary")
    protected BinaryArithmetic selectExpressionBinary;
    @XmlElement(name = "SelectExpressionCategorization")
    protected Categorization selectExpressionCategorization;
    @XmlElement(name = "HierarchyNodeMask")
    protected HierarchyMask hierarchyNodeMask;
    @XmlElement(name = "RecodingIdent")
    protected String recodingIdent;
    @XmlElement(name = "DirectRecoding")
    protected boolean directRecoding;
    @XmlAttribute(name = "OrderDirection", required = true)
    protected OrderByTypes orderDirection;

    /**
     * Gets the value of the hierLevel property.
     * 
     * @return
     *     possible object is
     *     {@link QueryHierarchyLevel }
     *     
     */
    public QueryHierarchyLevel getHierLevel() {
        return hierLevel;
    }

    /**
     * Sets the value of the hierLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryHierarchyLevel }
     *     
     */
    public void setHierLevel(QueryHierarchyLevel value) {
        this.hierLevel = value;
    }

    /**
     * Gets the value of the selectExpressionField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryField }
     *     
     */
    public QueryField getSelectExpressionField() {
        return selectExpressionField;
    }

    /**
     * Sets the value of the selectExpressionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryField }
     *     
     */
    public void setSelectExpressionField(QueryField value) {
        this.selectExpressionField = value;
    }

    /**
     * Gets the value of the selectExpressionConstant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConstant }
     *     
     */
    public QueryConstant getSelectExpressionConstant() {
        return selectExpressionConstant;
    }

    /**
     * Sets the value of the selectExpressionConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConstant }
     *     
     */
    public void setSelectExpressionConstant(QueryConstant value) {
        this.selectExpressionConstant = value;
    }

    /**
     * Gets the value of the selectExpressionFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getSelectExpressionFunction() {
        return selectExpressionFunction;
    }

    /**
     * Sets the value of the selectExpressionFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setSelectExpressionFunction(Function value) {
        this.selectExpressionFunction = value;
    }

    /**
     * Gets the value of the selectExpressionForm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryForm }
     *     
     */
    public QueryForm getSelectExpressionForm() {
        return selectExpressionForm;
    }

    /**
     * Sets the value of the selectExpressionForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryForm }
     *     
     */
    public void setSelectExpressionForm(QueryForm value) {
        this.selectExpressionForm = value;
    }

    /**
     * Gets the value of the selectExpressionBinary property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryArithmetic }
     *     
     */
    public BinaryArithmetic getSelectExpressionBinary() {
        return selectExpressionBinary;
    }

    /**
     * Sets the value of the selectExpressionBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryArithmetic }
     *     
     */
    public void setSelectExpressionBinary(BinaryArithmetic value) {
        this.selectExpressionBinary = value;
    }

    /**
     * Gets the value of the selectExpressionCategorization property.
     * 
     * @return
     *     possible object is
     *     {@link Categorization }
     *     
     */
    public Categorization getSelectExpressionCategorization() {
        return selectExpressionCategorization;
    }

    /**
     * Sets the value of the selectExpressionCategorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorization }
     *     
     */
    public void setSelectExpressionCategorization(Categorization value) {
        this.selectExpressionCategorization = value;
    }

    /**
     * Gets the value of the hierarchyNodeMask property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyMask }
     *     
     */
    public HierarchyMask getHierarchyNodeMask() {
        return hierarchyNodeMask;
    }

    /**
     * Sets the value of the hierarchyNodeMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyMask }
     *     
     */
    public void setHierarchyNodeMask(HierarchyMask value) {
        this.hierarchyNodeMask = value;
    }

    /**
     * Gets the value of the recodingIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecodingIdent() {
        return recodingIdent;
    }

    /**
     * Sets the value of the recodingIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecodingIdent(String value) {
        this.recodingIdent = value;
    }

    /**
     * Gets the value of the directRecoding property.
     * 
     */
    public boolean isDirectRecoding() {
        return directRecoding;
    }

    /**
     * Sets the value of the directRecoding property.
     * 
     */
    public void setDirectRecoding(boolean value) {
        this.directRecoding = value;
    }

    /**
     * Gets the value of the orderDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByTypes }
     *     
     */
    public OrderByTypes getOrderDirection() {
        return orderDirection;
    }

    /**
     * Sets the value of the orderDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByTypes }
     *     
     */
    public void setOrderDirection(OrderByTypes value) {
        this.orderDirection = value;
    }

}
