package org.jsp;

public class ATM implements BankUser {
    @Override
    public void transaction(){
        System.out.println("Performing transaction via ATM");
    }

    @Override
    public void transferUPI(String upiId, double amount) {
        System.out.println("ATM does not support UPI transfers.");
    }
}
