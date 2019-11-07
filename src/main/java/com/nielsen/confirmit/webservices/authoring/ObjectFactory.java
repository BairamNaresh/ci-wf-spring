
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nielsen.confirmit.webservices.authoring package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OpenFormMinDate_QNAME = new QName("http://firmglobal.com/Confirmit/webservices/", "MinDate");
    private final static QName _OpenFormMaxDate_QNAME = new QName("http://firmglobal.com/Confirmit/webservices/", "MaxDate");
    private final static QName _SpecializedTextsText_QNAME = new QName("http://firmglobal.com/Confirmit/webservices/", "text");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nielsen.confirmit.webservices.authoring
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDatabaseLastCompiled }
     * 
     */
    public GetDatabaseLastCompiled createGetDatabaseLastCompiled() {
        return new GetDatabaseLastCompiled();
    }

    /**
     * Create an instance of {@link GetDatabaseLastCompiledResponse }
     * 
     */
    public GetDatabaseLastCompiledResponse createGetDatabaseLastCompiledResponse() {
        return new GetDatabaseLastCompiledResponse();
    }

    /**
     * Create an instance of {@link AddProjectFromTripleS }
     * 
     */
    public AddProjectFromTripleS createAddProjectFromTripleS() {
        return new AddProjectFromTripleS();
    }

    /**
     * Create an instance of {@link SssSchema }
     * 
     */
    public SssSchema createSssSchema() {
        return new SssSchema();
    }

    /**
     * Create an instance of {@link AddProjectFromTripleSResponse }
     * 
     */
    public AddProjectFromTripleSResponse createAddProjectFromTripleSResponse() {
        return new AddProjectFromTripleSResponse();
    }

    /**
     * Create an instance of {@link GetProjectList }
     * 
     */
    public GetProjectList createGetProjectList() {
        return new GetProjectList();
    }

    /**
     * Create an instance of {@link ProjectListToken }
     * 
     */
    public ProjectListToken createProjectListToken() {
        return new ProjectListToken();
    }

    /**
     * Create an instance of {@link GetProjectListResponse }
     * 
     */
    public GetProjectListResponse createGetProjectListResponse() {
        return new GetProjectListResponse();
    }

    /**
     * Create an instance of {@link ProjectListResultSet }
     * 
     */
    public ProjectListResultSet createProjectListResultSet() {
        return new ProjectListResultSet();
    }

    /**
     * Create an instance of {@link GetProjectListByProjectName }
     * 
     */
    public GetProjectListByProjectName createGetProjectListByProjectName() {
        return new GetProjectListByProjectName();
    }

    /**
     * Create an instance of {@link GetProjectListByProjectNameResponse }
     * 
     */
    public GetProjectListByProjectNameResponse createGetProjectListByProjectNameResponse() {
        return new GetProjectListByProjectNameResponse();
    }

    /**
     * Create an instance of {@link GetProjectListByCreator }
     * 
     */
    public GetProjectListByCreator createGetProjectListByCreator() {
        return new GetProjectListByCreator();
    }

    /**
     * Create an instance of {@link GetProjectListByCreatorResponse }
     * 
     */
    public GetProjectListByCreatorResponse createGetProjectListByCreatorResponse() {
        return new GetProjectListByCreatorResponse();
    }

    /**
     * Create an instance of {@link GetProjectListByKeywords }
     * 
     */
    public GetProjectListByKeywords createGetProjectListByKeywords() {
        return new GetProjectListByKeywords();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link GetProjectListByKeywordsResponse }
     * 
     */
    public GetProjectListByKeywordsResponse createGetProjectListByKeywordsResponse() {
        return new GetProjectListByKeywordsResponse();
    }

    /**
     * Create an instance of {@link GetProjectListByCreatedDate }
     * 
     */
    public GetProjectListByCreatedDate createGetProjectListByCreatedDate() {
        return new GetProjectListByCreatedDate();
    }

    /**
     * Create an instance of {@link GetProjectListByCreatedDateResponse }
     * 
     */
    public GetProjectListByCreatedDateResponse createGetProjectListByCreatedDateResponse() {
        return new GetProjectListByCreatedDateResponse();
    }

    /**
     * Create an instance of {@link AddProject }
     * 
     */
    public AddProject createAddProject() {
        return new AddProject();
    }

    /**
     * Create an instance of {@link AddProjectResponse }
     * 
     */
    public AddProjectResponse createAddProjectResponse() {
        return new AddProjectResponse();
    }

    /**
     * Create an instance of {@link DeleteProject }
     * 
     */
    public DeleteProject createDeleteProject() {
        return new DeleteProject();
    }

    /**
     * Create an instance of {@link DeleteProjectResponse }
     * 
     */
    public DeleteProjectResponse createDeleteProjectResponse() {
        return new DeleteProjectResponse();
    }

    /**
     * Create an instance of {@link DuplicateProject }
     * 
     */
    public DuplicateProject createDuplicateProject() {
        return new DuplicateProject();
    }

    /**
     * Create an instance of {@link DuplicateProjectResponse }
     * 
     */
    public DuplicateProjectResponse createDuplicateProjectResponse() {
        return new DuplicateProjectResponse();
    }

    /**
     * Create an instance of {@link SetCustomProjectInfoField }
     * 
     */
    public SetCustomProjectInfoField createSetCustomProjectInfoField() {
        return new SetCustomProjectInfoField();
    }

    /**
     * Create an instance of {@link SetCustomProjectInfoFieldResponse }
     * 
     */
    public SetCustomProjectInfoFieldResponse createSetCustomProjectInfoFieldResponse() {
        return new SetCustomProjectInfoFieldResponse();
    }

    /**
     * Create an instance of {@link GetCustomProjectInfoField }
     * 
     */
    public GetCustomProjectInfoField createGetCustomProjectInfoField() {
        return new GetCustomProjectInfoField();
    }

    /**
     * Create an instance of {@link GetCustomProjectInfoFieldResponse }
     * 
     */
    public GetCustomProjectInfoFieldResponse createGetCustomProjectInfoFieldResponse() {
        return new GetCustomProjectInfoFieldResponse();
    }

    /**
     * Create an instance of {@link GetProjectInfo }
     * 
     */
    public GetProjectInfo createGetProjectInfo() {
        return new GetProjectInfo();
    }

    /**
     * Create an instance of {@link GetProjectInfoResponse }
     * 
     */
    public GetProjectInfoResponse createGetProjectInfoResponse() {
        return new GetProjectInfoResponse();
    }

    /**
     * Create an instance of {@link SurveySchema }
     * 
     */
    public SurveySchema createSurveySchema() {
        return new SurveySchema();
    }

    /**
     * Create an instance of {@link GetQuestionnaire }
     * 
     */
    public GetQuestionnaire createGetQuestionnaire() {
        return new GetQuestionnaire();
    }

    /**
     * Create an instance of {@link GetQuestionnaireResponse }
     * 
     */
    public GetQuestionnaireResponse createGetQuestionnaireResponse() {
        return new GetQuestionnaireResponse();
    }

    /**
     * Create an instance of {@link GetFilteredQuestionnaire }
     * 
     */
    public GetFilteredQuestionnaire createGetFilteredQuestionnaire() {
        return new GetFilteredQuestionnaire();
    }

    /**
     * Create an instance of {@link PoetReadFilter }
     * 
     */
    public PoetReadFilter createPoetReadFilter() {
        return new PoetReadFilter();
    }

    /**
     * Create an instance of {@link GetFilteredQuestionnaireResponse }
     * 
     */
    public GetFilteredQuestionnaireResponse createGetFilteredQuestionnaireResponse() {
        return new GetFilteredQuestionnaireResponse();
    }

    /**
     * Create an instance of {@link ExportSurvey }
     * 
     */
    public ExportSurvey createExportSurvey() {
        return new ExportSurvey();
    }

    /**
     * Create an instance of {@link ExportSurveyResponse }
     * 
     */
    public ExportSurveyResponse createExportSurveyResponse() {
        return new ExportSurveyResponse();
    }

    /**
     * Create an instance of {@link ExportSurveyLayout }
     * 
     */
    public ExportSurveyLayout createExportSurveyLayout() {
        return new ExportSurveyLayout();
    }

    /**
     * Create an instance of {@link ExportSurveyLayoutResponse }
     * 
     */
    public ExportSurveyLayoutResponse createExportSurveyLayoutResponse() {
        return new ExportSurveyLayoutResponse();
    }

    /**
     * Create an instance of {@link ExportSurveyWithHTMLRemoved }
     * 
     */
    public ExportSurveyWithHTMLRemoved createExportSurveyWithHTMLRemoved() {
        return new ExportSurveyWithHTMLRemoved();
    }

    /**
     * Create an instance of {@link ExportSurveyWithHTMLRemovedResponse }
     * 
     */
    public ExportSurveyWithHTMLRemovedResponse createExportSurveyWithHTMLRemovedResponse() {
        return new ExportSurveyWithHTMLRemovedResponse();
    }

    /**
     * Create an instance of {@link ImportSurvey }
     * 
     */
    public ImportSurvey createImportSurvey() {
        return new ImportSurvey();
    }

    /**
     * Create an instance of {@link ImportSurveyResponse }
     * 
     */
    public ImportSurveyResponse createImportSurveyResponse() {
        return new ImportSurveyResponse();
    }

    /**
     * Create an instance of {@link ImportTranslation }
     * 
     */
    public ImportTranslation createImportTranslation() {
        return new ImportTranslation();
    }

    /**
     * Create an instance of {@link ImportTranslationResponse }
     * 
     */
    public ImportTranslationResponse createImportTranslationResponse() {
        return new ImportTranslationResponse();
    }

    /**
     * Create an instance of {@link ExportTranslation }
     * 
     */
    public ExportTranslation createExportTranslation() {
        return new ExportTranslation();
    }

    /**
     * Create an instance of {@link ExportTranslationResponse }
     * 
     */
    public ExportTranslationResponse createExportTranslationResponse() {
        return new ExportTranslationResponse();
    }

    /**
     * Create an instance of {@link GetPredefinedLists }
     * 
     */
    public GetPredefinedLists createGetPredefinedLists() {
        return new GetPredefinedLists();
    }

    /**
     * Create an instance of {@link ReadFilterSimple }
     * 
     */
    public ReadFilterSimple createReadFilterSimple() {
        return new ReadFilterSimple();
    }

    /**
     * Create an instance of {@link GetPredefinedListsResponse }
     * 
     */
    public GetPredefinedListsResponse createGetPredefinedListsResponse() {
        return new GetPredefinedListsResponse();
    }

    /**
     * Create an instance of {@link GetPredefinedList }
     * 
     */
    public GetPredefinedList createGetPredefinedList() {
        return new GetPredefinedList();
    }

    /**
     * Create an instance of {@link GetPredefinedListResponse }
     * 
     */
    public GetPredefinedListResponse createGetPredefinedListResponse() {
        return new GetPredefinedListResponse();
    }

    /**
     * Create an instance of {@link GetQuotas }
     * 
     */
    public GetQuotas createGetQuotas() {
        return new GetQuotas();
    }

    /**
     * Create an instance of {@link GetQuotasResponse }
     * 
     */
    public GetQuotasResponse createGetQuotasResponse() {
        return new GetQuotasResponse();
    }

    /**
     * Create an instance of {@link GetQuota }
     * 
     */
    public GetQuota createGetQuota() {
        return new GetQuota();
    }

    /**
     * Create an instance of {@link GetQuotaResponse }
     * 
     */
    public GetQuotaResponse createGetQuotaResponse() {
        return new GetQuotaResponse();
    }

    /**
     * Create an instance of {@link DeleteRouting }
     * 
     */
    public DeleteRouting createDeleteRouting() {
        return new DeleteRouting();
    }

    /**
     * Create an instance of {@link DeleteRoutingResponse }
     * 
     */
    public DeleteRoutingResponse createDeleteRoutingResponse() {
        return new DeleteRoutingResponse();
    }

    /**
     * Create an instance of {@link DeleteQuestionnaire }
     * 
     */
    public DeleteQuestionnaire createDeleteQuestionnaire() {
        return new DeleteQuestionnaire();
    }

    /**
     * Create an instance of {@link DeleteQuestionnaireResponse }
     * 
     */
    public DeleteQuestionnaireResponse createDeleteQuestionnaireResponse() {
        return new DeleteQuestionnaireResponse();
    }

    /**
     * Create an instance of {@link GetFormByName }
     * 
     */
    public GetFormByName createGetFormByName() {
        return new GetFormByName();
    }

    /**
     * Create an instance of {@link GetFormByNameResponse }
     * 
     */
    public GetFormByNameResponse createGetFormByNameResponse() {
        return new GetFormByNameResponse();
    }

    /**
     * Create an instance of {@link GetForm }
     * 
     */
    public GetForm createGetForm() {
        return new GetForm();
    }

    /**
     * Create an instance of {@link GetFormResponse }
     * 
     */
    public GetFormResponse createGetFormResponse() {
        return new GetFormResponse();
    }

    /**
     * Create an instance of {@link GetNode }
     * 
     */
    public GetNode createGetNode() {
        return new GetNode();
    }

    /**
     * Create an instance of {@link GetNodeResponse }
     * 
     */
    public GetNodeResponse createGetNodeResponse() {
        return new GetNodeResponse();
    }

    /**
     * Create an instance of {@link GetNodes }
     * 
     */
    public GetNodes createGetNodes() {
        return new GetNodes();
    }

    /**
     * Create an instance of {@link GetNodesResponse }
     * 
     */
    public GetNodesResponse createGetNodesResponse() {
        return new GetNodesResponse();
    }

    /**
     * Create an instance of {@link GetFormsInLoop }
     * 
     */
    public GetFormsInLoop createGetFormsInLoop() {
        return new GetFormsInLoop();
    }

    /**
     * Create an instance of {@link ReadFilter }
     * 
     */
    public ReadFilter createReadFilter() {
        return new ReadFilter();
    }

    /**
     * Create an instance of {@link GetFormsInLoopResponse }
     * 
     */
    public GetFormsInLoopResponse createGetFormsInLoopResponse() {
        return new GetFormsInLoopResponse();
    }

    /**
     * Create an instance of {@link GetLoopStructure }
     * 
     */
    public GetLoopStructure createGetLoopStructure() {
        return new GetLoopStructure();
    }

    /**
     * Create an instance of {@link GetLoopStructureResponse }
     * 
     */
    public GetLoopStructureResponse createGetLoopStructureResponse() {
        return new GetLoopStructureResponse();
    }

    /**
     * Create an instance of {@link GetConditionBranch }
     * 
     */
    public GetConditionBranch createGetConditionBranch() {
        return new GetConditionBranch();
    }

    /**
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
    }

    /**
     * Create an instance of {@link GetConditionBranchResponse }
     * 
     */
    public GetConditionBranchResponse createGetConditionBranchResponse() {
        return new GetConditionBranchResponse();
    }

    /**
     * Create an instance of {@link GetRouting }
     * 
     */
    public GetRouting createGetRouting() {
        return new GetRouting();
    }

    /**
     * Create an instance of {@link GetRoutingResponse }
     * 
     */
    public GetRoutingResponse createGetRoutingResponse() {
        return new GetRoutingResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link GetSurveyStatus }
     * 
     */
    public GetSurveyStatus createGetSurveyStatus() {
        return new GetSurveyStatus();
    }

    /**
     * Create an instance of {@link GetSurveyStatusResponse }
     * 
     */
    public GetSurveyStatusResponse createGetSurveyStatusResponse() {
        return new GetSurveyStatusResponse();
    }

    /**
     * Create an instance of {@link SetSurveyStatus }
     * 
     */
    public SetSurveyStatus createSetSurveyStatus() {
        return new SetSurveyStatus();
    }

    /**
     * Create an instance of {@link SetSurveyStatusResponse }
     * 
     */
    public SetSurveyStatusResponse createSetSurveyStatusResponse() {
        return new SetSurveyStatusResponse();
    }

    /**
     * Create an instance of {@link GetExternalAnswers }
     * 
     */
    public GetExternalAnswers createGetExternalAnswers() {
        return new GetExternalAnswers();
    }

    /**
     * Create an instance of {@link GetExternalAnswersResponse }
     * 
     */
    public GetExternalAnswersResponse createGetExternalAnswersResponse() {
        return new GetExternalAnswersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAnswerBase }
     * 
     */
    public ArrayOfAnswerBase createArrayOfAnswerBase() {
        return new ArrayOfAnswerBase();
    }

    /**
     * Create an instance of {@link ProjectExists }
     * 
     */
    public ProjectExists createProjectExists() {
        return new ProjectExists();
    }

    /**
     * Create an instance of {@link ProjectExistsResponse }
     * 
     */
    public ProjectExistsResponse createProjectExistsResponse() {
        return new ProjectExistsResponse();
    }

    /**
     * Create an instance of {@link GetBenchmarkProjectIds }
     * 
     */
    public GetBenchmarkProjectIds createGetBenchmarkProjectIds() {
        return new GetBenchmarkProjectIds();
    }

    /**
     * Create an instance of {@link GetBenchmarkProjectIdsResponse }
     * 
     */
    public GetBenchmarkProjectIdsResponse createGetBenchmarkProjectIdsResponse() {
        return new GetBenchmarkProjectIdsResponse();
    }

    /**
     * Create an instance of {@link GetProjectEmailObjects }
     * 
     */
    public GetProjectEmailObjects createGetProjectEmailObjects() {
        return new GetProjectEmailObjects();
    }

    /**
     * Create an instance of {@link GetProjectEmailObjectsResponse }
     * 
     */
    public GetProjectEmailObjectsResponse createGetProjectEmailObjectsResponse() {
        return new GetProjectEmailObjectsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEmailObject }
     * 
     */
    public ArrayOfEmailObject createArrayOfEmailObject() {
        return new ArrayOfEmailObject();
    }

    /**
     * Create an instance of {@link SssSurvey }
     * 
     */
    public SssSurvey createSssSurvey() {
        return new SssSurvey();
    }

    /**
     * Create an instance of {@link SpecializedTexts }
     * 
     */
    public SpecializedTexts createSpecializedTexts() {
        return new SpecializedTexts();
    }

    /**
     * Create an instance of {@link SssText }
     * 
     */
    public SssText createSssText() {
        return new SssText();
    }

    /**
     * Create an instance of {@link SssRecord }
     * 
     */
    public SssRecord createSssRecord() {
        return new SssRecord();
    }

    /**
     * Create an instance of {@link SssVariable }
     * 
     */
    public SssVariable createSssVariable() {
        return new SssVariable();
    }

    /**
     * Create an instance of {@link SssPosition }
     * 
     */
    public SssPosition createSssPosition() {
        return new SssPosition();
    }

    /**
     * Create an instance of {@link SssSpread }
     * 
     */
    public SssSpread createSssSpread() {
        return new SssSpread();
    }

    /**
     * Create an instance of {@link ArrayOfChoice1 }
     * 
     */
    public ArrayOfChoice1 createArrayOfChoice1() {
        return new ArrayOfChoice1();
    }

    /**
     * Create an instance of {@link SssRange }
     * 
     */
    public SssRange createSssRange() {
        return new SssRange();
    }

    /**
     * Create an instance of {@link SssValue }
     * 
     */
    public SssValue createSssValue() {
        return new SssValue();
    }

    /**
     * Create an instance of {@link SssHierarchy }
     * 
     */
    public SssHierarchy createSssHierarchy() {
        return new SssHierarchy();
    }

    /**
     * Create an instance of {@link SssLevel }
     * 
     */
    public SssLevel createSssLevel() {
        return new SssLevel();
    }

    /**
     * Create an instance of {@link SssParent }
     * 
     */
    public SssParent createSssParent() {
        return new SssParent();
    }

    /**
     * Create an instance of {@link SssQuantum }
     * 
     */
    public SssQuantum createSssQuantum() {
        return new SssQuantum();
    }

    /**
     * Create an instance of {@link ProjectList }
     * 
     */
    public ProjectList createProjectList() {
        return new ProjectList();
    }

    /**
     * Create an instance of {@link ArrayOfProject }
     * 
     */
    public ArrayOfProject createArrayOfProject() {
        return new ArrayOfProject();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link ArrayOfNodeType }
     * 
     */
    public ArrayOfNodeType createArrayOfNodeType() {
        return new ArrayOfNodeType();
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link PredefinedList }
     * 
     */
    public PredefinedList createPredefinedList() {
        return new PredefinedList();
    }

    /**
     * Create an instance of {@link ArrayOfChoice15 }
     * 
     */
    public ArrayOfChoice15 createArrayOfChoice15() {
        return new ArrayOfChoice15();
    }

    /**
     * Create an instance of {@link HeaderAnswer }
     * 
     */
    public HeaderAnswer createHeaderAnswer() {
        return new HeaderAnswer();
    }

    /**
     * Create an instance of {@link LoopMember }
     * 
     */
    public LoopMember createLoopMember() {
        return new LoopMember();
    }

    /**
     * Create an instance of {@link ArrayOfAnswerText }
     * 
     */
    public ArrayOfAnswerText createArrayOfAnswerText() {
        return new ArrayOfAnswerText();
    }

    /**
     * Create an instance of {@link AnswerText }
     * 
     */
    public AnswerText createAnswerText() {
        return new AnswerText();
    }

    /**
     * Create an instance of {@link HeaderAnswerEnd }
     * 
     */
    public HeaderAnswerEnd createHeaderAnswerEnd() {
        return new HeaderAnswerEnd();
    }

    /**
     * Create an instance of {@link LoopLevelReference }
     * 
     */
    public LoopLevelReference createLoopLevelReference() {
        return new LoopLevelReference();
    }

    /**
     * Create an instance of {@link HieararchyAnswer }
     * 
     */
    public HieararchyAnswer createHieararchyAnswer() {
        return new HieararchyAnswer();
    }

    /**
     * Create an instance of {@link ArrayOfHierarchyNode }
     * 
     */
    public ArrayOfHierarchyNode createArrayOfHierarchyNode() {
        return new ArrayOfHierarchyNode();
    }

    /**
     * Create an instance of {@link HierarchyNode }
     * 
     */
    public HierarchyNode createHierarchyNode() {
        return new HierarchyNode();
    }

    /**
     * Create an instance of {@link HierarchyLevel }
     * 
     */
    public HierarchyLevel createHierarchyLevel() {
        return new HierarchyLevel();
    }

    /**
     * Create an instance of {@link Predefined }
     * 
     */
    public Predefined createPredefined() {
        return new Predefined();
    }

    /**
     * Create an instance of {@link GridAnswer }
     * 
     */
    public GridAnswer createGridAnswer() {
        return new GridAnswer();
    }

    /**
     * Create an instance of {@link ArrayOfGridAnswerText }
     * 
     */
    public ArrayOfGridAnswerText createArrayOfGridAnswerText() {
        return new ArrayOfGridAnswerText();
    }

    /**
     * Create an instance of {@link GridAnswerText }
     * 
     */
    public GridAnswerText createGridAnswerText() {
        return new GridAnswerText();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link AdditionalColumnAnswer }
     * 
     */
    public AdditionalColumnAnswer createAdditionalColumnAnswer() {
        return new AdditionalColumnAnswer();
    }

    /**
     * Create an instance of {@link ArrayOfTranslationStatus }
     * 
     */
    public ArrayOfTranslationStatus createArrayOfTranslationStatus() {
        return new ArrayOfTranslationStatus();
    }

    /**
     * Create an instance of {@link TranslationStatus }
     * 
     */
    public TranslationStatus createTranslationStatus() {
        return new TranslationStatus();
    }

    /**
     * Create an instance of {@link ProjectInfo }
     * 
     */
    public ProjectInfo createProjectInfo() {
        return new ProjectInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString7 }
     * 
     */
    public ArrayOfLanguageString7 createArrayOfLanguageString7() {
        return new ArrayOfLanguageString7();
    }

    /**
     * Create an instance of {@link LanguageString }
     * 
     */
    public LanguageString createLanguageString() {
        return new LanguageString();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString8 }
     * 
     */
    public ArrayOfLanguageString8 createArrayOfLanguageString8() {
        return new ArrayOfLanguageString8();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString9 }
     * 
     */
    public ArrayOfLanguageString9 createArrayOfLanguageString9() {
        return new ArrayOfLanguageString9();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString10 }
     * 
     */
    public ArrayOfLanguageString10 createArrayOfLanguageString10() {
        return new ArrayOfLanguageString10();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString11 }
     * 
     */
    public ArrayOfLanguageString11 createArrayOfLanguageString11() {
        return new ArrayOfLanguageString11();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString12 }
     * 
     */
    public ArrayOfLanguageString12 createArrayOfLanguageString12() {
        return new ArrayOfLanguageString12();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString13 }
     * 
     */
    public ArrayOfLanguageString13 createArrayOfLanguageString13() {
        return new ArrayOfLanguageString13();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString14 }
     * 
     */
    public ArrayOfLanguageString14 createArrayOfLanguageString14() {
        return new ArrayOfLanguageString14();
    }

    /**
     * Create an instance of {@link ArrayOfCustomResource }
     * 
     */
    public ArrayOfCustomResource createArrayOfCustomResource() {
        return new ArrayOfCustomResource();
    }

    /**
     * Create an instance of {@link CustomResource }
     * 
     */
    public CustomResource createCustomResource() {
        return new CustomResource();
    }

    /**
     * Create an instance of {@link ArrayOfLangSpecString }
     * 
     */
    public ArrayOfLangSpecString createArrayOfLangSpecString() {
        return new ArrayOfLangSpecString();
    }

    /**
     * Create an instance of {@link LangSpecString }
     * 
     */
    public LangSpecString createLangSpecString() {
        return new LangSpecString();
    }

    /**
     * Create an instance of {@link Questionnaire }
     * 
     */
    public Questionnaire createQuestionnaire() {
        return new Questionnaire();
    }

    /**
     * Create an instance of {@link ArrayOfPredefinedList }
     * 
     */
    public ArrayOfPredefinedList createArrayOfPredefinedList() {
        return new ArrayOfPredefinedList();
    }

    /**
     * Create an instance of {@link ArrayOfEmail }
     * 
     */
    public ArrayOfEmail createArrayOfEmail() {
        return new ArrayOfEmail();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link ArrayOfFormText }
     * 
     */
    public ArrayOfFormText createArrayOfFormText() {
        return new ArrayOfFormText();
    }

    /**
     * Create an instance of {@link FormText }
     * 
     */
    public FormText createFormText() {
        return new FormText();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link MultiForm }
     * 
     */
    public MultiForm createMultiForm() {
        return new MultiForm();
    }

    /**
     * Create an instance of {@link ArrayOfChoice6 }
     * 
     */
    public ArrayOfChoice6 createArrayOfChoice6() {
        return new ArrayOfChoice6();
    }

    /**
     * Create an instance of {@link IncludeExcludeWithPrecodes }
     * 
     */
    public IncludeExcludeWithPrecodes createIncludeExcludeWithPrecodes() {
        return new IncludeExcludeWithPrecodes();
    }

    /**
     * Create an instance of {@link RandomCategorySelection }
     * 
     */
    public RandomCategorySelection createRandomCategorySelection() {
        return new RandomCategorySelection();
    }

    /**
     * Create an instance of {@link Redirect }
     * 
     */
    public Redirect createRedirect() {
        return new Redirect();
    }

    /**
     * Create an instance of {@link IncludeExclude }
     * 
     */
    public IncludeExclude createIncludeExclude() {
        return new IncludeExclude();
    }

    /**
     * Create an instance of {@link AssignRequestValues }
     * 
     */
    public AssignRequestValues createAssignRequestValues() {
        return new AssignRequestValues();
    }

    /**
     * Create an instance of {@link MaskOnQuestion }
     * 
     */
    public MaskOnQuestion createMaskOnQuestion() {
        return new MaskOnQuestion();
    }

    /**
     * Create an instance of {@link OpenForm }
     * 
     */
    public OpenForm createOpenForm() {
        return new OpenForm();
    }

    /**
     * Create an instance of {@link GridForm }
     * 
     */
    public GridForm createGridForm() {
        return new GridForm();
    }

    /**
     * Create an instance of {@link ArrayOfChoice4 }
     * 
     */
    public ArrayOfChoice4 createArrayOfChoice4() {
        return new ArrayOfChoice4();
    }

    /**
     * Create an instance of {@link ArrayOfChoice5 }
     * 
     */
    public ArrayOfChoice5 createArrayOfChoice5() {
        return new ArrayOfChoice5();
    }

    /**
     * Create an instance of {@link SingleForm }
     * 
     */
    public SingleForm createSingleForm() {
        return new SingleForm();
    }

    /**
     * Create an instance of {@link ArrayOfChoice3 }
     * 
     */
    public ArrayOfChoice3 createArrayOfChoice3() {
        return new ArrayOfChoice3();
    }

    /**
     * Create an instance of {@link Hierarchy }
     * 
     */
    public Hierarchy createHierarchy() {
        return new Hierarchy();
    }

    /**
     * Create an instance of {@link CustomTable }
     * 
     */
    public CustomTable createCustomTable() {
        return new CustomTable();
    }

    /**
     * Create an instance of {@link ArrayOfHierarchyElement }
     * 
     */
    public ArrayOfHierarchyElement createArrayOfHierarchyElement() {
        return new ArrayOfHierarchyElement();
    }

    /**
     * Create an instance of {@link HierarchyElement }
     * 
     */
    public HierarchyElement createHierarchyElement() {
        return new HierarchyElement();
    }

    /**
     * Create an instance of {@link Grid3DForm }
     * 
     */
    public Grid3DForm createGrid3DForm() {
        return new Grid3DForm();
    }

    /**
     * Create an instance of {@link ArrayOfChoice7 }
     * 
     */
    public ArrayOfChoice7 createArrayOfChoice7() {
        return new ArrayOfChoice7();
    }

    /**
     * Create an instance of {@link ArrayOfChoice8 }
     * 
     */
    public ArrayOfChoice8 createArrayOfChoice8() {
        return new ArrayOfChoice8();
    }

    /**
     * Create an instance of {@link InfoForm }
     * 
     */
    public InfoForm createInfoForm() {
        return new InfoForm();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     */
    public Folder createFolder() {
        return new Folder();
    }

    /**
     * Create an instance of {@link ArrayOfChoice10 }
     * 
     */
    public ArrayOfChoice10 createArrayOfChoice10() {
        return new ArrayOfChoice10();
    }

    /**
     * Create an instance of {@link Script }
     * 
     */
    public Script createScript() {
        return new Script();
    }

    /**
     * Create an instance of {@link ArrayOfChoice11 }
     * 
     */
    public ArrayOfChoice11 createArrayOfChoice11() {
        return new ArrayOfChoice11();
    }

    /**
     * Create an instance of {@link Directive }
     * 
     */
    public Directive createDirective() {
        return new Directive();
    }

    /**
     * Create an instance of {@link Page }
     * 
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link ArrayOfChoice9 }
     * 
     */
    public ArrayOfChoice9 createArrayOfChoice9() {
        return new ArrayOfChoice9();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString2 }
     * 
     */
    public ArrayOfLanguageString2 createArrayOfLanguageString2() {
        return new ArrayOfLanguageString2();
    }

    /**
     * Create an instance of {@link Stop }
     * 
     */
    public Stop createStop() {
        return new Stop();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString }
     * 
     */
    public ArrayOfLanguageString createArrayOfLanguageString() {
        return new ArrayOfLanguageString();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString1 }
     * 
     */
    public ArrayOfLanguageString1 createArrayOfLanguageString1() {
        return new ArrayOfLanguageString1();
    }

    /**
     * Create an instance of {@link CallBlock }
     * 
     */
    public CallBlock createCallBlock() {
        return new CallBlock();
    }

    /**
     * Create an instance of {@link Block }
     * 
     */
    public Block createBlock() {
        return new Block();
    }

    /**
     * Create an instance of {@link ArrayOfChoice13 }
     * 
     */
    public ArrayOfChoice13 createArrayOfChoice13() {
        return new ArrayOfChoice13();
    }

    /**
     * Create an instance of {@link Loop }
     * 
     */
    public Loop createLoop() {
        return new Loop();
    }

    /**
     * Create an instance of {@link ArrayOfChoice2 }
     * 
     */
    public ArrayOfChoice2 createArrayOfChoice2() {
        return new ArrayOfChoice2();
    }

    /**
     * Create an instance of {@link ArrayOfChoice14 }
     * 
     */
    public ArrayOfChoice14 createArrayOfChoice14() {
        return new ArrayOfChoice14();
    }

    /**
     * Create an instance of {@link Telephone }
     * 
     */
    public Telephone createTelephone() {
        return new Telephone();
    }

    /**
     * Create an instance of {@link DialCommand }
     * 
     */
    public DialCommand createDialCommand() {
        return new DialCommand();
    }

    /**
     * Create an instance of {@link ArrayOfCommandText }
     * 
     */
    public ArrayOfCommandText createArrayOfCommandText() {
        return new ArrayOfCommandText();
    }

    /**
     * Create an instance of {@link CommandText }
     * 
     */
    public CommandText createCommandText() {
        return new CommandText();
    }

    /**
     * Create an instance of {@link AllowIgnoreDialingCommand }
     * 
     */
    public AllowIgnoreDialingCommand createAllowIgnoreDialingCommand() {
        return new AllowIgnoreDialingCommand();
    }

    /**
     * Create an instance of {@link HangupCommand }
     * 
     */
    public HangupCommand createHangupCommand() {
        return new HangupCommand();
    }

    /**
     * Create an instance of {@link ArrayOfChoice12 }
     * 
     */
    public ArrayOfChoice12 createArrayOfChoice12() {
        return new ArrayOfChoice12();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString3 }
     * 
     */
    public ArrayOfLanguageString3 createArrayOfLanguageString3() {
        return new ArrayOfLanguageString3();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString4 }
     * 
     */
    public ArrayOfLanguageString4 createArrayOfLanguageString4() {
        return new ArrayOfLanguageString4();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString5 }
     * 
     */
    public ArrayOfLanguageString5 createArrayOfLanguageString5() {
        return new ArrayOfLanguageString5();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString6 }
     * 
     */
    public ArrayOfLanguageString6 createArrayOfLanguageString6() {
        return new ArrayOfLanguageString6();
    }

    /**
     * Create an instance of {@link ArrayOfChoice16 }
     * 
     */
    public ArrayOfChoice16 createArrayOfChoice16() {
        return new ArrayOfChoice16();
    }

    /**
     * Create an instance of {@link ArrayOfBlock }
     * 
     */
    public ArrayOfBlock createArrayOfBlock() {
        return new ArrayOfBlock();
    }

    /**
     * Create an instance of {@link ArrayOfQuota }
     * 
     */
    public ArrayOfQuota createArrayOfQuota() {
        return new ArrayOfQuota();
    }

    /**
     * Create an instance of {@link Quota }
     * 
     */
    public Quota createQuota() {
        return new Quota();
    }

    /**
     * Create an instance of {@link ArrayOfFormReference }
     * 
     */
    public ArrayOfFormReference createArrayOfFormReference() {
        return new ArrayOfFormReference();
    }

    /**
     * Create an instance of {@link FormReference }
     * 
     */
    public FormReference createFormReference() {
        return new FormReference();
    }

    /**
     * Create an instance of {@link ArrayOfChoice17 }
     * 
     */
    public ArrayOfChoice17 createArrayOfChoice17() {
        return new ArrayOfChoice17();
    }

    /**
     * Create an instance of {@link EmailObject }
     * 
     */
    public EmailObject createEmailObject() {
        return new EmailObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://firmglobal.com/Confirmit/webservices/", name = "MinDate", scope = OpenForm.class)
    public JAXBElement<XMLGregorianCalendar> createOpenFormMinDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpenFormMinDate_QNAME, XMLGregorianCalendar.class, OpenForm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://firmglobal.com/Confirmit/webservices/", name = "MaxDate", scope = OpenForm.class)
    public JAXBElement<XMLGregorianCalendar> createOpenFormMaxDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpenFormMaxDate_QNAME, XMLGregorianCalendar.class, OpenForm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SssText }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SssText }{@code >}
     */
    @XmlElementDecl(namespace = "http://firmglobal.com/Confirmit/webservices/", name = "text", scope = SpecializedTexts.class)
    public JAXBElement<SssText> createSpecializedTextsText(SssText value) {
        return new JAXBElement<SssText>(_SpecializedTextsText_QNAME, SssText.class, SpecializedTexts.class, value);
    }

}
