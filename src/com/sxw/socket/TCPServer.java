package com.sxw.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/4 14:44
 * @Version 1.0
 * 描述：   TODO
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {
        //创建socket，并将socket一直绑定在65000端口
        ServerSocket socket = new ServerSocket(8080);
        //死循环，使socket一直等待并处理客户端发送过来的请求
        System.out.println("等待客户端连接中.....");
        while (true){
            Socket accept = socket.accept();
            //获取客户端的请求信息，执行相关业务逻辑
            new LengthCalculator(socket).start();
        }
    }
}
