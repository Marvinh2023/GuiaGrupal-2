package utec.edu.sv.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2,et3;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.etValor1);
        et2 = findViewById(R.id.etValor2);
        et3 = findViewById(R.id.etSigno);
        tv1 = findViewById(R.id.tvResultado);
    }

    public void calcular(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String signo = et3.getText().toString();

        double v1 = Double.parseDouble(valor1);
        double v2 = Double.parseDouble(valor2);

        String respuesta = "";

        if(signo.equals("+")){
            respuesta = "La suma es: "+ (v1+v2);
        }else if(signo.equals("-")){
            respuesta = "La resta es: "+ (v1-v2);
        }else if(signo.equals("*") ){
            respuesta = "La multiplicacion es: "+ (v1*v2);
        }
        else if(signo.equals("/") ){
            respuesta = "La division es: "+ (v1/v2);
        }else{
            respuesta = "No ha ingresado un un signo valido para operar los valores";
        }
        tv1.setText(respuesta);
    }
}