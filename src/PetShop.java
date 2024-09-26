import java.util.ArrayList;

public class PetShop {

    private String name;
    private String location;
    private ArrayList<Pet> pets;
    private ArrayList<Accessory> accessories;
    private ArrayList<Sales> saleRecords;

    public PetShop(String name, String location) {
        this.name = name;
        this.location = location;
        this.pets = new ArrayList<>();
        this.accessories = new ArrayList<>();
        this.saleRecords = new ArrayList<>();
    }

    public void addPet(Pet pet){
        pets.add(pet);
        System.out.println(pet.getName() + " added to the inventory.");
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
        System.out.println(accessory.getName() + " added to accessories.");
    }

    public void displayInventory() {
        System.out.println("\nPet Inventory:");
        for (Pet pet : pets) {
            System.out.println(pet.getName());
        }
        System.out.println("\nAccessory Inventory:");
        for (Accessory accessory : accessories) {
            System.out.println(accessory.getName());
        }
    }

    public void sellPet(int petId, Customer customer) {
        for (Pet pet : pets) {
            if (pet.getId() == petId && pet.getStatus().equals("available")) {
                pet.setStatus("sold");
                saleRecords.add(new Sales(pet, customer.getName()));
                System.out.println("Sold " + pet.getName() + " to " + customer.getName());
                return;
            }
        }
        System.out.println("Pet not available.");
    }

    public void displaySales() {
        System.out.println("\nSales Records:");
        for (Sales sale : saleRecords) {
            System.out.println(sale.getInfo());
        }
    }
}
