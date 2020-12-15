package com.github.chenqimiao.spi;

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

    }
}
