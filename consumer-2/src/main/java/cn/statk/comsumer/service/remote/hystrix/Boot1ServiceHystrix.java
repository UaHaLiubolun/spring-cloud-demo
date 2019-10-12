/*
 * @projectName spring-cloud
 * @package cn.statk.comsumer.service.remote.hystrix
 * @className cn.statk.comsumer.service.remote.hystrix.Boot1ServiceHystrix
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.statk.comsumer.service.remote.hystrix;

import cn.statk.comsumer.service.remote.Boot1Service;
import org.springframework.stereotype.Component;

/**
 * Boot1ServiceHystrix
 * @description TODO
 * @author liubolun
 * @date 2019年10月12日 10:52
 * @version 2.9
 */
@Component
public class Boot1ServiceHystrix implements Boot1Service {

    @Override
    public String hello() {
        return "boot-1 service has boom, so don't call me";
    }
}
