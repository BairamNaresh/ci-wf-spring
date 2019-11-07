
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProjectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}Node"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Build" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogoFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ProjectEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="WI_Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalStateDateChanged_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectSourceType" type="{http://firmglobal.com/Confirmit/webservices/}ConfirmitProjectSourceType"/&gt;
 *         &lt;element name="MasterProject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LostPasswordSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomNavigationStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageDefaultRadioButton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageOverRadioButton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageSelectedRadioButton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageDefaultCheckBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageOverCheckBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerImageSelectedCheckBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Languages" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="KeyWords" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Titles" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString7" minOccurs="0"/&gt;
 *         &lt;element name="HelpLinkTexts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString8" minOccurs="0"/&gt;
 *         &lt;element name="HelpLinkUrls" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString9" minOccurs="0"/&gt;
 *         &lt;element name="EndLinkTexts" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString10" minOccurs="0"/&gt;
 *         &lt;element name="EndLinkUrls" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString11" minOccurs="0"/&gt;
 *         &lt;element name="CustomNavigationOK" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString12" minOccurs="0"/&gt;
 *         &lt;element name="CustomNavigationBack" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString13" minOccurs="0"/&gt;
 *         &lt;element name="CustomNavigationNext" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfLanguageString14" minOccurs="0"/&gt;
 *         &lt;element name="TranslationStatusRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionnaireReviewerStatusRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionnaireReviewerDisplayAnswersScales" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AnswerImageHeightCheckBox" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AnswerImageWidthCheckBox" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AnswerImageHeightRadioButton" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AnswerImageWidthRadioButton" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TranslationBaseLang" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PanelTemplate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CurrentQuestionnaireVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuestionnaireVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InvalidDataHandlingSettingsSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HandlingOfUndefinedPrecodes" type="{http://firmglobal.com/Confirmit/webservices/}HandlingOfUndefinedPrecodes"/&gt;
 *         &lt;element name="HandlingOfInvalidNumericData" type="{http://firmglobal.com/Confirmit/webservices/}HandlingOfInvalidNumericData"/&gt;
 *         &lt;element name="HandlingOfOversizedTexts" type="{http://firmglobal.com/Confirmit/webservices/}HandlingOfOversizedTexts"/&gt;
 *         &lt;element name="SqlServerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TranslationStatuses" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfTranslationStatus" minOccurs="0"/&gt;
 *         &lt;element name="CustomResources" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfCustomResource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HasUploadedRespondents" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExternalQuickTestKey" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SurveyParametersForTestInterView" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Confirmit125_DBFormat_Support" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReusableDB_Support" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HasExternalData" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnforceVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnforceUnicodeEncoding" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExternalTestKey" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ExternalTestEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SurveyLogicMode" use="required" type="{http://firmglobal.com/Confirmit/webservices/}SurveyLogicModeType" /&gt;
 *       &lt;attribute name="WI_LaunchDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ApprovalState" use="required" type="{http://firmglobal.com/Confirmit/webservices/}SurveyApprovalState" /&gt;
 *       &lt;attribute name="ApprovalState_Int" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ProjectSourceType_Int" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ProjectType_Int" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsStandardPanel" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Use81WIGeneration" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TestMode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InlineSurveyEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InlineSurveyUseOverlay" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InlineSurveyOverlayOpacity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InlineSurveyWidth" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InlineSurveyFrequency" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="HideBackgroundVariablesInTestMode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HidePanelVariablesInTestMode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HideHiddenVariablesInTestMode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExternalRespondents" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InlineSurveyCookie" use="required" type="{http://firmglobal.com/Confirmit/webservices/}InlineSurveyCookieType" /&gt;
 *       &lt;attribute name="InlineSurveyCookie_Int" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="InlineSurveyCookieName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InlineSurveyCookieExpiration" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="NewLayoutEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SurveyLayoutName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SurveyLayoutId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SurveyLayoutIsEasyLayout" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DisplayPrecodesInCAPI" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DisplayPrecodesInCATI" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DefaultLanguage" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="CustomNavigationType" use="required" type="{http://firmglobal.com/Confirmit/webservices/}CustomNavigationType" /&gt;
 *       &lt;attribute name="ReservedErrorArea" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SetFirstControlFocus" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BackButton" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CapiBackButton" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ContinueLink" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllowModify" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllowModifyComplete" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FrameBreaker" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerImageEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Popup" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DoNotCreateDatabaseRowOnInitialRequest" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SingleSignOn" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SingleSignOnFallback" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OnlyUserId" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SurveyLinkExpiryEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnableShortUrls" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="QuotaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="DisablePrecodeCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Accessibility508" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ErrorPrefix" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OtherLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShowDeleted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerRequired" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Exclusivity" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OtherSpecify" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RankOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LimitedSurvey" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CapiLimitedSurvey" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LoginPage" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsOffline" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsCapiBasedSurvey" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsCatiBasedSurvey" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsTouchPhoneSurvey" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsGenericPhoneSurvey" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnableOpenedReviewRecording" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SupportTelephoneBlacklist" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnableInterviewRecording" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnableInterviewScreenRecording" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsSurveyIntegratedToFusion" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsSurveyPoll" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DialMode" use="required" type="{http://firmglobal.com/Confirmit/webservices/}DialMode" /&gt;
 *       &lt;attribute name="EnableSchedulingForWebInterviewing" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HtmlEncodePipingExpressions" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RequireXssSafeInput" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnforceHttps" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnableCAS" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EncryptSystemRequestParameters" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DisableQIDRequestParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PanelistRegistrationSurvey" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsWebBasedSurvey" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CustomNavigationEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnswerButtons" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LabelClick" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RadioButtons" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AutoNext" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TabOnEnterKey" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GridErrorHighlight" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnableDragDropOnTouch" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OverrideBrowserBack" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ProgressBar" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BitStreamIndexes" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OneQuestionPerPage" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnablePerQuestionAnswersRandomization" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllowPostRequestsForRespondentLinks" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EnterprisePanelId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UseDbEncryption" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OptimisticQuotaTimeout" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="OverrideOptimisticQuotaTimeout" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseChangeTracking" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HiddenInParticipation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectInfo", propOrder = {
    "build",
    "description",
    "logoFile",
    "projectStartDate",
    "projectEndDate",
    "wiUrl",
    "company",
    "companyId",
    "name",
    "projectID",
    "created",
    "createdDate",
    "timeStamp",
    "creator",
    "approvalStateDateChangedStr",
    "projectSourceType",
    "masterProject",
    "errorRecipient",
    "lostPasswordSender",
    "customNavigationStyle",
    "answerImageDefaultRadioButton",
    "answerImageOverRadioButton",
    "answerImageSelectedRadioButton",
    "answerImageDefaultCheckBox",
    "answerImageOverCheckBox",
    "answerImageSelectedCheckBox",
    "languages",
    "keyWords",
    "titles",
    "helpLinkTexts",
    "helpLinkUrls",
    "endLinkTexts",
    "endLinkUrls",
    "customNavigationOK",
    "customNavigationBack",
    "customNavigationNext",
    "translationStatusRecipient",
    "questionnaireReviewerStatusRecipient",
    "questionnaireReviewerDisplayAnswersScales",
    "answerImageHeightCheckBox",
    "answerImageWidthCheckBox",
    "answerImageHeightRadioButton",
    "answerImageWidthRadioButton",
    "translationBaseLang",
    "template",
    "panelTemplate",
    "currentQuestionnaireVersion",
    "questionnaireVersion",
    "invalidDataHandlingSettingsSpecified",
    "handlingOfUndefinedPrecodes",
    "handlingOfInvalidNumericData",
    "handlingOfOversizedTexts",
    "sqlServerId",
    "translationStatuses",
    "customResources"
})
public class ProjectInfo
    extends Node
{

    @XmlElement(name = "Build")
    protected String build;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LogoFile")
    protected String logoFile;
    @XmlElement(name = "ProjectStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar projectStartDate;
    @XmlElement(name = "ProjectEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar projectEndDate;
    @XmlElement(name = "WI_Url")
    protected String wiUrl;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "CompanyId")
    protected int companyId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ProjectID")
    protected String projectID;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "CreatedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(name = "Creator")
    protected String creator;
    @XmlElement(name = "ApprovalStateDateChanged_Str")
    protected String approvalStateDateChangedStr;
    @XmlElement(name = "ProjectSourceType", required = true)
    @XmlSchemaType(name = "string")
    protected ConfirmitProjectSourceType projectSourceType;
    @XmlElement(name = "MasterProject")
    protected String masterProject;
    @XmlElement(name = "ErrorRecipient")
    protected String errorRecipient;
    @XmlElement(name = "LostPasswordSender")
    protected String lostPasswordSender;
    @XmlElement(name = "CustomNavigationStyle")
    protected String customNavigationStyle;
    @XmlElement(name = "AnswerImageDefaultRadioButton")
    protected String answerImageDefaultRadioButton;
    @XmlElement(name = "AnswerImageOverRadioButton")
    protected String answerImageOverRadioButton;
    @XmlElement(name = "AnswerImageSelectedRadioButton")
    protected String answerImageSelectedRadioButton;
    @XmlElement(name = "AnswerImageDefaultCheckBox")
    protected String answerImageDefaultCheckBox;
    @XmlElement(name = "AnswerImageOverCheckBox")
    protected String answerImageOverCheckBox;
    @XmlElement(name = "AnswerImageSelectedCheckBox")
    protected String answerImageSelectedCheckBox;
    @XmlElement(name = "Languages")
    protected ArrayOfInt languages;
    @XmlElement(name = "KeyWords")
    protected ArrayOfString keyWords;
    @XmlElement(name = "Titles")
    protected ArrayOfLanguageString7 titles;
    @XmlElement(name = "HelpLinkTexts")
    protected ArrayOfLanguageString8 helpLinkTexts;
    @XmlElement(name = "HelpLinkUrls")
    protected ArrayOfLanguageString9 helpLinkUrls;
    @XmlElement(name = "EndLinkTexts")
    protected ArrayOfLanguageString10 endLinkTexts;
    @XmlElement(name = "EndLinkUrls")
    protected ArrayOfLanguageString11 endLinkUrls;
    @XmlElement(name = "CustomNavigationOK")
    protected ArrayOfLanguageString12 customNavigationOK;
    @XmlElement(name = "CustomNavigationBack")
    protected ArrayOfLanguageString13 customNavigationBack;
    @XmlElement(name = "CustomNavigationNext")
    protected ArrayOfLanguageString14 customNavigationNext;
    @XmlElement(name = "TranslationStatusRecipient")
    protected String translationStatusRecipient;
    @XmlElement(name = "QuestionnaireReviewerStatusRecipient")
    protected String questionnaireReviewerStatusRecipient;
    @XmlElement(name = "QuestionnaireReviewerDisplayAnswersScales")
    protected boolean questionnaireReviewerDisplayAnswersScales;
    @XmlElement(name = "AnswerImageHeightCheckBox")
    protected int answerImageHeightCheckBox;
    @XmlElement(name = "AnswerImageWidthCheckBox")
    protected int answerImageWidthCheckBox;
    @XmlElement(name = "AnswerImageHeightRadioButton")
    protected int answerImageHeightRadioButton;
    @XmlElement(name = "AnswerImageWidthRadioButton")
    protected int answerImageWidthRadioButton;
    @XmlElement(name = "TranslationBaseLang")
    protected int translationBaseLang;
    @XmlElement(name = "Template")
    protected int template;
    @XmlElement(name = "PanelTemplate")
    protected int panelTemplate;
    @XmlElement(name = "CurrentQuestionnaireVersion")
    protected int currentQuestionnaireVersion;
    @XmlElement(name = "QuestionnaireVersion")
    protected int questionnaireVersion;
    @XmlElement(name = "InvalidDataHandlingSettingsSpecified")
    protected boolean invalidDataHandlingSettingsSpecified;
    @XmlElement(name = "HandlingOfUndefinedPrecodes", required = true)
    @XmlSchemaType(name = "string")
    protected HandlingOfUndefinedPrecodes handlingOfUndefinedPrecodes;
    @XmlElement(name = "HandlingOfInvalidNumericData", required = true)
    @XmlSchemaType(name = "string")
    protected HandlingOfInvalidNumericData handlingOfInvalidNumericData;
    @XmlElement(name = "HandlingOfOversizedTexts", required = true)
    @XmlSchemaType(name = "string")
    protected HandlingOfOversizedTexts handlingOfOversizedTexts;
    @XmlElement(name = "SqlServerId")
    protected int sqlServerId;
    @XmlElement(name = "TranslationStatuses")
    protected ArrayOfTranslationStatus translationStatuses;
    @XmlElement(name = "CustomResources")
    protected ArrayOfCustomResource customResources;
    @XmlAttribute(name = "HasUploadedRespondents", required = true)
    protected boolean hasUploadedRespondents;
    @XmlAttribute(name = "ExternalQuickTestKey")
    protected String externalQuickTestKey;
    @XmlAttribute(name = "SurveyParametersForTestInterView")
    protected String surveyParametersForTestInterView;
    @XmlAttribute(name = "Confirmit125_DBFormat_Support", required = true)
    protected boolean confirmit125DBFormatSupport;
    @XmlAttribute(name = "ReusableDB_Support", required = true)
    protected boolean reusableDBSupport;
    @XmlAttribute(name = "HasExternalData", required = true)
    protected boolean hasExternalData;
    @XmlAttribute(name = "EnforceVersion", required = true)
    protected boolean enforceVersion;
    @XmlAttribute(name = "EnforceUnicodeEncoding", required = true)
    protected boolean enforceUnicodeEncoding;
    @XmlAttribute(name = "ExternalTestKey")
    protected String externalTestKey;
    @XmlAttribute(name = "ExternalTestEnabled", required = true)
    protected boolean externalTestEnabled;
    @XmlAttribute(name = "SurveyLogicMode", required = true)
    protected SurveyLogicModeType surveyLogicMode;
    @XmlAttribute(name = "WI_LaunchDate")
    protected String wiLaunchDate;
    @XmlAttribute(name = "ApprovalState", required = true)
    protected SurveyApprovalState approvalState;
    @XmlAttribute(name = "ApprovalState_Int", required = true)
    protected int approvalStateInt;
    @XmlAttribute(name = "ProjectSourceType_Int", required = true)
    protected int projectSourceTypeInt;
    @XmlAttribute(name = "ProjectType_Int", required = true)
    protected int projectTypeInt;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "IsStandardPanel", required = true)
    protected boolean isStandardPanel;
    @XmlAttribute(name = "Use81WIGeneration", required = true)
    protected boolean use81WIGeneration;
    @XmlAttribute(name = "TestMode", required = true)
    protected boolean testMode;
    @XmlAttribute(name = "InlineSurveyEnabled", required = true)
    protected boolean inlineSurveyEnabled;
    @XmlAttribute(name = "InlineSurveyUseOverlay", required = true)
    protected boolean inlineSurveyUseOverlay;
    @XmlAttribute(name = "InlineSurveyOverlayOpacity")
    protected String inlineSurveyOverlayOpacity;
    @XmlAttribute(name = "InlineSurveyWidth")
    protected String inlineSurveyWidth;
    @XmlAttribute(name = "InlineSurveyFrequency", required = true)
    protected int inlineSurveyFrequency;
    @XmlAttribute(name = "HideBackgroundVariablesInTestMode", required = true)
    protected boolean hideBackgroundVariablesInTestMode;
    @XmlAttribute(name = "HidePanelVariablesInTestMode", required = true)
    protected boolean hidePanelVariablesInTestMode;
    @XmlAttribute(name = "HideHiddenVariablesInTestMode", required = true)
    protected boolean hideHiddenVariablesInTestMode;
    @XmlAttribute(name = "ExternalRespondents", required = true)
    protected boolean externalRespondents;
    @XmlAttribute(name = "InlineSurveyCookie", required = true)
    protected InlineSurveyCookieType inlineSurveyCookie;
    @XmlAttribute(name = "InlineSurveyCookie_Int", required = true)
    protected int inlineSurveyCookieInt;
    @XmlAttribute(name = "InlineSurveyCookieName")
    protected String inlineSurveyCookieName;
    @XmlAttribute(name = "InlineSurveyCookieExpiration", required = true)
    protected int inlineSurveyCookieExpiration;
    @XmlAttribute(name = "NewLayoutEnabled", required = true)
    protected boolean newLayoutEnabled;
    @XmlAttribute(name = "SurveyLayoutName")
    protected String surveyLayoutName;
    @XmlAttribute(name = "SurveyLayoutId")
    protected String surveyLayoutId;
    @XmlAttribute(name = "SurveyLayoutIsEasyLayout", required = true)
    protected boolean surveyLayoutIsEasyLayout;
    @XmlAttribute(name = "DisplayPrecodesInCAPI", required = true)
    protected boolean displayPrecodesInCAPI;
    @XmlAttribute(name = "DisplayPrecodesInCATI", required = true)
    protected boolean displayPrecodesInCATI;
    @XmlAttribute(name = "DefaultLanguage", required = true)
    protected int defaultLanguage;
    @XmlAttribute(name = "CustomNavigationType", required = true)
    protected CustomNavigationType customNavigationType;
    @XmlAttribute(name = "ReservedErrorArea", required = true)
    protected boolean reservedErrorArea;
    @XmlAttribute(name = "SetFirstControlFocus", required = true)
    protected boolean setFirstControlFocus;
    @XmlAttribute(name = "BackButton", required = true)
    protected boolean backButton;
    @XmlAttribute(name = "CapiBackButton", required = true)
    protected boolean capiBackButton;
    @XmlAttribute(name = "ContinueLink", required = true)
    protected boolean continueLink;
    @XmlAttribute(name = "AllowModify", required = true)
    protected boolean allowModify;
    @XmlAttribute(name = "AllowModifyComplete", required = true)
    protected boolean allowModifyComplete;
    @XmlAttribute(name = "FrameBreaker", required = true)
    protected boolean frameBreaker;
    @XmlAttribute(name = "AnswerImageEnabled", required = true)
    protected boolean answerImageEnabled;
    @XmlAttribute(name = "Popup", required = true)
    protected boolean popup;
    @XmlAttribute(name = "DoNotCreateDatabaseRowOnInitialRequest", required = true)
    protected boolean doNotCreateDatabaseRowOnInitialRequest;
    @XmlAttribute(name = "SingleSignOn", required = true)
    protected boolean singleSignOn;
    @XmlAttribute(name = "SingleSignOnFallback", required = true)
    protected boolean singleSignOnFallback;
    @XmlAttribute(name = "OnlyUserId", required = true)
    protected boolean onlyUserId;
    @XmlAttribute(name = "SurveyLinkExpiryEnabled", required = true)
    protected boolean surveyLinkExpiryEnabled;
    @XmlAttribute(name = "EnableShortUrls", required = true)
    protected boolean enableShortUrls;
    @XmlAttribute(name = "QuotaVersion", required = true)
    protected int quotaVersion;
    @XmlAttribute(name = "DisablePrecodeCheck", required = true)
    protected boolean disablePrecodeCheck;
    @XmlAttribute(name = "Accessibility508", required = true)
    protected boolean accessibility508;
    @XmlAttribute(name = "ErrorPrefix", required = true)
    protected boolean errorPrefix;
    @XmlAttribute(name = "OtherLabel", required = true)
    protected boolean otherLabel;
    @XmlAttribute(name = "ShowDeleted", required = true)
    protected boolean showDeleted;
    @XmlAttribute(name = "AnswerRequired", required = true)
    protected boolean answerRequired;
    @XmlAttribute(name = "Exclusivity", required = true)
    protected boolean exclusivity;
    @XmlAttribute(name = "OtherSpecify", required = true)
    protected boolean otherSpecify;
    @XmlAttribute(name = "RankOrder", required = true)
    protected boolean rankOrder;
    @XmlAttribute(name = "LimitedSurvey", required = true)
    protected boolean limitedSurvey;
    @XmlAttribute(name = "CapiLimitedSurvey", required = true)
    protected boolean capiLimitedSurvey;
    @XmlAttribute(name = "LoginPage", required = true)
    protected boolean loginPage;
    @XmlAttribute(name = "IsOffline", required = true)
    protected boolean isOffline;
    @XmlAttribute(name = "IsCapiBasedSurvey", required = true)
    protected boolean isCapiBasedSurvey;
    @XmlAttribute(name = "IsCatiBasedSurvey", required = true)
    protected boolean isCatiBasedSurvey;
    @XmlAttribute(name = "IsTouchPhoneSurvey", required = true)
    protected boolean isTouchPhoneSurvey;
    @XmlAttribute(name = "IsGenericPhoneSurvey", required = true)
    protected boolean isGenericPhoneSurvey;
    @XmlAttribute(name = "EnableOpenedReviewRecording", required = true)
    protected boolean enableOpenedReviewRecording;
    @XmlAttribute(name = "SupportTelephoneBlacklist", required = true)
    protected boolean supportTelephoneBlacklist;
    @XmlAttribute(name = "EnableInterviewRecording", required = true)
    protected boolean enableInterviewRecording;
    @XmlAttribute(name = "EnableInterviewScreenRecording", required = true)
    protected boolean enableInterviewScreenRecording;
    @XmlAttribute(name = "IsSurveyIntegratedToFusion", required = true)
    protected boolean isSurveyIntegratedToFusion;
    @XmlAttribute(name = "IsSurveyPoll", required = true)
    protected boolean isSurveyPoll;
    @XmlAttribute(name = "DialMode", required = true)
    protected DialMode dialMode;
    @XmlAttribute(name = "EnableSchedulingForWebInterviewing", required = true)
    protected boolean enableSchedulingForWebInterviewing;
    @XmlAttribute(name = "HtmlEncodePipingExpressions", required = true)
    protected boolean htmlEncodePipingExpressions;
    @XmlAttribute(name = "RequireXssSafeInput", required = true)
    protected boolean requireXssSafeInput;
    @XmlAttribute(name = "EnforceHttps", required = true)
    protected boolean enforceHttps;
    @XmlAttribute(name = "EnableCAS", required = true)
    protected boolean enableCAS;
    @XmlAttribute(name = "EncryptSystemRequestParameters", required = true)
    protected boolean encryptSystemRequestParameters;
    @XmlAttribute(name = "DisableQIDRequestParameter", required = true)
    protected boolean disableQIDRequestParameter;
    @XmlAttribute(name = "PanelistRegistrationSurvey", required = true)
    protected boolean panelistRegistrationSurvey;
    @XmlAttribute(name = "IsWebBasedSurvey", required = true)
    protected boolean isWebBasedSurvey;
    @XmlAttribute(name = "CustomNavigationEnabled", required = true)
    protected boolean customNavigationEnabled;
    @XmlAttribute(name = "AnswerButtons", required = true)
    protected boolean answerButtons;
    @XmlAttribute(name = "LabelClick", required = true)
    protected boolean labelClick;
    @XmlAttribute(name = "RadioButtons", required = true)
    protected boolean radioButtons;
    @XmlAttribute(name = "AutoNext", required = true)
    protected boolean autoNext;
    @XmlAttribute(name = "TabOnEnterKey", required = true)
    protected boolean tabOnEnterKey;
    @XmlAttribute(name = "GridErrorHighlight", required = true)
    protected boolean gridErrorHighlight;
    @XmlAttribute(name = "EnableDragDropOnTouch", required = true)
    protected boolean enableDragDropOnTouch;
    @XmlAttribute(name = "OverrideBrowserBack", required = true)
    protected boolean overrideBrowserBack;
    @XmlAttribute(name = "ProgressBar", required = true)
    protected boolean progressBar;
    @XmlAttribute(name = "BitStreamIndexes")
    protected String bitStreamIndexes;
    @XmlAttribute(name = "OneQuestionPerPage", required = true)
    protected boolean oneQuestionPerPage;
    @XmlAttribute(name = "EnablePerQuestionAnswersRandomization", required = true)
    protected boolean enablePerQuestionAnswersRandomization;
    @XmlAttribute(name = "AllowPostRequestsForRespondentLinks", required = true)
    protected boolean allowPostRequestsForRespondentLinks;
    @XmlAttribute(name = "EnterprisePanelId")
    protected String enterprisePanelId;
    @XmlAttribute(name = "UseDbEncryption", required = true)
    protected boolean useDbEncryption;
    @XmlAttribute(name = "OptimisticQuotaTimeout", required = true)
    protected int optimisticQuotaTimeout;
    @XmlAttribute(name = "OverrideOptimisticQuotaTimeout", required = true)
    protected boolean overrideOptimisticQuotaTimeout;
    @XmlAttribute(name = "UseChangeTracking", required = true)
    protected boolean useChangeTracking;
    @XmlAttribute(name = "HiddenInParticipation", required = true)
    protected boolean hiddenInParticipation;

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the logoFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoFile() {
        return logoFile;
    }

    /**
     * Sets the value of the logoFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoFile(String value) {
        this.logoFile = value;
    }

    /**
     * Gets the value of the projectStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectStartDate() {
        return projectStartDate;
    }

    /**
     * Sets the value of the projectStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectStartDate(XMLGregorianCalendar value) {
        this.projectStartDate = value;
    }

    /**
     * Gets the value of the projectEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectEndDate() {
        return projectEndDate;
    }

    /**
     * Sets the value of the projectEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectEndDate(XMLGregorianCalendar value) {
        this.projectEndDate = value;
    }

    /**
     * Gets the value of the wiUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWIUrl() {
        return wiUrl;
    }

    /**
     * Sets the value of the wiUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWIUrl(String value) {
        this.wiUrl = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     */
    public int getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     */
    public void setCompanyId(int value) {
        this.companyId = value;
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
     * Gets the value of the projectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectID(String value) {
        this.projectID = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the approvalStateDateChangedStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStateDateChangedStr() {
        return approvalStateDateChangedStr;
    }

    /**
     * Sets the value of the approvalStateDateChangedStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStateDateChangedStr(String value) {
        this.approvalStateDateChangedStr = value;
    }

    /**
     * Gets the value of the projectSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmitProjectSourceType }
     *     
     */
    public ConfirmitProjectSourceType getProjectSourceType() {
        return projectSourceType;
    }

    /**
     * Sets the value of the projectSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmitProjectSourceType }
     *     
     */
    public void setProjectSourceType(ConfirmitProjectSourceType value) {
        this.projectSourceType = value;
    }

    /**
     * Gets the value of the masterProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterProject() {
        return masterProject;
    }

    /**
     * Sets the value of the masterProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterProject(String value) {
        this.masterProject = value;
    }

    /**
     * Gets the value of the errorRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorRecipient() {
        return errorRecipient;
    }

    /**
     * Sets the value of the errorRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorRecipient(String value) {
        this.errorRecipient = value;
    }

    /**
     * Gets the value of the lostPasswordSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostPasswordSender() {
        return lostPasswordSender;
    }

    /**
     * Sets the value of the lostPasswordSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostPasswordSender(String value) {
        this.lostPasswordSender = value;
    }

    /**
     * Gets the value of the customNavigationStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomNavigationStyle() {
        return customNavigationStyle;
    }

    /**
     * Sets the value of the customNavigationStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomNavigationStyle(String value) {
        this.customNavigationStyle = value;
    }

    /**
     * Gets the value of the answerImageDefaultRadioButton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageDefaultRadioButton() {
        return answerImageDefaultRadioButton;
    }

    /**
     * Sets the value of the answerImageDefaultRadioButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageDefaultRadioButton(String value) {
        this.answerImageDefaultRadioButton = value;
    }

    /**
     * Gets the value of the answerImageOverRadioButton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageOverRadioButton() {
        return answerImageOverRadioButton;
    }

    /**
     * Sets the value of the answerImageOverRadioButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageOverRadioButton(String value) {
        this.answerImageOverRadioButton = value;
    }

    /**
     * Gets the value of the answerImageSelectedRadioButton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageSelectedRadioButton() {
        return answerImageSelectedRadioButton;
    }

    /**
     * Sets the value of the answerImageSelectedRadioButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageSelectedRadioButton(String value) {
        this.answerImageSelectedRadioButton = value;
    }

    /**
     * Gets the value of the answerImageDefaultCheckBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageDefaultCheckBox() {
        return answerImageDefaultCheckBox;
    }

    /**
     * Sets the value of the answerImageDefaultCheckBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageDefaultCheckBox(String value) {
        this.answerImageDefaultCheckBox = value;
    }

    /**
     * Gets the value of the answerImageOverCheckBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageOverCheckBox() {
        return answerImageOverCheckBox;
    }

    /**
     * Sets the value of the answerImageOverCheckBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageOverCheckBox(String value) {
        this.answerImageOverCheckBox = value;
    }

    /**
     * Gets the value of the answerImageSelectedCheckBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerImageSelectedCheckBox() {
        return answerImageSelectedCheckBox;
    }

    /**
     * Sets the value of the answerImageSelectedCheckBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerImageSelectedCheckBox(String value) {
        this.answerImageSelectedCheckBox = value;
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
     * Gets the value of the keyWords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getKeyWords() {
        return keyWords;
    }

    /**
     * Sets the value of the keyWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setKeyWords(ArrayOfString value) {
        this.keyWords = value;
    }

    /**
     * Gets the value of the titles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString7 }
     *     
     */
    public ArrayOfLanguageString7 getTitles() {
        return titles;
    }

    /**
     * Sets the value of the titles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString7 }
     *     
     */
    public void setTitles(ArrayOfLanguageString7 value) {
        this.titles = value;
    }

    /**
     * Gets the value of the helpLinkTexts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString8 }
     *     
     */
    public ArrayOfLanguageString8 getHelpLinkTexts() {
        return helpLinkTexts;
    }

    /**
     * Sets the value of the helpLinkTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString8 }
     *     
     */
    public void setHelpLinkTexts(ArrayOfLanguageString8 value) {
        this.helpLinkTexts = value;
    }

    /**
     * Gets the value of the helpLinkUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString9 }
     *     
     */
    public ArrayOfLanguageString9 getHelpLinkUrls() {
        return helpLinkUrls;
    }

    /**
     * Sets the value of the helpLinkUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString9 }
     *     
     */
    public void setHelpLinkUrls(ArrayOfLanguageString9 value) {
        this.helpLinkUrls = value;
    }

    /**
     * Gets the value of the endLinkTexts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString10 }
     *     
     */
    public ArrayOfLanguageString10 getEndLinkTexts() {
        return endLinkTexts;
    }

    /**
     * Sets the value of the endLinkTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString10 }
     *     
     */
    public void setEndLinkTexts(ArrayOfLanguageString10 value) {
        this.endLinkTexts = value;
    }

    /**
     * Gets the value of the endLinkUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString11 }
     *     
     */
    public ArrayOfLanguageString11 getEndLinkUrls() {
        return endLinkUrls;
    }

    /**
     * Sets the value of the endLinkUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString11 }
     *     
     */
    public void setEndLinkUrls(ArrayOfLanguageString11 value) {
        this.endLinkUrls = value;
    }

    /**
     * Gets the value of the customNavigationOK property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString12 }
     *     
     */
    public ArrayOfLanguageString12 getCustomNavigationOK() {
        return customNavigationOK;
    }

    /**
     * Sets the value of the customNavigationOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString12 }
     *     
     */
    public void setCustomNavigationOK(ArrayOfLanguageString12 value) {
        this.customNavigationOK = value;
    }

    /**
     * Gets the value of the customNavigationBack property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString13 }
     *     
     */
    public ArrayOfLanguageString13 getCustomNavigationBack() {
        return customNavigationBack;
    }

    /**
     * Sets the value of the customNavigationBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString13 }
     *     
     */
    public void setCustomNavigationBack(ArrayOfLanguageString13 value) {
        this.customNavigationBack = value;
    }

    /**
     * Gets the value of the customNavigationNext property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageString14 }
     *     
     */
    public ArrayOfLanguageString14 getCustomNavigationNext() {
        return customNavigationNext;
    }

    /**
     * Sets the value of the customNavigationNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageString14 }
     *     
     */
    public void setCustomNavigationNext(ArrayOfLanguageString14 value) {
        this.customNavigationNext = value;
    }

    /**
     * Gets the value of the translationStatusRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationStatusRecipient() {
        return translationStatusRecipient;
    }

    /**
     * Sets the value of the translationStatusRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationStatusRecipient(String value) {
        this.translationStatusRecipient = value;
    }

    /**
     * Gets the value of the questionnaireReviewerStatusRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionnaireReviewerStatusRecipient() {
        return questionnaireReviewerStatusRecipient;
    }

    /**
     * Sets the value of the questionnaireReviewerStatusRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionnaireReviewerStatusRecipient(String value) {
        this.questionnaireReviewerStatusRecipient = value;
    }

    /**
     * Gets the value of the questionnaireReviewerDisplayAnswersScales property.
     * 
     */
    public boolean isQuestionnaireReviewerDisplayAnswersScales() {
        return questionnaireReviewerDisplayAnswersScales;
    }

    /**
     * Sets the value of the questionnaireReviewerDisplayAnswersScales property.
     * 
     */
    public void setQuestionnaireReviewerDisplayAnswersScales(boolean value) {
        this.questionnaireReviewerDisplayAnswersScales = value;
    }

    /**
     * Gets the value of the answerImageHeightCheckBox property.
     * 
     */
    public int getAnswerImageHeightCheckBox() {
        return answerImageHeightCheckBox;
    }

    /**
     * Sets the value of the answerImageHeightCheckBox property.
     * 
     */
    public void setAnswerImageHeightCheckBox(int value) {
        this.answerImageHeightCheckBox = value;
    }

    /**
     * Gets the value of the answerImageWidthCheckBox property.
     * 
     */
    public int getAnswerImageWidthCheckBox() {
        return answerImageWidthCheckBox;
    }

    /**
     * Sets the value of the answerImageWidthCheckBox property.
     * 
     */
    public void setAnswerImageWidthCheckBox(int value) {
        this.answerImageWidthCheckBox = value;
    }

    /**
     * Gets the value of the answerImageHeightRadioButton property.
     * 
     */
    public int getAnswerImageHeightRadioButton() {
        return answerImageHeightRadioButton;
    }

    /**
     * Sets the value of the answerImageHeightRadioButton property.
     * 
     */
    public void setAnswerImageHeightRadioButton(int value) {
        this.answerImageHeightRadioButton = value;
    }

    /**
     * Gets the value of the answerImageWidthRadioButton property.
     * 
     */
    public int getAnswerImageWidthRadioButton() {
        return answerImageWidthRadioButton;
    }

    /**
     * Sets the value of the answerImageWidthRadioButton property.
     * 
     */
    public void setAnswerImageWidthRadioButton(int value) {
        this.answerImageWidthRadioButton = value;
    }

    /**
     * Gets the value of the translationBaseLang property.
     * 
     */
    public int getTranslationBaseLang() {
        return translationBaseLang;
    }

    /**
     * Sets the value of the translationBaseLang property.
     * 
     */
    public void setTranslationBaseLang(int value) {
        this.translationBaseLang = value;
    }

    /**
     * Gets the value of the template property.
     * 
     */
    public int getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     */
    public void setTemplate(int value) {
        this.template = value;
    }

    /**
     * Gets the value of the panelTemplate property.
     * 
     */
    public int getPanelTemplate() {
        return panelTemplate;
    }

    /**
     * Sets the value of the panelTemplate property.
     * 
     */
    public void setPanelTemplate(int value) {
        this.panelTemplate = value;
    }

    /**
     * Gets the value of the currentQuestionnaireVersion property.
     * 
     */
    public int getCurrentQuestionnaireVersion() {
        return currentQuestionnaireVersion;
    }

    /**
     * Sets the value of the currentQuestionnaireVersion property.
     * 
     */
    public void setCurrentQuestionnaireVersion(int value) {
        this.currentQuestionnaireVersion = value;
    }

    /**
     * Gets the value of the questionnaireVersion property.
     * 
     */
    public int getQuestionnaireVersion() {
        return questionnaireVersion;
    }

    /**
     * Sets the value of the questionnaireVersion property.
     * 
     */
    public void setQuestionnaireVersion(int value) {
        this.questionnaireVersion = value;
    }

    /**
     * Gets the value of the invalidDataHandlingSettingsSpecified property.
     * 
     */
    public boolean isInvalidDataHandlingSettingsSpecified() {
        return invalidDataHandlingSettingsSpecified;
    }

    /**
     * Sets the value of the invalidDataHandlingSettingsSpecified property.
     * 
     */
    public void setInvalidDataHandlingSettingsSpecified(boolean value) {
        this.invalidDataHandlingSettingsSpecified = value;
    }

    /**
     * Gets the value of the handlingOfUndefinedPrecodes property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingOfUndefinedPrecodes }
     *     
     */
    public HandlingOfUndefinedPrecodes getHandlingOfUndefinedPrecodes() {
        return handlingOfUndefinedPrecodes;
    }

    /**
     * Sets the value of the handlingOfUndefinedPrecodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingOfUndefinedPrecodes }
     *     
     */
    public void setHandlingOfUndefinedPrecodes(HandlingOfUndefinedPrecodes value) {
        this.handlingOfUndefinedPrecodes = value;
    }

    /**
     * Gets the value of the handlingOfInvalidNumericData property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingOfInvalidNumericData }
     *     
     */
    public HandlingOfInvalidNumericData getHandlingOfInvalidNumericData() {
        return handlingOfInvalidNumericData;
    }

    /**
     * Sets the value of the handlingOfInvalidNumericData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingOfInvalidNumericData }
     *     
     */
    public void setHandlingOfInvalidNumericData(HandlingOfInvalidNumericData value) {
        this.handlingOfInvalidNumericData = value;
    }

    /**
     * Gets the value of the handlingOfOversizedTexts property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingOfOversizedTexts }
     *     
     */
    public HandlingOfOversizedTexts getHandlingOfOversizedTexts() {
        return handlingOfOversizedTexts;
    }

    /**
     * Sets the value of the handlingOfOversizedTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingOfOversizedTexts }
     *     
     */
    public void setHandlingOfOversizedTexts(HandlingOfOversizedTexts value) {
        this.handlingOfOversizedTexts = value;
    }

    /**
     * Gets the value of the sqlServerId property.
     * 
     */
    public int getSqlServerId() {
        return sqlServerId;
    }

    /**
     * Sets the value of the sqlServerId property.
     * 
     */
    public void setSqlServerId(int value) {
        this.sqlServerId = value;
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

    /**
     * Gets the value of the customResources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomResource }
     *     
     */
    public ArrayOfCustomResource getCustomResources() {
        return customResources;
    }

    /**
     * Sets the value of the customResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomResource }
     *     
     */
    public void setCustomResources(ArrayOfCustomResource value) {
        this.customResources = value;
    }

    /**
     * Gets the value of the hasUploadedRespondents property.
     * 
     */
    public boolean isHasUploadedRespondents() {
        return hasUploadedRespondents;
    }

    /**
     * Sets the value of the hasUploadedRespondents property.
     * 
     */
    public void setHasUploadedRespondents(boolean value) {
        this.hasUploadedRespondents = value;
    }

    /**
     * Gets the value of the externalQuickTestKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalQuickTestKey() {
        return externalQuickTestKey;
    }

    /**
     * Sets the value of the externalQuickTestKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalQuickTestKey(String value) {
        this.externalQuickTestKey = value;
    }

    /**
     * Gets the value of the surveyParametersForTestInterView property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyParametersForTestInterView() {
        return surveyParametersForTestInterView;
    }

    /**
     * Sets the value of the surveyParametersForTestInterView property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyParametersForTestInterView(String value) {
        this.surveyParametersForTestInterView = value;
    }

    /**
     * Gets the value of the confirmit125DBFormatSupport property.
     * 
     */
    public boolean isConfirmit125DBFormatSupport() {
        return confirmit125DBFormatSupport;
    }

    /**
     * Sets the value of the confirmit125DBFormatSupport property.
     * 
     */
    public void setConfirmit125DBFormatSupport(boolean value) {
        this.confirmit125DBFormatSupport = value;
    }

    /**
     * Gets the value of the reusableDBSupport property.
     * 
     */
    public boolean isReusableDBSupport() {
        return reusableDBSupport;
    }

    /**
     * Sets the value of the reusableDBSupport property.
     * 
     */
    public void setReusableDBSupport(boolean value) {
        this.reusableDBSupport = value;
    }

    /**
     * Gets the value of the hasExternalData property.
     * 
     */
    public boolean isHasExternalData() {
        return hasExternalData;
    }

    /**
     * Sets the value of the hasExternalData property.
     * 
     */
    public void setHasExternalData(boolean value) {
        this.hasExternalData = value;
    }

    /**
     * Gets the value of the enforceVersion property.
     * 
     */
    public boolean isEnforceVersion() {
        return enforceVersion;
    }

    /**
     * Sets the value of the enforceVersion property.
     * 
     */
    public void setEnforceVersion(boolean value) {
        this.enforceVersion = value;
    }

    /**
     * Gets the value of the enforceUnicodeEncoding property.
     * 
     */
    public boolean isEnforceUnicodeEncoding() {
        return enforceUnicodeEncoding;
    }

    /**
     * Sets the value of the enforceUnicodeEncoding property.
     * 
     */
    public void setEnforceUnicodeEncoding(boolean value) {
        this.enforceUnicodeEncoding = value;
    }

    /**
     * Gets the value of the externalTestKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTestKey() {
        return externalTestKey;
    }

    /**
     * Sets the value of the externalTestKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTestKey(String value) {
        this.externalTestKey = value;
    }

    /**
     * Gets the value of the externalTestEnabled property.
     * 
     */
    public boolean isExternalTestEnabled() {
        return externalTestEnabled;
    }

    /**
     * Sets the value of the externalTestEnabled property.
     * 
     */
    public void setExternalTestEnabled(boolean value) {
        this.externalTestEnabled = value;
    }

    /**
     * Gets the value of the surveyLogicMode property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyLogicModeType }
     *     
     */
    public SurveyLogicModeType getSurveyLogicMode() {
        return surveyLogicMode;
    }

    /**
     * Sets the value of the surveyLogicMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyLogicModeType }
     *     
     */
    public void setSurveyLogicMode(SurveyLogicModeType value) {
        this.surveyLogicMode = value;
    }

    /**
     * Gets the value of the wiLaunchDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWILaunchDate() {
        return wiLaunchDate;
    }

    /**
     * Sets the value of the wiLaunchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWILaunchDate(String value) {
        this.wiLaunchDate = value;
    }

    /**
     * Gets the value of the approvalState property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyApprovalState }
     *     
     */
    public SurveyApprovalState getApprovalState() {
        return approvalState;
    }

    /**
     * Sets the value of the approvalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyApprovalState }
     *     
     */
    public void setApprovalState(SurveyApprovalState value) {
        this.approvalState = value;
    }

    /**
     * Gets the value of the approvalStateInt property.
     * 
     */
    public int getApprovalStateInt() {
        return approvalStateInt;
    }

    /**
     * Sets the value of the approvalStateInt property.
     * 
     */
    public void setApprovalStateInt(int value) {
        this.approvalStateInt = value;
    }

    /**
     * Gets the value of the projectSourceTypeInt property.
     * 
     */
    public int getProjectSourceTypeInt() {
        return projectSourceTypeInt;
    }

    /**
     * Sets the value of the projectSourceTypeInt property.
     * 
     */
    public void setProjectSourceTypeInt(int value) {
        this.projectSourceTypeInt = value;
    }

    /**
     * Gets the value of the projectTypeInt property.
     * 
     */
    public int getProjectTypeInt() {
        return projectTypeInt;
    }

    /**
     * Sets the value of the projectTypeInt property.
     * 
     */
    public void setProjectTypeInt(int value) {
        this.projectTypeInt = value;
    }

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
     * Gets the value of the isStandardPanel property.
     * 
     */
    public boolean isIsStandardPanel() {
        return isStandardPanel;
    }

    /**
     * Sets the value of the isStandardPanel property.
     * 
     */
    public void setIsStandardPanel(boolean value) {
        this.isStandardPanel = value;
    }

    /**
     * Gets the value of the use81WIGeneration property.
     * 
     */
    public boolean isUse81WIGeneration() {
        return use81WIGeneration;
    }

    /**
     * Sets the value of the use81WIGeneration property.
     * 
     */
    public void setUse81WIGeneration(boolean value) {
        this.use81WIGeneration = value;
    }

    /**
     * Gets the value of the testMode property.
     * 
     */
    public boolean isTestMode() {
        return testMode;
    }

    /**
     * Sets the value of the testMode property.
     * 
     */
    public void setTestMode(boolean value) {
        this.testMode = value;
    }

    /**
     * Gets the value of the inlineSurveyEnabled property.
     * 
     */
    public boolean isInlineSurveyEnabled() {
        return inlineSurveyEnabled;
    }

    /**
     * Sets the value of the inlineSurveyEnabled property.
     * 
     */
    public void setInlineSurveyEnabled(boolean value) {
        this.inlineSurveyEnabled = value;
    }

    /**
     * Gets the value of the inlineSurveyUseOverlay property.
     * 
     */
    public boolean isInlineSurveyUseOverlay() {
        return inlineSurveyUseOverlay;
    }

    /**
     * Sets the value of the inlineSurveyUseOverlay property.
     * 
     */
    public void setInlineSurveyUseOverlay(boolean value) {
        this.inlineSurveyUseOverlay = value;
    }

    /**
     * Gets the value of the inlineSurveyOverlayOpacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineSurveyOverlayOpacity() {
        return inlineSurveyOverlayOpacity;
    }

    /**
     * Sets the value of the inlineSurveyOverlayOpacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineSurveyOverlayOpacity(String value) {
        this.inlineSurveyOverlayOpacity = value;
    }

    /**
     * Gets the value of the inlineSurveyWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineSurveyWidth() {
        return inlineSurveyWidth;
    }

    /**
     * Sets the value of the inlineSurveyWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineSurveyWidth(String value) {
        this.inlineSurveyWidth = value;
    }

    /**
     * Gets the value of the inlineSurveyFrequency property.
     * 
     */
    public int getInlineSurveyFrequency() {
        return inlineSurveyFrequency;
    }

    /**
     * Sets the value of the inlineSurveyFrequency property.
     * 
     */
    public void setInlineSurveyFrequency(int value) {
        this.inlineSurveyFrequency = value;
    }

    /**
     * Gets the value of the hideBackgroundVariablesInTestMode property.
     * 
     */
    public boolean isHideBackgroundVariablesInTestMode() {
        return hideBackgroundVariablesInTestMode;
    }

    /**
     * Sets the value of the hideBackgroundVariablesInTestMode property.
     * 
     */
    public void setHideBackgroundVariablesInTestMode(boolean value) {
        this.hideBackgroundVariablesInTestMode = value;
    }

    /**
     * Gets the value of the hidePanelVariablesInTestMode property.
     * 
     */
    public boolean isHidePanelVariablesInTestMode() {
        return hidePanelVariablesInTestMode;
    }

    /**
     * Sets the value of the hidePanelVariablesInTestMode property.
     * 
     */
    public void setHidePanelVariablesInTestMode(boolean value) {
        this.hidePanelVariablesInTestMode = value;
    }

    /**
     * Gets the value of the hideHiddenVariablesInTestMode property.
     * 
     */
    public boolean isHideHiddenVariablesInTestMode() {
        return hideHiddenVariablesInTestMode;
    }

    /**
     * Sets the value of the hideHiddenVariablesInTestMode property.
     * 
     */
    public void setHideHiddenVariablesInTestMode(boolean value) {
        this.hideHiddenVariablesInTestMode = value;
    }

    /**
     * Gets the value of the externalRespondents property.
     * 
     */
    public boolean isExternalRespondents() {
        return externalRespondents;
    }

    /**
     * Sets the value of the externalRespondents property.
     * 
     */
    public void setExternalRespondents(boolean value) {
        this.externalRespondents = value;
    }

    /**
     * Gets the value of the inlineSurveyCookie property.
     * 
     * @return
     *     possible object is
     *     {@link InlineSurveyCookieType }
     *     
     */
    public InlineSurveyCookieType getInlineSurveyCookie() {
        return inlineSurveyCookie;
    }

    /**
     * Sets the value of the inlineSurveyCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link InlineSurveyCookieType }
     *     
     */
    public void setInlineSurveyCookie(InlineSurveyCookieType value) {
        this.inlineSurveyCookie = value;
    }

    /**
     * Gets the value of the inlineSurveyCookieInt property.
     * 
     */
    public int getInlineSurveyCookieInt() {
        return inlineSurveyCookieInt;
    }

    /**
     * Sets the value of the inlineSurveyCookieInt property.
     * 
     */
    public void setInlineSurveyCookieInt(int value) {
        this.inlineSurveyCookieInt = value;
    }

    /**
     * Gets the value of the inlineSurveyCookieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineSurveyCookieName() {
        return inlineSurveyCookieName;
    }

    /**
     * Sets the value of the inlineSurveyCookieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineSurveyCookieName(String value) {
        this.inlineSurveyCookieName = value;
    }

    /**
     * Gets the value of the inlineSurveyCookieExpiration property.
     * 
     */
    public int getInlineSurveyCookieExpiration() {
        return inlineSurveyCookieExpiration;
    }

    /**
     * Sets the value of the inlineSurveyCookieExpiration property.
     * 
     */
    public void setInlineSurveyCookieExpiration(int value) {
        this.inlineSurveyCookieExpiration = value;
    }

    /**
     * Gets the value of the newLayoutEnabled property.
     * 
     */
    public boolean isNewLayoutEnabled() {
        return newLayoutEnabled;
    }

    /**
     * Sets the value of the newLayoutEnabled property.
     * 
     */
    public void setNewLayoutEnabled(boolean value) {
        this.newLayoutEnabled = value;
    }

    /**
     * Gets the value of the surveyLayoutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyLayoutName() {
        return surveyLayoutName;
    }

    /**
     * Sets the value of the surveyLayoutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyLayoutName(String value) {
        this.surveyLayoutName = value;
    }

    /**
     * Gets the value of the surveyLayoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyLayoutId() {
        return surveyLayoutId;
    }

    /**
     * Sets the value of the surveyLayoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyLayoutId(String value) {
        this.surveyLayoutId = value;
    }

    /**
     * Gets the value of the surveyLayoutIsEasyLayout property.
     * 
     */
    public boolean isSurveyLayoutIsEasyLayout() {
        return surveyLayoutIsEasyLayout;
    }

    /**
     * Sets the value of the surveyLayoutIsEasyLayout property.
     * 
     */
    public void setSurveyLayoutIsEasyLayout(boolean value) {
        this.surveyLayoutIsEasyLayout = value;
    }

    /**
     * Gets the value of the displayPrecodesInCAPI property.
     * 
     */
    public boolean isDisplayPrecodesInCAPI() {
        return displayPrecodesInCAPI;
    }

    /**
     * Sets the value of the displayPrecodesInCAPI property.
     * 
     */
    public void setDisplayPrecodesInCAPI(boolean value) {
        this.displayPrecodesInCAPI = value;
    }

    /**
     * Gets the value of the displayPrecodesInCATI property.
     * 
     */
    public boolean isDisplayPrecodesInCATI() {
        return displayPrecodesInCATI;
    }

    /**
     * Sets the value of the displayPrecodesInCATI property.
     * 
     */
    public void setDisplayPrecodesInCATI(boolean value) {
        this.displayPrecodesInCATI = value;
    }

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
     * Gets the value of the customNavigationType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomNavigationType }
     *     
     */
    public CustomNavigationType getCustomNavigationType() {
        return customNavigationType;
    }

    /**
     * Sets the value of the customNavigationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomNavigationType }
     *     
     */
    public void setCustomNavigationType(CustomNavigationType value) {
        this.customNavigationType = value;
    }

    /**
     * Gets the value of the reservedErrorArea property.
     * 
     */
    public boolean isReservedErrorArea() {
        return reservedErrorArea;
    }

    /**
     * Sets the value of the reservedErrorArea property.
     * 
     */
    public void setReservedErrorArea(boolean value) {
        this.reservedErrorArea = value;
    }

    /**
     * Gets the value of the setFirstControlFocus property.
     * 
     */
    public boolean isSetFirstControlFocus() {
        return setFirstControlFocus;
    }

    /**
     * Sets the value of the setFirstControlFocus property.
     * 
     */
    public void setSetFirstControlFocus(boolean value) {
        this.setFirstControlFocus = value;
    }

    /**
     * Gets the value of the backButton property.
     * 
     */
    public boolean isBackButton() {
        return backButton;
    }

    /**
     * Sets the value of the backButton property.
     * 
     */
    public void setBackButton(boolean value) {
        this.backButton = value;
    }

    /**
     * Gets the value of the capiBackButton property.
     * 
     */
    public boolean isCapiBackButton() {
        return capiBackButton;
    }

    /**
     * Sets the value of the capiBackButton property.
     * 
     */
    public void setCapiBackButton(boolean value) {
        this.capiBackButton = value;
    }

    /**
     * Gets the value of the continueLink property.
     * 
     */
    public boolean isContinueLink() {
        return continueLink;
    }

    /**
     * Sets the value of the continueLink property.
     * 
     */
    public void setContinueLink(boolean value) {
        this.continueLink = value;
    }

    /**
     * Gets the value of the allowModify property.
     * 
     */
    public boolean isAllowModify() {
        return allowModify;
    }

    /**
     * Sets the value of the allowModify property.
     * 
     */
    public void setAllowModify(boolean value) {
        this.allowModify = value;
    }

    /**
     * Gets the value of the allowModifyComplete property.
     * 
     */
    public boolean isAllowModifyComplete() {
        return allowModifyComplete;
    }

    /**
     * Sets the value of the allowModifyComplete property.
     * 
     */
    public void setAllowModifyComplete(boolean value) {
        this.allowModifyComplete = value;
    }

    /**
     * Gets the value of the frameBreaker property.
     * 
     */
    public boolean isFrameBreaker() {
        return frameBreaker;
    }

    /**
     * Sets the value of the frameBreaker property.
     * 
     */
    public void setFrameBreaker(boolean value) {
        this.frameBreaker = value;
    }

    /**
     * Gets the value of the answerImageEnabled property.
     * 
     */
    public boolean isAnswerImageEnabled() {
        return answerImageEnabled;
    }

    /**
     * Sets the value of the answerImageEnabled property.
     * 
     */
    public void setAnswerImageEnabled(boolean value) {
        this.answerImageEnabled = value;
    }

    /**
     * Gets the value of the popup property.
     * 
     */
    public boolean isPopup() {
        return popup;
    }

    /**
     * Sets the value of the popup property.
     * 
     */
    public void setPopup(boolean value) {
        this.popup = value;
    }

    /**
     * Gets the value of the doNotCreateDatabaseRowOnInitialRequest property.
     * 
     */
    public boolean isDoNotCreateDatabaseRowOnInitialRequest() {
        return doNotCreateDatabaseRowOnInitialRequest;
    }

    /**
     * Sets the value of the doNotCreateDatabaseRowOnInitialRequest property.
     * 
     */
    public void setDoNotCreateDatabaseRowOnInitialRequest(boolean value) {
        this.doNotCreateDatabaseRowOnInitialRequest = value;
    }

    /**
     * Gets the value of the singleSignOn property.
     * 
     */
    public boolean isSingleSignOn() {
        return singleSignOn;
    }

    /**
     * Sets the value of the singleSignOn property.
     * 
     */
    public void setSingleSignOn(boolean value) {
        this.singleSignOn = value;
    }

    /**
     * Gets the value of the singleSignOnFallback property.
     * 
     */
    public boolean isSingleSignOnFallback() {
        return singleSignOnFallback;
    }

    /**
     * Sets the value of the singleSignOnFallback property.
     * 
     */
    public void setSingleSignOnFallback(boolean value) {
        this.singleSignOnFallback = value;
    }

    /**
     * Gets the value of the onlyUserId property.
     * 
     */
    public boolean isOnlyUserId() {
        return onlyUserId;
    }

    /**
     * Sets the value of the onlyUserId property.
     * 
     */
    public void setOnlyUserId(boolean value) {
        this.onlyUserId = value;
    }

    /**
     * Gets the value of the surveyLinkExpiryEnabled property.
     * 
     */
    public boolean isSurveyLinkExpiryEnabled() {
        return surveyLinkExpiryEnabled;
    }

    /**
     * Sets the value of the surveyLinkExpiryEnabled property.
     * 
     */
    public void setSurveyLinkExpiryEnabled(boolean value) {
        this.surveyLinkExpiryEnabled = value;
    }

    /**
     * Gets the value of the enableShortUrls property.
     * 
     */
    public boolean isEnableShortUrls() {
        return enableShortUrls;
    }

    /**
     * Sets the value of the enableShortUrls property.
     * 
     */
    public void setEnableShortUrls(boolean value) {
        this.enableShortUrls = value;
    }

    /**
     * Gets the value of the quotaVersion property.
     * 
     */
    public int getQuotaVersion() {
        return quotaVersion;
    }

    /**
     * Sets the value of the quotaVersion property.
     * 
     */
    public void setQuotaVersion(int value) {
        this.quotaVersion = value;
    }

    /**
     * Gets the value of the disablePrecodeCheck property.
     * 
     */
    public boolean isDisablePrecodeCheck() {
        return disablePrecodeCheck;
    }

    /**
     * Sets the value of the disablePrecodeCheck property.
     * 
     */
    public void setDisablePrecodeCheck(boolean value) {
        this.disablePrecodeCheck = value;
    }

    /**
     * Gets the value of the accessibility508 property.
     * 
     */
    public boolean isAccessibility508() {
        return accessibility508;
    }

    /**
     * Sets the value of the accessibility508 property.
     * 
     */
    public void setAccessibility508(boolean value) {
        this.accessibility508 = value;
    }

    /**
     * Gets the value of the errorPrefix property.
     * 
     */
    public boolean isErrorPrefix() {
        return errorPrefix;
    }

    /**
     * Sets the value of the errorPrefix property.
     * 
     */
    public void setErrorPrefix(boolean value) {
        this.errorPrefix = value;
    }

    /**
     * Gets the value of the otherLabel property.
     * 
     */
    public boolean isOtherLabel() {
        return otherLabel;
    }

    /**
     * Sets the value of the otherLabel property.
     * 
     */
    public void setOtherLabel(boolean value) {
        this.otherLabel = value;
    }

    /**
     * Gets the value of the showDeleted property.
     * 
     */
    public boolean isShowDeleted() {
        return showDeleted;
    }

    /**
     * Sets the value of the showDeleted property.
     * 
     */
    public void setShowDeleted(boolean value) {
        this.showDeleted = value;
    }

    /**
     * Gets the value of the answerRequired property.
     * 
     */
    public boolean isAnswerRequired() {
        return answerRequired;
    }

    /**
     * Sets the value of the answerRequired property.
     * 
     */
    public void setAnswerRequired(boolean value) {
        this.answerRequired = value;
    }

    /**
     * Gets the value of the exclusivity property.
     * 
     */
    public boolean isExclusivity() {
        return exclusivity;
    }

    /**
     * Sets the value of the exclusivity property.
     * 
     */
    public void setExclusivity(boolean value) {
        this.exclusivity = value;
    }

    /**
     * Gets the value of the otherSpecify property.
     * 
     */
    public boolean isOtherSpecify() {
        return otherSpecify;
    }

    /**
     * Sets the value of the otherSpecify property.
     * 
     */
    public void setOtherSpecify(boolean value) {
        this.otherSpecify = value;
    }

    /**
     * Gets the value of the rankOrder property.
     * 
     */
    public boolean isRankOrder() {
        return rankOrder;
    }

    /**
     * Sets the value of the rankOrder property.
     * 
     */
    public void setRankOrder(boolean value) {
        this.rankOrder = value;
    }

    /**
     * Gets the value of the limitedSurvey property.
     * 
     */
    public boolean isLimitedSurvey() {
        return limitedSurvey;
    }

    /**
     * Sets the value of the limitedSurvey property.
     * 
     */
    public void setLimitedSurvey(boolean value) {
        this.limitedSurvey = value;
    }

    /**
     * Gets the value of the capiLimitedSurvey property.
     * 
     */
    public boolean isCapiLimitedSurvey() {
        return capiLimitedSurvey;
    }

    /**
     * Sets the value of the capiLimitedSurvey property.
     * 
     */
    public void setCapiLimitedSurvey(boolean value) {
        this.capiLimitedSurvey = value;
    }

    /**
     * Gets the value of the loginPage property.
     * 
     */
    public boolean isLoginPage() {
        return loginPage;
    }

    /**
     * Sets the value of the loginPage property.
     * 
     */
    public void setLoginPage(boolean value) {
        this.loginPage = value;
    }

    /**
     * Gets the value of the isOffline property.
     * 
     */
    public boolean isIsOffline() {
        return isOffline;
    }

    /**
     * Sets the value of the isOffline property.
     * 
     */
    public void setIsOffline(boolean value) {
        this.isOffline = value;
    }

    /**
     * Gets the value of the isCapiBasedSurvey property.
     * 
     */
    public boolean isIsCapiBasedSurvey() {
        return isCapiBasedSurvey;
    }

    /**
     * Sets the value of the isCapiBasedSurvey property.
     * 
     */
    public void setIsCapiBasedSurvey(boolean value) {
        this.isCapiBasedSurvey = value;
    }

    /**
     * Gets the value of the isCatiBasedSurvey property.
     * 
     */
    public boolean isIsCatiBasedSurvey() {
        return isCatiBasedSurvey;
    }

    /**
     * Sets the value of the isCatiBasedSurvey property.
     * 
     */
    public void setIsCatiBasedSurvey(boolean value) {
        this.isCatiBasedSurvey = value;
    }

    /**
     * Gets the value of the isTouchPhoneSurvey property.
     * 
     */
    public boolean isIsTouchPhoneSurvey() {
        return isTouchPhoneSurvey;
    }

    /**
     * Sets the value of the isTouchPhoneSurvey property.
     * 
     */
    public void setIsTouchPhoneSurvey(boolean value) {
        this.isTouchPhoneSurvey = value;
    }

    /**
     * Gets the value of the isGenericPhoneSurvey property.
     * 
     */
    public boolean isIsGenericPhoneSurvey() {
        return isGenericPhoneSurvey;
    }

    /**
     * Sets the value of the isGenericPhoneSurvey property.
     * 
     */
    public void setIsGenericPhoneSurvey(boolean value) {
        this.isGenericPhoneSurvey = value;
    }

    /**
     * Gets the value of the enableOpenedReviewRecording property.
     * 
     */
    public boolean isEnableOpenedReviewRecording() {
        return enableOpenedReviewRecording;
    }

    /**
     * Sets the value of the enableOpenedReviewRecording property.
     * 
     */
    public void setEnableOpenedReviewRecording(boolean value) {
        this.enableOpenedReviewRecording = value;
    }

    /**
     * Gets the value of the supportTelephoneBlacklist property.
     * 
     */
    public boolean isSupportTelephoneBlacklist() {
        return supportTelephoneBlacklist;
    }

    /**
     * Sets the value of the supportTelephoneBlacklist property.
     * 
     */
    public void setSupportTelephoneBlacklist(boolean value) {
        this.supportTelephoneBlacklist = value;
    }

    /**
     * Gets the value of the enableInterviewRecording property.
     * 
     */
    public boolean isEnableInterviewRecording() {
        return enableInterviewRecording;
    }

    /**
     * Sets the value of the enableInterviewRecording property.
     * 
     */
    public void setEnableInterviewRecording(boolean value) {
        this.enableInterviewRecording = value;
    }

    /**
     * Gets the value of the enableInterviewScreenRecording property.
     * 
     */
    public boolean isEnableInterviewScreenRecording() {
        return enableInterviewScreenRecording;
    }

    /**
     * Sets the value of the enableInterviewScreenRecording property.
     * 
     */
    public void setEnableInterviewScreenRecording(boolean value) {
        this.enableInterviewScreenRecording = value;
    }

    /**
     * Gets the value of the isSurveyIntegratedToFusion property.
     * 
     */
    public boolean isIsSurveyIntegratedToFusion() {
        return isSurveyIntegratedToFusion;
    }

    /**
     * Sets the value of the isSurveyIntegratedToFusion property.
     * 
     */
    public void setIsSurveyIntegratedToFusion(boolean value) {
        this.isSurveyIntegratedToFusion = value;
    }

    /**
     * Gets the value of the isSurveyPoll property.
     * 
     */
    public boolean isIsSurveyPoll() {
        return isSurveyPoll;
    }

    /**
     * Sets the value of the isSurveyPoll property.
     * 
     */
    public void setIsSurveyPoll(boolean value) {
        this.isSurveyPoll = value;
    }

    /**
     * Gets the value of the dialMode property.
     * 
     * @return
     *     possible object is
     *     {@link DialMode }
     *     
     */
    public DialMode getDialMode() {
        return dialMode;
    }

    /**
     * Sets the value of the dialMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialMode }
     *     
     */
    public void setDialMode(DialMode value) {
        this.dialMode = value;
    }

    /**
     * Gets the value of the enableSchedulingForWebInterviewing property.
     * 
     */
    public boolean isEnableSchedulingForWebInterviewing() {
        return enableSchedulingForWebInterviewing;
    }

    /**
     * Sets the value of the enableSchedulingForWebInterviewing property.
     * 
     */
    public void setEnableSchedulingForWebInterviewing(boolean value) {
        this.enableSchedulingForWebInterviewing = value;
    }

    /**
     * Gets the value of the htmlEncodePipingExpressions property.
     * 
     */
    public boolean isHtmlEncodePipingExpressions() {
        return htmlEncodePipingExpressions;
    }

    /**
     * Sets the value of the htmlEncodePipingExpressions property.
     * 
     */
    public void setHtmlEncodePipingExpressions(boolean value) {
        this.htmlEncodePipingExpressions = value;
    }

    /**
     * Gets the value of the requireXssSafeInput property.
     * 
     */
    public boolean isRequireXssSafeInput() {
        return requireXssSafeInput;
    }

    /**
     * Sets the value of the requireXssSafeInput property.
     * 
     */
    public void setRequireXssSafeInput(boolean value) {
        this.requireXssSafeInput = value;
    }

    /**
     * Gets the value of the enforceHttps property.
     * 
     */
    public boolean isEnforceHttps() {
        return enforceHttps;
    }

    /**
     * Sets the value of the enforceHttps property.
     * 
     */
    public void setEnforceHttps(boolean value) {
        this.enforceHttps = value;
    }

    /**
     * Gets the value of the enableCAS property.
     * 
     */
    public boolean isEnableCAS() {
        return enableCAS;
    }

    /**
     * Sets the value of the enableCAS property.
     * 
     */
    public void setEnableCAS(boolean value) {
        this.enableCAS = value;
    }

    /**
     * Gets the value of the encryptSystemRequestParameters property.
     * 
     */
    public boolean isEncryptSystemRequestParameters() {
        return encryptSystemRequestParameters;
    }

    /**
     * Sets the value of the encryptSystemRequestParameters property.
     * 
     */
    public void setEncryptSystemRequestParameters(boolean value) {
        this.encryptSystemRequestParameters = value;
    }

    /**
     * Gets the value of the disableQIDRequestParameter property.
     * 
     */
    public boolean isDisableQIDRequestParameter() {
        return disableQIDRequestParameter;
    }

    /**
     * Sets the value of the disableQIDRequestParameter property.
     * 
     */
    public void setDisableQIDRequestParameter(boolean value) {
        this.disableQIDRequestParameter = value;
    }

    /**
     * Gets the value of the panelistRegistrationSurvey property.
     * 
     */
    public boolean isPanelistRegistrationSurvey() {
        return panelistRegistrationSurvey;
    }

    /**
     * Sets the value of the panelistRegistrationSurvey property.
     * 
     */
    public void setPanelistRegistrationSurvey(boolean value) {
        this.panelistRegistrationSurvey = value;
    }

    /**
     * Gets the value of the isWebBasedSurvey property.
     * 
     */
    public boolean isIsWebBasedSurvey() {
        return isWebBasedSurvey;
    }

    /**
     * Sets the value of the isWebBasedSurvey property.
     * 
     */
    public void setIsWebBasedSurvey(boolean value) {
        this.isWebBasedSurvey = value;
    }

    /**
     * Gets the value of the customNavigationEnabled property.
     * 
     */
    public boolean isCustomNavigationEnabled() {
        return customNavigationEnabled;
    }

    /**
     * Sets the value of the customNavigationEnabled property.
     * 
     */
    public void setCustomNavigationEnabled(boolean value) {
        this.customNavigationEnabled = value;
    }

    /**
     * Gets the value of the answerButtons property.
     * 
     */
    public boolean isAnswerButtons() {
        return answerButtons;
    }

    /**
     * Sets the value of the answerButtons property.
     * 
     */
    public void setAnswerButtons(boolean value) {
        this.answerButtons = value;
    }

    /**
     * Gets the value of the labelClick property.
     * 
     */
    public boolean isLabelClick() {
        return labelClick;
    }

    /**
     * Sets the value of the labelClick property.
     * 
     */
    public void setLabelClick(boolean value) {
        this.labelClick = value;
    }

    /**
     * Gets the value of the radioButtons property.
     * 
     */
    public boolean isRadioButtons() {
        return radioButtons;
    }

    /**
     * Sets the value of the radioButtons property.
     * 
     */
    public void setRadioButtons(boolean value) {
        this.radioButtons = value;
    }

    /**
     * Gets the value of the autoNext property.
     * 
     */
    public boolean isAutoNext() {
        return autoNext;
    }

    /**
     * Sets the value of the autoNext property.
     * 
     */
    public void setAutoNext(boolean value) {
        this.autoNext = value;
    }

    /**
     * Gets the value of the tabOnEnterKey property.
     * 
     */
    public boolean isTabOnEnterKey() {
        return tabOnEnterKey;
    }

    /**
     * Sets the value of the tabOnEnterKey property.
     * 
     */
    public void setTabOnEnterKey(boolean value) {
        this.tabOnEnterKey = value;
    }

    /**
     * Gets the value of the gridErrorHighlight property.
     * 
     */
    public boolean isGridErrorHighlight() {
        return gridErrorHighlight;
    }

    /**
     * Sets the value of the gridErrorHighlight property.
     * 
     */
    public void setGridErrorHighlight(boolean value) {
        this.gridErrorHighlight = value;
    }

    /**
     * Gets the value of the enableDragDropOnTouch property.
     * 
     */
    public boolean isEnableDragDropOnTouch() {
        return enableDragDropOnTouch;
    }

    /**
     * Sets the value of the enableDragDropOnTouch property.
     * 
     */
    public void setEnableDragDropOnTouch(boolean value) {
        this.enableDragDropOnTouch = value;
    }

    /**
     * Gets the value of the overrideBrowserBack property.
     * 
     */
    public boolean isOverrideBrowserBack() {
        return overrideBrowserBack;
    }

    /**
     * Sets the value of the overrideBrowserBack property.
     * 
     */
    public void setOverrideBrowserBack(boolean value) {
        this.overrideBrowserBack = value;
    }

    /**
     * Gets the value of the progressBar property.
     * 
     */
    public boolean isProgressBar() {
        return progressBar;
    }

    /**
     * Sets the value of the progressBar property.
     * 
     */
    public void setProgressBar(boolean value) {
        this.progressBar = value;
    }

    /**
     * Gets the value of the bitStreamIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitStreamIndexes() {
        return bitStreamIndexes;
    }

    /**
     * Sets the value of the bitStreamIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitStreamIndexes(String value) {
        this.bitStreamIndexes = value;
    }

    /**
     * Gets the value of the oneQuestionPerPage property.
     * 
     */
    public boolean isOneQuestionPerPage() {
        return oneQuestionPerPage;
    }

    /**
     * Sets the value of the oneQuestionPerPage property.
     * 
     */
    public void setOneQuestionPerPage(boolean value) {
        this.oneQuestionPerPage = value;
    }

    /**
     * Gets the value of the enablePerQuestionAnswersRandomization property.
     * 
     */
    public boolean isEnablePerQuestionAnswersRandomization() {
        return enablePerQuestionAnswersRandomization;
    }

    /**
     * Sets the value of the enablePerQuestionAnswersRandomization property.
     * 
     */
    public void setEnablePerQuestionAnswersRandomization(boolean value) {
        this.enablePerQuestionAnswersRandomization = value;
    }

    /**
     * Gets the value of the allowPostRequestsForRespondentLinks property.
     * 
     */
    public boolean isAllowPostRequestsForRespondentLinks() {
        return allowPostRequestsForRespondentLinks;
    }

    /**
     * Sets the value of the allowPostRequestsForRespondentLinks property.
     * 
     */
    public void setAllowPostRequestsForRespondentLinks(boolean value) {
        this.allowPostRequestsForRespondentLinks = value;
    }

    /**
     * Gets the value of the enterprisePanelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterprisePanelId() {
        return enterprisePanelId;
    }

    /**
     * Sets the value of the enterprisePanelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterprisePanelId(String value) {
        this.enterprisePanelId = value;
    }

    /**
     * Gets the value of the useDbEncryption property.
     * 
     */
    public boolean isUseDbEncryption() {
        return useDbEncryption;
    }

    /**
     * Sets the value of the useDbEncryption property.
     * 
     */
    public void setUseDbEncryption(boolean value) {
        this.useDbEncryption = value;
    }

    /**
     * Gets the value of the optimisticQuotaTimeout property.
     * 
     */
    public int getOptimisticQuotaTimeout() {
        return optimisticQuotaTimeout;
    }

    /**
     * Sets the value of the optimisticQuotaTimeout property.
     * 
     */
    public void setOptimisticQuotaTimeout(int value) {
        this.optimisticQuotaTimeout = value;
    }

    /**
     * Gets the value of the overrideOptimisticQuotaTimeout property.
     * 
     */
    public boolean isOverrideOptimisticQuotaTimeout() {
        return overrideOptimisticQuotaTimeout;
    }

    /**
     * Sets the value of the overrideOptimisticQuotaTimeout property.
     * 
     */
    public void setOverrideOptimisticQuotaTimeout(boolean value) {
        this.overrideOptimisticQuotaTimeout = value;
    }

    /**
     * Gets the value of the useChangeTracking property.
     * 
     */
    public boolean isUseChangeTracking() {
        return useChangeTracking;
    }

    /**
     * Sets the value of the useChangeTracking property.
     * 
     */
    public void setUseChangeTracking(boolean value) {
        this.useChangeTracking = value;
    }

    /**
     * Gets the value of the hiddenInParticipation property.
     * 
     */
    public boolean isHiddenInParticipation() {
        return hiddenInParticipation;
    }

    /**
     * Sets the value of the hiddenInParticipation property.
     * 
     */
    public void setHiddenInParticipation(boolean value) {
        this.hiddenInParticipation = value;
    }

}
