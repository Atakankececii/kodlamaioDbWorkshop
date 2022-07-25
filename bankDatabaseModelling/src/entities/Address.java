package entities;

public class Address {
    private long id;
    private Customer customer;
    private String detail;

    public Address(int id, Customer customer, String detail) {
        this.id = id;
        this.customer = customer;
        this.detail = detail;
    }

    public Address() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
