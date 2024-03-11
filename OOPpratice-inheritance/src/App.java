class Animal {
    String name;
    String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
}

class Dog extends Animal {
    public Dog(String name, String species) {
        super(name, species);
    }

    void bark() {
        System.out.println(name + " is barking!");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        System.out.println(myDog.name);
        System.out.println(myDog.species);

        myDog.bark();
    }
}
