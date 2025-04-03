public class SolarSystemRunner {
    public static void main(String[] args) {
        SolarSystem system1 = new SolarSystem();
        system1.info();

        String sun = "Hydrogen & Helium";
        int moonCount = 200;
        SolarSystem system2 = new SolarSystem(sun, moonCount);
        system2.info();

        sun = "Hydrogen & Helium";
        moonCount = 150;
        boolean hasRings = true;
        double size = 318.0;
        SolarSystem system3 = new SolarSystem(sun, moonCount, hasRings, size);
        system3.info();

        sun = "Hydrogen & Helium";
        moonCount = 180;
        hasRings = false;
        size = 317.8;
        String closestStar = "theta eeta";
        boolean spaceRocks = true;
        SolarSystem system4 = new SolarSystem(sun, moonCount, hasRings, size, closestStar, spaceRocks);
        system4.info();

        sun = "Hydrogen & Helium";
        moonCount = 170;
        hasRings = true;
        size = 320.5;
        closestStar = "Alpha beta";
        spaceRocks = true;
        double rotatingDays = 365.25;
        int lifeZone = 93;
        String strongWinds = "High";
        boolean nearbyPlanets = true;
        SolarSystem system5 = new SolarSystem(sun, moonCount, hasRings, size, closestStar, spaceRocks, rotatingDays, lifeZone, strongWinds, nearbyPlanets);
        system5.info();
    }
}
