package project;

import java.util.*;

public class Customer extends Accounts {

    public static Scanner numscan = new Scanner(System.in);

    private double balance;

    public Customer(String username, String password, double b) {
        super(username, password);
        balance = b;

    }//end constructor
    
    public double getBalance() {
        return balance;
    }

    public double buyProduct(double balance, Products p) {
        //GUI select poduct to buy

        balance = balance - p.getPrice();
        p.setSold(); //set to true

        return balance;
    }//end buyPoduct

    public double sellProduct(double balance, Products p) {
        //GUI someone buys product

        balance = balance + p.getPrice();

        return balance;
    } //end sellProduct

    public double adjustPrice(Products p) {
        double newPrice = numscan.nextDouble();

        p.setPrice(newPrice);
        //p.setPrice(balance) = newPrice;

        return newPrice;
    }//end adjustPrice

    public double addToBalance(double balance) {
        double amountAdded = numscan.nextDouble();

        balance = balance + amountAdded;
        return balance;
    }//end addToBalance

    public void printInfo() {
        System.out.println("Username:" + username);
        System.out.println("Password:" + password);
        System.out.println("Balance:" + balance);
    }
    
    public void addProduct(double price,String name,String sellerUsername, double maxBid, int ID){
    
    projectMain.productList.add(new Products(price, name, sellerUsername, maxBid, ID));
   
    }

}//end class
