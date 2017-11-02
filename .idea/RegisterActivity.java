package com.example.hanna.rpsgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView register_textview;
    EditText login_name_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register_textview = (TextView) findViewById(R.id.register_textview);
        login_name_text = (EditText) findViewById(R.id.login_name_text);

        Button register_button = (Button)findViewById(R.id.register_button);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(login_name_text.getText().toString().isEmpty()) || !(login_name_text.getText().toString().equals("Login Name"))) {
                    startActivity(new Intent(RegisterActivity.this, ConnectActivity.class));
                }else{
                    register_textview.setText("Not a valid login");
                }
            }
        });
    }
}
