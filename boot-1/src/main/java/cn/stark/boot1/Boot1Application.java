/*
 * @projectName spring-cloud
 * @package cn.stark.boot1
 * @className cn.stark.boot1.Application
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.stark.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Application
 * @description TODO
 * @author liubolun
 * @date 2019年10月10日 13:48
 * @version 2.9
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Boot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot1Application.class, args);
    }
}
