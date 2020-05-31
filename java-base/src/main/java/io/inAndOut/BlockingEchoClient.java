package io.inAndOut;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class BlockingEchoClient {
    public static void main(String[] args) {
        client("127.0.0.1",8080);
    }


    public static void client(String host,int port){
        try{
            Socket socket = new Socket(host,port);
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter output =new PrintWriter(socket.getOutputStream(),true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String userInput = "";
            while((userInput = stdIn.readLine()) != null){
                output.println(userInput);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
