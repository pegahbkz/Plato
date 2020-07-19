package com.plato.TicTacToe;
import android.widget.TextView;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class NetworkHandlerThread extends Thread {
    public Socket socket;
    public ObjectInputStream ois;
    public ObjectOutputStream oos;
    public DataInputStream dis;
    public DataOutputStream dos;
    NetworkHandlerThread() throws IOException {

        socket = new Socket("10.0.2.2", 3838);
        oos = new ObjectOutputStream(socket.getOutputStream());
        ois = new ObjectInputStream(socket.getInputStream());

    }

    @Override
    public void run() {
//        try {
//
//
////            oos.writeUTF("hi");
////            oos.flush();
//
////            while (true) {
////                String message = ois.readUTF();
////                serverMessageTextView.setText(message);
////            }
////                    Log.i("SOCKET", dis.readUTF());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}