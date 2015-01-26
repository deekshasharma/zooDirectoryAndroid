package com.example.deeksha.zoo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class AnimalDetailActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);

        Intent myIntent = getIntent();
        String animalName = myIntent.getStringExtra("DetailName");
        int animalImageId = myIntent.getIntExtra("DetailImage", 0);
        String description = myIntent.getStringExtra("DetailDescription");

        TextView animalDescription = (TextView) this.findViewById(R.id.animalDescription);
        animalDescription.setText(description);
        TextView detailAnimalName = (TextView) this.findViewById(R.id.detailAnimalName);
        detailAnimalName.setText(animalName);
        ImageView detailAnimalImage = (ImageView) this.findViewById(R.id.detailAnimalImage);
        detailAnimalImage.setImageResource(animalImageId);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_animal_detail,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_information)
        {
            Intent intent = new Intent(getApplicationContext(),ZooInfoActivity.class);
            startActivity(intent);
            return true;
        }
        if(id == R.id.action_uninstall)
        {
            Uri packageURI = Uri.parse("package:com.example.deeksha.zoo");
            Intent intent = new Intent(Intent.ACTION_DELETE,packageURI);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
