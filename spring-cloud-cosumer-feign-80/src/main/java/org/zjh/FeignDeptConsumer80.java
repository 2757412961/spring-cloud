package org.zjh;

import org.ribbon.RuleConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: zjh
 * @date : 2021/4/12 10:02
 * @Email : 2757412961@qq.com
 * @update:
 */

@RibbonClient(name = "SPRINGCLOUD-PROVIER-DEPT", configuration = {RuleConf.class})
@EnableEurekaClient
@SpringBootApplication
public class FeignDeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer80.class);
    }
}
