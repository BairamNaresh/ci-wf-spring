
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Email complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Email"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}QuestionnaireNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Languages" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString2" minOccurs="0"/&gt;
 *         &lt;element name="Subjects" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString3" minOccurs="0"/&gt;
 *         &lt;element name="SendAsHtml" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BodyHtmls" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString4" minOccurs="0"/&gt;
 *         &lt;element name="SendAsPlainText" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BodyPlaintexts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString5" minOccurs="0"/&gt;
 *         &lt;element name="CustomLinkTexts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString6" minOccurs="0"/&gt;
 *         &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReplyDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverrideRecipientEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OverrideRecipientEmailField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendEmailForward" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SendEmailForwardField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendConfirmationEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ConfirmationEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ActivateLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SecureLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DisableNoOfEmailsSent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdditionalLinkParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomHeaders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoutingPart" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DisableSendOnBackward" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TranslationStatuses" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfTranslationStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Email", propOrder = {
    "defaultLanguage",
    "languages",
    "name",
    "descriptions",
    "subjects",
    "sendAsHtml",
    "bodyHtmls",
    "sendAsPlainText",
    "bodyPlaintexts",
    "customLinkTexts",
    "to",
    "from",
    "cc",
    "bcc",
    "replyTo",
    "displayName",
    "replyDisplayName",
    "overrideRecipientEmail",
    "overrideRecipientEmailField",
    "sendEmailForward",
    "sendEmailForwardField",
    "sendConfirmationEmail",
    "confirmationEmailAddress",
    "includeLink",
    "activateLogging",
    "secureLink",
    "readOnly",
    "disableNoOfEmailsSent",
    "additionalLinkParameters",
    "customHeaders",
    "routingPart",
    "disableSendOnBackward",
    "translationStatuses"
})
public class Email
    extends QuestionnaireNode
{

    @XmlElement(name = "DefaultLanguage")
    protected int defaultLanguage;
    @XmlElement(name = "Languages")
    protected ArrayOfInt languages;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Descriptions")
    protected ArrayOfLanguageString2 descriptions;
    @XmlElement(name = "Subjects")
    protected ArrayOfLanguageString3 subjects;
    @XmlElement(name = "SendAsHtml")
    protected boolean sendAsHtml;
    @XmlElement(name = "BodyHtmls")
    protected ArrayOfLanguageString4 bodyHtmls;
    @XmlElement(name = "SendAsPlainText")
    protected boolean sendAsPlainText;
    @XmlElement(name = "BodyPlaintexts")
    protected ArrayOfLanguageString5 bodyPlaintexts;
    @XmlElement(name = "CustomLinkTexts")
    protected ArrayOfLanguageString6 customLinkTexts;
    @XmlElement(name = "To")
    protected String to;
    @XmlElement(name = "From")
    protected String from;
    @XmlElement(name = "Cc")
    protected String cc;
    @XmlElement(name = "Bcc")
    protected String bcc;
    @XmlElement(name = "ReplyTo")
    protected String replyTo;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "ReplyDisplayName")
    protected String replyDisplayName;
    @XmlElement(name = "OverrideRecipientEmail")
    protected boolean overrideRecipientEmail;
    @XmlElement(name = "OverrideRecipientEmailField")
    protected String overrideRecipientEmailField;
    @XmlElement(name = "SendEmailForward")
    protected boolean sendEmailForward;
    @XmlElement(name = "SendEmailForwardField")
    protected String sendEmailForwardField;
    @XmlElement(name = "SendConfirmationEmail")
    protected boolean sendConfirmationEmail;
    @XmlElement(name = "ConfirmationEmailAddress")
    protected String confirmationEmailAddress;
    @XmlElement(name = "IncludeLink")
    protected boolean includeLink;
    @XmlElement(name = "ActivateLogging")
    protected boolean activateLogging;
    @XmlElement(name = "SecureLink")
    protected boolean secureLink;
    @XmlElement(name = "ReadOnly")
    protected boolean readOnly;
    @XmlElement(name = "DisableNoOfEmailsSent")
    protected boolean disableNoOfEmailsSent;
    @XmlElement(name = "AdditionalLinkParameters")
    protected String additionalLinkParameters;
    @XmlElement(name = "CustomHeaders")
    protected String customHeaders;
    @XmlElement(name = "RoutingPart")
    protected boolean routingPart;
    @XmlElement(name = "DisableSendOnBackward")
    protected boolean disableSendOnBackward;
    @XmlElement(name = "TranslationStatuses")
    protected ArrayOfTranslationStatus translationStatuses;

    /**
     * Gets the value of the defaultLanguage property.
     * 
     */
    public int getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     */
    public void setDefaultLanguage(int value) {
        this.defaultLanguage = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLanguages(ArrayOfInt value) {
        this.languages = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString2 }
     *     
     */
    public ArrayOfLanguageString2 getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString2 }
     *     
     */
    public void setDescriptions(ArrayOfLanguageString2 value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the subjects property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString3 }
     *     
     */
    public ArrayOfLanguageString3 getSubjects() {
        return subjects;
    }

    /**
     * Sets the value of the subjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString3 }
     *     
     */
    public void setSubjects(ArrayOfLanguageString3 value) {
        this.subjects = value;
    }

    /**
     * Gets the value of the sendAsHtml property.
     * 
     */
    public boolean isSendAsHtml() {
        return sendAsHtml;
    }

    /**
     * Sets the value of the sendAsHtml property.
     * 
     */
    public void setSendAsHtml(boolean value) {
        this.sendAsHtml = value;
    }

    /**
     * Gets the value of the bodyHtmls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString4 }
     *     
     */
    public ArrayOfLanguageString4 getBodyHtmls() {
        return bodyHtmls;
    }

    /**
     * Sets the value of the bodyHtmls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString4 }
     *     
     */
    public void setBodyHtmls(ArrayOfLanguageString4 value) {
        this.bodyHtmls = value;
    }

    /**
     * Gets the value of the sendAsPlainText property.
     * 
     */
    public boolean isSendAsPlainText() {
        return sendAsPlainText;
    }

    /**
     * Sets the value of the sendAsPlainText property.
     * 
     */
    public void setSendAsPlainText(boolean value) {
        this.sendAsPlainText = value;
    }

    /**
     * Gets the value of the bodyPlaintexts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString5 }
     *     
     */
    public ArrayOfLanguageString5 getBodyPlaintexts() {
        return bodyPlaintexts;
    }

    /**
     * Sets the value of the bodyPlaintexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString5 }
     *     
     */
    public void setBodyPlaintexts(ArrayOfLanguageString5 value) {
        this.bodyPlaintexts = value;
    }

    /**
     * Gets the value of the customLinkTexts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString6 }
     *     
     */
    public ArrayOfLanguageString6 getCustomLinkTexts() {
        return customLinkTexts;
    }

    /**
     * Sets the value of the customLinkTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString6 }
     *     
     */
    public void setCustomLinkTexts(ArrayOfLanguageString6 value) {
        this.customLinkTexts = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCc() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCc(String value) {
        this.cc = value;
    }

    /**
     * Gets the value of the bcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBcc() {
        return bcc;
    }

    /**
     * Sets the value of the bcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBcc(String value) {
        this.bcc = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the replyDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyDisplayName() {
        return replyDisplayName;
    }

    /**
     * Sets the value of the replyDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyDisplayName(String value) {
        this.replyDisplayName = value;
    }

    /**
     * Gets the value of the overrideRecipientEmail property.
     * 
     */
    public boolean isOverrideRecipientEmail() {
        return overrideRecipientEmail;
    }

    /**
     * Sets the value of the overrideRecipientEmail property.
     * 
     */
    public void setOverrideRecipientEmail(boolean value) {
        this.overrideRecipientEmail = value;
    }

    /**
     * Gets the value of the overrideRecipientEmailField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideRecipientEmailField() {
        return overrideRecipientEmailField;
    }

    /**
     * Sets the value of the overrideRecipientEmailField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideRecipientEmailField(String value) {
        this.overrideRecipientEmailField = value;
    }

    /**
     * Gets the value of the sendEmailForward property.
     * 
     */
    public boolean isSendEmailForward() {
        return sendEmailForward;
    }

    /**
     * Sets the value of the sendEmailForward property.
     * 
     */
    public void setSendEmailForward(boolean value) {
        this.sendEmailForward = value;
    }

    /**
     * Gets the value of the sendEmailForwardField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendEmailForwardField() {
        return sendEmailForwardField;
    }

    /**
     * Sets the value of the sendEmailForwardField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendEmailForwardField(String value) {
        this.sendEmailForwardField = value;
    }

    /**
     * Gets the value of the sendConfirmationEmail property.
     * 
     */
    public boolean isSendConfirmationEmail() {
        return sendConfirmationEmail;
    }

    /**
     * Sets the value of the sendConfirmationEmail property.
     * 
     */
    public void setSendConfirmationEmail(boolean value) {
        this.sendConfirmationEmail = value;
    }

    /**
     * Gets the value of the confirmationEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationEmailAddress() {
        return confirmationEmailAddress;
    }

    /**
     * Sets the value of the confirmationEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationEmailAddress(String value) {
        this.confirmationEmailAddress = value;
    }

    /**
     * Gets the value of the includeLink property.
     * 
     */
    public boolean isIncludeLink() {
        return includeLink;
    }

    /**
     * Sets the value of the includeLink property.
     * 
     */
    public void setIncludeLink(boolean value) {
        this.includeLink = value;
    }

    /**
     * Gets the value of the activateLogging property.
     * 
     */
    public boolean isActivateLogging() {
        return activateLogging;
    }

    /**
     * Sets the value of the activateLogging property.
     * 
     */
    public void setActivateLogging(boolean value) {
        this.activateLogging = value;
    }

    /**
     * Gets the value of the secureLink property.
     * 
     */
    public boolean isSecureLink() {
        return secureLink;
    }

    /**
     * Sets the value of the secureLink property.
     * 
     */
    public void setSecureLink(boolean value) {
        this.secureLink = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the disableNoOfEmailsSent property.
     * 
     */
    public boolean isDisableNoOfEmailsSent() {
        return disableNoOfEmailsSent;
    }

    /**
     * Sets the value of the disableNoOfEmailsSent property.
     * 
     */
    public void setDisableNoOfEmailsSent(boolean value) {
        this.disableNoOfEmailsSent = value;
    }

    /**
     * Gets the value of the additionalLinkParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalLinkParameters() {
        return additionalLinkParameters;
    }

    /**
     * Sets the value of the additionalLinkParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalLinkParameters(String value) {
        this.additionalLinkParameters = value;
    }

    /**
     * Gets the value of the customHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomHeaders() {
        return customHeaders;
    }

    /**
     * Sets the value of the customHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomHeaders(String value) {
        this.customHeaders = value;
    }

    /**
     * Gets the value of the routingPart property.
     * 
     */
    public boolean isRoutingPart() {
        return routingPart;
    }

    /**
     * Sets the value of the routingPart property.
     * 
     */
    public void setRoutingPart(boolean value) {
        this.routingPart = value;
    }

    /**
     * Gets the value of the disableSendOnBackward property.
     * 
     */
    public boolean isDisableSendOnBackward() {
        return disableSendOnBackward;
    }

    /**
     * Sets the value of the disableSendOnBackward property.
     * 
     */
    public void setDisableSendOnBackward(boolean value) {
        this.disableSendOnBackward = value;
    }

    /**
     * Gets the value of the translationStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTranslationStatus }
     *     
     */
    public ArrayOfTranslationStatus getTranslationStatuses() {
        return translationStatuses;
    }

    /**
     * Sets the value of the translationStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTranslationStatus }
     *     
     */
    public void setTranslationStatuses(ArrayOfTranslationStatus value) {
        this.translationStatuses = value;
    }

}
