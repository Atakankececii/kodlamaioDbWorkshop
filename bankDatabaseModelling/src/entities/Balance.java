package entities;

import java.util.Date;

public class Balance {

    private long id;
    private Customer customer;
    private String firstDate;
    private String secondDate;
    private double balance;

    public Balance(long id, Customer customer, String firstDate, String secondDate, double balance) {
        this.id = id;
        this.customer = customer;
        this.firstDate = firstDate;
        this.secondDate = secondDate;
        this.balance = balance;
    }

    public Balance() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getSecondDate() {
        return secondDate;
    }

    public void setSecondDate(String secondDate) {
        this.secondDate = secondDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
