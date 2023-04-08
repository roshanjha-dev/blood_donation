package com.example.rohandsouza.blooddonation;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Home extends AppCompatActivity {

    String OPositive[] = {"Roshan                    9612625117", "Praveen                    9876578901", "Rohan                    8925462341", "Saurav                    9612625117", "Sachin                    9612625117","Rahul                    9612625117"};
    String BPositive[] = {"Roshan                    9612625117", "Praveen                    9612625117", "Rohan                    9612625117", "Saurav                    9612625117", "Sachin                    9612625117","Rahul                    9612625117", "Roshan                    9612625117", "Praveen                    9612625117", "Rohan                    9612625117", "Saurav                    9612625117", "Sachin                    9612625117","Rahul                    9612625117"};
    String APositive[] = {"Roshan", "Praveen", "Rohan", "Saurav", "Sachin","Rahul"};

    EditText e1;
    Button f;
    ListView listView;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        f = (Button)findViewById(R.id.donateBlood);
        e1 = (EditText)findViewById(R.id.searchDonor);
        listView = (ListView)findViewById(R.id.listView);
        search =(Button)findViewById(R.id.search);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("O+ve")){
                    ArrayAdapter<String> a = new ArrayAdapter<String>(Home.this,R.layout.support_simple_spinner_dropdown_item,OPositive);
                    listView.setAdapter(a);
                }
                else{
                    ArrayAdapter<String> a = new ArrayAdapter<String>(Home.this,R.layout.support_simple_spinner_dropdown_item,BPositive);
                    listView.setAdapter(a);
                }
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = (String)parent.getItemAtPosition(position);
                if(name.equals("Roshan                    9612625117")){
                    startActivity(new Intent(Home.this,Roshan.class));
                }
                else if(name.equals("Praveen                    9876578901")){
                    startActivity(new Intent(Home.this, Praveen.class));
                }
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, DonateBlood.class));
            }
        });






    }
}
