package com.elicastrillon.figurasgeometricas;

import android.content.Intent;
import android.graphics.Color;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Calculando extends AppCompatActivity {
Button eCalcular,lLimpiar,lVolver;
TextView nNombreFigura;
EditText aAncho,aAlto,aLargo,ePerimetro,aArea,vVolumen;
Double ancho1,alto1,largo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculando);


        // refundicion o Castin
        lVolver =(Button)findViewById(R.id.btn_volver);
        lLimpiar =(Button)findViewById(R.id.btn_limpiar);
        eCalcular =(Button)findViewById(R.id.btn_calcular);

        nNombreFigura =(TextView)findViewById(R.id.nombreFigura);
        aAncho =(EditText)findViewById(R.id.aAncho);
        aAlto =(EditText)findViewById(R.id.alto);
        aLargo =(EditText)findViewById(R.id.largo);
        ePerimetro =(EditText)findViewById(R.id.perimetro);
        aArea =(EditText)findViewById(R.id.area);
        vVolumen =(EditText)findViewById(R.id.volumen);

        //cerrar la aplicación.




        // Volver a la pantalla principal
        lVolver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

             //   Calculando.this.startActivity(new Intent(Calculando.this, MainActivity.class));
    Intent intent = new Intent (Calculando.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


// nada profe

        //limpiar campos
        lLimpiar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {



                // limpiar campos de cuadrado
                if(MainActivity.figura.equals("cuadrado")){
                    aAncho.setText("");
                    ePerimetro.setText("");
                    aArea.setText("");
                }


                //Limpiar Campos del Círculo

                else if(MainActivity.figura.equals("circulo")){
                    aAncho.setText("");
                    ePerimetro.setText("");
                    aArea.setText("");

                }
                // Limpiar Campos Cubo
                else if(MainActivity.figura.equals("cubo")){

                    aAncho.setText("");
                    ePerimetro.setText("");
                   aArea.setText("");
                    vVolumen.setText("");


                }

                // Limpiar Campos Triangulo

                else {

                    aAncho.setText("");

                    aAlto.setText("");

                    aLargo.setText("");
                    ePerimetro.setText("");
                    aArea.setText("");

                    vVolumen.setText("  ");

                }


            }











        });




            // evaluando el cuadrado
        if(MainActivity.figura.equals("cuadrado")){
            nNombreFigura.setText("CUADRADO");
            nNombreFigura.setTextColor(Color.BLACK);
            aAlto.setFocusable(false);
            aAlto.setText(" ");
            aLargo.setFocusable(false);
            aLargo.setText(" ");
            vVolumen.setText(" ");




           // acccion cuando se pulsa el boton evaluar
            eCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   try {
                       ancho1 = Double.parseDouble(aAncho.getText().toString());
                       ePerimetro.setText("P = " + String.valueOf(4 * ancho1));
                       aArea.setText("A = " + String.valueOf(ancho1 * ancho1));
                   }catch (Exception e){
                       Toast.makeText(getApplicationContext(),"Llenar Campos  Vacios Para Calcular", Toast.LENGTH_SHORT).show();}

                    vVolumen.setText(" ");


                }


            });
        }

        // Evaluando el circulo


       else if(MainActivity.figura.equals("circulo")){
            nNombreFigura.setText("CIRCULO");
            nNombreFigura.setTextColor(Color.BLACK);
            aAncho.setHint("Ingrese el Radio");
            aAlto.setFocusable(false);
            aAlto.setText("  ");
            aLargo.setFocusable(false);
            aLargo.setText(" ");
            vVolumen.setFocusable(false);
            vVolumen.setText("  ");

            eCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                      try {
                          ancho1 = Double.parseDouble(aAncho.getText().toString());
                          ePerimetro.setText("P = " + String.valueOf(2 * Math.PI * ancho1));
                          aArea.setText("A = " + String.valueOf(Math.PI * ancho1 * ancho1));
                      }catch (Exception e){
                          Toast.makeText(getApplicationContext(),"Llenar Campos  Vacios Para Calcular", Toast.LENGTH_SHORT).show();
                      }
                    vVolumen.setText(" ");


                }


            });

        }





      // Evaluando el Cubo

       else if(MainActivity.figura.equals("cubo")){

            nNombreFigura.setText("CUBO");
            nNombreFigura.setTextColor(Color.BLACK);
            aAncho.setHint("Ingrese el Lado");
            aAlto.setFocusable(false);
            aAlto.setText(" ");
            aLargo.setFocusable(false);
            aLargo.setText(" ");


            eCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ancho1 = Double.parseDouble(aAncho.getText().toString());
                        ePerimetro.setText("P = " + String.valueOf(12 * ancho1));
                        aArea.setText("A = " + String.valueOf(6 * ancho1 * ancho1));
                        vVolumen.setText("V = "+ancho1*ancho1*ancho1);
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Llenar Campos  Vacios Para Calcular", Toast.LENGTH_SHORT).show();
                    }



                }


            });

        }



        // evaluando el triangulo
       else {

            nNombreFigura.setText("TRIANGULO RECTANGULO");
            nNombreFigura.setTextColor(Color.BLACK);
            nNombreFigura.setTextSize(20);


            aAncho.setHint("Cateto Opuesto ");

            aAlto.setHint("Cateto Adyacente");

            aLargo.setHint("Hipotenuza");

            vVolumen.setText("  ");

            eCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                       try {
                           ancho1 = Double.parseDouble(aAncho.getText().toString());
                           largo1 = Double.parseDouble(aLargo.getText().toString());
                           alto1 = Double.parseDouble(aAlto.getText().toString());
                           ePerimetro.setText("P = " + String.valueOf(ancho1 + largo1 + alto1));
                           aArea.setText("A = " + String.valueOf((ancho1 * largo1) / 2));
                       }catch (Exception e){
                           Toast.makeText(getApplicationContext(),"Llenar Campos  Vacios Para Calcular", Toast.LENGTH_SHORT).show();
                       }
                    vVolumen.setText(" ");


                }


            });



        }




    }

}
