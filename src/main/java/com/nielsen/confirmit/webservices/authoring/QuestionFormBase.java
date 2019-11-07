
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuestionFormBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionFormBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}FormBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ParentGrid3DFormName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StartPosition" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="NotPerformDataCleaningOnMasking" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Level" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="JscriptExpression" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BenchmarkType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}BenchmarkFormType" /&gt;
 *       &lt;attribute name="Seed" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionFormBase", propOrder = {
    "validationCode"
})
@XmlSeeAlso({
    MultiForm.class,
    OpenForm.class,
    GridForm.class,
    SingleForm.class
})
public abstract class QuestionFormBase
    extends FormBase
{

    @XmlElement(name = "ValidationCode")
    protected String validationCode;
    @XmlAttribute(name = "ParentGrid3DFormName")
    protected String parentGrid3DFormName;
    @XmlAttribute(name = "StartPosition", required = true)
    protected int startPosition;
    @XmlAttribute(name = "NotPerformDataCleaningOnMasking", required = true)
    protected boolean notPerformDataCleaningOnMasking;
    @XmlAttribute(name = "Level", required = true)
    protected int level;
    @XmlAttribute(name = "JscriptExpression", required = true)
    protected boolean jscriptExpression;
    @XmlAttribute(name = "BenchmarkType", required = true)
    protected BenchmarkFormType benchmarkType;
    @XmlAttribute(name = "Seed", required = true)
    protected int seed;

    /**
     * Gets the value of the validationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationCode() {
        return validationCode;
    }

    /**
     * Sets the value of the validationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationCode(String value) {
        this.validationCode = value;
    }

    /**
     * Gets the value of the parentGrid3DFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGrid3DFormName() {
        return parentGrid3DFormName;
    }

    /**
     * Sets the value of the parentGrid3DFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGrid3DFormName(String value) {
        this.parentGrid3DFormName = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     */
    public int getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     */
    public void setStartPosition(int value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the notPerformDataCleaningOnMasking property.
     * 
     */
    public boolean isNotPerformDataCleaningOnMasking() {
        return notPerformDataCleaningOnMasking;
    }

    /**
     * Sets the value of the notPerformDataCleaningOnMasking property.
     * 
     */
    public void setNotPerformDataCleaningOnMasking(boolean value) {
        this.notPerformDataCleaningOnMasking = value;
    }

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the jscriptExpression property.
     * 
     */
    public boolean isJscriptExpression() {
        return jscriptExpression;
    }

    /**
     * Sets the value of the jscriptExpression property.
     * 
     */
    public void setJscriptExpression(boolean value) {
        this.jscriptExpression = value;
    }

    /**
     * Gets the value of the benchmarkType property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkFormType }
     *     
     */
    public BenchmarkFormType getBenchmarkType() {
        return benchmarkType;
    }

    /**
     * Sets the value of the benchmarkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkFormType }
     *     
     */
    public void setBenchmarkType(BenchmarkFormType value) {
        this.benchmarkType = value;
    }

    /**
     * Gets the value of the seed property.
     * 
     */
    public int getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     */
    public void setSeed(int value) {
        this.seed = value;
    }

}
