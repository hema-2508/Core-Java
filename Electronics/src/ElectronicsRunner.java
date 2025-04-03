public class ElectronicsRunner {
    public static void main(String[] args) {
        Electronics device1 = new Electronics();
        device1.info();

        String processor = "Snapdragon 8 ";
        int ramSize = 8;
        Electronics device2 = new Electronics(processor, ramSize);
        device2.info();

        processor = "Snapdragon 12";
        ramSize = 16;
        int storageCapacity = 512;
        Electronics device3 = new Electronics(processor, ramSize, storageCapacity);
        device3.info();

        processor = "Intel i9";
        ramSize = 32;
        storageCapacity = 1000;
        double screenSize = 16.0;
        String displayType = "LED";
        Electronics device4 = new Electronics(processor, ramSize, storageCapacity, screenSize, displayType);
        device4.info();

        processor = "AMD Ryzen 9";
        ramSize = 64;
        storageCapacity = 2000;
        screenSize = 17.3;
        displayType = "OLED";
        boolean hasTouchscreen = true;
        int batteryCapacity = 9000;
        boolean supports5G = false;
        boolean isWaterResistant = true;
        String connectivityOptions = "Wi-Fi 6, Bluetooth 5.2";
        Electronics device5 = new Electronics(processor, ramSize, storageCapacity, screenSize, displayType, hasTouchscreen, batteryCapacity, supports5G, isWaterResistant, connectivityOptions);
        device5.info();
    }
}
