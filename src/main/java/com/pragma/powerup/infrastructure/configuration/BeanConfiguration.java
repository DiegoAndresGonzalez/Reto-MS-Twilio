package com.pragma.powerup.infrastructure.configuration;

import com.pragma.powerup.domain.api.NotificationServicePort;
import com.pragma.powerup.domain.spi.NotificationPersistencePort;
import com.pragma.powerup.domain.usecase.NotificationUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    @Bean
    public NotificationServicePort notificationServicePort(NotificationPersistencePort notificationPersistencePort){
        return new NotificationUseCase(notificationPersistencePort);
    }

}