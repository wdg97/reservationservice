package com.reservationprovider;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableApolloConfig
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.reservationprovider.dubboServiceImpl")
@MapperScan("com.reservationprovider.dao")
public class ReservationproviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReservationproviderApplication.class, args);
    }
}
