package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tx1, tx2, tx3, tx4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tx1 = (TextView)findViewById(R.id.tx1);
        tx2 = (TextView)findViewById(R.id.tx2);
        tx3 = (TextView)findViewById(R.id.tx3);
        tx4 = (TextView)findViewById(R.id.tx4);

        String dato1 = getIntent().getStringExtra("dato1");
        tx1.setText("Ingrese el Nombre : "+ dato1);
        String dato2 = getIntent().getStringExtra("dato2");
        tx2.setText("Ingrese el Apellido: "+ dato2);
        String dato3 = getIntent().getStringExtra("dato3");
        tx3.setText("Ingrese la Edad : "+ dato3);
        String dato4 = getIntent().getStringExtra("dato4");
        tx4.setText("Ingrese el Correo : "+ dato4);

    }
    public void retro(View v){
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);

    }
}
