package com.spring_microservise.department_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope

public class MassageController {
    @Value("${spring.boot.massage}")
    private String message;

    @GetMapping("massage")
    public String massage() {
        return message;
    }


}
