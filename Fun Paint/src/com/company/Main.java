package com.company;

import graphicshape.Circle;
import graphicshape.Shape;

public class Main {

    public static void main(String[] args) {


        Point p = new Point(3, 4);

        Shape s = new Shape();
        System.out.println(p.hashCode());

        Circle circle = new Circle(7);
        //System.out.println(circle.area());
        RecTangle a1 = new RecTangle(10, 10);
        RecTangle a2 = new RecTangle(20, 30);

        System.out.println("This Rectangle area is " + a1.recTanglrArea());


        int x=2;
        int y=3;
        System.out.println(x^y);

    }

    Point p1 = new Point(3, 4);
    Point p2 = new Point(3, 4);

    int x=2;
    int y=3;
    @Override
    public boolean equals(Object obj) {
        if (obj==null)
            return false;
        if (this==obj)
            return false;
        if (obj instanceof Point){
            Point other = (Point) obj;
            //return this.x == other.x && this.y == other.y
        }
        return equals(obj);
    }

    Point p=new Point(3,4);

    @Override
    public int hashCode() {
        return (7*x) ^ (11*y) ^ (53*y);
    }
}


/*
    public boolean  (Object obj) {
        if super.equals(obj) {
            if (super.equals(obj)) {

            }
            return super.equals(obj) && obj()
        }
    }
*/
