package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.buttonid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=null;
                s.equals("ddd");
            }
        });

        Log.e("=====MainActivity","onCreate");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("===MainActivity===","onDestroy");

    }
}
