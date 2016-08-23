package com.company;

/**
 * Created by Avi on 31.7.2016.
 */
public class Rationallnumber extends Number {

    private int numerator;
    private int denominator = 0;

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        if (denominator!=0)
        this.numerator = numerator;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    public Rationallnumber(){

    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return (double)numerator/(double)denominator;
    }
}
