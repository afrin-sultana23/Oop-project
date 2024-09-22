

public class Customer {

    private String name;
    private int contact;
    private String address;

    public Customer(String name, int contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    String getInfo() {

        return  "Customer: " + name + " " + contact + " " + address ;
    }
}
