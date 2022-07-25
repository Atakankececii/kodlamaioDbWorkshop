package entities;

import java.util.Date;

public class CommercialActivity {
    private long id;
    private IndividualCustomer individualCustomer;
    private Date startDate;

    public CommercialActivity(int id, IndividualCustomer individualCustomer, Date startDate) {
        this.id = id;
        this.individualCustomer = individualCustomer;
        this.startDate = startDate;
    }

    public CommercialActivity() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IndividualCustomer getIndividualCustomer() {
        return individualCustomer;
    }

    public void setIndividualCustomer(IndividualCustomer individualCustomer) {
        this.individualCustomer = individualCustomer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
