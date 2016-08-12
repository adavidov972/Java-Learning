package com.company;

public class Main {

    public static void revrseOrder(int[]nums){
        int temp, adjacent;
        int upTo=nums.length/2;
        for (int i = 0; i < upTo; i++) {
            temp=nums[i];
            adjacent=nums.length-i-1;
            nums[i]=nums[adjacent];
            nums[adjacent]=temp;
        }
    }

    public static int maxsubarray (int [] nums){
        int maxSoFar=0;
        int maxEndinfHere = 0;
        for (int i = 0; i < nums.length; i++) {
            maxEndinfHere+= nums[i];
            if (maxEndinfHere < 0);
                maxEndinfHere=0;
            if (maxSoFar<maxEndinfHere)
                maxSoFar=maxEndinfHere;

        }
        return maxSoFar;
    }
    public static int partition (int [] arr, int law, int high){
        int pivot = arr[high];
        int i=law-1;
        for (int j = law; j <high; j++) {
            if (arr[j]<=pivot){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
        int temp=arr[i+1];
        arr [i+1]=arr[high];
        arr[high]=temp;
        return i+1;

    }
    public static void quicksort (int [] arr, int law, int high){
        if (law<high){
            int p=partition(arr, law, high);
            quicksort(arr,law,p-1);
            quicksort(arr,p+1,high);
        }

    }


    public static void main(String[] args) {
	int[] nums ={-1,4,-1,3,-3};
        System.out.println(maxsubarray(nums));
    }
}
