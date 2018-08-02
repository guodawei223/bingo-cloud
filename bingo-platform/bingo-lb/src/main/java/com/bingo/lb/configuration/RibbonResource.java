package com.bingo.lb.configuration;

import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 50644 on 2018/7/19.
 */
@RestController
@RequestMapping("/api")
public class RibbonResource {

    @Autowired
    private RibbonService helloService;


    //原生的ribbon实现负载均衡
    @Timed
    @GetMapping("/ribbon")
    public String ribbon(){
        return helloService.getHello();
    }


    //Feign实现负载均衡，内部使用的ribbon
    @Autowired
    private FeignService feignService;
    @Timed
    @GetMapping("/ribbon2")
    public String ribbon2(){
        return feignService.sayHello();
    }
}
