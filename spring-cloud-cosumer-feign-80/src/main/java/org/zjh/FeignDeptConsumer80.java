package org.zjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: zjh
 * @date : 2021/4/12 10:02
 * @Email : 2757412961@qq.com
 * @update:
 */

@ComponentScan(basePackages = {"org.zjh"})
@EnableFeignClients(basePackages = {"org.zjh"})
@EnableEurekaClient
@SpringBootApplication
public class FeignDeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer80.class);
    }
}
