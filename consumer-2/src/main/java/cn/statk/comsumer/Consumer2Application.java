/*
 * @projectName spring-cloud
 * @package cn.statk.comsumer
 * @className cn.statk.comsumer.Consumer2Application
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.statk.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Consumer2Application
 * @description TODO
 * @author liubolun
 * @date 2019年10月11日 19:39
 * @version 2.9
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Consumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer2Application.class, args);
    }
}
