package com.zxb.spring.cloud.house.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.zxb
 * @date 2018-11-12 21:49:37
 */
@RestController
@RequestMapping("/house")
public class HouseController {

    @GetMapping("/hello")
    public String hello() {
        return "hello eureka.";
    }
}
