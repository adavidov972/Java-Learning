package com.company;

/**
 * Created by Avi on 3.8.2016.
 */
public class RecTangle {

    private double height;
    private double width;

    public RecTangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double recTanglrArea (){
        return height*width;
    }



}
