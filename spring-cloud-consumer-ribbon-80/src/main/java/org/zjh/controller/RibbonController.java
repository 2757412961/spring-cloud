package org.zjh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/17 16:42
 * @Email : 2757412961@qq.com
 * @update:
 */

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    /**
     * Ribbon 负载均衡 RestTemplate
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Ribbon。 我们这里的地址，应该是一一个变量，通过服务名来访问
     * Ribbon 和 Eureka 整合以后，客户端可以直接调用，不用关心IP地址和端口号
     */
    private static final String REST_URL_PREFIX = "http://SPRING-CLOUD-PROVIER-DEPT";

    @RequestMapping("/dept/get/all")
    public List<?> getAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/all", List.class);
    }

}
