package com.nielsen.confirmit.controller;

import com.nielsen.confirmit.client.ConfirmItClient;
import com.nielsen.confirmit.webservices.logon.LogOnUser;
import com.nielsen.confirmit.webservices.logon.LogOnUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logon")
public class LogonController {

    @Autowired
    private ConfirmItClient confirmItClient;

    @PostMapping("/logOnUser")
    public LogOnUserResponse invokeConfirmItClientToLogon(@RequestBody LogOnUser logOnUser) {
        return confirmItClient.logOn(logOnUser);
    }
}
