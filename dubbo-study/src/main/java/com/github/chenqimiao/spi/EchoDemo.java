package com.github.chenqimiao.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @Description: Echo 示例
 * @Author: Qimiao Chen
 * @Create: 2020-12-15 19:09
 **/
public class EchoDemo {

    public static void main(String[] args) {

        ExtensionLoader<EchoService> extensionLoader = ExtensionLoader.getExtensionLoader(EchoService.class);
        EchoService defaultEchoService = extensionLoader.getDefaultExtension();
        EchoService fastEchoService = extensionLoader.getExtension("fast");

        defaultEchoService.echo("Hello, Qimiao chen");
        fastEchoService.echo("Hello, Qimiao chen");


        EchoService adaptiveExtension = extensionLoader.getAdaptiveExtension();
        URL url = URL.valueOf("http://www.baidu.com?echo.service=urlSpecified");
        // 存在一个优先级 被 @Adaptive 注解的类 > url 指定的 value > @SPI 指定的默认的类
        adaptiveExtension.echo(url, "Hello, Qimiao chen");

    }
}
