package utec.edu.sv.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tvMensaje);
        et1 = findViewById(R.id.etNombre);
    }

    public void mensaje(View view){
        tv1.setText("Bienvenido: "+ et1.getText().toString());
    }
}