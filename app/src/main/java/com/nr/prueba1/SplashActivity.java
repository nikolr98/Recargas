package com.nr.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    private Timer timer;
    private ProgressBar progressBar;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar=findViewById(R.id.barra);
        progressBar.setProgress(0);
        final long intervalo=45;
        timer =new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (i < 100) {
                    progressBar.setProgress(i);
                    i++;
                } else {
                    timer.cancel();
                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        },0,intervalo);

    /*    new Handler().postDelayed(new Runnable() {
            private Intent PackageContext;

            @Override
            public void run() {
                Intent intent=new Intent( SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },3000);*/
    }
}