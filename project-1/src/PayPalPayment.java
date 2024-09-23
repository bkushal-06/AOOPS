public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public String pay(int amount) {
        return "Paid " + amount + " using PayPal: " + email;
    }
}
