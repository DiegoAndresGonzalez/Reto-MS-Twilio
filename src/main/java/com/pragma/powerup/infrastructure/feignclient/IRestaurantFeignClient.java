package com.pragma.powerup.infrastructure.feignclient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "restaurantServiceClient", url = "${microservice.restaurantServiceUrl}")
public interface IRestaurantFeignClient {



}