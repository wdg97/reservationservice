package com.reservationprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Date 2022/3/7 9:30
 * @Author wdg
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.reservationprovider.dubboServiceImpl")
@MapperScan("com.reservationprovider.dao")
public class Reservationprovider01Application {
    public static void main(String[] args) {
        SpringApplication.run(Reservationprovider01Application.class,args);
        System.out.println("服务器2启动成功！");
    }
}
