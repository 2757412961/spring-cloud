package org.zjh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/15 16:24
 * @Email : 2757412961@qq.com
 * @update:
 */

@RestController
public class ServiceMessageController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 注册进来的微服务，获取一些消息~
     */
    /**
     * @Description: 获取微服务列表的清单
     * @param: []
     * @return: java.lang.Object
     * @exception: IOException On input error.
     * @Author: zjh
     * @Date: 2021/4/15
     */
    @RequestMapping("/dept/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println("invoke discovery():" + services);

        List<ServiceInstance> instances = discoveryClient.getInstances("spring-cloud-provider-dept8001");

        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost() + "\t" +
                            instance.getPort() + "\t" +
                            instance.getUri() + "\t" +
                            instance.getServiceId() + "\t"
            );
        }

        return this.discoveryClient;
    }


}
