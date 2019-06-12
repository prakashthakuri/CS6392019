package com.example.imageviewer;

class Animal {
    private int animalImage;
    private String animalName;
    private String animalDescription;

    public String getName(){

        return animalName;
    }


    public String getAnimalDescription(){
        return animalDescription;
    }



    public int getAnimalImage(){

        return animalImage;

    }


    public Animal(int animalImage, String animalName, String animalDescription){
        super();

        this.animalImage=animalImage;
        this.animalName=animalName;
        this.animalDescription=animalDescription;


    }
}
