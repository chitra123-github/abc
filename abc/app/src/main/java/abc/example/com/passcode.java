package abc.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class passcode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode);
        EditText edit=(EditText)findViewById(R.id.code);
        String result= edit.getText().toString();

        if(result == "1234567"){
            startActivity(new Intent(passcode.this, register.class));
        }

    }
}
