package br.ufba.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicouNoBotao(View v){

        TextView imcResultado = (TextView)findViewById(R.id.imcResultado);
        EditText txtPeso = (EditText) findViewById(R.id.editPeso);
        EditText txtAltura = (EditText) findViewById(R.id.editAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());
        float resultado = peso / (altura * altura);

        if(resultado < 18.5){
           imcResultado.setText("Abaixo do peso!");
        }
        else if(resultado >= 18.5 & resultado <= 24.9){
           imcResultado.setText("Peso normal!");
        }
        else if(resultado >= 25 & resultado <= 29.9){
            imcResultado.setText("Sobrepeso!");
        }
        else{
            imcResultado.setText("Obeso!");
        }
    }
}