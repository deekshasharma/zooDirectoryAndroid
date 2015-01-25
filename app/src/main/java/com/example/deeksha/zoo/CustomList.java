package com.example.deeksha.zoo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {

    private Activity context ;
    private String[] animalItems;
    private Integer[] imageId;

    public CustomList(Activity context, String[] foodItems, Integer[] imageId)
    {
        super(context, R.layout.list_item,foodItems);
        this.context = context;
        this.animalItems = foodItems;
        this.imageId = imageId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View row = layoutInflater.inflate(R.layout.list_item,null,true);
        TextView animalName = (TextView) row.findViewById(R.id.animalName);
        ImageView animalImage = (ImageView) row.findViewById(R.id.detailAnimalImage);
        animalName.setText(animalItems[position]);
        animalImage.setImageResource(imageId[position]);
        return row;
    }
}
