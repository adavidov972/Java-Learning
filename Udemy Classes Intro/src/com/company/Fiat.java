package com.company;

/**
 * Created by Avi on 19/08/2016.
 */
public class Fiat extends Car {

    private int speed;
    private String color;

    public Fiat(int gear, int steering, int move, String brand, String manufactureYear, int speed) {
        super(gear, steering, move, brand, manufactureYear);
        this.speed = speed;
    }

    public void speed (int speed) {
        System.out.println("Fiat.speed() called");

    }
}
