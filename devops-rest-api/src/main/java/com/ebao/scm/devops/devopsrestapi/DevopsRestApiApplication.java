package com.ebao.scm.devops.devopsrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsRestApiApplication.class, args);
    }

    @RequestMapping("/")
    private String index(String name) {
        return name + ",Hello Spring Boot!";
    }
}
