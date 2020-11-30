package cl.example.desafiosimpleweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import cl.example.desafiosimpleweather.databinding.ActivityMainBinding;

/*
 * [x] 1. Crear un proyecto desde el template de actividad vacía.
 * [X] 2. Copiar los recursos entregados dentro de los directorios correspondientes.
 * [X] 3. Configurar DataBinding en archivo build.gradle y enlazar en MainActivity.
 * [X] 4. Cambiar el layout usando background_grandient.xml como fondo.
 * [X] 5. Crear una nueva imagen de un sol usando Vector Asset y la galería de imágenes incluida en el SDK.
 * [] 6. Agregar las vistas para cumplir con la interfaz usando ConstraintLayout. Estas son:
 *    [X] TextView para la ciudad
      [X] TextView para la fecha
      [X] ImageView para el clima
      [X] TextView para la temperatura
      [X] TextView para la unidad de medida (grados celsius)
 * [X] 7. Crear una clase DailyWeather con los atributos para ciudad, fecha, imagen de clima, temperatura y unidad que serán utilizados en la interfaz
 * [] 8. Utilizar Data Binding para asignar los valores a desplegar por las vistas en MainActivity.
 *
 */
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
       
        DailyWeather clima = new DailyWeather ("Santiago", "02 de Julio", "R.drawable.ic_sol", "16", "°C");
        binding.setClima(clima);


        this.mostrarTexto();
    }

    private void mostrarTexto() {
    }
}