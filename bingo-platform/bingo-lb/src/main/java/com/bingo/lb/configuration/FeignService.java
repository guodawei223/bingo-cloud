package com.bingo.lb.configuration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 50644 on 2018/7/19.
 */
@FeignClient(value = "BINGO-CMDB")
public interface FeignService {

    @RequestMapping(value = "/api/hello",method = RequestMethod.GET)
    String sayHello();
}
