package com.example.thunder.listviewtest;

public class Phone {
    private String name;
    private int imageID;
    public Phone(String name,int imageID){
        this.name=name;
        this.imageID=imageID;
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }
}
