package com.sayem.geeknot.ghdb;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NFCActivity extends AppCompatActivity {

    TextView tv3, tv4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc);

        tv3= (TextView)findViewById(R.id.tv3);
        Typeface roboto = Typeface.createFromAsset(getAssets(), "font/Roboto-Medium.ttf");
        tv3.setTypeface(roboto);

        tv4=(TextView)findViewById(R.id.tv4);
        Typeface roboto1 = Typeface.createFromAsset(getAssets(), "font/Roboto-Medium.ttf");
        tv4.setTypeface(roboto1);

        btn5= (Button)findViewById(R.id.btn_noNfc);
        Typeface roboto2 = Typeface.createFromAsset(getAssets(), "font/Roboto-Medium.ttf");
        btn5.setTypeface(roboto2);
    }
}
