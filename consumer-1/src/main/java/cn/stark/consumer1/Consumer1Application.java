/*
 * @projectName spring-cloud
 * @package cn.stark.consumer1
 * @className cn.stark.consumer1.Consumer1Application
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.stark.consumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Consumer1Application
 * @description TODO
 * @author liubolun
 * @date 2019年10月10日 14:41
 * @version 2.9
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consumer1Application {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Consumer1Application.class, args);
    }
}
