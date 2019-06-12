package com.llab.ligablo.controllers.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.llab.ligablo.R;

import butterknife.BindView;
import butterknife.OnClick;

public class ConnectionActivity extends AppCompatActivity {

    @BindView(R.id.btnMotDePasseOublie) Button btnMotDePasseOublie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

    }


    @OnClick(R.id.btnConnectionValider)
    public void onClickConnectionValider() {

        Toast.makeText(ConnectionActivity.this, " Button de validation cliqué ", Toast.LENGTH_LONG).show();
        btnMotDePasseOublie.setVisibility(Button.VISIBLE);
        Intent dashBoard = new Intent(this, DashBoard.class);
        startActivity(dashBoard);
    }

}