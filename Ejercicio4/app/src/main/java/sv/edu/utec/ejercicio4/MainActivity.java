package sv.edu.utec.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.tvResultado);
    }


    public void procesar(View view){
        int n = 1; String acumMe = "";
        n+=77;
        acumMe  = "N + 77 = "+n;
        n-=3;
        acumMe  = acumMe+ "\nN - 3 = "+n;
        n*=2;
        acumMe  = acumMe+ "\nN * 3 = "+n;
        resultado.setText(acumMe);
    }
}