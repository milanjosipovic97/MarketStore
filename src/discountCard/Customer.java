package discountCard;

public class Customer {

    private long uid;

    private String fullName;

    private String address;

    private String contactNumber;

    public Customer() {
    }

    public Customer(long uid, String fullName, String address, String contactNumber) {
        setUid(uid);
        setFullName(fullName);
        setAddress(address);
        setContactNumber(contactNumber);
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
