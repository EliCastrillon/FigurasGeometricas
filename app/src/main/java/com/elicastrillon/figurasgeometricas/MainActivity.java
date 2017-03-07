package com.elicastrillon.figurasgeometricas;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
public static String figura;
Button sSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sSalir=(Button)findViewById(R.id.sSalir);

        // Boton Salir
        sSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                   System.exit(0);

            }
        });

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?


        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.cCuadrado:
                Intent intent = new Intent (MainActivity.this, Calculando.class);
                startActivity(intent);

               // MainActivity.this.startActivity(new Intent(MainActivity.this, Calculando.class));
                //nada profe

                figura="cuadrado";
                break;

            case R.id.cCirculo:
                MainActivity.this.startActivity(new Intent(MainActivity.this, Calculando.class));
                figura="circulo";
                 break;

            case R.id.tTriangulo:
                MainActivity.this.startActivity(new Intent(MainActivity.this, Calculando.class));
                figura="triangulo";
                break;
            case R.id.cCubo:
                MainActivity.this.startActivity(new Intent(MainActivity.this, Calculando.class));
                figura="cubo";
                break;

        }






    }

}
