package cn.com.lan.demomall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "cn.com.lan.demomall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class DemomallMemberApplication {

    public static void main (String[] args) {
        SpringApplication.run (DemomallMemberApplication.class, args);
    }

}
