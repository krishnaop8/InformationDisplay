package com.example.krish.infodisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    private String nameText;
    private String phoneText;
    private String ageText;
    private String regText;
    private TextView nameT;
    private TextView regT;
    private TextView ageT;
    private TextView phoneT;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        nameT=(TextView)findViewById(R.id.name);
        ageT=(TextView)findViewById(R.id.age);
        regT=(TextView)findViewById(R.id.register);
        phoneT=(TextView)findViewById(R.id.phone);
        Intent intent= getIntent();
        nameText= intent.getStringExtra(getString(R.string.nameKey));
        ageText= intent.getStringExtra(getString(R.string.ageKey));
        phoneText= intent.getStringExtra(getString(R.string.phoneKey));
        regText= intent.getStringExtra(getString(R.string.regKey));
        nameT.setText(nameText);
        ageT.setText(ageText);
        phoneT.setText(phoneText);
        regT.setText(regText);
    }
}
