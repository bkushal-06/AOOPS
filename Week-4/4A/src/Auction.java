import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> bidders;
    private String item;

    public Auction(String item) {
        this.item = item;
        this.bidders = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        bidders.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        bidders.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer bidder : bidders) {
            bidder.update(event);
        }
    }

    public void startAuction() {
        notifyObservers("Bidding started for " + item);
    }

    public void endAuction() {
        notifyObservers("Bidding ended for " + item);
    }

    public void itemAvailable() {
        notifyObservers(item + " is now available for auction");
    }
}
