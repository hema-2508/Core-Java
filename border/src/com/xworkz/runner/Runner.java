package com.xworkz.runner;

import com.xworkz.external.*;
import com.xworkz.external1.*;
import com.xworkz.external2.*;
import com.xworkz.external3.*;
import com.xworkz.external4.*;
import com.xworkz.internal.rules.*;
import com.xworkz.internal.rules1.*;
import com.xworkz.internal.rules2.*;
import com.xworkz.internal.rules3.*;
import com.xworkz.internal.rules4.*;

public class Runner {
    public static void main(String[] args) {
        Engine engine=new CarEngine();
        engine.start();
        CarEngine carEngine=new CarEngine();
        carEngine.start();
        Temple temple=new Meenakshi();
        temple.pooja();
        Meenakshi meenakshi=new Meenakshi();
        meenakshi.pooja();
        SmartDevice smartDevice=new SmartWatch();
        smartDevice.powerOn();
        SmartWatch smartWatch=new SmartWatch();
        smartWatch.powerOn();
        Printer printer=new LaserPrinter();
        printer.print();
        LaserPrinter laserPrinter=new LaserPrinter();
        laserPrinter.print();
        BankAccount bankAccount=new SavingsAccount();
        bankAccount.deposite();
        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.deposite();
        MediaPlayer mediaPlayer=new VLCPlayer();
        mediaPlayer.pause();
        mediaPlayer.play();
        mediaPlayer.stop();
        VLCPlayer vlcPlayer=new VLCPlayer();
        vlcPlayer.pause();
        vlcPlayer.play();
        vlcPlayer.stop();
        Camera camera=new DSLRCamera();
        camera.capture();
        camera.record();
        camera.zoomIn();
        DSLRCamera dslrCamera = new DSLRCamera();
        dslrCamera.capture();
        dslrCamera.record();
        dslrCamera.zoomIn();
        Database database= new MySQLDAtabase();
        database.disconnect();
        database.connect();
        database.insert();
        MySQLDAtabase mySQLDAtabase=new MySQLDAtabase();
        mySQLDAtabase.connect();
        mySQLDAtabase.disconnect();
        mySQLDAtabase.insert();
        Vehicle vehicle=new Bike();
        vehicle.start();
        vehicle.stop();
        vehicle.horn();
        Bike bike=new Bike();
        bike.start();
        bike.stop();
        bike.horn();
        ChatApp chatApp=new WhatsApp();
        chatApp.receive();
        chatApp.send();
        chatApp.call();
        WhatsApp whatsApp=new WhatsApp();
        whatsApp.receive();
        whatsApp.send();
        whatsApp.call();

        HomeAssistant home = new HomeAssistant();
        home.turnOnLight();
        home.turnOffLight();
        home.closeDoor();
        home.openDoor();
        home.setTemperature();

        SmartHome smartHome=new HomeAssistant();
        smartHome.closeDoor();
        smartHome.openDoor();
        smartHome.setTemperature();
        smartHome.turnOffLight();
        smartHome.turnOnLight();

        Robot robot = new RoboX();
        robot.walk();
        robot.talk();
        robot.pickObject();
        robot.scanArea();
        robot.shutdown();

        RoboX roboX=new RoboX();
        roboX.pickObject();
        roboX.scanArea();
        roboX.talk();
        roboX.walk();
        roboX.shutdown();

        PaymentGateway paymentGateway=new Razorpay();
        paymentGateway.cancel();
        paymentGateway.pay();
        paymentGateway.refund();
        paymentGateway.status();
        paymentGateway.validate();
        Razorpay gateway = new Razorpay();
        gateway.pay();
        gateway.status();
        gateway.cancel();
        gateway.refund();
        gateway.validate();

        GoogleDrive googleDrive = new GoogleDrive();
        googleDrive.sync();
        googleDrive.monitor();
        googleDrive.delete();
        googleDrive.download();
        googleDrive.upload();
        CloudService cloud = new GoogleDrive();
        cloud.upload();
        cloud.download();
        cloud.delete();
        cloud.monitor();
        cloud.sync();

        Amazon amazon = new Amazon();
        amazon.browse();
        amazon.checkout();
        amazon.addToCart();
        amazon.trackOrder();
        amazon.returnItem();

        ECommerce eCommerce =new Amazon();
        eCommerce.addToCart();
        eCommerce.browse();
        eCommerce.checkout();
        eCommerce.returnItem();
        eCommerce.trackOrder();

        PaymentGateways paymentGateways = new Razorpays();
        paymentGateways.generateInvoice();
        paymentGateways.transactionHistory();
        paymentGateways.pay();
        paymentGateways.cancel();
        paymentGateways.refund();
        paymentGateways.status();
        paymentGateways.validate();
        Razorpays razorpays = new Razorpays();
        razorpays.cancel();
        razorpays.pay();
        razorpays.generateInvoice();
        razorpays.refund();
        razorpays.transactionHistory();
        razorpays.status();
        razorpays.validate();


        VehicleControl vehicleControl = new Tesla();
        vehicleControl.startEngine();
        vehicleControl.accelerate();
        vehicleControl.fuelStatus();
        vehicleControl.brake();
        vehicleControl.honk();
        vehicleControl.steer();
        vehicleControl.stopEngine();

        Tesla tesla = new Tesla();
        tesla.startEngine();
        tesla.accelerate();
        tesla.fuelStatus();
        tesla.brake();
        tesla.honk();
        tesla.steer();
        tesla.stopEngine();

        SmartDevices smartDevices = new Alexa();
        smartDevices.connect();
        smartDevices.diagnose();
        smartDevices.turnOn();
        smartDevices.update();
        smartDevices.restart();
        smartDevices.turnOff();
        smartDevices.disconnect();

        Alexa alexa = new Alexa();
        alexa.connect();
        alexa.diagnose();
        alexa.turnOn();
        alexa.update();
        alexa.restart();
        alexa.turnOff();
        alexa.disconnect();

        OnlineLearning course = new Coursera();
        course.login();
        course.watchLecture();
        course.checkGrades();
        course.submitAssignment();
        course.downloadMaterials();
        course.joinDiscussion();
        course.takeQuiz();

        Coursera coursera = new Coursera();
        coursera.login();
        coursera.watchLecture();
        coursera.checkGrades();
        coursera.submitAssignment();
        coursera.downloadMaterials();
        coursera.joinDiscussion();
        coursera.takeQuiz();

        BankOperations bank = new SBI();
        bank.deposit();
        bank.applyLoan();
        bank.getStatement();
        bank.checkBalance();
        bank.closeAccount();
        bank.openAccount();
        bank.withdraw();

        SBI sbi = new SBI();
        sbi.deposit();
        sbi.applyLoan();
        sbi.getStatement();
        sbi.checkBalance();
        sbi.closeAccount();
        sbi.openAccount();
        sbi.withdraw();

        Microwave microwave = new Microwave();
        microwave.turnOn();
        microwave.turnOff();
        microwave.increaseVolume();
        microwave.decreaseVolume();
        microwave.setTimer();
        microwave.reset();
        microwave.testMode();
        microwave.calibrate();
        microwave.energySavingMode();

        Chrome chrome = new Chrome();
        chrome.openTab();
        chrome.closeTab();
        chrome.refreshPage();
        chrome.goToURL();
        chrome.bookmarkPage();
        chrome.openHistory();
        chrome.downloadFile();
        chrome.printPage();
        chrome.incognitoMode();

        PlayBox playBox = new PlayBox();
        playBox.startGame();
        playBox.pauseGame();
        playBox.saveGame();
        playBox.loadGame();
        playBox.exitGame();
        playBox.connectController();
        playBox.updateFirmware();
        playBox.takeScreenshot();
        playBox.streamGame();

        QuadX drone = new QuadX();
        drone.takeOff();
        drone.land();
        drone.moveLeft();
        drone.moveRight();
        drone.ascend();
        drone.descend();
        drone.hover();
        drone.takePhoto();
        drone.recordVideo();

        PayMate payMate = new PayMate();
        payMate.initiatePayment();
        payMate.verifyOTP();
        payMate.transactionHistory();
        payMate.refundAmount();
        payMate.cancelTransaction();
        payMate.checkBalance();
        payMate.linkAccount();
        payMate.generateStatement();
        payMate.customerSupport();

    }

}
