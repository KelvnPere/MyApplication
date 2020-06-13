package com.example.java;

import java.util.ArrayList;

public class NewClass {

    public   static void main (String[] args){

//     Creating an array
        int [] myArray = {1,33,4,12,88,98}; // length = 6
        String [] names = {"James", "Anthony","Rodrigo","Niraj"};

        int [] newArray = new int[4];
        String [] newNames = new String[5];

        newArray[0] = 12;
        newArray[1] = 13;
        newArray[2] = 14;
        newArray[3] = 15;





        for (int i = 0; i < newArray.length ; i++){
            System.out.println("items:" + newArray[i]);
        }

        // Array Lists
//        ArrayList<String> name = new ArrayList<>();

          ArrayList name = new ArrayList();
        name.add("Bond");
        name.add("James");
        name.add("Arnold");
        name.add("Arnold");

        // Looping through Array List
        for (int i = 0; i < name.size(); i++) {
            System.out.println("Names: " + name.get(i));
        }

//        Clever for loop

        for (Object n: name){

            System.out.println(n);
    }
    }
      //  System.out.println(name.get(0));

}






























//        instantiate means to create a piece of object in memory. Meaning i need a new space in memory for this.
//
//        Microphone microphone = new Microphone("Blue Yeti", "Blue", 364435); // instantiating our object
//
//        microphone.setModel(87);
//        microphone.setName("New Blue Yeti");
//        microphone.setColor("Red Blue");
//
//
//
//        System.out.println("New Mic: " + microphone.getModel());
//
//        microphone.turnOn();
//        microphone.setVolume();
//        microphone.turnOff();
//
//
//        System.out.println(microphone.showDescription());
//
//        Microphone newMic = new Microphone("NewMic","Green",123);
//        Microphone otherMic = new Microphone();
//        otherMic.setColor("Other Mic");