package io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("服务端启动成功，端口:" + port);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("服务端启动失败");
        }
    }

    public void start(){
        new Thread(new Runnable() {
            public void run() {
                dostart();
            }
        }).start();
    }


    private void dostart(){
        while(true){
            try{
                Socket client =serverSocket.accept();
                new ServertHandler(client).start();
            }catch (Exception e){
                System.out.println("服务端异常");
            }
        }
    }
}
