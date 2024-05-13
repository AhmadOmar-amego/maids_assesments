package com.maids.salesmanagements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SalesmanagementsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalesmanagementsApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "hi world";
    }

    @GetMapping("/secured")
    public String secured() {
        return "hi secured";
    }


}
