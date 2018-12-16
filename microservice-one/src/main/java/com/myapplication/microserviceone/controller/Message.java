package com.myapplication.microserviceone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RefreshScope
@RestController
//@RequestMapping("/microservice-one")
public class Message {

//    @Autowired
//    private RestTemplate  restTemplate;

    @Value("${message}")
    private String message;

    @RequestMapping("/message")
    public String message(){
        return message;
    }

    @RequestMapping("/messages")
    public String messages(){

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject("http://localhost:8001/api/microservice-two/microservice-two/message", String.class) + "\n" +message;

    }
}
