package com.xworkz.internal.rules4;

public interface PaymentSystem {
    void initiatePayment();
    void verifyOTP();
    void transactionHistory();
    void refundAmount();
    void cancelTransaction();
    void checkBalance();
    void linkAccount();
    void generateStatement();
    void customerSupport();
}
