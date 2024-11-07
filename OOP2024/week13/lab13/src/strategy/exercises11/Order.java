package strategy.exercises11;

/**
 * Order class. Doesn’t know the concrete payment method (strategy) user has picked.
 * It uses common strategy interface to delegate collecting payment data to strategy object.
 * It can be used to save order to database.
 */
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrderUsingPaypal(PayStrategy paypal) {
        paypal.collectPaymentDetails();
    }

    public void processOrderUsingCreditCard(PayStrategy creditCard) {
        creditCard.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}