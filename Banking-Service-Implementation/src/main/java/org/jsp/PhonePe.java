package org.jsp;

public class PhonePe implements BankUser{
    @Override
    public void transaction(){
        System.out.println("Performing transaction via PhonePe");

    }

    @Override
    public void transferUPI(String upiId, double amount) {
        System.out.println("Transferred " + amount + " via PhonePe to UPI ID: " + upiId);
    }
}
