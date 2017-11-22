package com.example.chelsi.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String address_shared_preferences = "sharedPrefsTesting";
    private EditText email;
    private Button saveEmail;
    private Button sharedPref;
    private SharedPreferences login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email_edittext);
        saveEmail = (Button) findViewById(R.id.saveEmail_Button);
        sharedPref = (Button) findViewById(R.id.register_button);


        login = getApplicationContext().getSharedPreferences(address_shared_preferences, MODE_PRIVATE);

        saveEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = login.edit();
                if (saveEmail.isClickable()) {
                    editor.putString("username", email.getText().toString());
                    editor.commit();
                } else {
                    email.getText().clear();
                }
            }
        });

        sharedPref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecylerActivity.class);
                intent.putExtra("sharedPref", address_shared_preferences);
                startActivity(intent);
            }
        });

    }
        }

