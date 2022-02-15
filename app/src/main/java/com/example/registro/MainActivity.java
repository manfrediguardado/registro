package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre, apellido, edad, mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.nombre);
        apellido = (EditText)findViewById(R.id.apellido);
        edad = (EditText)findViewById(R.id.edad);
        mail = (EditText)findViewById(R.id.mail);

    }

    public void envia(View v){
        Intent j = new Intent( this, MainActivity2.class);
        j.putExtra("dato1", nombre.getText().toString());
        j.putExtra("dato2", apellido.getText().toString());
        j.putExtra("dato3", edad.getText().toString());
        j.putExtra("dato4", mail.getText().toString());

        startActivity(j);
    }


}