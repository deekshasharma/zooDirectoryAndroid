package com.example.deeksha.zoo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    final Animal animal = new Animal();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

                if(position == animalNames.length - 1)
                {
                    openDialog(image, name, description);
                }

                if(position < animalNames.length - 1){
                Intent intent = new Intent(getApplicationContext(),AnimalDetailActivity.class);
                intent.putExtra("DetailName",name);
                intent.putExtra("DetailImage",image);
                intent.putExtra("DetailDescription",description);
                startActivity(intent);}

            }
        });
    }


    private void openDialog(final int imageId, final String name, final String description)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Warning!!");
        builder.setMessage("Scary Animal! Do you want to click ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(getApplicationContext(),AnimalDetailActivity.class);

                        intent.putExtra("DetailName",name);
                        intent.putExtra("DetailImage",imageId);
                        intent.putExtra("DetailDescription",description);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //
                    }
                });
        builder.create().show();

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
