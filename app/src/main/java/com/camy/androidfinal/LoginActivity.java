package com.camy.androidfinal;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText loginUsername,loginPassword;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginUsername = findViewById(R.id.edUsername);
        loginPassword = findViewById(R.id.edPassword);
        loginButton = findViewById(R.id.btnLogin);

        loginUsername.setText("user@employee.com");
        loginPassword.setText("s3cr3t");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                // user@employee.com/s3cr3t
                if(loginUsername.getText().toString().trim().equals("user@employee.com")
                        && loginPassword.getText().toString().trim().equals("s3cr3t"))
                {
                    Intent mIntent = new Intent(LoginActivity.this, NavigationDrawerAct.class);
                    startActivity(mIntent);

                }
                else
                {
                    showAlertError();

//                    loginUsername.setError("Fill an Adequate Email");
//                    loginPassword.setError("Fill an Adequate Password");
                }
            }
        });
    }
    public void showAlertError()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("Login error");



        AlertDialog mAlertDialog=alertDialogBuilder.create();
        mAlertDialog.show();
    }



    }

