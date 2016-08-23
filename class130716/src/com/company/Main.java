package com.company;

public class Main {

    public static void drowrectungle (int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean isFrame= i==0 || i==height-1 || j==0 || j==width-1;
                System.out.print(isFrame ? "*" : " ");
            }
            System.out.println();
        }


    }

    public static void moveRectangle (int x, int y, int width, int height){
        for (int i = 0; i < y ; i++) {
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <  x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                boolean isFrame = i==0 || i==height-1 || j==0 || j==width-1;
                boolean move = i==width;
                System.out.print(isFrame ? "*" : " ");
                System.out.print(move ? "    " : "");
            }
            System.out.println();
        }


    }

    public static void drowX (int size){
        if (size%2==0) size++;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                boolean isDiagonal = i==j || i+j==size-1;
                System.out.print(isDiagonal ? "*" : " ");
            }
            System.out.println();
        }
    }
    /*public static boolean isPointOnCircle (int a, int b, int radius){

    }*/
    public static void drowCircle (int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean isFrame = i==0 || i==height-1 || j==0 || j==width-1;
                System.out.print(isFrame ? "*" : " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        //drowrectungle(6,6);
        moveRectangle(20,5,20,10);
        //drowX(8);
        //drowCircle(30,10);
    }

}
