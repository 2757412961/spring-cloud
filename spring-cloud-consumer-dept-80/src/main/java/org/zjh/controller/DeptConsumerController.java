package org.zjh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.zjh.pojo.Dept;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/12 9:11
 * @Email : 2757412961@qq.com
 * @update:
 */

@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_FREIX = "http://localhost:8001";

    /**
     * 理解:消费者，不应该有service层
     * RestTemplate  供我们直接调用就可以 了!注册到Spring中
     * URI url, Class<T> responseType
     */
    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_FREIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/dept/get/all")
    public List<?> getAll() {
        return restTemplate.getForObject(REST_URL_FREIX + "/dept/get/all", List.class);
    }

    @RequestMapping("/dept/add")
    public Boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_FREIX + "/dept/add", dept, Boolean.class);
    }


}
