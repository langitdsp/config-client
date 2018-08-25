package com.langitdsp.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/client")
public class ClientController {

    @Value("${message:Default message}")
    private String message;

    @Value("${login_url:Default url}")
    private String loginUrl;

    @Value("${test_null:Default null}")
    private String testNull;

    @GetMapping(value = "/message")
    String getMessage(){
        return this.message;
    }

    @GetMapping(value = "/loginUrl")
    String getLoginUrl(){
        return this.loginUrl;
    }

    @GetMapping(value = "/testNull")
    String getTestNull(){
        return this.testNull;
    }
}
