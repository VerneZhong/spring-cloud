package com.zxb.spring.cloud;

import com.zxb.spring.cloud.common.StartCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync    // 开启异步执行
public class SpringBootPreparationApplication {

    public static void main(String[] args) {
        new StartCommand(args);
        SpringApplication.run(SpringBootPreparationApplication.class, args);
    }
}
