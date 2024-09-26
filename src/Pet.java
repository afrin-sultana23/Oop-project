

public abstract class Pet extends PetItem{

        protected int age;
        protected String breed;
        protected PetSize size;


    public Pet(String name, int id, double price, int age, String breed, PetSize size) {
        super(name, id, price);
        this.age = age;
        this.breed = breed;
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public PetSize getSize() {
        return size;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Age: "+ age);
        System.out.println("Breed: "+ breed);
        System.out.println("Size: "+ size);
    }
}
