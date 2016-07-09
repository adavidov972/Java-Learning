package com.company;

public class Main {



    public static int distance (int x, int y) {

        int d = 0;
        int small=y;
        int large=x;
        while (small <large) {
        d++;
        }
        return d;

    }
    //homework 1
    public static int distance1 (int a, int b){
        int d;
        for (d = 0; a > b +d ; d++){
        };
        return d;

    }
    //homework2
    public static int multyply(int a, int b){
        int m ; int count;
        for (m = 0, count=0; count<a ; m=m+b,count++) {
        };
        return m;
    }
    //homework3
    public static int devide (int a, int b){

        if (a>b) {
            return 0;
        }
        else{
            int count; int m; int x;
            for (count=0, m=a, x=a; a <= b ; m=m+a, count++) {
                a=a+x;
            }
            return count;
        }

    }


    public static void main (String[] args){

        System.out.println(distance1 (8,3));
        System.out.println(multyply (2,30));
        System.out.println(devide (42,84));
    }

 }


