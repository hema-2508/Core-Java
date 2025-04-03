public class SolarSystem {
    String sun;
    int moonCount;
    boolean hasRings;
    double size;
    String closestStar;
    boolean spaceRocks;
    double rotatingDays;
    int lifeZone;
    String strongWinds;
    boolean nearbyPlanets;

    public SolarSystem() {
        System.out.println("No Constructor");
    }

    public SolarSystem(String sun, int moonCount) {
        this.sun = sun;
        this.moonCount = moonCount;
    }

    public SolarSystem(String sun, int moonCount, boolean hasRings, double size) {
        this(sun, moonCount);
        this.hasRings = hasRings;
        this.size = size;
    }

    public SolarSystem(String sun, int moonCount, boolean hasRings, double size, String closestStar, boolean spaceRocks) {
        this(sun, moonCount, hasRings, size);
        this.closestStar = closestStar;
        this.spaceRocks = spaceRocks;
    }

    public SolarSystem(String sun, int moonCount, boolean hasRings, double size, String closestStar, boolean spaceRocks, double rotatingDays, int lifeZone, String strongWinds, boolean nearbyPlanets) {
        this(sun, moonCount, hasRings, size, closestStar, spaceRocks);
        this.rotatingDays = rotatingDays;
        this.lifeZone = lifeZone;
        this.strongWinds = strongWinds;
        this.nearbyPlanets = nearbyPlanets;
    }

    public void info() {
        System.out.println("Solar System Details:");
        System.out.println("Sun Element: " + sun);
        System.out.println("Number of Moons: " + moonCount);
        System.out.println("Has Rings: " + hasRings);
        System.out.println("Biggest Planet Mass: " + size);
        System.out.println("Closest Star: " + closestStar);
        System.out.println("Has Space Rocks: " + spaceRocks);
        System.out.println("Orbit Time (days): " + rotatingDays);
        System.out.println("Habitable Zone Distance: " + lifeZone);
        System.out.println("Strong Magnetic Winds: " + strongWinds);
        System.out.println("Nearby Planetary Systems: " + nearbyPlanets);
    }



}
