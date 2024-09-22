

public abstract class PetItem {

    protected String name;
    protected int id;
    protected double price;
    protected String status;

    public PetItem(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.status = "available";
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    void displayInfo(){
        System.out.println("Id: "+ this.id);
        System.out.println("Name: "+ this.name);
        System.out.println("Price: "+ this.price);
        System.out.println("Status: "+ this.status);
    }


}


