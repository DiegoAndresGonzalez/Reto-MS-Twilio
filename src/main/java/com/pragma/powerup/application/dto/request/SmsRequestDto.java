package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmsRequestDto {

    private String phone;
    private String message;

}