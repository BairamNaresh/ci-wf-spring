package com.nielsen.confirmit.controller;

import com.nielsen.confirmit.client.ConfirmItClient;
import com.nielsen.confirmit.utils.Utils;
import com.nielsen.confirmit.webservices.authoring.*;
import com.nielsen.confirmit.webservices.surveydata.GetDataByProject;
import com.nielsen.confirmit.webservices.surveydata.GetDataByProjectResponse;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@RestController
@RequestMapping("survey")
@Slf4j
public class SurveyController {

    @Autowired
    private ConfirmItClient confirmItClient;

    @PostMapping("/getDataByProject")
    public GetDataByProjectResponse getDataByProject(@RequestBody GetDataByProject getDataByProject) throws JSONException {
        GetDataByProjectResponse getDataByProjectResponse = confirmItClient.getDataByProject(getDataByProject);
//        Document document = ((Element) getDataByProjectResponse.getGetDataByProjectResult().getResult().getAny()).getOwnerDocument();
//        String xmlString = Utils.convertDocumentToString(document);
//        JSONObject responsesJsonObject = Utils.convertXMLStringToJSONObject(xmlString);
        return getDataByProjectResponse;
    }

    @PostMapping("/getQuestionnaire")
    public GetQuestionnaireResponse getQuestionnaire(@RequestBody GetQuestionnaire getQuestionnaire) {
        return confirmItClient.getQuestionnaire(getQuestionnaire);
    }
}
