package com.example.deeksha.zoo;

public class Animal {

    private final String[] animalItems = {
            "Koala",
            "Wolf",
            "Zebra",
            "Leopard",
            "Lion"};

    private final Integer[] imageId = {
            R.drawable.koala,
            R.drawable.wolf,
            R.drawable.zebra,
            R.drawable.leopard,
            R.drawable.lion
    };

    private final String[] animalDescriptions =
            {
                    "This is a such a cute Koala",
                    "The Wolf looks really angry",
                    "The Zebra is the most unique animal with amazing stripes",
                    "A Leopard can eat 10 deer at a time",
                    "Lion is indeed the king of the jungle and very dangerous!"
            };


    protected String[] getAnimalNames()
    {
        return animalItems;
    }

    protected Integer[] getImageId ()
    {
        return imageId;
    }

    protected String[] getAnimalDescriptions()
    {
        return animalDescriptions;
    }

}
