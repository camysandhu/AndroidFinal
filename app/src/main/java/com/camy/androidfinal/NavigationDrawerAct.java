package com.camy.androidfinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
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
    HomeFragment homeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        this.nav_drawer = (DrawerLayout) findViewById(R.id.nav_drawer);
        employeeFragment = new EmployeeFragment();

        //reference -  https://stackoverflow.com/questions/26486730/in-android-app-toolbar-settitle-method-has-no-effect-application-name-is-shown
        // reference - https://developer.android.com/training/implementing-navigation/nav-drawer
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

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.home123:
                        if(homeFragment == null)
                        {
                           homeFragment = new HomeFragment();
                        }
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout, homeFragment, null);
                        fragmentTransaction.commit();
                        actionbar.setTitle("Home");
                        NavigationDrawerAct.this.nav_drawer.closeDrawer(Gravity.START, true);
                        Snackbar.make(nav_view,"Home",Snackbar.LENGTH_SHORT).show();
                        break;



                    case R.id.employees :
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout, employeeFragment, null);
                        fragmentTransaction.commit();
                        actionbar.setTitle("Employees");
                        NavigationDrawerAct.this.nav_drawer.closeDrawer(Gravity.START, true);
                        Snackbar.make(nav_view,"Employee",Snackbar.LENGTH_SHORT).show();
                        break;



                    case R.id.add_employee :
                        if(addEmployeesFragment == null)
                        {
                            addEmployeesFragment = new AddEmployeesFragment();
                        }
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout, addEmployeesFragment);
                        fragmentTransaction.commit();
                        actionbar.setTitle("Add employee");
                       NavigationDrawerAct.this.nav_drawer.closeDrawer(Gravity.START, true);
                        Snackbar.make(nav_view,"Add Employee",Snackbar.LENGTH_SHORT).show();

                        break;

                    case R.id.logout :
                        startActivity(new Intent(NavigationDrawerAct.this, LoginActivity.class));
                        Toast.makeText(NavigationDrawerAct.this, "Logout" , Toast.LENGTH_LONG).show();
                        break;

                    case R.id.help:
                        showAlertHelp();

                }



                return true;
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.nav_drawer.openDrawer(Gravity.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void showAlertHelp()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

       alertDialogBuilder.setTitle("Contact Us ");
        alertDialogBuilder.setMessage("Email Us: admin@payroll.com");
       alertDialogBuilder.setMessage("Email Us: admin@payroll.com\n" +
                "Contact Us: (+1)234-567-33333");
        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish();
            }
        });
        
        AlertDialog mAlertDialog = alertDialogBuilder.create();
        mAlertDialog.show();
    }
}
