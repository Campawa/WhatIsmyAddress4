package com.example.chelsi.whatismyaddress;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Chelsi on 11/21/2017.
 */

public class RecylerActivity extends AppCompatActivity{
    private SharedPreferences sharedPref;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        ArrayList<String> emails = new ArrayList<>();


        Map<String, ?> allEntries = sharedPref.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue().toString());
            entry.getValue();
            emails.add(entry.getValue().toString());
        }

    }
}
