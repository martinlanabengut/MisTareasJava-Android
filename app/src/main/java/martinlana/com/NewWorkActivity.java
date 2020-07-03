package martinlana.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class NewWorkActivity extends AppCompatActivity {

    ImageButton back;

    //Defino 3 ArrayLists( desc es de descripcion)

    ArrayList<String> tarea, fecha, desc;

    //Creamos objetos edittext
    EditText etTarea, etDia, etMes, etAnio, etDesc;

    //Boton de guardar
    Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_work);

        //Inicializamos nuestros 3 arrays

        tarea = new ArrayList<String>();
        fecha = new ArrayList<String>();
        desc = new ArrayList<String>();

        //Debemos Hacer la referencia de nuestros edittext
        etTarea = (EditText) findViewById(R.id.et_tarea);
        etDia = (EditText) findViewById(R.id.et_dia);
        etMes = (EditText) findViewById(R.id.et_mes);
        etAnio = (EditText) findViewById(R.id.et_anio);
        etDesc = (EditText) findViewById(R.id.et_desc);


        //Le damos la referencia al boton

        btnGuardar = (Button) findViewById(R.id.btn_guardar);




        back = (ImageButton) findViewById(R.id.back_anw);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

     //Le damos la funcionalidad al boton
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cuando demos en clic en este boton guardar, llamara al metodo guardarDatos
                guardarDatos();
                //mostrar();
            }
        });


    }

    // Creo un metodo guardarDatos, que traera todos los datos de los edittext y los almacenara en los ArraysList
    public void guardarDatos(){

        //Creo 3 variables
        String work;
        String date;
        String description;

       //Todo lo que habia en mis edittext lo almaceno en estas variables.

        work  = etTarea.getText().toString();
        date = etDia.getText().toString() + "/" + etMes.getText().toString() + "/" + etAnio.getText().toString();
        description = etDesc.getText().toString();


        tarea.add(work);
        fecha.add(date);
        desc.add(description);

    }

    //Creamos un metodo para mostrar los arreglos

    //Metodo de prueba para verificar que muestre lo guardado
   // public void mostrar(){
        //Obtengo la primera posicion de cada uno de mis arreglos
       // Toast.makeText( this, tarea.get(0), Toast.LENGTH_SHORT).show();
      //  Toast.makeText( this, fecha.get(0), Toast.LENGTH_SHORT).show();
    //Toast.makeText( this, desc.get(0), Toast.LENGTH_SHORT).show();

    //}

    //Este metodo enviara el arreglo que se llama tarea
    public void enviarDatos(){

    }
}
