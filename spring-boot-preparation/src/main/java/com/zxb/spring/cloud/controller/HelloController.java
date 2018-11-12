package com.zxb.spring.cloud.controller;

import com.zxb.spring.cloud.service.AsyncBusiness;
import com.zxb.spring.cloud.common.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.zxb
 * @date 2018-11-09 17:30
 */
@RestController
public class HelloController {

    @Autowired
    private Environment env;

    /**
     * 注入配置
     */
    @Value("${server.port}")
    private String port;

    @Autowired
    private MyConfig myConfig;

    @Autowired
    private AsyncBusiness business;

    @GetMapping("/hello")
    public String hello() {
        // 读取配置
        String port = env.getProperty("server.port");
        System.out.println("port:" + port);
//        int i = 1 /0 ;
        business.saveLog();
        return myConfig.getName();
    }


}
