package com.camy.androidfinal;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;


public class NavigationDrawerAct extends AppCompatActivity {

    private WebView webView;


    Toolbar customToolBar;
    NavigationView nav_view;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    AddEmployeesFragment addEmployeesFragment;
    EmployeeFragment employeeFragment;

    DrawerLayout nav_drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        this.nav_drawer = (DrawerLayout) findViewById(R.id.nav_drawer);
        employeeFragment = new EmployeeFragment();

        //reference -  https://stackoverflow.com/questions/26486730/in-android-app-toolbar-settitle-method-has-no-effect-application-name-is-shown
        // for displaying title on ToolBar
        // reference - https://developer.android.com/training/implementing-navigation/nav-drawer
        // for Add the nav drawer button
        this.customToolBar = findViewById(R.id.Customtoolbar);
        setSupportActionBar(this.customToolBar);
        final ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("My title");
        actionbar.setDisplayHomeAsUpEnabled(true);


        fragmentManager = getSupportFragmentManager();
        this.fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_layout, employeeFragment);
        fragmentTransaction.commit();
        this.customToolBar.setTitle("Employees");



        nav_view = findViewById(R.id.nav_view);


    }
}
