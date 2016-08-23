package com.company;

/**
 * Created by Avi on 19/08/2016.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAdrress;

    public VipCustomer(){

        this("DefaultName", 100.0, "email@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit,"default@email.com");
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdrress() {
        return emailAdrress;
    }

    public VipCustomer(String name, double creditLimit, String emailAdrress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdrress = emailAdrress;
    }
}

