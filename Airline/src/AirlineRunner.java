public class AirlineRunner {
    public static void main(String[] args) {
        Airline airline1 = new Airline();

        String flightName = "Kingfisher";
        int flightCode = 112233;
        Airline airline2 = new Airline(flightName, flightCode);
        airline2.info();

        flightName = "Mumbai Airways";
        flightCode = 445566;
        String arrivalCity = "Begur";
        String departureTime = "08:30";
        Airline airline3 = new Airline(flightName, flightCode, arrivalCity, departureTime);
        airline3.info();

        flightName = "Chennai Airlines";
        flightCode = 778899;
        arrivalCity = "T nagar";
        departureTime = "20:45";
        String landingTime = "04:15";
        String aircraftType = "Boeing 747";
        Airline airline4 = new Airline(flightName, flightCode, arrivalCity, departureTime, landingTime, aircraftType);
        airline4.info();

        flightName = "Japan Airlines";
        flightCode = 990011;
        arrivalCity = "Tokyo";
        departureTime = "13:20";
        landingTime = "22:55";
        aircraftType = "Airbus A350";
        int passengerCapacity = 280;
        double fareAmount = 9200.50;
        Airline airline5 = new Airline(flightName, flightCode, arrivalCity, departureTime, landingTime, aircraftType, passengerCapacity, fareAmount);
        airline5.info();
    }
}