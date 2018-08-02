package com.bingo.lb.configuration;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 50644 on 2018/7/19.
 */
@Service
public class RibbonService {


    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getHello(){
        return restTemplate.getForObject("http://BINGO-CMDB/api/hello",String.class);
    }

    public String serviceFailure(){
        return "hello world service is not available !";
    }

}
