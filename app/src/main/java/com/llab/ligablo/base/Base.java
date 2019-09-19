package com.llab.ligablo.base;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.llab.ligablo.R;

import butterknife.ButterKnife;

public abstract class Base extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(this.getLayoutContentViewId());
        ButterKnife.bind(this);
    }

    public abstract int getLayoutContentViewId();

    protected void configureToolbar(){
        ActionBar ab= getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

    }


}
