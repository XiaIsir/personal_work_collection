package com.yanque.IPDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        // 获取ip
        //InetAddress xiaoxia = InetAddress.getByName("小夏");
        //System.out.println(xiaoxia);
        // 获取本机ip
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        String hostName = localHost.getHostName();
        System.out.println(hostName);

        String hostAddress = localHost.getHostAddress();
        System.out.println(hostAddress);

    }
}
