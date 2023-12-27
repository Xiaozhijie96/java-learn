package com.xiao.spi;


import java.util.ServiceLoader;

/**
 * SPI (Service Provider Interface)
 * SPI与API区别：
 *     API是调用并用于实现目标的类、接口、方法等的描述；
 *     SPI是扩展和实现以实现目标的类、接口、方法等的描述；
 */
public class SpiMain {

    /**
     * 会读取 META-INF/services/ ISpi.class 全类名路径来循环加载
     * @param args
     */
    public static void main(String[] args) {
        ServiceLoader<ISpi> spi = ServiceLoader.load(ISpi.class);
        spi.forEach(ISpi::say);
    }
}
