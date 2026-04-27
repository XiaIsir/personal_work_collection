package com.yanque.IPDemo;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) throws IOException {

        // 发送数据
        //1.创建DatagramSocket对象(快递公司）
        //细节：
        //绑定端口，以后我们就是通过这个端口往外发送
        //空参：所有可用的端口中随机一个进行使用
        //有参：指定端口号进行绑定
        DatagramSocket ds = new DatagramSocket(); //空参构造创建
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入发送的数据：");
            // 打包数据
            String str = sc.nextLine();
            if("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes(); // 字符串转换成字节数组
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            /**
             * 创建数据包
             * 参数1：数据
             * 参2：数据长度
             * 参3：发送数据的目的IP
             * 参4：发送数据目的端口
             */
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            ds.send(dp);
        }
        // 关闭资源
        ds.close();


    }
}
