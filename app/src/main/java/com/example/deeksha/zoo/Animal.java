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
                    "Koalas today are found in Queensland , New South Wales , Victoria and South Australia . " +
                            "Their range extends from the Atherton Tableland west of Cairns in Qld to islands " +
                            "off the coast of Victoria and South Australia in the south, and west to central " +
                            "and western Qld, NSW and Victoria.\n" +
                            "\n" +
                            "Koalas live in societies, just like humans, so they need to be able to come into " +
                            "contact with other koalas.Koalas are highly territorial and in " +
                            "stable breeding groups, individual members of koala society maintain their own \"home range\" areas.",


                    "You may be surprised to find that they can consume up to 20 pounds of meat in a single feeding" +
                            "The body of a wolf allows it to be able to survive in a variety of different locations." +
                            "The wolf is one of the best communicators out there when it comes to the use of body language.",


                    "Zebras are herbivorous and primarily eat a variety of grasses. " +
                            "They are also known to eat shrubs, herbs, twigs, leaves and bark." +
                            "Zebras as very social animals and live in large groups called 'harems.' " +
                            "Plains and mountain zebras live in harems that are made up of one stallion " +
                            "and up to six mares and their young, while Grevy's zebras come together as " +
                            "groups for short periods of time.",


                    "Leopards eat small hoofstock such as gazelle, impala, deer and wildebeast. " +
                            "On occasion, they may also hunt monkeys, rodents and birds. " +
                            "They often bring their prey up into the branches of a tree to eat it " +
                            "and protect it from other predators and scavengers.",


                    "Lions are large felines that are traditionally depicted as the \"king of the jungle.\" " +
                            "These big cats once roamed Africa, Asia and Europe. However, now they are found in " +
                            "only two areas of the world and are classified into two subspecies. " +
                            "Asiatic lions live in India's Gir Forest; African lions live in central and southern Africa. " +
                            "Though they look similar, these two subspecies are very different in size, habitat, diet and more."
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
