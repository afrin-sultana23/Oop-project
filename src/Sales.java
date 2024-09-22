


public class Sales {

    private String petItem;
    private String customerName;


    public Sales(String petItem, String customerName) {
        this.petItem = petItem;
        this.customerName = customerName;
    }

    String getInfo(){

        return petItem + " sold to " + customerName;
    }
}
