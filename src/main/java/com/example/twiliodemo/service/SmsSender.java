package com.example.twiliodemo.service;

import com.example.twiliodemo.model.SmsRequest;

public interface SmsSender {

    void sendSMS(SmsRequest smsRequest);
}
