package com.xworkz.runner;

import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.use();

        Camera camera1 = new CameraPro();
        camera1.use();

        CameraPro camera2 = (CameraPro)camera1;
        camera2.feature();

        CameraPro cameraPro = new CameraPro();
        cameraPro.use();
        cameraPro.feature();

        Television television = new Television();
        television.use();

        Television television1 = new TelevisionPro();
        television1.use();

        TelevisionPro television2 = (TelevisionPro)television1;
        television2.feature();

        TelevisionPro televisionPro = new TelevisionPro();
        televisionPro.use();
        televisionPro.feature();

        Microwave microwave = new Microwave();
        microwave.use();

        Microwave microwave1 = new MicrowavePro();
        microwave1.use();

        MicrowavePro microwave2 = (MicrowavePro)microwave1;
        microwave2.feature();

        MicrowavePro microwavePro = new MicrowavePro();
        microwavePro.use();
        microwavePro.feature();

        Printer printer = new Printer();
        printer.use();

        Printer printer1 = new PrinterPro();
        printer1.use();

        PrinterPro printer2 = (PrinterPro)printer1;
        printer2.feature();

        PrinterPro printerPro = new PrinterPro();
        printerPro.use();
        printerPro.feature();

        Laptop laptop = new Laptop();
        laptop.use();

        Laptop laptop1 = new LaptopPro();
        laptop1.use();

        LaptopPro laptop2 = (LaptopPro)laptop1;
        laptop2.feature();

        LaptopPro laptopPro = new LaptopPro();
        laptopPro.use();
        laptopPro.feature();

        Smartphone smartphone = new Smartphone();
        smartphone.use();

        Smartphone smartphone1 = new SmartphonePro();
        smartphone1.use();

        SmartphonePro smartphone2 = (SmartphonePro)smartphone1;
        smartphone2.feature();

        SmartphonePro smartphonePro = new SmartphonePro();
        smartphonePro.use();
        smartphonePro.feature();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.use();

        Refrigerator refrigerator1 = new RefrigeratorPro();
        refrigerator1.use();

        RefrigeratorPro refrigerator2 = (RefrigeratorPro)refrigerator1;
        refrigerator2.feature();

        RefrigeratorPro refrigeratorPro = new RefrigeratorPro();
        refrigeratorPro.use();
        refrigeratorPro.feature();

        Toaster toaster = new Toaster();
        toaster.use();

        Toaster toaster1 = new ToasterPro();
        toaster1.use();

        ToasterPro toaster2 = (ToasterPro)toaster1;
        toaster2.feature();

        ToasterPro toasterPro = new ToasterPro();
        toasterPro.use();
        toasterPro.feature();

        WashingMachine washingmachine = new WashingMachine();
        washingmachine.use();

        WashingMachine washingmachine1 = new WashingMachinePro();
        washingmachine1.use();

        WashingMachinePro washingmachine2 = (WashingMachinePro)washingmachine1;
        washingmachine2.feature();

        WashingMachinePro washingmachinePro = new WashingMachinePro();
        washingmachinePro.use();
        washingmachinePro.feature();

        Dryer dryer = new Dryer();
        dryer.use();

        Dryer dryer1 = new DryerPro();
        dryer1.use();

        DryerPro dryer2 = (DryerPro)dryer1;
        dryer2.feature();

        DryerPro dryerPro = new DryerPro();
        dryerPro.use();
        dryerPro.feature();

        AirConditioner airconditioner = new AirConditioner();
        airconditioner.use();

        AirConditioner airconditioner1 = new AirConditionerPro();
        airconditioner1.use();

        AirConditionerPro airconditioner2 = (AirConditionerPro)airconditioner1;
        airconditioner2.feature();

        AirConditionerPro airconditionerPro = new AirConditionerPro();
        airconditionerPro.use();
        airconditionerPro.feature();

        Heater heater = new Heater();
        heater.use();

        Heater heater1 = new HeaterPro();
        heater1.use();

        HeaterPro heater2 = (HeaterPro)heater1;
        heater2.feature();

        HeaterPro heaterPro = new HeaterPro();
        heaterPro.use();
        heaterPro.feature();

        Mixer mixer = new Mixer();
        mixer.use();

        Mixer mixer1 = new MixerPro();
        mixer1.use();

        MixerPro mixer2 = (MixerPro)mixer1;
        mixer2.feature();

        MixerPro mixerPro = new MixerPro();
        mixerPro.use();
        mixerPro.feature();

        Grinder grinder = new Grinder();
        grinder.use();

        Grinder grinder1 = new GrinderPro();
        grinder1.use();

        GrinderPro grinder2 = (GrinderPro)grinder1;
        grinder2.feature();

        GrinderPro grinderPro = new GrinderPro();
        grinderPro.use();
        grinderPro.feature();

        Tablet tablet = new Tablet();
        tablet.use();

        Tablet tablet1 = new TabletPro();
        tablet1.use();

        TabletPro tablet2 = (TabletPro)tablet1;
        tablet2.feature();

        TabletPro tabletPro = new TabletPro();
        tabletPro.use();
        tabletPro.feature();

        Monitor monitor = new Monitor();
        monitor.use();

        Monitor monitor1 = new MonitorPro();
        monitor1.use();

        MonitorPro monitor2 = (MonitorPro)monitor1;
        monitor2.feature();

        MonitorPro monitorPro = new MonitorPro();
        monitorPro.use();
        monitorPro.feature();

        Keyboard keyboard = new Keyboard();
        keyboard.use();

        Keyboard keyboard1 = new KeyboardPro();
        keyboard1.use();

        KeyboardPro keyboard2 = (KeyboardPro)keyboard1;
        keyboard2.feature();

        KeyboardPro keyboardPro = new KeyboardPro();
        keyboardPro.use();
        keyboardPro.feature();

        Mouse mouse = new Mouse();
        mouse.use();

        Mouse mouse1 = new MousePro();
        mouse1.use();

        MousePro mouse2 = (MousePro)mouse1;
        mouse2.feature();

        MousePro mousePro = new MousePro();
        mousePro.use();
        mousePro.feature();

        Speaker speaker = new Speaker();
        speaker.use();

        Speaker speaker1 = new SpeakerPro();
        speaker1.use();

        SpeakerPro speaker2 = (SpeakerPro)speaker1;
        speaker2.feature();

        SpeakerPro speakerPro = new SpeakerPro();
        speakerPro.use();
        speakerPro.feature();

        Projector projector = new Projector();
        projector.use();

        Projector projector1 = new ProjectorPro();
        projector1.use();

        ProjectorPro projector2 = (ProjectorPro)projector1;
        projector2.feature();

        ProjectorPro projectorPro = new ProjectorPro();
        projectorPro.use();
        projectorPro.feature();

        Router router = new Router();
        router.use();

        Router router1 = new RouterPro();
        router1.use();

        RouterPro router2 = (RouterPro)router1;
        router2.feature();

        RouterPro routerPro = new RouterPro();
        routerPro.use();
        routerPro.feature();

        Modem modem = new Modem();
        modem.use();

        Modem modem1 = new ModemPro();
        modem1.use();

        ModemPro modem2 = (ModemPro)modem1;
        modem2.feature();

        ModemPro modemPro = new ModemPro();
        modemPro.use();
        modemPro.feature();

        Drone drone = new Drone();
        drone.use();

        Drone drone1 = new DronePro();
        drone1.use();

        DronePro drone2 = (DronePro)drone1;
        drone2.feature();

        DronePro dronePro = new DronePro();
        dronePro.use();
        dronePro.feature();

        Scanner scanner = new Scanner();
        scanner.use();

        Scanner scanner1 = new ScannerPro();
        scanner1.use();

        ScannerPro scanner2 = (ScannerPro)scanner1;
        scanner2.feature();

        ScannerPro scannerPro = new ScannerPro();
        scannerPro.use();
        scannerPro.feature();

        Thermostat thermostat = new Thermostat();
        thermostat.use();

        Thermostat thermostat1 = new ThermostatPro();
        thermostat1.use();

        ThermostatPro thermostat2 = (ThermostatPro)thermostat1;
        thermostat2.feature();

        ThermostatPro thermostatPro = new ThermostatPro();
        thermostatPro.use();
        thermostatPro.feature();

        LightBulb lightbulb = new LightBulb();
        lightbulb.use();

        LightBulb lightbulb1 = new LightBulbPro();
        lightbulb1.use();

        LightBulbPro lightbulb2 = (LightBulbPro)lightbulb1;
        lightbulb2.feature();

        LightBulbPro lightbulbPro = new LightBulbPro();
        lightbulbPro.use();
        lightbulbPro.feature();

        SmartWatch smartwatch = new SmartWatch();
        smartwatch.use();

        SmartWatch smartwatch1 = new SmartWatchPro();
        smartwatch1.use();

        SmartWatchPro smartwatch2 = (SmartWatchPro)smartwatch1;
        smartwatch2.feature();

        SmartWatchPro smartwatchPro = new SmartWatchPro();
        smartwatchPro.use();
        smartwatchPro.feature();

        Vacuum vacuum = new Vacuum();
        vacuum.use();

        Vacuum vacuum1 = new VacuumPro();
        vacuum1.use();

        VacuumPro vacuum2 = (VacuumPro)vacuum1;
        vacuum2.feature();

        VacuumPro vacuumPro = new VacuumPro();
        vacuumPro.use();
        vacuumPro.feature();

        CoffeeMaker coffeemaker = new CoffeeMaker();
        coffeemaker.use();

        CoffeeMaker coffeemaker1 = new CoffeeMakerPro();
        coffeemaker1.use();

        CoffeeMakerPro coffeemaker2 = (CoffeeMakerPro)coffeemaker1;
        coffeemaker2.feature();

        CoffeeMakerPro coffeemakerPro = new CoffeeMakerPro();
        coffeemakerPro.use();
        coffeemakerPro.feature();

        Fan fan = new Fan();
        fan.use();

        Fan fan1 = new FanPro();
        fan1.use();

        FanPro fan2 = (FanPro)fan1;
        fan2.feature();

        FanPro fanPro = new FanPro();
        fanPro.use();
        fanPro.feature();

        Clock clock = new Clock();
        clock.use();

        Clock clock1 = new ClockPro();
        clock1.use();

        ClockPro clock2 = (ClockPro)clock1;
        clock2.feature();

        ClockPro clockPro = new ClockPro();
        clockPro.use();
        clockPro.feature();

        GameConsole gameconsole = new GameConsole();
        gameconsole.use();

        GameConsole gameconsole1 = new GameConsolePro();
        gameconsole1.use();

        GameConsolePro gameconsole2 = (GameConsolePro)gameconsole1;
        gameconsole2.feature();

        GameConsolePro gameconsolePro = new GameConsolePro();
        gameconsolePro.use();
        gameconsolePro.feature();

        Car car = new Car();
        car.use();

        Car car1 = new CarPro();
        car1.use();

        CarPro car2 = (CarPro)car1;
        car2.feature();

        CarPro carPro = new CarPro();
        carPro.use();
        carPro.feature();

        Bike bike = new Bike();
        bike.use();

        Bike bike1 = new BikePro();
        bike1.use();

        BikePro bike2 = (BikePro)bike1;
        bike2.feature();

        BikePro bikePro = new BikePro();
        bikePro.use();
        bikePro.feature();

        Truck truck = new Truck();
        truck.use();

        Truck truck1 = new TruckPro();
        truck1.use();

        TruckPro truck2 = (TruckPro)truck1;
        truck2.feature();

        TruckPro truckPro = new TruckPro();
        truckPro.use();
        truckPro.feature();

        Boat boat = new Boat();
        boat.use();

        Boat boat1 = new BoatPro();
        boat1.use();

        BoatPro boat2 = (BoatPro)boat1;
        boat2.feature();

        BoatPro boatPro = new BoatPro();
        boatPro.use();
        boatPro.feature();

        Train train = new Train();
        train.use();

        Train train1 = new TrainPro();
        train1.use();

        TrainPro train2 = (TrainPro)train1;
        train2.feature();

        TrainPro trainPro = new TrainPro();
        trainPro.use();
        trainPro.feature();

        Plane plane = new Plane();
        plane.use();

        Plane plane1 = new PlanePro();
        plane1.use();

        PlanePro plane2 = (PlanePro)plane1;
        plane2.feature();

        PlanePro planePro = new PlanePro();
        planePro.use();
        planePro.feature();

        Helicopter helicopter = new Helicopter();
        helicopter.use();

        Helicopter helicopter1 = new HelicopterPro();
        helicopter1.use();

        HelicopterPro helicopter2 = (HelicopterPro)helicopter1;
        helicopter2.feature();

        HelicopterPro helicopterPro = new HelicopterPro();
        helicopterPro.use();
        helicopterPro.feature();

        Scooter scooter = new Scooter();
        scooter.use();

        Scooter scooter1 = new ScooterPro();
        scooter1.use();

        ScooterPro scooter2 = (ScooterPro)scooter1;
        scooter2.feature();

        ScooterPro scooterPro = new ScooterPro();
        scooterPro.use();
        scooterPro.feature();

        Skateboard skateboard = new Skateboard();
        skateboard.use();

        Skateboard skateboard1 = new SkateboardPro();
        skateboard1.use();

        SkateboardPro skateboard2 = (SkateboardPro)skateboard1;
        skateboard2.feature();

        SkateboardPro skateboardPro = new SkateboardPro();
        skateboardPro.use();
        skateboardPro.feature();

        Tractor tractor = new Tractor();
        tractor.use();

        Tractor tractor1 = new TractorPro();
        tractor1.use();

        TractorPro tractor2 = (TractorPro)tractor1;
        tractor2.feature();

        TractorPro tractorPro = new TractorPro();
        tractorPro.use();
        tractorPro.feature();

        Bulldozer bulldozer = new Bulldozer();
        bulldozer.use();

        Bulldozer bulldozer1 = new BulldozerPro();
        bulldozer1.use();

        BulldozerPro bulldozer2 = (BulldozerPro)bulldozer1;
        bulldozer2.feature();

        BulldozerPro bulldozerPro = new BulldozerPro();
        bulldozerPro.use();
        bulldozerPro.feature();

        Forklift forklift = new Forklift();
        forklift.use();

        Forklift forklift1 = new ForkliftPro();
        forklift1.use();

        ForkliftPro forklift2 = (ForkliftPro)forklift1;
        forklift2.feature();

        ForkliftPro forkliftPro = new ForkliftPro();
        forkliftPro.use();
        forkliftPro.feature();

        Elevator elevator = new Elevator();
        elevator.use();

        Elevator elevator1 = new ElevatorPro();
        elevator1.use();

        ElevatorPro elevator2 = (ElevatorPro)elevator1;
        elevator2.feature();

        ElevatorPro elevatorPro = new ElevatorPro();
        elevatorPro.use();
        elevatorPro.feature();

        Escalator escalator = new Escalator();
        escalator.use();

        Escalator escalator1 = new EscalatorPro();
        escalator1.use();

        EscalatorPro escalator2 = (EscalatorPro)escalator1;
        escalator2.feature();

        EscalatorPro escalatorPro = new EscalatorPro();
        escalatorPro.use();
        escalatorPro.feature();

        Crane crane = new Crane();
        crane.use();

        Crane crane1 = new CranePro();
        crane1.use();

        CranePro crane2 = (CranePro)crane1;
        crane2.feature();

        CranePro cranePro = new CranePro();
        cranePro.use();
        cranePro.feature();

        Roller roller = new Roller();
        roller.use();

        Roller roller1 = new RollerPro();
        roller1.use();

        RollerPro roller2 = (RollerPro)roller1;
        roller2.feature();

        RollerPro rollerPro = new RollerPro();
        rollerPro.use();
        rollerPro.feature();

        Bus bus = new Bus();
        bus.use();

        Bus bus1 = new BusPro();
        bus1.use();

        BusPro bus2 = (BusPro)bus1;
        bus2.feature();

        BusPro busPro = new BusPro();
        busPro.use();
        busPro.feature();

        Submarine submarine = new Submarine();
        submarine.use();

        Submarine submarine1 = new SubmarinePro();
        submarine1.use();

        SubmarinePro submarine2 = (SubmarinePro)submarine1;
        submarine2.feature();

        SubmarinePro submarinePro = new SubmarinePro();
        submarinePro.use();
        submarinePro.feature();

        Helmet helmet = new Helmet();
        helmet.use();

        Helmet helmet1 = new HelmetPro();
        helmet1.use();

        HelmetPro helmet2 = (HelmetPro)helmet1;
        helmet2.feature();

        HelmetPro helmetPro = new HelmetPro();
        helmetPro.use();
        helmetPro.feature();

        Jacket jacket = new Jacket();
        jacket.use();

        Jacket jacket1 = new JacketPro();
        jacket1.use();

        JacketPro jacket2 = (JacketPro)jacket1;
        jacket2.feature();

        JacketPro jacketPro = new JacketPro();
        jacketPro.use();
        jacketPro.feature();

        Shoes shoes = new Shoes();
        shoes.use();

        Shoes shoes1 = new ShoesPro();
        shoes1.use();

        ShoesPro shoes2 = (ShoesPro)shoes1;
        shoes2.feature();

        ShoesPro shoesPro = new ShoesPro();
        shoesPro.use();
        shoesPro.feature();

        Gloves gloves = new Gloves();
        gloves.use();

        Gloves gloves1 = new GlovesPro();
        gloves1.use();

        GlovesPro gloves2 = (GlovesPro)gloves1;
        gloves2.feature();

        GlovesPro glovesPro = new GlovesPro();
        glovesPro.use();
        glovesPro.feature();

        Bag bag = new Bag();
        bag.use();

        Bag bag1 = new BagPro();
        bag1.use();

        BagPro bag2 = (BagPro)bag1;
        bag2.feature();

        BagPro bagPro = new BagPro();
        bagPro.use();
        bagPro.feature();

        Belt belt = new Belt();
        belt.use();

        Belt belt1 = new BeltPro();
        belt1.use();

        BeltPro belt2 = (BeltPro)belt1;
        belt2.feature();

        BeltPro beltPro = new BeltPro();
        beltPro.use();
        beltPro.feature();

        Watch watch = new Watch();
        watch.use();

        Watch watch1 = new WatchPro();
        watch1.use();

        WatchPro watch2 = (WatchPro)watch1;
        watch2.feature();

        WatchPro watchPro = new WatchPro();
        watchPro.use();
        watchPro.feature();

        Sunglasses sunglasses = new Sunglasses();
        sunglasses.use();

        Sunglasses sunglasses1 = new SunglassesPro();
        sunglasses1.use();

        SunglassesPro sunglasses2 = (SunglassesPro)sunglasses1;
        sunglasses2.feature();

        SunglassesPro sunglassesPro = new SunglassesPro();
        sunglassesPro.use();
        sunglassesPro.feature();

        Cap cap = new Cap();
        cap.use();

        Cap cap1 = new CapPro();
        cap1.use();

        CapPro cap2 = (CapPro)cap1;
        cap2.feature();

        CapPro capPro = new CapPro();
        capPro.use();
        capPro.feature();

        Umbrella umbrella = new Umbrella();
        umbrella.use();

        Umbrella umbrella1 = new UmbrellaPro();
        umbrella1.use();

        UmbrellaPro umbrella2 = (UmbrellaPro)umbrella1;
        umbrella2.feature();

        UmbrellaPro umbrellaPro = new UmbrellaPro();
        umbrellaPro.use();
        umbrellaPro.feature();

        Tent tent = new Tent();
        tent.use();

        Tent tent1 = new TentPro();
        tent1.use();

        TentPro tent2 = (TentPro)tent1;
        tent2.feature();

        TentPro tentPro = new TentPro();
        tentPro.use();
        tentPro.feature();

        SleepingBag sleepingbag = new SleepingBag();
        sleepingbag.use();

        SleepingBag sleepingbag1 = new SleepingBagPro();
        sleepingbag1.use();

        SleepingBagPro sleepingbag2 = (SleepingBagPro)sleepingbag1;
        sleepingbag2.feature();

        SleepingBagPro sleepingbagPro = new SleepingBagPro();
        sleepingbagPro.use();
        sleepingbagPro.feature();

        Lantern lantern = new Lantern();
        lantern.use();

        Lantern lantern1 = new LanternPro();
        lantern1.use();

        LanternPro lantern2 = (LanternPro)lantern1;
        lantern2.feature();

        LanternPro lanternPro = new LanternPro();
        lanternPro.use();
        lanternPro.feature();

        Stove stove = new Stove();
        stove.use();

        Stove stove1 = new StovePro();
        stove1.use();

        StovePro stove2 = (StovePro)stove1;
        stove2.feature();

        StovePro stovePro = new StovePro();
        stovePro.use();
        stovePro.feature();

        Map map = new Map();
        map.use();

        Map map1 = new MapPro();
        map1.use();

        MapPro map2 = (MapPro)map1;
        map2.feature();

        MapPro mapPro = new MapPro();
        mapPro.use();
        mapPro.feature();

        Compass compass = new Compass();
        compass.use();

        Compass compass1 = new CompassPro();
        compass1.use();

        CompassPro compass2 = (CompassPro)compass1;
        compass2.feature();

        CompassPro compassPro = new CompassPro();
        compassPro.use();
        compassPro.feature();

        Bottle bottle = new Bottle();
        bottle.use();

        Bottle bottle1 = new BottlePro();
        bottle1.use();

        BottlePro bottle2 = (BottlePro)bottle1;
        bottle2.feature();

        BottlePro bottlePro = new BottlePro();
        bottlePro.use();
        bottlePro.feature();

        Rope rope = new Rope();
        rope.use();

        Rope rope1 = new RopePro();
        rope1.use();

        RopePro rope2 = (RopePro)rope1;
        rope2.feature();

        RopePro ropePro = new RopePro();
        ropePro.use();
        ropePro.feature();

        Binoculars binoculars = new Binoculars();
        binoculars.use();

        Binoculars binoculars1 = new BinocularsPro();
        binoculars1.use();

        BinocularsPro binoculars2 = (BinocularsPro)binoculars1;
        binoculars2.feature();

        BinocularsPro binocularsPro = new BinocularsPro();
        binocularsPro.use();
        binocularsPro.feature();

        Notebook notebook = new Notebook();
        notebook.use();

        Notebook notebook1 = new NotebookPro();
        notebook1.use();

        NotebookPro notebook2 = (NotebookPro)notebook1;
        notebook2.feature();

        NotebookPro notebookPro = new NotebookPro();
        notebookPro.use();
        notebookPro.feature();

        Pen pen = new Pen();
        pen.use();

        Pen pen1 = new PenPro();
        pen1.use();

        PenPro pen2 = (PenPro)pen1;
        pen2.feature();

        PenPro penPro = new PenPro();
        penPro.use();
        penPro.feature();

        Pencil pencil = new Pencil();
        pencil.use();

        Pencil pencil1 = new PencilPro();
        pencil1.use();

        PencilPro pencil2 = (PencilPro)pencil1;
        pencil2.feature();

        PencilPro pencilPro = new PencilPro();
        pencilPro.use();
        pencilPro.feature();

        Eraser eraser = new Eraser();
        eraser.use();

        Eraser eraser1 = new EraserPro();
        eraser1.use();

        EraserPro eraser2 = (EraserPro)eraser1;
        eraser2.feature();

        EraserPro eraserPro = new EraserPro();
        eraserPro.use();
        eraserPro.feature();

        Sharpener sharpener = new Sharpener();
        sharpener.use();

        Sharpener sharpener1 = new SharpenerPro();
        sharpener1.use();

        SharpenerPro sharpener2 = (SharpenerPro)sharpener1;
        sharpener2.feature();

        SharpenerPro sharpenerPro = new SharpenerPro();
        sharpenerPro.use();
        sharpenerPro.feature();

        Ruler ruler = new Ruler();
        ruler.use();

        Ruler ruler1 = new RulerPro();
        ruler1.use();

        RulerPro ruler2 = (RulerPro)ruler1;
        ruler2.feature();

        RulerPro rulerPro = new RulerPro();
        rulerPro.use();
        rulerPro.feature();

        Marker marker = new Marker();
        marker.use();

        Marker marker1 = new MarkerPro();
        marker1.use();

        MarkerPro marker2 = (MarkerPro)marker1;
        marker2.feature();

        MarkerPro markerPro = new MarkerPro();
        markerPro.use();
        markerPro.feature();

        Board board = new Board();
        board.use();

        Board board1 = new BoardPro();
        board1.use();

        BoardPro board2 = (BoardPro)board1;
        board2.feature();

        BoardPro boardPro = new BoardPro();
        boardPro.use();
        boardPro.feature();

        Chalk chalk = new Chalk();
        chalk.use();

        Chalk chalk1 = new ChalkPro();
        chalk1.use();

        ChalkPro chalk2 = (ChalkPro)chalk1;
        chalk2.feature();

        ChalkPro chalkPro = new ChalkPro();
        chalkPro.use();
        chalkPro.feature();

        Brush brush = new Brush();
        brush.use();

        Brush brush1 = new BrushPro();
        brush1.use();

        BrushPro brush2 = (BrushPro)brush1;
        brush2.feature();

        BrushPro brushPro = new BrushPro();
        brushPro.use();
        brushPro.feature();

        Paint paint = new Paint();
        paint.use();

        Paint paint1 = new PaintPro();
        paint1.use();

        PaintPro paint2 = (PaintPro)paint1;
        paint2.feature();

        PaintPro paintPro = new PaintPro();
        paintPro.use();
        paintPro.feature();

        Drill drill = new Drill();
        drill.use();

        Drill drill1 = new DrillPro();
        drill1.use();

        DrillPro drill2 = (DrillPro)drill1;
        drill2.feature();

        DrillPro drillPro = new DrillPro();
        drillPro.use();
        drillPro.feature();

        Hammer hammer = new Hammer();
        hammer.use();

        Hammer hammer1 = new HammerPro();
        hammer1.use();

        HammerPro hammer2 = (HammerPro)hammer1;
        hammer2.feature();

        HammerPro hammerPro = new HammerPro();
        hammerPro.use();
        hammerPro.feature();

        Saw saw = new Saw();
        saw.use();

        Saw saw1 = new SawPro();
        saw1.use();

        SawPro saw2 = (SawPro)saw1;
        saw2.feature();

        SawPro sawPro = new SawPro();
        sawPro.use();
        sawPro.feature();

        Screwdriver screwdriver = new Screwdriver();
        screwdriver.use();

        Screwdriver screwdriver1 = new ScrewdriverPro();
        screwdriver1.use();

        ScrewdriverPro screwdriver2 = (ScrewdriverPro)screwdriver1;
        screwdriver2.feature();

        ScrewdriverPro screwdriverPro = new ScrewdriverPro();
        screwdriverPro.use();
        screwdriverPro.feature();

        Wrench wrench = new Wrench();
        wrench.use();

        Wrench wrench1 = new WrenchPro();
        wrench1.use();

        WrenchPro wrench2 = (WrenchPro)wrench1;
        wrench2.feature();

        WrenchPro wrenchPro = new WrenchPro();
        wrenchPro.use();
        wrenchPro.feature();

        Plier plier = new Plier();
        plier.use();

        Plier plier1 = new PlierPro();
        plier1.use();

        PlierPro plier2 = (PlierPro)plier1;
        plier2.feature();

        PlierPro plierPro = new PlierPro();
        plierPro.use();
        plierPro.feature();

        Tape tape = new Tape();
        tape.use();

        Tape tape1 = new TapePro();
        tape1.use();

        TapePro tape2 = (TapePro)tape1;
        tape2.feature();

        TapePro tapePro = new TapePro();
        tapePro.use();
        tapePro.feature();

        Ladder ladder = new Ladder();
        ladder.use();

        Ladder ladder1 = new LadderPro();
        ladder1.use();

        LadderPro ladder2 = (LadderPro)ladder1;
        ladder2.feature();

        LadderPro ladderPro = new LadderPro();
        ladderPro.use();
        ladderPro.feature();

        Toolbox toolbox = new Toolbox();
        toolbox.use();

        Toolbox toolbox1 = new ToolboxPro();
        toolbox1.use();

        ToolboxPro toolbox2 = (ToolboxPro)toolbox1;
        toolbox2.feature();

        ToolboxPro toolboxPro = new ToolboxPro();
        toolboxPro.use();
        toolboxPro.feature();

      /*  Helmet helmet = new Helmet();
        helmet.use();

        Helmet helmet1 = new HelmetPro();
        helmet1.use();

        HelmetPro helmet2 = (HelmetPro)helmet1;
        helmet2.feature();

        HelmetPro helmetPro = new HelmetPro();
        helmetPro.use();
        helmetPro.feature();*/

        Mask mask = new Mask();
        mask.use();

        Mask mask1 = new MaskPro();
        mask1.use();

        MaskPro mask2 = (MaskPro)mask1;
        mask2.feature();

        MaskPro maskPro = new MaskPro();
        maskPro.use();
        maskPro.feature();

        Goggles goggles = new Goggles();
        goggles.use();

        Goggles goggles1 = new GogglesPro();
        goggles1.use();

        GogglesPro goggles2 = (GogglesPro)goggles1;
        goggles2.feature();

        GogglesPro gogglesPro = new GogglesPro();
        gogglesPro.use();
        gogglesPro.feature();

        Apron apron = new Apron();
        apron.use();

        Apron apron1 = new ApronPro();
        apron1.use();

        ApronPro apron2 = (ApronPro)apron1;
        apron2.feature();

        ApronPro apronPro = new ApronPro();
        apronPro.use();
        apronPro.feature();

        Glasses glasses = new Glasses();
        glasses.use();

        Glasses glasses1 = new GlassesPro();
        glasses1.use();

        GlassesPro glasses2 = (GlassesPro)glasses1;
        glasses2.feature();

        GlassesPro glassesPro = new GlassesPro();
        glassesPro.use();
        glassesPro.feature();

        Cane cane = new Cane();
        cane.use();

        Cane cane1 = new CanePro();
        cane1.use();

        CanePro cane2 = (CanePro)cane1;
        cane2.feature();

        CanePro canePro = new CanePro();
        canePro.use();
        canePro.feature();

        Walker walker = new Walker();
        walker.use();

        Walker walker1 = new WalkerPro();
        walker1.use();

        WalkerPro walker2 = (WalkerPro)walker1;
        walker2.feature();

        WalkerPro walkerPro = new WalkerPro();
        walkerPro.use();
        walkerPro.feature();

        Wheelchair wheelchair = new Wheelchair();
        wheelchair.use();

        Wheelchair wheelchair1 = new WheelchairPro();
        wheelchair1.use();

        WheelchairPro wheelchair2 = (WheelchairPro)wheelchair1;
        wheelchair2.feature();

        WheelchairPro wheelchairPro = new WheelchairPro();
        wheelchairPro.use();
        wheelchairPro.feature();

        Stretcher stretcher = new Stretcher();
        stretcher.use();

        Stretcher stretcher1 = new StretcherPro();
        stretcher1.use();

        StretcherPro stretcher2 = (StretcherPro)stretcher1;
        stretcher2.feature();

        StretcherPro stretcherPro = new StretcherPro();
        stretcherPro.use();
        stretcherPro.feature();

        Syringe syringe = new Syringe();
        syringe.use();

        Syringe syringe1 = new SyringePro();
        syringe1.use();

        SyringePro syringe2 = (SyringePro)syringe1;
        syringe2.feature();

        SyringePro syringePro = new SyringePro();
        syringePro.use();
        syringePro.feature();

        Thermometer thermometer = new Thermometer();
        thermometer.use();

        Thermometer thermometer1 = new ThermometerPro();
        thermometer1.use();

        ThermometerPro thermometer2 = (ThermometerPro)thermometer1;
        thermometer2.feature();

        ThermometerPro thermometerPro = new ThermometerPro();
        thermometerPro.use();
        thermometerPro.feature();

    }
}