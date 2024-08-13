// PaymentFactory.java
interface PaymentFactory {
    PaymentMethod createPaymentMethod();
}

// CreditCardFactory.java
class CreditCardFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}

// PayPalFactory.java
class PayPalFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}

// CashFactory.java
class CashFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new Cash();
    }
}
