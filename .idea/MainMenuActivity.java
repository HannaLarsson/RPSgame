package com.example.hanna.rpsgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button online_players_button = (Button)findViewById(R.id.online_players_button);
        online_players_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenuActivity.this, OnlinePlayersActivity.class));
            }
        });

        Button pending_requests_button = (Button)findViewById(R.id.pending_requests_button);
        pending_requests_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenuActivity.this, PendingRequestsActivity.class));
            }
        });

        Button view_sent_requests_button = (Button)findViewById(R.id.view_sent_requests_button);
        view_sent_requests_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenuActivity.this, SentRequestsActivity.class));
            }
        });
    }
}
