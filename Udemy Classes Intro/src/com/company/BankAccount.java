package com.company;

/**
 * Created by Avi on 18/08/2016.
 */
public class BankAccount {

    private String accountNumber;
    private double balance;
    private String costumerName;
    private String emailAdrress;
    private String phoneNumber;


    public BankAccount () {
        this ("222222", 2, "Defult Name", "Defult Adrress", "Default Phone");
    }

    public BankAccount(String accountNumber, int balance, String costumerName, String emailAdrress, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.costumerName = costumerName;
        this.emailAdrress = emailAdrress;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (this.balance<0){
            System.out.println("Balance is negetive");
        };
        this.balance = balance;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String cotumerName) {
        this.costumerName = cotumerName;
    }

    public String getEmailAdrress() {
        return emailAdrress;
    }

    public void setEmailAdrress(String emailAdrress) {
        this.emailAdrress = emailAdrress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void Withdrawal (int amount) {

        if (this.balance-amount>0) {

            this.balance-=amount;
            System.out.println(amount + " withdrawaled");
            System.out.println("New balance is "+this.balance);
        }
        else {
            System.out.printf("Can not make withdrawal-insufficient balance");
        }

    }

    public void deposit (double depositAmount){
        this.balance+=depositAmount;
    }
}

