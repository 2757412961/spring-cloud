package org.zjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: zjh
 * @date : 2021/4/12 10:02
 * @Email : 2757412961@qq.com
 * @update:
 */

@EnableEurekaClient
@SpringBootApplication
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class);
    }
}
