package com.plato.TicTacToe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    private  NetworkHandlerThread networkHandlerThread;


    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        final TextView textView = findViewById(R.id.textView);


        try {
            networkHandlerThread = new NetworkHandlerThread(textView);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //networkHandlerThread.setDaemon(true);
        networkHandlerThread.start();

        try {
            networkHandlerThread.oos.reset();
            networkHandlerThread.oos.writeUTF("hi");
            networkHandlerThread.oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        b = findViewById(R.id.button);
        final Intent intent = new Intent(MainActivity.this,xoGame.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });


    }
}
