package com.nielsen.confirmit.controller;

import com.nielsen.confirmit.client.ConfirmItClient;
import com.nielsen.confirmit.webservices.authoring.GetProjectListByProjectName;
import com.nielsen.confirmit.webservices.authoring.GetProjectListByProjectNameResponse;
import com.nielsen.confirmit.webservices.authoring.GetSurveyStatus;
import com.nielsen.confirmit.webservices.authoring.GetSurveyStatusResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("survey")
public class SurveyController {

    @Autowired
    ConfirmItClient confirmItClient;

    @PostMapping("/getSurveyStatus")
    public GetSurveyStatusResponse invokeConfimItClientToGetSurveyStatus(@RequestBody GetSurveyStatus getSurveyStatus) {
        return confirmItClient.getSurveyStatus(getSurveyStatus);
    }

    @PostMapping("/getProjectListByProjectName")
    public GetProjectListByProjectNameResponse invokeConfimItClientToGetSurveyStatus(@RequestBody GetProjectListByProjectName getProjectListByProjectName) {
        return confirmItClient.getProjectListByProjectName(getProjectListByProjectName);
    }
}
