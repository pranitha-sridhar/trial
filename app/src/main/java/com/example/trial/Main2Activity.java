package com.example.trial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t=(TextView)findViewById(R.id.n);
        Intent intent=getIntent();
        s=intent.getStringExtra(MainActivity.EXTRA_TEXT);
        t.setText(s);

    }
}
