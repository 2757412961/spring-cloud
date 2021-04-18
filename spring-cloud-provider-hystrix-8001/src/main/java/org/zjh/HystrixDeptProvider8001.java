package org.zjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: zjh
 * @date : 2021/4/11 20:36
 * @Email : 2757412961@qq.com
 * @update:
 */

@EnableEurekaServer
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class HystrixDeptProvider8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDeptProvider8001.class);
    }
}
