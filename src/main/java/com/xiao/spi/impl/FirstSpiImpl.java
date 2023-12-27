package com.xiao.spi.impl;

import com.xiao.spi.ISpi;

public class FirstSpiImpl implements ISpi {
    @Override
    public void say() {
        System.out.println("com.xiao.spi.impl.FirstSpiImpl");
    }
}
