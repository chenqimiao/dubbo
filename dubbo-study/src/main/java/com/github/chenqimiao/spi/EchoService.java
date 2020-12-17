package com.github.chenqimiao.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @Description: Echo 服务接口
 * @Author: Qimiao Chen
 * @Create: 2020-12-15 19:05
 **/
@SPI("default")
public interface EchoService {

    String echo(String message);

    @Adaptive("echo.service")
    String echo(URL url, String message);
}
