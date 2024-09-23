public class BitcoinPayment implements PaymentStrategy {
    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public String pay(int amount) {
        return "Paid " + amount + " using Bitcoin: " + bitcoinAddress;
    }
}
