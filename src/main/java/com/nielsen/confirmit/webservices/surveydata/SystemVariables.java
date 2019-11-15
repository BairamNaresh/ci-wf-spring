
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemVariables complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemVariables"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludeLastTouched" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeSurveyPackageVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeChannels" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeState" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeRespId" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeInterviewStart" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeInterviewEnd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeLastComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeRowguid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeIterationId" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeLoopState" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeFirstQuestionOnLastPageDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeStartPageContext" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeCatiExtendedStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemVariables", propOrder = {
    "includeLastTouched",
    "includeSurveyPackageVersion",
    "includeChannels",
    "includeState",
    "includeRespId",
    "includeInterviewStart",
    "includeInterviewEnd",
    "includeStatus",
    "includeLastComplete",
    "includeRowguid",
    "includeIterationId",
    "includeLoopState",
    "includeFirstQuestionOnLastPageDisplayed",
    "includeStartPageContext",
    "includeCatiExtendedStatus"
})
public class SystemVariables {

    @XmlElement(name = "IncludeLastTouched")
    protected boolean includeLastTouched;
    @XmlElement(name = "IncludeSurveyPackageVersion")
    protected boolean includeSurveyPackageVersion;
    @XmlElement(name = "IncludeChannels")
    protected boolean includeChannels;
    @XmlElement(name = "IncludeState")
    protected boolean includeState;
    @XmlElement(name = "IncludeRespId")
    protected boolean includeRespId;
    @XmlElement(name = "IncludeInterviewStart")
    protected boolean includeInterviewStart;
    @XmlElement(name = "IncludeInterviewEnd")
    protected boolean includeInterviewEnd;
    @XmlElement(name = "IncludeStatus")
    protected boolean includeStatus;
    @XmlElement(name = "IncludeLastComplete")
    protected boolean includeLastComplete;
    @XmlElement(name = "IncludeRowguid")
    protected boolean includeRowguid;
    @XmlElement(name = "IncludeIterationId")
    protected boolean includeIterationId;
    @XmlElement(name = "IncludeLoopState")
    protected boolean includeLoopState;
    @XmlElement(name = "IncludeFirstQuestionOnLastPageDisplayed")
    protected boolean includeFirstQuestionOnLastPageDisplayed;
    @XmlElement(name = "IncludeStartPageContext")
    protected boolean includeStartPageContext;
    @XmlElement(name = "IncludeCatiExtendedStatus")
    protected boolean includeCatiExtendedStatus;

    /**
     * Gets the value of the includeLastTouched property.
     * 
     */
    public boolean isIncludeLastTouched() {
        return includeLastTouched;
    }

    /**
     * Sets the value of the includeLastTouched property.
     * 
     */
    public void setIncludeLastTouched(boolean value) {
        this.includeLastTouched = value;
    }

    /**
     * Gets the value of the includeSurveyPackageVersion property.
     * 
     */
    public boolean isIncludeSurveyPackageVersion() {
        return includeSurveyPackageVersion;
    }

    /**
     * Sets the value of the includeSurveyPackageVersion property.
     * 
     */
    public void setIncludeSurveyPackageVersion(boolean value) {
        this.includeSurveyPackageVersion = value;
    }

    /**
     * Gets the value of the includeChannels property.
     * 
     */
    public boolean isIncludeChannels() {
        return includeChannels;
    }

    /**
     * Sets the value of the includeChannels property.
     * 
     */
    public void setIncludeChannels(boolean value) {
        this.includeChannels = value;
    }

    /**
     * Gets the value of the includeState property.
     * 
     */
    public boolean isIncludeState() {
        return includeState;
    }

    /**
     * Sets the value of the includeState property.
     * 
     */
    public void setIncludeState(boolean value) {
        this.includeState = value;
    }

    /**
     * Gets the value of the includeRespId property.
     * 
     */
    public boolean isIncludeRespId() {
        return includeRespId;
    }

    /**
     * Sets the value of the includeRespId property.
     * 
     */
    public void setIncludeRespId(boolean value) {
        this.includeRespId = value;
    }

    /**
     * Gets the value of the includeInterviewStart property.
     * 
     */
    public boolean isIncludeInterviewStart() {
        return includeInterviewStart;
    }

    /**
     * Sets the value of the includeInterviewStart property.
     * 
     */
    public void setIncludeInterviewStart(boolean value) {
        this.includeInterviewStart = value;
    }

    /**
     * Gets the value of the includeInterviewEnd property.
     * 
     */
    public boolean isIncludeInterviewEnd() {
        return includeInterviewEnd;
    }

    /**
     * Sets the value of the includeInterviewEnd property.
     * 
     */
    public void setIncludeInterviewEnd(boolean value) {
        this.includeInterviewEnd = value;
    }

    /**
     * Gets the value of the includeStatus property.
     * 
     */
    public boolean isIncludeStatus() {
        return includeStatus;
    }

    /**
     * Sets the value of the includeStatus property.
     * 
     */
    public void setIncludeStatus(boolean value) {
        this.includeStatus = value;
    }

    /**
     * Gets the value of the includeLastComplete property.
     * 
     */
    public boolean isIncludeLastComplete() {
        return includeLastComplete;
    }

    /**
     * Sets the value of the includeLastComplete property.
     * 
     */
    public void setIncludeLastComplete(boolean value) {
        this.includeLastComplete = value;
    }

    /**
     * Gets the value of the includeRowguid property.
     * 
     */
    public boolean isIncludeRowguid() {
        return includeRowguid;
    }

    /**
     * Sets the value of the includeRowguid property.
     * 
     */
    public void setIncludeRowguid(boolean value) {
        this.includeRowguid = value;
    }

    /**
     * Gets the value of the includeIterationId property.
     * 
     */
    public boolean isIncludeIterationId() {
        return includeIterationId;
    }

    /**
     * Sets the value of the includeIterationId property.
     * 
     */
    public void setIncludeIterationId(boolean value) {
        this.includeIterationId = value;
    }

    /**
     * Gets the value of the includeLoopState property.
     * 
     */
    public boolean isIncludeLoopState() {
        return includeLoopState;
    }

    /**
     * Sets the value of the includeLoopState property.
     * 
     */
    public void setIncludeLoopState(boolean value) {
        this.includeLoopState = value;
    }

    /**
     * Gets the value of the includeFirstQuestionOnLastPageDisplayed property.
     * 
     */
    public boolean isIncludeFirstQuestionOnLastPageDisplayed() {
        return includeFirstQuestionOnLastPageDisplayed;
    }

    /**
     * Sets the value of the includeFirstQuestionOnLastPageDisplayed property.
     * 
     */
    public void setIncludeFirstQuestionOnLastPageDisplayed(boolean value) {
        this.includeFirstQuestionOnLastPageDisplayed = value;
    }

    /**
     * Gets the value of the includeStartPageContext property.
     * 
     */
    public boolean isIncludeStartPageContext() {
        return includeStartPageContext;
    }

    /**
     * Sets the value of the includeStartPageContext property.
     * 
     */
    public void setIncludeStartPageContext(boolean value) {
        this.includeStartPageContext = value;
    }

    /**
     * Gets the value of the includeCatiExtendedStatus property.
     * 
     */
    public boolean isIncludeCatiExtendedStatus() {
        return includeCatiExtendedStatus;
    }

    /**
     * Sets the value of the includeCatiExtendedStatus property.
     * 
     */
    public void setIncludeCatiExtendedStatus(boolean value) {
        this.includeCatiExtendedStatus = value;
    }

}
