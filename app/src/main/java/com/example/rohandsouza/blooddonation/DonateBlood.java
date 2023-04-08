package com.example.rohandsouza.blooddonation;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DonateBlood extends AppCompatActivity {

    EditText e1,e2,e3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_blood);

        e1 = (EditText)findViewById(R.id.donatedDate);
        e2 = (EditText)findViewById(R.id.weight);
        e3 = (EditText)findViewById(R.id.disease);
        b1 = (Button)findViewById(R.id.Submit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((e1.length() == 0) && (e2.length() == 0) && (e3.length() == 0)) {
                    Toast.makeText(DonateBlood.this, "Please fill in the details", Toast.LENGTH_SHORT).show();
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(DonateBlood.this);
                    builder.setTitle("Thank You!!!")
                            .setMessage("Thank you for registering. Your blood may save many life. You will be notified with the schedule and the venue.")
                            .setCancelable(false);
                    builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(DonateBlood.this, Home.class));
                            finish();
                        }
                    });
                    builder.show();
                }
            }
        });


    }
}
