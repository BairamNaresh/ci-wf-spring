package com.nielsen.confirmit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nielsen.confirmit.client.ConfirmItClient;
import com.nielsen.confirmit.webservices.authoring.GetProjectInfo;
import com.nielsen.confirmit.webservices.authoring.GetProjectInfoResponse;
import com.nielsen.confirmit.webservices.authoring.GetProjectList;
import com.nielsen.confirmit.webservices.authoring.GetProjectListByProjectName;
import com.nielsen.confirmit.webservices.authoring.GetProjectListByProjectNameResponse;
import com.nielsen.confirmit.webservices.authoring.GetProjectListResponse;
import com.nielsen.confirmit.webservices.authoring.GetSurveyStatus;
import com.nielsen.confirmit.webservices.authoring.GetSurveyStatusResponse;

@RestController
@RequestMapping("/authoring")
public class AuthoringController {

    @Autowired
    private ConfirmItClient confirmItClient;

    @PostMapping("/getSurveyStatus")
    public GetSurveyStatusResponse getSurveyStatus(@RequestBody GetSurveyStatus getSurveyStatus) {
        return confirmItClient.getSurveyStatus(getSurveyStatus);
    }

    @PostMapping("/getProjectListByProjectName")
    public GetProjectListByProjectNameResponse getProjectListByProjectName(@RequestBody GetProjectListByProjectName getProjectListByProjectName) {
        return confirmItClient.getProjectListByProjectName(getProjectListByProjectName);
    }

    @PostMapping("/getProjectList")
    public GetProjectListResponse getProjectList(@RequestBody GetProjectList getProjectList){
        return confirmItClient.getProjectList(getProjectList);
    }

    @PostMapping("/getProjectInfo")
    public GetProjectInfoResponse getProjectInfo(@RequestBody GetProjectInfo getProjectInfo){
        return confirmItClient.getProjectInfo(getProjectInfo);
    }
}
