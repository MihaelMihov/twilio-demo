package com.example.twiliodemo.service;

import com.example.twiliodemo.model.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SmsSenderService {
    private final SmsSender smsSender;

    @Autowired
    SmsSenderService(@Qualifier("twilio") SmsSenderImpl smsSender){
        this.smsSender = smsSender;
    }

    public void sendSMS(SmsRequest smsRequest) {
        smsSender.sendSMS(smsRequest);
    }
}
