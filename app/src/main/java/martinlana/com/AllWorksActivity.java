 package martinlana.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.List;

 public class AllWorksActivity extends AppCompatActivity {

    ListView listWorks;
    ArrayAdapter<String> adapter;
    ImageButton back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_works);

        listWorks =(ListView) findViewById(R.id.list_works);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        back = (ImageButton) findViewById(R.id.back_aaw);
         back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 onBackPressed();

             }
         });

        adapter.add("Tarea 1");
        adapter.add("Tarea 2");
        adapter.add("Tarea 3");

        listWorks.setAdapter(adapter);
    }
}
