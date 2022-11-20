package com.sxw.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/4 14:49
 * @Version 1.0
 * 描述：   TODO
 */
public class LengthCalculator extends Thread{
    //以socket为成员变量
    private Socket socket;

    public LengthCalculator(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //获取socket的输出流
            OutputStream os = socket.getOutputStream();
            //获取socket的输入流
            InputStream is = socket.getInputStream();
            int ch = 0;
            byte[] buff = new byte[1024];
            //buff主要用来读取输入的内容，存成byte数组,ch主要用来获取数组的长度
            ch = is.read(buff);
            //将接收流的byte数组转换为字符串，这里获取内容是客户端发送过来的字符串参数
            String content = new java.lang.String(buff, 0, ch);
            System.out.println(content);
            //往输出端写入获取到的字符串的长度，回发给客户端
            os.write(String.valueOf(content.length()).getBytes());
            //不要忘记关闭输入输出流以及socket
            is.close();
            os.close();
            socket.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public LengthCalculator(ServerSocket socket) {

    }
}
