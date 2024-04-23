package com.pragma.powerup.domain.api;

public interface NotificationServicePort {

    void sendNotification(String phone, String message);

}