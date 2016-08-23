package com.company;

public class Main {

    public static void main(String[] args) {

        //מאפיינים של מחלקה ישנם 4 עקרונות

        //Object oriented programming principles

        //Encapsulation as capsula
        //inheritance
        //polymorphism
        //abstraction

        //access modifiers:

        //public
        //private
        //protected
        //Default

        //What "new" does :

        //1. find free in the heap that is large enough to the object
        //2. mark the space as taken
        //3. initialize the space in memory
        //4. returns the adrress in memory that the object was created in

        Dog d;
        d=new Dog();
        new Dog();
        Animal a=new Dog();
        int x=5;
        Integer i=x;
        int y=i;
        Float f=34.0f;
        Double dd=15.4;
        Long l=234L;
        Animal c=new Dog();
        //a.makeSound();
        Antelope z= new Antelope();
        z.lope();




        boolean b=true;

    }

}


class Animal {
    void makeSound (){
        System.out.println("some sound");
    }

}
class Dog extends Animal{
    void bark (){
        System.out.println("baf...baf");
    }

}

class Cat extends Animal{
    void growl (){
        System.out.println("mio... mio");
    }
}

class Antelope extends Animal {
    void lope() {
        System.out.println("I am Antilope");

    }
public void sound (String [] petname) {
    for (int i = 0; i < petname.length; i++) {
        System.out.println("Hi my name is "+ petname[i]);
    }

    //String [] petname = {"snake, monkey"};
    sound(petname);
}

}