/*
 * @projectName spring-cloud
 * @package cn.stark.boot1.controller
 * @className cn.stark.boot1.controller.HelloController
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.stark.boot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * @description TODO
 * @author liubolun
 * @date 2019年10月10日 14:00
 * @version 2.9
 */
@RestController
public class HelloController {


    @GetMapping(value = "/hello")
    public String hello() {
        return "boot-1";
    }
}
