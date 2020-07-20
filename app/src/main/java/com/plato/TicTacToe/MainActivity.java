package com.plato.TicTacToe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private  NetworkHandlerThread networkHandlerThread;


    private Button xoButton;
    private Button guessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//
//
//
//        try {
//            networkHandlerThread = new NetworkHandlerThread();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //networkHandlerThread.setDaemon(true);
//        networkHandlerThread.start();
//
//        try {
//            networkHandlerThread.oos.reset();
//            networkHandlerThread.oos.writeUTF("hi");
//            networkHandlerThread.oos.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        xoButton = findViewById(R.id.xobutton);

        xoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,xoGame.class));
            }
        });

//        guessButton = findViewById(R.id.guessbutton);
//        final Intent intent2 = new Intent(MainActivity.this,guessGame.class);
//        guessButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(intent2);
//            }
//        });




    }
}
