package cn.com.lan.demomall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *  1）、导入依赖
 *  2）、配置
 *      1、配置数据源
 *          1）、导入数据库驱动
 *          2）、在yml中配置数据源相关信息
 *      2、配置mybatis-plus
 *          1)、使用@Mappscan
 *          2）、配置sql映射文件
 */
@SpringBootApplication
public class DemomallProductApplication {

    public static void main (String[] args) {
        SpringApplication.run (DemomallProductApplication.class, args);
    }

}
