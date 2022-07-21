package com.example.twiliodemo.controller;

import com.example.twiliodemo.model.SmsRequest;
import com.example.twiliodemo.service.SmsSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")
public class SmsController {

    private final SmsSenderService smsSenderService;

    @Autowired
    SmsController(SmsSenderService smsSenderService) {
        this.smsSenderService = smsSenderService;
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest){
        smsSenderService.sendSMS(smsRequest);
    }

}
