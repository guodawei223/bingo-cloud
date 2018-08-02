package com.bingo.cmdb.configuration;

import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 50644 on 2018/7/18.
 */

@RestController
@RequestMapping("/api")
@RefreshScope
public class HelloResource {


    //动态刷新还没有实现，文档中提到的需要手动或者webhook调用http://localhost:8762/refresh ,实际测试找不到资源，社区很多反馈改自动刷新不考虑，建议用bus来实现
    @Value("${hello}")
    String hello;

    @Autowired
    private ServerProperties serverProperties;

    @Timed
    @GetMapping("/hello")
    public String hello(){
        return hello+"from "+serverProperties.getPort();
    }
}
