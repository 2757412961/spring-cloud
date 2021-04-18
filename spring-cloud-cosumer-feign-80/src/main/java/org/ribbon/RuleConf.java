package org.ribbon;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zjh
 * @date : 2021/4/17 20:15
 * @Email : 2757412961@qq.com
 * @update:
 */

@Configuration
public class RuleConf {

    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new ZjuRule();
    }

}
