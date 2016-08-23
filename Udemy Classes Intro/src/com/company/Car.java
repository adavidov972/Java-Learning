package com.company;

/**
 * Created by Avi on 19/08/2016.
 */
public class Car extends Vehicle {

    private String brand;
    private String ManufactureYear;


    public Car(int gear, int steering, int move, String brand, String manufactureYear) {
        super(gear, steering, move);
        this.brand = brand;
        this.ManufactureYear = manufactureYear;
    }
}
