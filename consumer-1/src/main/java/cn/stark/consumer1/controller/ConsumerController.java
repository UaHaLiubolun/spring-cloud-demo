/*
 * @projectName spring-cloud
 * @package cn.stark.consumer1.controller
 * @className cn.stark.consumer1.controller.ConsumerController
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.stark.consumer1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ConsumerController
 * @description TODO
 * @author liubolun
 * @date 2019年10月10日 14:43
 * @version 2.9
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public String hello() {
        return restTemplate.getForEntity("http://boot-1/hello", String.class).getBody();
    }
}
