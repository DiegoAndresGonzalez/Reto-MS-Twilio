package com.pragma.powerup.domain.spi;

public interface NotificationPersistencePort {

    void sendNotification(String phone, String message);

}