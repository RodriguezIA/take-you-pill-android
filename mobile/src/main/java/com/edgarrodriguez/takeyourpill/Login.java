package com.edgarrodriguez.takeyourpill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //metodo para ir a registro
    public void Registro(View view) {
        Intent siguiente = new Intent(this, Sigin.class);
        startActivity(siguiente);
    }
}