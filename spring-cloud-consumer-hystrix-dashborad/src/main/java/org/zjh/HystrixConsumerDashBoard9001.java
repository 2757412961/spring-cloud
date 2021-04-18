package org.zjh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: zjh
 * @date : 2021/4/18 21:13
 * @Email : 2757412961@qq.com
 * @update:
 */

@EnableHystrixDashboard
@SpringBootApplication
public class HystrixConsumerDashBoard9001 {
    /** dash board URL: http://localhost:9001/hystrix */
    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerDashBoard9001.class);
    }
}
