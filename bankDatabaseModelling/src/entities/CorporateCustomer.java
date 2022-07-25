package entities;

public class CorporateCustomer extends Customer {
    private long corporateId;
    private String companyName;
    private String taxNo;

    public CorporateCustomer(int id, String customerNumber, Channel channel, long corporateId, String companyName, String taxNo) {
        super(id, customerNumber, channel);
        this.corporateId = corporateId;
        this.companyName = companyName;
        this.taxNo = taxNo;
    }

    public CorporateCustomer() {
    }

    public long getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(long corporateId) {
        this.corporateId = corporateId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }
}
