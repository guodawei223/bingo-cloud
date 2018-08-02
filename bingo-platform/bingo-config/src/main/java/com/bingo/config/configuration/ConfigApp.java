package com.bingo.config.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 50644 on 2018/7/17.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApp {
    public static void main(String[] args){
        SpringApplication.run(ConfigApp.class,args);
    }
}
