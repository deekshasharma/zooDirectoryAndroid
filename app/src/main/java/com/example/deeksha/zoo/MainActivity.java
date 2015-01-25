package com.example.deeksha.zoo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animal animal = new Animal();
        final String[] animalNames = animal.getAnimalNames();
        final Integer[] imageId = animal.getImageId();
        final String[] animalDescriptions = animal.getAnimalDescriptions();

        ListView listView = (ListView) findViewById(R.id.animalList);
        final CustomList customList = new CustomList(this, animalNames,imageId);
        listView.setAdapter(customList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String name = animalNames[position];
                int image = imageId[position];
                String description = animalDescriptions[position];

                Intent intent = new Intent(getApplicationContext(),AnimalDetailActivity.class);
                intent.putExtra("DetailName",name);
                intent.putExtra("DetailImage",image);
                intent.putExtra("DetailDescription",description);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_information) {

            Intent intent = new Intent(getApplicationContext(),ZooInfoActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
