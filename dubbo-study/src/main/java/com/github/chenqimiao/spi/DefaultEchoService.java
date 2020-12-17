package com.github.chenqimiao.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * @Description: 默认的 EchoService 实现
 * @Author: Qimiao Chen
 * @Create: 2020-12-15 19:05
 **/
public class DefaultEchoService implements EchoService {
    @Override
    public String echo(String message) {
        System.out.println("Execute default echo service ... ");
        return message;
    }

    @Override
    public String echo(URL url, String message) {
        System.out.println("Execute default echo service with url... ");
        return message;
    }
}
