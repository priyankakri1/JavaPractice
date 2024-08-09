package org.jsp;

public interface BankUser {
    public void transaction();

//   =================== UPI transfer Method===========================
   void transferUPI(String upiId, double amount);

}
