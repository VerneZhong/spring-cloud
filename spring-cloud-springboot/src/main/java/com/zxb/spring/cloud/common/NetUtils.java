package com.zxb.spring.cloud.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.Socket;

/**
 * 检查端口是否可用，主要是用Socket来判断这个端口是否可被链接
 * @author Mr.zxb
 * @date 2018-11-12 17:11
 */
public class NetUtils {

    private static Logger logger = LoggerFactory.getLogger(NetUtils.class);

    public static boolean isLoclePortUsing(int port) {
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return flag;
    }

    public static boolean isPortUsing(String host, int port) {
        boolean flag = false;
        try {
            InetAddress address = InetAddress.getByName(host);
            Socket socket = new Socket(address, port);
            flag = true;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return flag;
    }
}
