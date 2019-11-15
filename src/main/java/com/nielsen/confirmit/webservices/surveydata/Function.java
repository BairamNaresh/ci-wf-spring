
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Function complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Function"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GroupBy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OrderDirection" use="required" type="{http://firmglobal.com/Confirmit/webservices/8.5/}OrderByTypes" /&gt;
 *       &lt;attribute name="OrderBy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Function")
@XmlSeeAlso({
    GenericSqlFunction.class,
    Case.class,
    TypeConvertion.class,
    DatePart.class,
    DateAdd.class,
    DateDiff.class,
    Unary.class
})
public abstract class Function {

    @XmlAttribute(name = "Alias")
    protected String alias;
    @XmlAttribute(name = "GroupBy", required = true)
    protected boolean groupBy;
    @XmlAttribute(name = "OrderDirection", required = true)
    protected OrderByTypes orderDirection;
    @XmlAttribute(name = "OrderBy", required = true)
    protected boolean orderBy;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the groupBy property.
     * 
     */
    public boolean isGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     * 
     */
    public void setGroupBy(boolean value) {
        this.groupBy = value;
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

    /**
     * Gets the value of the orderBy property.
     * 
     */
    public boolean isOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     */
    public void setOrderBy(boolean value) {
        this.orderBy = value;
    }

}
