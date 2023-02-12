package utec.edu.sv.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private EditText n1;
    private double iva = 0.13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 =  findViewById(R.id.nPrecio);
        tv1 = findViewById(R.id.tvResultado);
    }

    public void calcular(View view){
        String precio = n1.getText().toString();
        double data1 = Double.parseDouble(precio);
        double r = (data1 * iva) + data1;
        tv1.setText("El precio con iva es: "+r);
    }
}