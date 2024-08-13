// VehicleFactory.java
public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "scooter":
                return new Scooter();
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}