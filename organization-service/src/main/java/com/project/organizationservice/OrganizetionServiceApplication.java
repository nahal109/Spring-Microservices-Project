package com.project.organizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrganizetionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizetionServiceApplication.class, args);
    }

}
