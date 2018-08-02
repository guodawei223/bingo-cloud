package com.bingo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by 50644 on 2018/7/19.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayApp {

    public static void main(String[] args){
        SpringApplication.run(GatewayApp.class,args);
    }
}
