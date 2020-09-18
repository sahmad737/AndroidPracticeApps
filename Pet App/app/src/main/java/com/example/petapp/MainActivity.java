package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView hamsterView;
    private ImageView dogView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hamsterView =findViewById(R.id.hamsterImage);
        dogView = findViewById(R.id.dogImage);

        //Attaching a clicklistener to images
//
//        hamsterView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"Hamster Touched",Toast.LENGTH_SHORT).show();
//            }
//        });
//

            hamsterView.setOnClickListener(this);
            dogView.setOnClickListener(this);


}

    @Override
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.hamsterImage:
                 //Go to Hamster Activity
//                 Toast.makeText(MainActivity.this,"Hamster Touched",Toast.LENGTH_SHORT).show();
                 Intent hamsterIntent= new Intent(MainActivity.this,BioActivity.class);
                 hamsterIntent.putExtra("name","Hamstu");
                 hamsterIntent.putExtra("bio","Can generate electicity. Cute hamster");
                 startActivity(hamsterIntent);

                 break;

             case R.id.dogImage:
//                 Toast.makeText(MainActivity.this,"Dog Touched",Toast.LENGTH_SHORT).show();
                 //Go to Dog Activity
                 Intent dogIntent= new Intent(MainActivity.this,BioActivity.class);
                 dogIntent.putExtra("name","Doggo");
                 dogIntent.putExtra("bio","Can not generate electicity. Cute dog!");
                 startActivity(dogIntent);
                 break;

         }

    }
}