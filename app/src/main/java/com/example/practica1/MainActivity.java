package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rbMasculino, rbFemenino;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view) {
        //Creamos el Intent
        Intent intent = new Intent(this, SaludoActivity.class);

        EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
        EditText txtFechaNacimiento = (EditText) findViewById(R.id.txtFechaNacimiento);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        rbMasculino= (RadioButton)findViewById(R.id.rbMasculino);
        rbFemenino= (RadioButton)findViewById(R.id.rbFemenino);
        validarSexo();
        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        //Añadimos la información al intent
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("FECHANACIMIENTO", txtFechaNacimiento.getText().toString());
        b.putString("TELEFONO", txtTelefono.getText().toString());
        b.putString("GENERO", Global.sex);
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }

    public void validarSexo() {

        if (rbMasculino.isChecked() == true)
            Global.sex = "Masculino";
        {
            if (rbFemenino.isChecked() == true)
                Global.sex = "Femenino";
        }
    }
}