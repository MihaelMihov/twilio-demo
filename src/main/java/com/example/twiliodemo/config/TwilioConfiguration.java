package com.example.twiliodemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "sms")
public class TwilioConfiguration {

    private String accountSID;
    private String authToken;
    private String trialNumber;
}
