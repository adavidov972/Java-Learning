package com.company;

public class Main {

    public static int power (int x, int y){

        int result=x;
        for (int i = 1; i <y ; i++) {
            result*=x;
        }
        return result;

    }
    //homework1
    public static int digitSum (int x) {
        int sum;
        for (sum=0;x>1;x/=10) {
            sum+=(x%10);
        }
        return sum;

    }

    //homework2
    public static int largeDigit(int x){
        int digit;

        for (digit=0;x>1;x/=10) {
                if (digit<=(x%10)){
                    digit=(x%10);
                }

        }
        return digit;

    }

    //homework3
    public static int digitNum(int x){
        int num;
        for (num=0;x>1;x/=10) {
            num+=1;
        }
        return num;
    }
    public static int reverseDigits (int x){
        int rsult;
        for (rsult=0; x>0 ;x/=10){
            rsult+=((x%10)*(power(10,digitNum(x))));
        }
        return rsult/10;

    }
    public static void main(String[] args) {
        System.out.println(power (3,5));
        System.out.println(digitSum(6666));
        System.out.println(largeDigit (8651));
        System.out.println(digitNum (8651));
        System.out.println(reverseDigits (1234));
    }


}
