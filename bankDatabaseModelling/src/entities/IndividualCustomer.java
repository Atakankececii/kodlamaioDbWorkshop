package entities;

public class IndividualCustomer extends Customer {
    private long customerId;
    private String firstName;
    private String lastName;
    private String nationalIdentityNumber;


    public IndividualCustomer(int id, String customerNumber, Channel channel, long customerId, String firstName, String lastName, String nationalIdentityNumber) {
        super(id, customerNumber, channel);
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentityNumber = nationalIdentityNumber;
    }

    public IndividualCustomer() {
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentityNumber() {
        return nationalIdentityNumber;
    }

    public void setNationalIdentityNumber(String nationalIdentityNumber) {
        this.nationalIdentityNumber = nationalIdentityNumber;
    }
}
