package com.company;

import sun.tools.tree.SuperExpression;

public class Main {

    public static void main(String[] args) {
	Car a=new Car ();
    Ford b=new Ford();
    VolksWagen c=new VolksWagen();
    Hipushit d=new Hipushit();
    //c.car();
    d.car();
    }
}

class Car {
    public void car (){
        System.out.print("I am a car, manufactured in ");
    }
}

class Ford extends Car {
    public void ford  (){
        System.out.println("ford");
    }
}

class VolksWagen extends Car{
    @Override
    public void car() {
        super.car();
        System.out.print ("volksWagen ");
    }

}

class Hipushit extends VolksWagen{
    @Override
    public void car() {
        super.car();
        System.out.print("Model Hipushit");
    }

}