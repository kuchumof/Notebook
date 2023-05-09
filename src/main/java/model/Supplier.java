package model;

public class Supplier {
    private Long inn;
    private String companyName;
    private String eMail;
    private String contactName;
    private String phoneNumber;
    private String mobilePhoneNumber;
    private String address;
    private String city;
    private String type;
    private Boolean isOvp;
    private String nomenclature;
    private String url;
    private String workingHours;
    private String comments;

    public Supplier() {
    }

    public Supplier(Long inn, String companyName, String eMail, String contactName, String phoneNumber, String mobilePhoneNumber, String address, String city, String type, Boolean isOvp, String nomenclature, String url, String workingHours, String comments) {
        this.inn = inn;
        this.companyName = companyName;
        this.eMail = eMail;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.address = address;
        this.city = city;
        this.type = type;
        this.isOvp = isOvp;
        this.nomenclature = nomenclature;
        this.url = url;
        this.workingHours = workingHours;
        this.comments = comments;
    }

    public Long getInn() {
        return inn;
    }

    public void setInn(Long inn) {
        this.inn = inn;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getOvp() {
        return isOvp;
    }

    public void setOvp(Boolean ovp) {
        isOvp = ovp;
    }

    public String getNomenclature() {
        return nomenclature;
    }

    public void setNomenclature(String nomenclature) {
        this.nomenclature = nomenclature;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "inn=" + inn +
                ", companyName='" + companyName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", contactName='" + contactName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                ", isOvp=" + isOvp +
                ", nomenclature='" + nomenclature + '\'' +
                ", url='" + url + '\'' +
                ", workingHours='" + workingHours + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
