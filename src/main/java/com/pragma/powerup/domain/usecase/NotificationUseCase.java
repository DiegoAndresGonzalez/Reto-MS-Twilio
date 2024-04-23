package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.NotificationServicePort;
import com.pragma.powerup.domain.spi.NotificationPersistencePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NotificationUseCase implements NotificationServicePort {

    private final NotificationPersistencePort notificationPersistencePort;
    @Override
    public void sendNotification(String phone, String message) {
        notificationPersistencePort.sendNotification(phone, message);
    }
}