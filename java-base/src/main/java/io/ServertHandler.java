package io;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServertHandler {

    public static final int MAXx_DATA_LEN =1024;

    private final Socket socket;

    public ServertHandler(Socket socket){
        this.socket = socket;
    }

    public void start(){
        System.out.println("等待客户输入");
        doStart();
    }

    private void doStart(){
        try{
            InputStream inputStream = socket.getInputStream();
            byte[] data = new byte[MAXx_DATA_LEN];
            int len;
            while ((len = inputStream.read(data)) != -1) {
                String message = new String(data, 0, len);
                System.out.println("客户端传来消息: " + message);
                socket.getOutputStream().write(data);
            }
        }catch (IOException e){
            System.out.println("服务端处理消息异常");
            e.printStackTrace();
        }
    }
}
