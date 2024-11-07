package task4;

class Account {
    private float saldo;
    public Account(int saldo) {
        this.saldo = saldo;
    }
    synchronized void transfer(float amount) {
        saldo += amount;
        notify();
        System.out.println(String.format("Transfer %f, saldo: %f",
                amount, saldo));
    }
    synchronized void pay(float amount) throws
            InterruptedException {
        while (amount > saldo) {
            System.out.println("Not enough money! Waiting ... ");
            wait();
        }
        saldo -= amount;
        System.out.println(String.format("Pay %f, saldo: %f",
                amount, saldo));
    }
}
