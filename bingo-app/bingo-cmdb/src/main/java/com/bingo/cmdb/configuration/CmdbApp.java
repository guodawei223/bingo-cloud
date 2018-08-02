package com.bingo.cmdb.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 50644 on 2018/7/17.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan
public class CmdbApp {

    public static void main(String[] args){
        SpringApplication.run(CmdbApp.class, args);
    }

}
