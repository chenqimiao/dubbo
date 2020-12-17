package com.github.chenqimiao.spi;

import org.apache.dubbo.common.URL;

/**
 * @Description: URL 指定的 ECHO 实现
 * @Author: Qimiao Chen
 * @Create: 2020-12-17 17:04
 **/
public class URLSpecifiedEchoService implements EchoService{
    @Override
    public String echo(String message) {
        System.out.println("Execute url specified echo service ... ");
        return message;
    }

    @Override
    public String echo(URL url, String message) {
        System.out.println("Execute url specified echo service with url ... ");
        return message;
    }
}
