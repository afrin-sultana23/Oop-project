

public class Main {
    public static void main(String[] args) {

        PetShop petShop = new PetShop("Paw Haven", "Downtown");

        petShop.addPet(new Dog("Buddy", 1, 120.00, 2, "Labrador", PetSize.LARGE));
        petShop.addPet(new Cat("Whiskers", 2, 100.00, 1, "Persian", PetSize.MEDIUM));
        petShop.addPet(new Hamster("Nibbles", 3, 25.00, 1, "Syrian", PetSize.SMALL));
        petShop.addPet(new Parrot("Polly", 4, 200.00, 3, "Macaw", PetSize.SMALL));
        petShop.addPet(new Rabbit("Thumper", 5, 45.00, 2, "Dutch", PetSize.SMALL));
        petShop.addPet(new Fish("Goldie", 6, 10.00, 1, "Goldfish", PetSize.SMALL));

        petShop.addAccessory(new Accessory("Dog Leash", 101, 15.00));
        petShop.addAccessory(new Accessory("Cat Toy", 102,  5.00));

        petShop.displayInventory();

        Customer customer1 = new Customer("Alice Smith", 1234-567890, "bangladesh");
        petShop.sellPet(1, customer1);  // Selling the Rabbit to Alice

        petShop.displaySales();

    }
}