package org.jsp;

public class GooglePay implements BankUser{
    @Override
    public void transaction(){
        System.out.println("Performing transaction via GooglePay");

    }

    @Override
    public void transferUPI(String upiId, double amount) {
        System.out.println("Transferred " + amount + " via GooglePay to UPI ID: " + upiId);
    }
}
