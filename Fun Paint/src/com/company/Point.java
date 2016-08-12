package com.company;

/**
 * Created by Avi on 3.8.2016.
 */
public class Point {

    private int x, y;

    public Point(int x, int y) {
        setX(x);
        setX(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x>0) this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (x>0) this.y = y;
    }

    public double distanceTo (Point other){
        int deltaX=this.x-other.x;
        int deltaY=this.y - other.y;
        return Math.sqrt(deltaX*deltaX+deltaY*deltaY);
    }
}

