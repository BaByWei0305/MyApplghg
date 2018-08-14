package com.example.asus.myapplication.UI.main.view.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.activity.LoginActivity;

public class DonghuaActivity extends AppCompatActivity {

    private ImageView img;

    private final long SPLASH_LENGTH = 3000;

    Handler handler = new Handler();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donghuaactivity);

        handler.postDelayed(new Runnable() {

            public void run() {
                Intent intent = new Intent(DonghuaActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_LENGTH);
        initView();
    }

    private void initView() {
        img = (ImageView) findViewById(R.id.img);
    }
}
