package com.lecco.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btn;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btnSaludar);
        user = (EditText)findViewById(R.id.txtUser);
        pass = (EditText)findViewById(R.id.txtPassword);
    }

    public void Saludar(View view) {

        String _user = user.getText().toString();
        String _pass = pass.getText().toString();

        if(_user.compareTo("alex") == 0 && _pass.compareTo("lecco") == 0) {
            Toast.makeText(getApplicationContext(), "Ciao mondo!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Login Error", Toast.LENGTH_LONG).show();
        }
    }
}
