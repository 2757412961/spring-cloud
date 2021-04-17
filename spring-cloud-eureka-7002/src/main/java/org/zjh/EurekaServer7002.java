package org.zjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: zjh
 * @date : 2021/4/14 21:00
 * @Email : 2757412961@qq.com
 * @update:
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002.class);
    }
}
