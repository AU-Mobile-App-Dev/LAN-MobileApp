package com.example.dlee.lanlogin;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registerActivity extends AppCompatActivity {

    protected EditText susername;
    protected EditText semail;
    protected EditText spassword;
    protected EditText sconfpassword;
    protected EditText szipcode;
    protected Button   ssignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // inilize
        susername = (EditText)findViewById(R.id.signupUsername);
        semail = (EditText)findViewById(R.id.signupEmail);
        spassword = (EditText)findViewById(R.id.signupPassword);
        sconfpassword = (EditText)findViewById(R.id.signupConfirmPassword);
        szipcode = (EditText)findViewById(R.id.signupZipcode);
        ssignup = (Button)findViewById(R.id.signupButton);

        ssignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // parse user
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
