package com.example.registerationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText name;
    EditText email;
    EditText mobile;
    EditText address;
    EditText occupation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view)
    {
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        mobile = findViewById(R.id.mobile);
        address = findViewById(R.id.address);
        occupation = findViewById(R.id.occupation);
        if(!(name.getText().toString().isEmpty() && email.getText().toString().isEmpty() && mobile.getText().toString().isEmpty() && address.getText().toString().isEmpty() && occupation.getText().toString().isEmpty()))
            Toast.makeText(this, "Form Submitted", Toast.LENGTH_SHORT).show();
    }
}