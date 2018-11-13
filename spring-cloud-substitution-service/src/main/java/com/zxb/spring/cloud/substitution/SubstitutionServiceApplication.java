package com.zxb.spring.cloud.substitution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务消费者
 * @author Mr.zxb
 * @date 2018-11-12 22:08:12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SubstitutionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubstitutionServiceApplication.class, args);
    }
}
