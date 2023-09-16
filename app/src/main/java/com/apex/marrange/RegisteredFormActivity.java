package com.apex.marrange;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class RegisteredFormActivity extends AppCompatActivity {
        LinearLayout submitBtn;
        Spinner spinner;
        EditText fullNameTxt;
        EditText emailTxt;
        EditText contactNoTxt;
        CheckBox agreed_Chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_registeredform);
        spinner=findViewById(R.id.purpase_spinner);
        List<String> list = new ArrayList<>();
        list.add("Parties");
        list.add("Wedding");
        list.add("Brith days");
        list.add("Coorpetation Events");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        fullNameTxt=findViewById(R.id.fullName_txt);
        emailTxt=findViewById(R.id.email_txt);
        contactNoTxt=findViewById(R.id.contactNo_txt);
        agreed_Chk=findViewById(R.id.agreed_chk);

        submitBtn=findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSubmitBtn();
            }
        });
    }

    private void setSubmitBtn(){
        startActivity(new Intent(RegisteredFormActivity.this,MainActivity.class));
        finish();
    }
}
