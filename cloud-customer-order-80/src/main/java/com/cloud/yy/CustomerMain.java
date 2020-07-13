package com.cloud.yy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerMain {
    public static void main(String[] args) {
        SpringApplication.run(CustomerMain.class,args);
    }
}
