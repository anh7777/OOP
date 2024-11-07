public class BankTransferPayment implements PaymentStrategy {
    private String accountNumber;
    private String bankName;

    public BankTransferPayment(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void pay(double amount) {
        // Implement bank transfer payment processing
        System.out.println("Paid " + amount + " using Bank Transfer.");
    }
}
