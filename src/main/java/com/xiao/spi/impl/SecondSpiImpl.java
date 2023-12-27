package com.xiao.spi.impl;

import com.xiao.spi.ISpi;

public class SecondSpiImpl implements ISpi {
    @Override
    public void say() {
        System.out.println("com.xiao.spi.impl.SecondSpiImpl");
    }
}
