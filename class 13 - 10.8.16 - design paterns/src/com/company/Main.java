package com.company;

public class Main {

    public static void main(String[] args) {

    Dog d1= Dog.getdog() ;


    }




}

class Dog{

    private static Dog d;

    private Dog (){

    }
    public static Dog getdog (){
        if (d==null)
            d=new Dog();
        return d;
    }
}


