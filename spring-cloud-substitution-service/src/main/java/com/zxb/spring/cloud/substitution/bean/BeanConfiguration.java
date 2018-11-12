package com.zxb.spring.cloud.substitution.bean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate 是Spring提供的用于访问Rest服务的客户端，提供了多种便捷访问远程Http服务的方法
 * 大大提高了客户端的编写效率
 * @author Mr.zxb
 * @date 2018-11-12 22:02:31
 */
@Configuration
public class BeanConfiguration {

    @Bean
    @LoadBalanced //这个注解会自动构造LoadBalancerClient接口的实现类并注册到Spring容器中
    /**
     * RestTemplate负载均衡配置
     */
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
