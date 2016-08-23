package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount avisAccount=new BankAccount("148851", 700000, "Avi Davidov", "avi.davidov@gmail.com","054-6868414");
        BankAccount defaultAccount = new BankAccount();

        avisAccount.Withdrawal(25000);


        System.out.println("Account No. " + avisAccount.getAccountNumber());
        System.out.println("Costumer Name : " + avisAccount.getCostumerName());
        System.out.println("Costumer Email : " + avisAccount.getPhoneNumber());
        System.out.println("Costumer Phone : " + avisAccount.getEmailAdrress());
        System.out.println();
        System.out.println();
        System.out.println("Balance is : " + avisAccount.getBalance());

        System.out.println("Account No. " + defaultAccount.getAccountNumber());
        System.out.println("Costumer Name : " + defaultAccount.getCostumerName());
        System.out.println("Costumer Email : " + defaultAccount.getPhoneNumber());
        System.out.println("Costumer Phone : " + defaultAccount.getEmailAdrress());
        System.out.println();
        System.out.println();
        System.out.println("Balance is : " + defaultAccount.getBalance());

        VipCustomer avi=new VipCustomer("Avi", 50000, "avi.davidov@gmail.com");
        System.out.println("Customer name : "+ avi.getName());
        System.out.println("Credit balance : " + avi.getCreditLimit ());
        System.out.println("Customer Email : " + avi.getEmailAdrress());


        Vehicle vehicle=new Fiat(1,1,1,"fiat","2015",140);


        IntNode x= new IntNode(12);
        System.out.println(x.getInfo());
    }


}
