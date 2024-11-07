package strategy.exercises11;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
