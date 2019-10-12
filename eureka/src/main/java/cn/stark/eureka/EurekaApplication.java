/*
 * @projectName spring-cloud
 * @package cn.stark.eureka
 * @className cn.stark.eureka.Application
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.stark.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Application
 * @description TODO
 * @author liubolun
 * @date 2019年10月10日 11:18
 * @version 2.9
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
