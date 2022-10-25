package com.yogesh.greetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



//    Step 2: Declaring the Widgets

    TextView textView;
    Button btn;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);


//        Step 3: Adding the Functionality
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Hello "+name, Toast.LENGTH_SHORT).show();
            }
        });


    }
}