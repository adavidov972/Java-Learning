package com.company;

public class Main {

    public static double sum (Number []nums){
        double sum=0.0;
        for (Number num : nums) {
            sum+=num.doubleValue();
        }
        return sum;

    }


    public static void main(String[] args) {


        Rationallnumber q= new Rationallnumber();
        q.setNumerator(12);
        q.setDenominator(6);

        Number [] nums= {
                new Integer(4),
                new Double(3.4),
                new Long(34L),
                new Float(234.3f),
                3,
                q,
        };

        System.out.println(sum(nums));

    }

}
