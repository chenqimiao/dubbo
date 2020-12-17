package com.github.chenqimiao.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * @Description:
 * @Author: Qimiao Chen
 * @Create: 2020-12-15 19:06
 **/
public class FastEchoService implements EchoService {

    @Override
    public String echo(String message) {
        System.out.println("Execute fast echo service ... ");
        return message;
    }

    @Override
    public String echo(URL url, String message) {
        System.out.println("Execute fast echo service with url ... ");
        return message;
    }
}
