package org.zjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: zjh
 * @date : 2021/4/19 21:38
 * @Email : 2757412961@qq.com
 * @update:
 */

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication9527.class);
    }
}
