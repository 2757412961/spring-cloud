package org.zjh;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
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

    /**
     * 开启 Hystrix DashBoard 的监控，相当于注册一个 bean
     */
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean<HystrixMetricsStreamServlet> bean = new ServletRegistrationBean<>(new HystrixMetricsStreamServlet());

        /** http://192.168.2.116:8001/actuator/hystrix.stream */
        bean.addUrlMappings("/actuator/hystrix.stream");

        return bean;
    }
}
