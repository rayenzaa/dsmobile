package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
        EditText nomInput = findViewById(R.id.editTextNom);
        String nom = nomInput.getText().toString();

        EditText prenomInput = findViewById(R.id.editTextPrenom);
        String prenom = prenomInput.getText().toString();

        CheckBox checkboxHackathon = findViewById(R.id.checkboxHackathon);
        boolean isHackathonSelected = checkboxHackathon.isChecked();

        CheckBox checkboxCertification = findViewById(R.id.checkboxCertification);
        boolean isCertificationSelected = checkboxCertification.isChecked();

        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Bonjour ! " + " " + nom+prenom + " Vous avez choisi de participer à : ";
                if (isHackathonSelected) {
                    message += " hackathon";
                }
                if(isCertificationSelected){
                    message += " Session de certification";
                }
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("message",message);
                startActivity(intent);
            }

        });
    }

}