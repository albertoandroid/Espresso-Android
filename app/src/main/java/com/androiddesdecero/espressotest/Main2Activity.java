package com.androiddesdecero.espressotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView)findViewById(R.id.texto2);
        Bundle inputData = getIntent().getExtras();
        String input = inputData.getString("input");
        textView.setText(input);
    }
}
