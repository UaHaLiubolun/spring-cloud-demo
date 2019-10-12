/*
 * @projectName spring-cloud
 * @package cn.stark.zuul1.filter
 * @className cn.stark.zuul1.filter.Zuul1Filter
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.stark.zuul1.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Zuul1Filter
 * @description TODO
 * @author liubolun
 * @date 2019年10月12日 14:17
 * @version 2.9
 */
public class Zuul1Filter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(Zuul1Filter.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        logger.info(request.getRequestURI());
        return null;
    }
}
