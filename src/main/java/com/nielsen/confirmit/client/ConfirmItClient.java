package com.nielsen.confirmit.client;

import com.nielsen.confirmit.webservices.authoring.GetProjectListByProjectName;
import com.nielsen.confirmit.webservices.authoring.GetProjectListByProjectNameResponse;
import com.nielsen.confirmit.webservices.authoring.GetSurveyStatus;
import com.nielsen.confirmit.webservices.authoring.GetSurveyStatusResponse;
import com.nielsen.confirmit.webservices.logon.LogOnUser;
import com.nielsen.confirmit.webservices.logon.LogOnUserResponse;
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

}
