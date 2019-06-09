package com.llab.ligablo.controllers.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.llab.ligablo.R;

public class ConnectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);
//retrouver le bouton de validation et gerer l'evenement une fois le bouton cliqué
        Button btnValidationConnection= findViewById(R.id.btnConnectionValider);
        Button btnMotDePasseOublié= findViewById(R.id.btnMotDePasseOublié);
        btnValidationConnection.setOnClickListener((View v) -> {
            Toast.makeText(ConnectionActivity.this, " Button de validation cliqué ", Toast.LENGTH_LONG).show();

btnMotDePasseOublié.setVisibility(Button.VISIBLE);
            Intent dashBoard = new Intent(this, DashBoard.class);
            startActivity(dashBoard);
        });


    }
}
