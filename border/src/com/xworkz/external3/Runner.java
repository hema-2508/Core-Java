package com.xworkz.external3;

import com.xworkz.internal.rules3.*;

public class Runner {
    public static void main(String[] args) {
        PaymentGateways paymentGateway = new Razorpays();
        paymentGateway.pay();
        paymentGateway.status();
        paymentGateway.generateInvoice();

        SmartDevices device = new Alexa();
        device.turnOn();
        device.update();
        device.diagnose();

        VehicleControl car = new Tesla();
        car.startEngine();
        car.accelerate();
        car.fuelStatus();

        OnlineLearning course = new Coursera();
        course.login();
        course.watchLecture();
        course.checkGrades();

        BankOperations bank = new SBI();
        bank.deposit();
        bank.applyLoan();
        bank.getStatement();
    }
}