package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    TextView msj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        //Localizar los controles
        msj=(TextView) findViewById(R.id.txtSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bRecibe = this.getIntent().getExtras();
        if(bRecibe!=null){
            String  nombre=bRecibe.getString("NOMBRE");
            String  FechaNacimiento=bRecibe.getString("FECHANACIMIENTO");
            String  telefono=bRecibe.getString("TELEFONO");
            String  genero=bRecibe.getString("GENERO");

            //Construimos el mensaje a mostrar
            msj.setText("Bienvenido: "+nombre+"\n"+"Genero: "+genero+"\n"+"Tu fecha de Nacimiento es: "+FechaNacimiento+"\n"+"Tu Teléfono es: "+telefono);
        }
    }

    public void onclick(View view) {
        finish();
    }
}