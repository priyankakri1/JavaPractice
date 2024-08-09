package org.jsp;

public class Paytm implements BankUser{
    @Override
    public void transaction(){
        System.out.println("Performing transaction via Paytm");

    }

    @Override
    public void transferUPI(String upiId, double amount) {
        System.out.println("Transferred " + amount + " via Paytm to UPI ID: " + upiId);
    }
}
