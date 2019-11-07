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
@RequestMapping("login")
public class LoginController {

    @Autowired
    ConfirmItClient confirmItClient;

    @PostMapping("/logOnUser")
    public LogOnUserResponse invokeConfimItClientToLogin(@RequestBody LogOnUser logOnUser) {
        return confirmItClient.logOn(logOnUser);
    }
}
