package com.company;

import graphicshape.Circle;

/**
 * Created by Avi on 27.7.2016.
 */

public class Ball extends Circle {
    public Ball(int r) {
        super(r);
    }

    void bounce(){
        System.out.println ("color is " + color);
    }
}