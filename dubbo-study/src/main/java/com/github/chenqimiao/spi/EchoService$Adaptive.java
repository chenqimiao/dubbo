package com.github.chenqimiao.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class EchoService$Adaptive implements com.github.chenqimiao.spi.EchoService {
    public java.lang.String echo(java.lang.String arg0) {
        throw new UnsupportedOperationException("The method public abstract java.lang.String com.github.chenqimiao.spi.EchoService.echo(java.lang.String) of interface com.github.chenqimiao.spi.EchoService is not adaptive method!");
    }

    public java.lang.String echo(org.apache.dubbo.common.URL arg0, java.lang.String arg1) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg0;
        String extName = url.getParameter("echo.service", "default");
        if (extName == null)
            throw new IllegalStateException("Failed to get extension (com.github.chenqimiao.spi.EchoService) name from url (" + url.toString() + ") use keys([echo.service])");
        com.github.chenqimiao.spi.EchoService extension = (com.github.chenqimiao.spi.EchoService) ExtensionLoader.getExtensionLoader(com.github.chenqimiao.spi.EchoService.class).getExtension(extName);
        return extension.echo(arg0, arg1);
    }
}