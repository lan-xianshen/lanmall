package cn.com.lan.demomall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemomallCouponApplication {

    public static void main (String[] args) {
        SpringApplication.run (DemomallCouponApplication.class, args);
    }

}
