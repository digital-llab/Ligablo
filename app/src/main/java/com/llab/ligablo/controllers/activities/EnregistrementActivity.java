package com.llab.ligablo.controllers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.llab.ligablo.R;
import com.llab.ligablo.base.Base;

import butterknife.OnClick;

public class EnregistrementActivity extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.configureToolbar();


    }

    @Override
    public int getLayoutContentViewId() {
        return R.layout.activity_enregistrement;
    }

    @OnClick(R.id.btnEnregistrementValider)
    public void onClickEnregistrementValider() {
        Toast.makeText(EnregistrementActivity.this, " Button de validation cliqué ", Toast.LENGTH_LONG).show();

    }
    @OnClick(R.id.btnEnregistrementFacebook)
    public void onClickEnregistrementFacebook() {
        Toast.makeText(EnregistrementActivity.this, " Button d'enregistrement avec Facebook cliqué ", Toast.LENGTH_LONG).show();

    }
}
