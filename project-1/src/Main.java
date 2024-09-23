public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Using Credit Card Payment Strategy
        paymentProcessor.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        System.out.println(paymentProcessor.processPayment(100));

        // Using PayPal Payment Strategy
        paymentProcessor.setPaymentStrategy(new PayPalPayment("user@example.com"));
        System.out.println(paymentProcessor.processPayment(150));

        // Using Bitcoin Payment Strategy
        paymentProcessor.setPaymentStrategy(new BitcoinPayment("bitcoin-address-xyz"));
        System.out.println(paymentProcessor.processPayment(200));

        // Trying to process payment without setting a strategy
        try {
            paymentProcessor.setPaymentStrategy(null);
            System.out.println(paymentProcessor.processPayment(50));
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
