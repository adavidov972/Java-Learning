package com.company;



public class Main {

    public static double abs (double x){
        return x < 0 ? -x : x;
    }

    public static double sqrtPrecise (double x) {
        double result=0;
        double add=10;
        while (abs(x-result * result)> 0.1){
            while ((result+add)*(result+add)>=
                    x){
                add/=10;
            }
            result += add;

        }
        return result;
    }

    //homework1
    public static int largeDigitOnArrys (){
        int x []={1,19,5,7,9};
        int digit=0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]>digit){
                digit=x[i];
            }
        }
        return digit;
    }
    //homework2
    public static double arrowAvarage (){
        double [] x = {2,4,7,8};
        double sumX=0;
        for (int i = 0; i < x.length ; i++) {
            sumX+=x[i];
        }
        return sumX/x.length;
    }

    //homework3
    public static boolean subArrowCheck (){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,4,6,7,8,6};
        int shortArrow []=arr1;
        int longArrow []=arr2;
                if (arr1.length>arr2.length){
                    arr1=longArrow;
                }
        for (int i = 0; i < arr2.length; i++) {
         arr1[i]=arr2[i] ;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(arrowAvarage());
        System.out.println(largeDigitOnArrys());
    //sqrtPrecise(9);
    }


}
