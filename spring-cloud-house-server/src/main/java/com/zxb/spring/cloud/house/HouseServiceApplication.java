package c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者
 * @author Mr.zxb
 * @date 2018-11-12 21:42:13
 */
@SpringBootApplication
@EnableDiscoveryClient // 表示是一个Eureka的客户端
public class HouseServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(HouseServiceApplication.class, args);
    }
}
