package org.faskan.serversocketapplication;

import android.util.Log;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketThread extends Thread {

    private ServerSocket serverSocket;

    @Override
    public void run(){
        try {
            serverSocket = new ServerSocket(5050);
            while (true) {
                Socket socket = serverSocket.accept();

                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bufferedWriter.write("Hello!");
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            Log.e("ServerSocket", e.getMessage());
        }

    }
}
