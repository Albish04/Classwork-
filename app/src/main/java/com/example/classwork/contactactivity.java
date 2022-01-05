package com.example.classwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class contactactivity extends AppCompatActivity {
    Button Contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Contact = findViewById(R.id.contact);

        Contact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(contactactivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
