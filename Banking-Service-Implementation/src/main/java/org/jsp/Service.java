package org.jsp;

public class Service {
    public BankUser login(int atmPin) {
        BankUser bu = null;

        if (atmPin == 7754) {
            bu = new ATM();
        }
        else if (atmPin == 7755) {
            bu = new PhonePe();
        }
        else if (atmPin == 7756) {
            bu = new GooglePay();
        }
        else if (atmPin == 7757) {
            bu = new Paytm();
        }
        else {
            System.out.println("Invalid ATM pin. Unable to log in.");
        }

        return bu;
    }
}
