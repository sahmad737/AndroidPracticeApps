package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petImageView;
    private TextView petNameView;
    private TextView petBioView;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView=findViewById(R.id.petBioImageId);
        petNameView=findViewById(R.id.nameId);
        petBioView=findViewById(R.id.bioId);

        extras=getIntent().getExtras();

        if(extras != null){
            String name=extras.getString("name");
            String bio=extras.getString("bio");
            setUp(name,bio);
        }
    }

    public void setUp(String name,String bio){
        if (name.equals("Hamstu")){
            //wE Show hamster
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.hamster));
        petNameView.setText(name);
        petBioView.setText(bio);
    }
        else if(name.equals("Doggo")){
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            petNameView.setText(name);
            petBioView.setText(bio);
        }
    }
}