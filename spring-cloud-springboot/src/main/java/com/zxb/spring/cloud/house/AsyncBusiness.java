package com.zxb.spring.cloud.house;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

/**
 * @author Mr.zxb
 * @date 2018-11-12 16:32
 */
@Repository
public class AsyncBusiness {

    /**
     * 异步执行
     */
    @Async
    public void saveLog() {
        System.out.println(Thread.currentThread().getName());
    }
}
