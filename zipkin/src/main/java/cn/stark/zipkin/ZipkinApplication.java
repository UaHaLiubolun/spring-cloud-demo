/*
 * @projectName spring-cloud
 * @package cn.stark.zipkin
 * @className cn.stark.zipkin.ZipkinApplication
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.stark.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * ZipkinApplication
 * @description TODO
 * @author liubolun
 * @date 2019年10月12日 14:59
 * @version 2.9
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
