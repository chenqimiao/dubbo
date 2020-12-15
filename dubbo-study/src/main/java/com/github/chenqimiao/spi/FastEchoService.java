package com.github.chenqimiao.spi;

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
}
