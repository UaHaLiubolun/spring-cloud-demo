/*
 * @projectName spring-cloud
 * @package cn.statk.comsumer.controller
 * @className cn.statk.comsumer.controller.HelloController
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.statk.comsumer.controller;

import cn.statk.comsumer.service.remote.Boot1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * @description TODO
 * @author liubolun
 * @date 2019年10月11日 19:41
 * @version 2.9
 */
@RestController
public class HelloController {

    @Autowired
    private Boot1Service boot1Service;


    @GetMapping(value = "/hello")
    public String hello() {
        return boot1Service.hello();
    }
}
