public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String pay(int amount) {
        return "Paid " + amount + " using Credit Card: " + cardNumber;
    }
}
