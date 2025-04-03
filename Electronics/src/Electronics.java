public class Electronics {
    String processor;
    int ramSize;
    int storageCapacity;
    double screenSize;
    String displayType;
    boolean hasTouchscreen;
    int batteryCapacity;
    boolean supports5G;
    boolean isWaterResistant;
    String connectivityOptions;


    public Electronics() {
        System.out.println("No parameter constructor.");
    }


    public Electronics(String processor, int ramSize) {
        this.processor = processor;
        this.ramSize = ramSize;
    }


    public Electronics(String processor, int ramSize, int storageCapacity) {
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
    }


    public Electronics(String processor, int ramSize, int storageCapacity, double screenSize, String displayType) {
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
        this.screenSize = screenSize;
        this.displayType = displayType;
    }


    public Electronics(String processor, int ramSize, int storageCapacity, double screenSize, String displayType, boolean hasTouchscreen, int batteryCapacity, boolean supports5G, boolean isWaterResistant, String connectivityOptions) {
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
        this.screenSize = screenSize;
        this.displayType = displayType;
        this.hasTouchscreen = hasTouchscreen;
        this.batteryCapacity = batteryCapacity;
        this.supports5G = supports5G;
        this.isWaterResistant = isWaterResistant;
        this.connectivityOptions = connectivityOptions;
    }

    public void info() {
        System.out.println("Processor: " + processor + ", RAM: " + ramSize + "GB, Storage: " + storageCapacity + "GB, Screen Size: " + screenSize +
                "\", Display: " + displayType + ", Touchscreen: " + hasTouchscreen + ", Battery: " + batteryCapacity + "mAh, 5G Support: " + supports5G +
                ", Water Resistant: " + isWaterResistant + ", Connectivity: " + connectivityOptions);
    }
}
