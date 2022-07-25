package entities;

public class Customer {
    private long id;
    private String customerNumber;
    private Channel channel;

    public Customer(int id, String customerNumber, Channel channel) {
        this.id = id;
        this.customerNumber = customerNumber;
        this.channel = channel;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
