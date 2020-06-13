package com.example.java;

public class MyClass {

    public  static void main (String[] args){
//        anotherMethod("Love", 91);
//           addNumbers(12,12);
//         System.out.println(addNumbers(4,5));
////           mulitiplyNumber(6,2);
////           divideNumbers(12, 2);
//
//        System.out.println(fullName("George", "The Man"));
//        System.out.println(showChar('b') );
          divideExample(3,5);
//       String des = showBio("George","I was born in Nebraska", 75 );
//
//        System.out.println(des);
    }

//     Todo: create a multiplyNumbers() and divideNumbers()....

    public static String showBio(String name, String bio, int age){

        return " My name is "
                + name + " and i am " +   age +  " years old."
                + bio;
    }


    public static double divideExample (double first, int second){


        System.out.println("The Result is: " + first/second);

        return first/second;
    }






//        A method that adds Numbers together
     public static int addNumbers (int a , int b){
        int result = 0;
        result = a + b;

//         System.out.println("The Addition is: " + (a + b) );

         return (result);
     }

//     Return a String
    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

//    Return a Char

    public static char showChar(char c){
        return c;
    }

//     This is a method that Multiply Numbers
    public static void mulitiplyNumber (int c, int d){
        int multiply = c * d;
        System.out.println("The Multiplication is: " + multiply );


    }

//    This is a method that divides Numbers
    public static void divideNumbers (int e, int f){
        int Divide = e / f;
        System.out.println("The Division is: " + Divide );
    }

    public static void anotherMethod (String numbers, int age){
        if (age > 90)
            System.out.println("I am still young");
    }




}
