package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.echoServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/25 10:47
 * @email: liuzihao29@jd.com
 */

public class EchoServer {

    public static void main(String[] args) throws IOException {

        class ConnectionHandler implements Runnable {
            InputStream in; OutputStream out;
            ConnectionHandler(Socket socket) throws IOException {
                in = socket.getInputStream();
                out = socket.getOutputStream();
            }

            public void run() {
                try {
                    int n;
                    byte[] buffer = new byte[1024];
                    while((n = in.read(buffer)) != -1) {
                        out.write(buffer, 0, n);
                        out.flush();
                    }
                } catch (IOException e) {}
            }
        }

        ServerSocket server = new ServerSocket(4567);
        while (true) {
            Socket socket = server.accept();
            Thread handler = new Thread(new ConnectionHandler(socket));
            handler.start();
        }
    }
}

