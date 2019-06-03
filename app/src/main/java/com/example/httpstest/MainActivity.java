package com.example.httpstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //HTTPSによる文字列取得
        MyHttpsTask httpsTask=new MyHttpsTask(this);
        httpsTask.execute("https://www.example.com");


    }
}
