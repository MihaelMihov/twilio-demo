package com.example.twiliodemo.service;

import com.example.twiliodemo.config.TwilioConfiguration;
import com.example.twiliodemo.model.SmsRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service("twilio")
public class SmsSenderImpl implements SmsSender {

    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    SmsSenderImpl(TwilioConfiguration twilioConfiguration){
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSMS(SmsRequest smsRequest) {
        PhoneNumber to = new PhoneNumber(smsRequest.getDestPhoneNumber());
        PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
        MessageCreator creator = Message.creator(to, from, smsRequest.getMessage());
        creator.create();
        log.info("SMS sent: {}", smsRequest);
    }
}
