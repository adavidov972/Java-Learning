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
    public static void main(String[] args) {
	int[] nums ={-1,4,-1,3,-3};
        System.out.println(maxsubarray(nums));
    }
}
