package com.example.hanna.rpsgame;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class ConnectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        Button connect_button = (Button)findViewById(R.id.connect_button);
        connect_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //For toast message
                Context context = getApplicationContext();
                CharSequence text = "Could not connect, retries";
                int dur = Toast.LENGTH_LONG;
                final Toast toast = Toast.makeText(context, text, dur);

                //TODO: Here, try to connect 3 times, if connected; change activity to MainMenu

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(ConnectActivity.this, MainMenuActivity.class));
                        }}, 5000);
                    toast.show();
            }
        });
    }
}
