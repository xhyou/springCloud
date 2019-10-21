package atguigu;

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
public class Provide8002 {
    public static void main(String[] args) {
        SpringApplication.run(Provide8002.class, args);
    }
}
