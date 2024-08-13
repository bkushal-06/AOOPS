public class Main{
    public static void main(String[] args) {
        Auction auction = new Auction("Antique Vase");

        Bidder bidder1 = new Bidder("Bidder1");
        Bidder bidder2 = new Bidder("Bidder2");
        Bidder bidder3 = new Bidder("Bidder3");

        auction.subscribe(bidder1);
        auction.subscribe(bidder2);
        auction.subscribe(bidder3);

        auction.itemAvailable();
        auction.startAuction();

        auction.unsubscribe(bidder2);

        auction.endAuction();
    }
}

