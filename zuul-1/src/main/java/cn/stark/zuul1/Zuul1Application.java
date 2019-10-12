/*
 * @projectName spring-cloud
 * @package cn.stark.zuul1
 * @className cn.stark.zuul1.Zuul1Application
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.stark.zuul1;

import cn.stark.zuul1.filter.Zuul1Filter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Zuul1Application
 * @description TODO
 * @author liubolun
 * @date 2019年10月12日 13:59
 * @version 2.9
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul1Application {

    @Bean
    public Zuul1Filter zuul1Filter() {
        return new Zuul1Filter();
    }

    public static void main(String[] args) {
        SpringApplication.run(Zuul1Application.class, args);
    }
}
