package com.nr.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    EditText numeror,numerorc,valorr,valorrc;
    Button recarga;
    daoRecarga daor;
    Spinner operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numeror=findViewById(R.id.numeror);
        numerorc=findViewById(R.id.numerorc);
        valorr=findViewById(R.id.valorr);
        valorrc=findViewById(R.id.valorrc);
        recarga=findViewById(R.id.recarga);
        operador=findViewById(R.id.operador);
        recarga.setOnClickListener(this);
        daor=new daoRecarga(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.recarga:
                String nur = numeror.getText().toString();
                String nurc = numerorc.getText().toString();
                String var = valorr.getText().toString();
                String varc = valorrc.getText().toString();

                Recarga r=new Recarga();
                r.setNumero(numeror.getText().toString());
                r.setValor( valorr.getText().toString());
                r.setOperador(operador.getSelectedItem().toString());

                if(nur.equals("")|| var.equals("")|| nurc.equals("")|| varc.equals("")) {
                    Toast.makeText(this, "Error:campos vacios", Toast.LENGTH_LONG).show();
                }else if(!validaNumero(nur)){
                    numeror.setError("Utilice 10 Digitos");
                }else if (!nur.equals(nurc)) {
                    numerorc.setError("El número no coincide");
                }else if( !(Integer.parseInt(var) > 0)) {
                    valorr.setError("El valor debe ser mayor que cero");
                }else if (!var.equals(varc)) {
                    valorrc.setError("el valor de la recarga no coincide");
                } else if (daor.insertRecarga(r)) {
                    Toast.makeText(this, "Recarga Realizada!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }

                break;
        }
    }
    private boolean validaNumero(String numm) {
        return numm.length() ==10 ;
    }
}
