package com.zxb.spring.cloud.substitution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者
 * @author Mr.zxb
 * @date 2018-11-12 22:04:57
 */
@RestController
@RequestMapping("/substitution")
public class SubstitutionController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 直接Rest接口调用的方式
     * @return
     */
    @GetMapping("/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://localhost:8081/house/hello", String.class);
    }

    @GetMapping("/callHello2")
    public String callHello2() {
        return restTemplate.getForObject("http://spring-cloud-house-server/house/hello", String.class);
    }

}
