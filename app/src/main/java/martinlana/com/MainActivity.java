package martinlana.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    //Creo un objeto tipo button que se llamara btnallwork y btnnewwork, e importo sus biblotecas

    Button btnAllWorks;
    Button btnNewWork;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ahora debemos enlazar los botones con su vista

        btnAllWorks = (Button) findViewById(R.id.btnAllWorks);
        btnNewWork = (Button) findViewById(R.id.btnNewWork);

        btnAllWorks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //En este metodo hara una accion cuando demos click
                //Creamos un objeto de tipo Intent(Es un objeto que usa android para interactuar en nuestra pantalla),Nosotros lo utilizaremos para abrir nuestras pantallas
                Intent intent = new Intent(getApplicationContext(), AllWorksActivity.class);
                startActivity(intent );
            }
        });

        btnNewWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), NewWorkActivity.class);
                startActivity(intent );

            }
        });

    }

}
