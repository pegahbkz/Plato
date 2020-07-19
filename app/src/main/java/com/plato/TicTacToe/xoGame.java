package com.plato.TicTacToe;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class xoGame extends AppCompatActivity {
    private NetworkHandlerThread networkHandlerThread;
    private Socket socket;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    Button[] buttons = new Button[9];

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xo_game);
        final TextView textView = findViewById(R.id.text1);
//
//        try {
////            socket = new Socket("10.0.2.2", 3838);
////            ois =  new ObjectInputStream(networkHandlerThread.socket.getInputStream());
////            oos = new ObjectOutputStream(networkHandlerThread.socket.getOutputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        buttons[0] = findViewById(R.id.button1);
        buttons[1] = findViewById(R.id.button2);
        buttons[2] = findViewById(R.id.button3);
        buttons[3] = findViewById(R.id.button4);
        buttons[4] = findViewById(R.id.button5);
        buttons[5] = findViewById(R.id.button6);
        buttons[6] = findViewById(R.id.button7);
        buttons[7] = findViewById(R.id.button8);
        buttons[8] = findViewById(R.id.button9);

        final String type = "x";
        String turn = "x";
        String typeAndTurn = type + "" + turn;
        if(type==turn){
            final boolean chose = false;
            if(!chose){
                for (int i = 0; i < 9; i++) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int id = v.getId();
                                   Button clickedButton =  (Button) findViewById(id);
                                   clickedButton.setText(type);
                                   clickedButton.setEnabled(false);
//                            try {
//                                oos.writeUTF("hi");
//                                oos.flush();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }

                        }
                    });
                }
            }

        }
    }

}