package com.llab.ligablo.controllers.activities;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.llab.ligablo.R;
import com.llab.ligablo.base.Base;

import butterknife.BindView;
import butterknife.OnClick;

public class DrawerDashBoard extends Base implements NavigationView.OnNavigationItemSelectedListener, ConfigurationDialogFragment.DialogListener, StockDialogFragment.DialogListener {

    @BindView(R.id.activity_main_drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.activity_main_nav_view)
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
this.configureDrawerLayout();
        this.configureToolbar();
        this.configureNavigationView();
    }

    @Override
    public int getLayoutContentViewId() {
        return R.layout.activity_drawer_dash_board;
    }
    //connection avec les differentes activity venant du dashboard
    @OnClick(R.id.configurationCard)
    public  void onClickConfiguration() {

        ConfigurationDialogFragment dialogFragment = new ConfigurationDialogFragment();

        Bundle bundle = new Bundle();
        bundle.putBoolean("notAlertDialog", true);

        dialogFragment.setArguments(bundle);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);


        dialogFragment.show(ft, "dialog");


    }

    @OnClick(R.id.stockCard)
    public  void onClickStock() {
        Toast.makeText(DrawerDashBoard.this, " Card de stock cliqué ", Toast.LENGTH_LONG).show();
        StockDialogFragment dialogFragment2 = new StockDialogFragment();

        Bundle bundle = new Bundle();
        bundle.putBoolean("stockAlertDialog", true);

        dialogFragment2.setArguments(bundle);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);


        dialogFragment2.show(ft, "dialog");

    }

    @OnClick(R.id.inventaireCard)
    public  void onClickInventaire() {

        Intent inventaire = new Intent(DrawerDashBoard.this, Inventaire.class);
        startActivity(inventaire);

    }

    @OnClick(R.id.recouvrementCard)
    public  void onClickRecouvrement() {
        Toast.makeText(DrawerDashBoard.this, " Card de Recouvrement cliqué ", Toast.LENGTH_LONG).show();
        Intent recouvrement = new Intent(DrawerDashBoard.this, Recouvrement.class);
        startActivity(recouvrement);

    }

    @OnClick(R.id.ventesCard)
    public  void onClickVentes() {

        Intent ventes = new Intent(DrawerDashBoard.this, Ventes.class);
        startActivity(ventes);

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


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle Navigation Item Click
        int id = item.getItemId();

        switch (id){
            case R.id.activity_main_drawer_accueil :
                break;
            case R.id.activity_main_drawer_conctact:
                // Start appropriate activity
                Toast.makeText(DrawerDashBoard.this, " item contact du drawer clické ", Toast.LENGTH_SHORT).show();
                    //this.startContactActivity();

                break;
            case R.id.activity_main_drawer_profil:
                // Check if user is connected before launching BookingActivity

                break;
            default:
                break;
        }

        this.drawerLayout.closeDrawer(GravityCompat.START);

        return true;

    }

    private void startContactActivity() {
        Intent contactIntent = new Intent(DrawerDashBoard.this, MainActivity.class);
        startActivity(contactIntent);
    }

    protected void configureNavigationView(){
        navigationView.setNavigationItemSelectedListener(this);
    }

    protected void configureDrawerLayout(){

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onFinishEditDialog(String inputText) {

    }
}
