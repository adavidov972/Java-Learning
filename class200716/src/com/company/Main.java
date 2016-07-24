package com.company;

public class Main {

    public static void printArray (int arr[]){
        System.out.println("{");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] + ",");
        }
        if (arr.length>0)
            System.out.println(arr[arr.length-1]);
        System.out.println("}");

    }

    public static void sortArr (int [] arr) {

        int largeNum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<=largeNum){
                arr[i]=arr[i-1];
            }
                for (int j = 0; j < arr.length+1; j++) {
                    if (arr[j]<=largeNum){
                        arr[j]=arr[j-1];
                }

                arr[i]=largeNum;
                largeNum++;
            }
        }
    }

    public static void sort (int []arr){
        boolean isSorted=false;
        int upto=arr.length-1;
        while (!isSorted){
            isSorted=true;
            for (int i = 0; i < upto; i++) {
                if (arr [i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                    isSorted=false;
            }
                
            }
            upto--;
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");

        }
        System.out.print(arr[arr.length-1]);
        System.out.println();
        System.out.println();
    }

    public static void sortDown (int[] arr){
        boolean isSorted=false;
        int upTo=arr.length-1;
        while (!isSorted);{
            isSorted=true;
            for (int i = 0; i < upTo; i++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i+1];
                    arr[i]=arr[i+1];
                    arr[i]=temp;

                    isSorted=false;
                }
            }
            upTo--;
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");

        }
        System.out.print(arr[arr.length-1]);
    }


    public static void main(String[] args) {
        sort (new int[]{3,5,-9,230,100,1});
        sortDown (new int[]{3,5,-9,230,100,1});

    }



}