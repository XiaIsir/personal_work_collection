package com.yanque.InterfaceBase;

public class UsbImpl implements Usb {
    @Override
    public void open() {
        System.out.println("打开USB设备");
    }

    @Override
    public void close() {
        System.out.println("关闭USB设备");
    }
}
