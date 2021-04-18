package org.zjh.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
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

    /**
     * 负载均衡策略
     * 原理：实现了 IRule 接口
     * 实现类：
     * RoundRobinRule 轮询
     * RandomRule 随机
     * AvailabilityFilteringRule 先过滤掉，跳闸、访间故降的服务，对剩下的进行轮询
     * RetryRule 先按照轮沟获取服务，如果服务获取失败。则会在指定的时间内进行重试
     */
    @Bean
    public IRule myRule() {
        return new RoundRobinRule();
    }

}
