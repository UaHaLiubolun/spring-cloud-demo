/*
 * @projectName spring-cloud
 * @package cn.stark.zuul1.fallback
 * @className cn.stark.zuul1.fallback.Zuul1Fallback
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package cn.stark.zuul1.fallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Zuul1Fallback
 * @description TODO
 * @author liubolun
 * @date 2019年10月12日 14:23
 * @version 2.9
 */
@Component
public class Zuul1Fallback implements FallbackProvider {

    private final Logger logger = LoggerFactory.getLogger(Zuul1Fallback.class);


    @Override
    public String getRoute() {
        return "boot-1";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        if (cause != null && cause.getCause() != null) {
            String reason = cause.getCause().getMessage();
            logger.info("Excption {}",reason);
        }
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 200;
            }

            @Override
            public String getStatusText() throws IOException {
                return "OK";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("The boot-1 service is unavailable.".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
            }
        };
    }
}
