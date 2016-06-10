package com.example.krish.infodisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText age;
    private EditText phone;
    private EditText reg;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.nameText);
        age=(EditText)findViewById(R.id.age);
        phone=(EditText)findViewById(R.id.phoneText);
        reg=(EditText)findViewById(R.id.regText);
        submit=(Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameText=name.getText().toString();
                String ageText=age.getText().toString();
                String phoneText=phone.getText().toString();
                String regText=reg.getText().toString();
                String hi=reg.getText().toString();
                Intent intent= new Intent(MainActivity.this,DisplayActivity.class);
                intent.putExtra(getString(R.string.nameKey),nameText);
                intent.putExtra(getString(R.string.ageKey),ageText);
                intent.putExtra(getString(R.string.phoneKey),phoneText);
                intent.putExtra(getString(R.string.regKey),regText);
                startActivity(intent);

    }
    });

    }
}