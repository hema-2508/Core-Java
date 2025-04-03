public class Airline {
        String flightName;
        int flightCode;
        String arrivalCity;
        String departureTime;
        String landingTime;
        String aircraftType;
        int passengerCapacity;
        double fareAmount;
        String flightStatus;
        String luggageLimit;

    public Airline() {
        System.out.println("No parameter Constructor");
    }

    public Airline(String flightName, int flightCode) {
            this.flightName = flightName;
            this.flightCode = flightCode;
        }


    public Airline(String flightName, int flightCode, String arrivalCity, String departureTime) {
         this(flightName,flightCode);
         this.arrivalCity = arrivalCity;
         this.departureTime = departureTime;
    }
        

    public Airline(String flightName, int flightCode, String arrivalCity, String departureTime, String landingTime, String aircraftType) {
        this(flightName,flightCode,arrivalCity,departureTime);
        this.landingTime = landingTime;
        this.aircraftType = aircraftType;
    }
        
    public Airline(String flightName, int flightCode, String arrivalCity, String departureTime, String landingTime, String aircraftType, int passengerCapacity, double fareAmount) {
        this(flightName, flightCode, arrivalCity, departureTime, landingTime,  aircraftType);
        this.passengerCapacity = passengerCapacity;
        this.fareAmount = fareAmount;
    }
    void info(){
        System.out.println("Flight name  " + flightName+"\n flightCode  "+flightCode+"\n arrivalCity  "+arrivalCity+"\n departureTime  "+departureTime
                +"\nlandingTime  "+landingTime+ "\n aircraftType  "+aircraftType+"\n passengerCapacity  "+passengerCapacity+"\n fareAmount  "+fareAmount+
                "\n flightStatus  "+flightStatus+"\n luggageLimit  "+luggageLimit);
    }

}




