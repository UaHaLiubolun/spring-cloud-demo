/*
 * @projectName spring-cloud
 * @package cn.statk.comsumer.service.remote
 * @className cn.statk.comsumer.service.remote.Boot1Service
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.statk.comsumer.service.remote;

import cn.statk.comsumer.service.remote.hystrix.Boot1ServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Boot1Service
 * @description TODO
 * @author liubolun
 * @date 2019年10月11日 19:41
 * @version 2.9
 */
@FeignClient(value = "boot-1", fallback = Boot1ServiceHystrix.class)
public interface Boot1Service {

    @GetMapping(value = "/hello")
    String hello();
}
