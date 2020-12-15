package com.github.chenqimiao.spi;

import org.apache.dubbo.common.extension.Adaptive;

/**
 * @Description: 默认的 EchoService 实现
 * @Author: Qimiao Chen
 * @Create: 2020-12-15 19:05
 **/
@Adaptive
public class DefaultEchoService implements EchoService {
    @Override
    public String echo(String message) {
        System.out.println("Execute default echo service ... ");
        return message;
    }
}
