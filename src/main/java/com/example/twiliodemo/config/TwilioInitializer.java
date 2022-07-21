package com.example.twiliodemo.config;

import com.twilio.Twilio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class TwilioInitializer {
    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        Twilio.init(twilioConfiguration.getAccountSID(), twilioConfiguration.getAuthToken());
        log.info("Twilio sms app initialized with: SID {}", twilioConfiguration.getAccountSID());
    }

}
