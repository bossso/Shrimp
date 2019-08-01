package com.example.shrimp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Login(View view) {
        EditText textView =  findViewById(R.id.textView);
        TextView textView1 = findViewById(R.id.textView3);
        TextView textView2 = findViewById(R.id.textView4);
        EditText editText = findViewById(R.id.textView1);

        textView1.setText(textView.getText());
        textView2.setText(editText.getText());


    }
}
