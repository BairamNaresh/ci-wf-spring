package com.nielsen.confirmit.client;

import com.nielsen.confirmit.webservices.authoring.*;
import com.nielsen.confirmit.webservices.logon.LogOnUser;
import com.nielsen.confirmit.webservices.logon.LogOnUserResponse;
import com.nielsen.confirmit.webservices.surveydata.GetDataByProject;
import com.nielsen.confirmit.webservices.surveydata.GetDataByProjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;

@Service
public class ConfirmItClient {

    @Value("${spring.confirmit.webservices.endpoint}")
    private String webServicesEndpoint;

    @Value("${spring.confirmit.webservices.soapaction.endpoint}")
    private String soapactionEndpoint;

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public LogOnUserResponse logOn(LogOnUser logOnUser) {
        return (LogOnUserResponse) webServiceTemplate.
                marshalSendAndReceive(webServicesEndpoint + "logon.asmx", logOnUser);
    }

    public GetSurveyStatusResponse getSurveyStatus(GetSurveyStatus getSurveyStatus) {
        return (GetSurveyStatusResponse) webServiceTemplate.
                marshalSendAndReceive(webServicesEndpoint + "Authoring.asmx", getSurveyStatus,
                        (message) -> ((SoapMessage) message).setSoapAction(soapactionEndpoint + "GetSurveyStatus"));
    }

    public GetProjectListByProjectNameResponse getProjectListByProjectName(GetProjectListByProjectName getProjectListByProjectName) {
        return (GetProjectListByProjectNameResponse) webServiceTemplate.
                marshalSendAndReceive(webServicesEndpoint + "Authoring.asmx", getProjectListByProjectName,
                        (message) -> ((SoapMessage) message).setSoapAction(soapactionEndpoint + "GetProjectListByProjectName"));
    }

    public GetProjectListResponse getProjectList(GetProjectList getProjectList) {
        return (GetProjectListResponse) webServiceTemplate.
                marshalSendAndReceive(webServicesEndpoint + "Authoring.asmx", getProjectList,
                        (message) -> ((SoapMessage) message).setSoapAction(soapactionEndpoint + "GetProjectList"));
    }

    public GetDataByProjectResponse getDataByProject(GetDataByProject getDataByProject) {
        return (GetDataByProjectResponse) webServiceTemplate.
                marshalSendAndReceive(webServicesEndpoint + "surveydata.asmx", getDataByProject,
                        (message) -> ((SoapMessage) message).setSoapAction(soapactionEndpoint + "GetDataByProject"));
    }

    public GetQuestionnaireResponse getQuestionnaire(GetQuestionnaire getQuestionnaire) {
        return (GetQuestionnaireResponse) webServiceTemplate.
                marshalSendAndReceive(webServicesEndpoint + "Authoring.asmx", getQuestionnaire,
                        (message) -> ((SoapMessage) message).setSoapAction(soapactionEndpoint + "GetQuestionnaire"));
    }

    public GetProjectInfoResponse getProjectInfo(GetProjectInfo getProjectInfo){
        return (GetProjectInfoResponse)webServiceTemplate.marshalSendAndReceive(webServicesEndpoint + "", getProjectInfo,
                (message) -> ((SoapMessage)message).setSoapAction(soapactionEndpoint + "getProjectInfo"));
    }
}
