interface Vehicle {
    void book();
}

// Car.java
class Car implements Vehicle {
    @Override
    public void book() {
        System.out.println("Car booked!");
    }
}

// Bike.java
class Bike implements Vehicle {
    @Override
    public void book() {
        System.out.println("Bike booked!");
    }
}

// Scooter.java
class Scooter implements Vehicle {
    @Override
    public void book() {
        System.out.println("Scooter booked!");
    }
}
