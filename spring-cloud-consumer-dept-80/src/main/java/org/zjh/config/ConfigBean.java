package org.zjh.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zjh
 * @date : 2021/4/12 9:16
 * @Email : 2757412961@qq.com
 * @update:
 */

@Configuration
public class ConfigBean {

    /**
     * 配置 Ribbon 负载均衡实现RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
