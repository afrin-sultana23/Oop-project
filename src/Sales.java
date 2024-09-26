


public class Sales {

    private PetItem petItem;
    private String customerName;


    public Sales(PetItem petItem, String customerName) {
        this.petItem = petItem;
        this.customerName = customerName;
    }

    String getInfo(){

        return petItem.getName() + " sold to " + customerName;
    }
}
