package com.xworkz.external4;

import com.xworkz.internal.rules4.PaymentSystem;

public class PayMate implements PaymentSystem {
    public void initiatePayment() { System.out.println("Payment initiated"); }
    public void verifyOTP() { System.out.println("OTP verified"); }
    public void transactionHistory() { System.out.println("Fetching transaction history"); }
    public void refundAmount() { System.out.println("Amount refunded"); }
    public void cancelTransaction() { System.out.println("Transaction cancelled"); }
    public void checkBalance() { System.out.println("Balance checked"); }
    public void linkAccount() { System.out.println("Account linked"); }
    public void generateStatement() { System.out.println("Statement generated"); }
    public void customerSupport() { System.out.println("Contacting support"); }
}

