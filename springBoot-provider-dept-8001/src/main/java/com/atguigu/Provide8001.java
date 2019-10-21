package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by xuehy
 *
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Provide8001 {
    public static void main(String[] args) {
        SpringApplication.run(Provide8001.class, args);
    }
}
