package com.zxb.spring.cloud.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * 随机端口，项目启动的时候检测端口是否有被使用
 * @author Mr.zxb
 * @date 2018-11-12 16:50
 */
public class StartCommand {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public StartCommand(String[] args) {
        boolean isServerPort = false;
        String serverPort = "";
        if (args != null) {
            for (String arg : args) {
                if (StringUtils.hasText(arg) && arg.startsWith("--server.port")) {
                    isServerPort = true;
                    serverPort = arg;
                    break;
                }
            }
        }

        // 如果没有指定端口，则随机生成一个可用的端口
        if (!isServerPort) {
            int port = ServerPortUtils.getAvailablePort();
            logger.info("current server.port = " + port);
            System.setProperty("server.port", String.valueOf(port));
        } else {
            logger.info("current server.port = "+ serverPort.split("=")[1]);
            System.setProperty("server.port", serverPort.split("=")[1]);
        }
    }



}
