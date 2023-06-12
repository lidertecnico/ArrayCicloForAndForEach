package unal.todosalau.arraylistforandforeach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "IteracionArrayList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crear un ArrayList de tipo String
        ArrayList<String> listaNombres = new ArrayList<>();

        // Agregar elementos al ArrayList
        listaNombres.add("Juan");
        listaNombres.add("María");
        listaNombres.add("Pedro");
        listaNombres.add("Ana");

        // Iteración usando un bucle for
        Log.d(TAG, "Iteración usando bucle for:");
        for (int i = 0; i < listaNombres.size(); i++) {
            String nombre = listaNombres.get(i);
            Log.d(TAG, nombre);
        }

        // Iteración usando un bucle foreach
        Log.d(TAG, "Iteración usando bucle foreach:");
        for (String nombre : listaNombres) {
            Log.d(TAG, nombre);
        }
    }
}