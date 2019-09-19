package com.llab.ligablo.controllers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.llab.ligablo.R;
import com.llab.ligablo.base.Base;

import butterknife.OnClick;

public class ConnectionActivity extends Base {

    //@BindView(R.id.btnMotDePasseOublie) Button btnMotDePasseOublie;
    //@BindView(R.id.btnConnectionValider) Button btnValider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.configureToolbar();
    }

    @Override
    public int getLayoutContentViewId() {
        return R.layout.activity_connection;
    }

    @OnClick(R.id.btnConnectionValider)
    public  void onClickValider() {
        Toast.makeText(ConnectionActivity.this, " Button de validation cliqué ", Toast.LENGTH_LONG).show();
        //btnMotDePasseOublie.setVisibility(Button.VISIBLE);
        Intent dashBoard = new Intent(ConnectionActivity.this, DrawerDashBoard.class);
        startActivity(dashBoard);
    }


}