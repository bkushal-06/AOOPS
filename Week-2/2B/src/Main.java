// Main.java
public class Main {
    public static void main(String[] args) {
        // User Authentication
        UserAuth userAuth = UserAuth.getInstance();
        userAuth.login("JohnDoe");

        if (userAuth.isLoggedIn()) {
            System.out.println("User " + userAuth.getUserName() + " is logged in.");

            // Vehicle Booking
            Vehicle vehicle = VehicleFactory.createVehicle("car");
            vehicle.book();

            // Payment Processing
            PaymentFactory paymentFactory = new CreditCardFactory();
            PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
            paymentMethod.pay(20.5);
        } else {
            System.out.println("User is not logged in.");
        }
    }
}
