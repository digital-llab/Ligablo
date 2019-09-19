package com.llab.ligablo.controllers.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.Toast;

import com.llab.ligablo.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnConnection= findViewById(R.id.btnConnection);
        btnConnection.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, " Button de connection cliqué ", Toast.LENGTH_LONG).show();

            Intent connectionActivity = new Intent(this, ConnectionActivity.class);
            startActivity(connectionActivity);
        });


        Button btnEnregistrement= findViewById(R.id.btnEnregistrer);
        btnEnregistrement.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, " Button pour S'enregistrer cliqué ", Toast.LENGTH_LONG).show();

            Intent enregistrementActivity = new Intent(this, EnregistrementActivity.class);
            startActivity(enregistrementActivity);
        });



    }
}
