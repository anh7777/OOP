package oop.hus.exe2.customer4;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }


    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID(){
        return customer.getId();
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        return this.amount * (100 - customer.getDiscount()) / 100;
    }
    public String toString(){
        return String.format("Invoice[id=%d,customer=%s(%d)(%d%%), amount = %f]",
                this.id,
                customer.getName(),
                customer.getId(),
                customer.getDiscount(),
                getAmount());
    }
}
