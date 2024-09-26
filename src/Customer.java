

public class Customer {

    private String name;
    private int contact;
    private String address;

    public Customer(String name, int contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    String getInfo() {

        return  "Customer: " + name + " " + contact + " " + address ;
    }
}
