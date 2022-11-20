package com.sxw.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/4 15:02
 * @Version 1.0
 * 描述：   TODO
 */
public class TCPClient {
    public static void main(String[] args) throws Exception{
        //创建socket，并指定连接的是本机的端口号为65000的服务器socket
        Socket socket = new Socket("127.0.0.1", 8080);
        //获取输出流
        OutputStream os = socket.getOutputStream();
        //获取输入流
        InputStream is = socket.getInputStream();
        //将要传递给server的字符串参数转换为byte数组，并将数组写入到输出流中
        os.write(new String("Hello World!!!").getBytes());
        int ch = 0;
        byte[] buff = new byte[1024];
        //buff主要用来读取输入的内容，存成byte数组,ch主要用来获取数组的长度
        ch = is.read(buff);
        //将接收流的byte数组转换为字符串，这里是从服务器回发回来的字符串参数的长度
        String content = new String(buff, 0, ch);
        System.out.println(content);
        //不要忘记关闭输入输出流以及socket
        socket.close();
        os.close();
        is.close();
    }
}
