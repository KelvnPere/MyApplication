package com.example.java;

public class Microphone {
// instance variables/ properties/ fields

    private String name;
     private String color;
     private int model;


//     Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

//    This is also a constructor but it is empty
      public Microphone(){

      }
    //    This is a constructor
    public Microphone(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    //    Actions/behaviors methods
     public void turnOff(){
         System.out.println(this.name + "Turn Off");

     }
     public void turnOn(){
         System.out.println(this.name + " Turn on");
     }
     public void setVolume(){
         System.out.println(this.name + " Setting Volume");
     }

     public String showDescription(){
         return "Microphone name " + this.name + " with color: " + this.color
                 + " and its model " + this.model;
     }
}

//  A constructor is a method that we add to our class to construct the object