package com.zxb.spring.cloud.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Mr.zxb
 * @date 2018-11-09 17:36
 */
@ConfigurationProperties(prefix = "com.pro")
@Component
public class MyConfig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
