package com.example.twiliodemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SmsRequest {


    @JsonProperty("phoneNumber")
    @NotBlank
    private final String destPhoneNumber;

    @JsonProperty("message")
    @NotBlank
    private final String message;
}
