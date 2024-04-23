package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.handler.INotificationHandler;
import com.pragma.powerup.domain.api.NotificationServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class NotificationHandler implements INotificationHandler {

    private final NotificationServicePort notificationServicePort;
    @Override
    public void sendNotification(String phone, String message) {
        notificationServicePort.sendNotification(phone, message);
    }
}
