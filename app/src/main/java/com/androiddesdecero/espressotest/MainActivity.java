package com.androiddesdecero.espressotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.texto);
        textView = (TextView)findViewById(R.id.textView);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.reset:
                editText.setText("Texto");
                break;
            case R.id.cambiarActivity:
                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("input", editText.getText().toString());
                startActivity(intent);
                break;
            case R.id.cambiarTextView:
                textView.setText(editText.getText().toString());
                break;
        }
    }
}
