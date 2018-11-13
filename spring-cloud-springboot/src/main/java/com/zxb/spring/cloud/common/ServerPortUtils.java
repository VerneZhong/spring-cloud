package com.zxb.spring.cloud.common;

import com.zxb.spring.cloud.common.NetUtils;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Mr.zxb
 * @date 2018-11-12 17:01
 */
public class ServerPortUtils {

    public static int getAvailablePort() {
        int max = 65535;
        int min  = 2000;

        ThreadLocalRandom random = ThreadLocalRandom.current();

        // 指定一个范围，生成随机数字，通过NetUtils来检查端口是否可用
        int port = random.nextInt(max) % (max - min + 1) + min;
        boolean using = NetUtils.isLoclePortUsing(port);
        if (using) {
            return getAvailablePort();
        } else {
            return port;
        }
    }

}
