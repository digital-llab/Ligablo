package com.llab.ligablo.controllers.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.llab.ligablo.R;
import com.llab.ligablo.base.Base;

import butterknife.BindView;
import butterknife.OnClick;

public class DrawerDashBoard extends Base {

    @BindView(R.id.activity_main_drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.activity_main_nav_view)
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.configureToolbar();
    }

    @Override
    public int getLayoutContentViewId() {
        return R.layout.activity_drawer_dash_board;
    }
    //connection des differentes activity venant du dashboard
    @OnClick(R.id.configurationCard)
    public  void onClickConfiguration() {
        Toast.makeText(DrawerDashBoard.this, " Card de configuration cliqué ", Toast.LENGTH_LONG).show();


    }

    @OnClick(R.id.stockCard)
    public  void onClickStock() {
        Toast.makeText(DrawerDashBoard.this, " Card de stock cliqué ", Toast.LENGTH_LONG).show();


    }

    @OnClick(R.id.inventaireCard)
    public  void onClickInventaire() {
        Toast.makeText(DrawerDashBoard.this, " Card de Inventaire cliqué ", Toast.LENGTH_LONG).show();


    }

    @OnClick(R.id.recouvrementCard)
    public  void onClickRecouvrement() {
        Toast.makeText(DrawerDashBoard.this, " Card de Recouvrement cliqué ", Toast.LENGTH_LONG).show();


    }

    @OnClick(R.id.ventesCard)
    public  void onClickVentes() {
        Toast.makeText(DrawerDashBoard.this, " Card de ventes cliqué ", Toast.LENGTH_LONG).show();


    }
    @Override
    public void onBackPressed() {
        // 5 - Handle back click to close menu
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



}
