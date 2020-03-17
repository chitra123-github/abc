package abc.example.com;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


import android.os.Bundle;

public class selectbest_layout extends AppCompatActivity {
    public static final String[] stop = new String[]{ "Mulund Depo", "Mulund Checknaka","Vashi depo","Vashi Station"};
    public static final String[] stop1 = new String[]{ "Mulund Depo", "Mulund Checknaka","Vashi depo","Vashi Station"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectbest_layout);
        String[] STOP = getResources().getStringArray(R.array.STOP);
        AutoCompleteTextView edittext = findViewById(R.id.atv);
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, STOP);
        edittext.setAdapter(adapter);


        String[] STOP1 = getResources().getStringArray(R.array.STOP1);

        AutoCompleteTextView editext1 = findViewById(R.id.atv1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,STOP1);
        editext1.setAdapter(adapter1);





    }
}
