// PaymentMethod.java
interface PaymentMethod {
    void pay(double amount);
}

// CreditCard.java
class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

// PayPal.java
class PayPal implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Cash.java
class Cash implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in Cash.");
    }
}
