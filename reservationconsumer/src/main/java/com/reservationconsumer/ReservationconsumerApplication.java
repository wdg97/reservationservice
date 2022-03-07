package com.reservationconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 如果只是作为消费者不需要这个注解，其作用只是去扫描所以的dubbo服务并注入到服务注册中心中
 * @auth wdg
 */
@EnableDubbo(scanBasePackages = "com.reservationconsumer.dubboserviceimpl")
public class ReservationconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationconsumerApplication.class, args);
    }

}
