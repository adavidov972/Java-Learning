package com.company;

public class Main {

    public static void main(String[] args) {
        arreys();

            }
    public static void arreys(){
        int [] arrey=new int [10];
        arrey[0]=292;
        arrey[1]=57;
        arrey[2]=3;
        arrey[3]=26;
        arrey[4]=-300;
        arrey[5]=232;
        arrey[6]=37;

        int temp=0;

        for (int i = 0; i < arrey.length-1; i++) {
            if (arrey[i] > arrey[i+1]){
                temp = arrey [i];
                arrey[i]=arrey [i+1];
                arrey[i+1]=temp;
                }

            System.out.println("Spot No. "+ (i + 1) + " is " +arrey[i]);
        }
    }
}
