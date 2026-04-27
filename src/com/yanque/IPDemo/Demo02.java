package com.yanque.IPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        // 创建数据包 快递
        DatagramSocket ds = new DatagramSocket(10086);

        // 接收 数据的容器
        byte[] bytes = new byte[1024];
        // 创建一个箱子
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            // 接收数据
            ds.receive(dp);

            // 解析数据
            byte[] data = dp.getData();
            int len = dp.getLength();
            // 获取发送方ip
            InetAddress address = dp.getAddress();
            String name = address.getHostName();
            String ip = address.getHostAddress();

            // 获取发送方端口
            int port = dp.getPort();
            /**
             * new String(data,0,len)
             * 创建字符串
             * data:数据
             * 0:开始索引
             * len:结束索引
             */
            // 输出数据
            System.out.println("ip为："+ip+":"+port+"说："+new String(data,0,len));
        }

    }
}
