package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by xuehy
 *
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Server7001 {
    public static void main(String[] args) {
        SpringApplication.run(Server7001.class, args);
    }
}
