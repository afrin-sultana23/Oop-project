

public abstract class Pet extends PetItem{

        protected int age;
        protected String breed;


    public Pet(String name, int id, double price, int age, String breed) {
        super(name, id, price);
        this.age = age;
        this.breed = breed;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Age: "+ age);
        System.out.println("Breed: "+ breed);
    }
}
