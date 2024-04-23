package com.pragma.powerup.infrastructure.out.jpa.adapter;

import com.pragma.powerup.domain.spi.NotificationPersistencePort;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationJpaAdapter implements NotificationPersistencePort {

    @Override
    public void sendNotification(String phone, String message) {
        Twilio.init("AC924c5aeedefb682e719031bacc19be6b", "5f447f21cd474ee0a964469140d8d415");
        Message.creator(new PhoneNumber(phone), new PhoneNumber("+12513339358"), message).create();
    }

}