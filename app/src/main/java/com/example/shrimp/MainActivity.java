package com.example.shrimp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    public  String  a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }
    ////////////////////////////////////////////
    public void alertDialog() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);  //Make AlertDialog
        if (a.equals("number")) {
            dialog.setTitle("     Stop!!!!");
            dialog.setMessage("ID shouldn't  only number");
            dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getApplicationContext(),"Chang your ID",Toast.LENGTH_LONG).show();
                }
            });
        }if(a.equals("IdOrPass")){
            dialog.setTitle("     Stop!!!!");
            dialog.setMessage("ID or Passord wrong");
            dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getApplicationContext(),"Chang your ID",Toast.LENGTH_LONG).show();
                }
            });
        }
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
    public void Login(View view) {

        TextInputEditText textId  =  findViewById(R.id.textView);
        TextInputEditText textPass =  findViewById(R.id.textView1);

        if(android.text.TextUtils.isDigitsOnly(textId.getText()) && !android.text.TextUtils.equals(textId.getText(),"")){
            a = "number";
            alertDialog();
        }
        if(textId.getText().length() < 4  || textPass.getText().length() < 8 ){
            a = "IdOrPass";
            alertDialog();
        }



    }


}
