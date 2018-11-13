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
        return restTemplate.getForObject("http://localhost:8071/house/hello", String.class);
    }

    /**
     * 通过Eureka来消费接口
     * @return
     */
    @GetMapping("/callHello2")
    public String callHello2() {
        return restTemplate.getForObject("http://zxb:123456@house-server/house/hello", String.class);
    }

}
