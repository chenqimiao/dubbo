package com.github.chenqimiao.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * @Description: Adaptive Echo Service
 * @Author: Qimiao Chen
 * @Create: 2020-12-17 16:54
 **/
@Adaptive
public class AdaptiveEchoService implements EchoService{
    @Override
    public String echo(String message) {
        System.out.println("Execute adaptive echo service ... ");
        return message;
    }

    @Override
    public String echo(URL url, String message) {
        System.out.println("Execute adaptive echo service with url... ");
        return message;
    }
}
