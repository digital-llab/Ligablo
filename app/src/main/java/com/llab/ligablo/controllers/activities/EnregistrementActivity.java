package com.llab.ligablo.controllers.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.llab.ligablo.R;

public class EnregistrementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enregistrement);

        Button btnValiderEnregistrement= findViewById(R.id.btnEnregistrementValider);
        btnValiderEnregistrement.setOnClickListener(v -> {
            Toast.makeText(EnregistrementActivity.this, " Button de validation cliqué ", Toast.LENGTH_LONG).show();

            //Intent connectionActivity = logo1 Intent(this, ConnectionActivity.class);
            //startActivity(connectionActivity);
        });

        Button btnEnregistrementFacebook= findViewById(R.id.btnEnregistrementFacebook);
        btnEnregistrementFacebook.setOnClickListener(v -> {
            Toast.makeText(EnregistrementActivity.this, " Button d'enregistrement avec Facebook cliqué ", Toast.LENGTH_LONG).show();

            //Intent connectionActivity = logo1 Intent(this, ConnectionActivity.class);
            //startActivity(connectionActivity);
        });
    }
}
