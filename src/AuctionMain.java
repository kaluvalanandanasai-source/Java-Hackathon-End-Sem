class Auction {
    String productName;
    double startingPrice;
    double highestBid;
    String highestBidder;

    // Constructor
    Auction(String name,double price) {
        productName=name.toUpperCase();
        startingPrice=price;
        highestBid=price;
        highestBidder="No Bidder";
    }

    // Method overloading
    void placeBid(double amount) {
        placeBid("Anonymous", amount);
    }

    // Method overloading
    void placeBid(String bidder, double amount) {
        System.out.println("Bidder Name        : "+bidder.toUpperCase());
        System.out.printf("Bid Amount         : Rs. %.2f%n",amount);

        if (amount > highestBid) {
            highestBid=amount;
            highestBidder=bidder.toUpperCase();
            System.out.println("Bid Status         : Bid Accepted");
        } else {
            System.out.println("Bid Status         : Bid Rejected - Bid Must Be Higher");
        }

        System.out.println();
    }
    void closeAuction() {
        System.out.println("---------- AUCTION SUMMARY ----------");
        System.out.println("Product Name       : " + productName);
        System.out.println("Winning Bidder     : " + highestBidder);
        System.out.printf("Final Bid Amount   : Rs. %.2f%n", highestBid);
        System.out.println("=============================================");
    }
}

class AuctionMain {
    public static void main(String[] args) {
        Auction a = new Auction("Laptop", 50000);

        System.out.println("========== ONLINE AUCTION PLATFORM ==========");
        System.out.println("Product Name       : " + a.productName);
        System.out.printf("Starting Price     : Rs. %.2f%n%n", a.startingPrice);

        a.placeBid("Ravi", 52000);
        a.placeBid("Priya", 55000);
        a.placeBid("Ravi", 53000);

        a.closeAuction();
    }
}

