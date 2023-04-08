package com.example.rohandsouza.blooddonation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username = "roshanjha";
    String password = "roshan123";

    EditText e1, e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.length() == 0 && e2.length() == 0){
                    Toast.makeText(MainActivity.this, "Enter the username and password", Toast.LENGTH_SHORT).show();
                }
                else if(e1.getText().toString().equals("roshanjha") && e2.getText().toString().equals("roshan123")){
                    startActivity(new Intent(MainActivity.this, Home.class));
                }
                else {
                    Toast.makeText(MainActivity.this, "This user is not registerd", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, register.class));
            }
        });

    }
}
