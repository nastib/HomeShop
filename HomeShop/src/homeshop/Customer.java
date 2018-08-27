package homeshop;

public class Customer {
    private String fullname;
    private String address;

    public Customer(){}
    public Customer(String fullname, String address){
        this.fullname = fullname;
        this.address = address;
    }
    public String getFullname() {
        return this.fullname;
    }

    public String getAddress() {
        return this.address;
    }
}