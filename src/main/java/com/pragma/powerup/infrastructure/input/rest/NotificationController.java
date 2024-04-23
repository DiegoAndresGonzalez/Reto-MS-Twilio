package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.dto.request.SmsRequestDto;
import com.pragma.powerup.application.handler.impl.NotificationHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/sms")
public class NotificationController {

    private final NotificationHandler notificationHandler;

    @PostMapping("/send")
    public void sendSms(@RequestBody SmsRequestDto requestDto){
        notificationHandler.sendNotification(requestDto.getPhone(),
                requestDto.getMessage());
    }
}