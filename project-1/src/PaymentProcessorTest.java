import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PaymentProcessorTest {

    private PaymentProcessor paymentProcessor;

    @BeforeEach
    public void setUp() {
        paymentProcessor = new PaymentProcessor();
    }

    @Test
    public void testCreditCardPayment() {
        paymentProcessor.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        String result = paymentProcessor.processPayment(100);
        assertEquals("Paid 100 using Credit Card: 1234-5678-9012-3456", result);
    }

    @Test
    public void testPayPalPayment() {
        paymentProcessor.setPaymentStrategy(new PayPalPayment("user@example.com"));
        String result = paymentProcessor.processPayment(150);
        assertEquals("Paid 150 using PayPal: user@example.com", result);
    }

    @Test
    public void testBitcoinPayment() {
        paymentProcessor.setPaymentStrategy(new BitcoinPayment("bitcoin-address-xyz"));
        String result = paymentProcessor.processPayment(200);
        assertEquals("Paid 200 using Bitcoin: bitcoin-address-xyz", result);
    }

    @Test
    public void testNoPaymentStrategySet() {
        assertThrows(IllegalStateException.class, () -> paymentProcessor.processPayment(100));
    }
}
