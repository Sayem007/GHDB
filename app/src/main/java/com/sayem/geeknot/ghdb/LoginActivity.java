package com.sayem.geeknot.ghdb;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button nfc, home;

    public  void homeActivity(){
        home= (Button)findViewById(R.id.btn_signin);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homer = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(homer);

            }
        });
    }

    public  void nfcActivity(){
        nfc= (Button)findViewById(R.id.btn_nfc);
        nfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nfcr = new Intent(LoginActivity.this, NFCActivity.class);
                startActivity(nfcr);

            }
        });
    }

    TextView tv1, tv2;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        homeActivity();
        nfcActivity();

        tv1=(TextView)findViewById(R.id.tv1);
        Typeface roboto = Typeface.createFromAsset(getAssets(), "font/Roboto-Medium.ttf");
        tv1.setTypeface(roboto);

        tv2=(TextView)findViewById(R.id.tv2);
        Typeface roboto1 = Typeface.createFromAsset(getAssets(), "font/Roboto-Medium.ttf");
        tv2.setTypeface(roboto1);

        btn1=(Button)findViewById(R.id.btn_signin);
        Typeface roboto2 = Typeface.createFromAsset(getAssets(), "font/Roboto-Regular.ttf");
        tv1.setTypeface(roboto2);

        btn2=(Button)findViewById(R.id.btn_nfc);
        Typeface roboto3 = Typeface.createFromAsset(getAssets(), "font/Roboto-Regular.ttf");
        btn2.setTypeface(roboto3);

        btn3=(Button)findViewById(R.id.btn_passHelp);
        Typeface roboto4 = Typeface.createFromAsset(getAssets(), "font/Roboto-Medium.ttf");
        btn3.setTypeface(roboto4);

        btn4=(Button)findViewById(R.id.btn_unmHelp);
        Typeface roboto5 = Typeface.createFromAsset(getAssets(), "font/Roboto-Medium.ttf");
        btn4.setTypeface(roboto5);
    }
}
