class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Dog alfred = new Dog();
        Cat alfredo = new Cat();
        
        alfred.sound();
        alfredo.sound();
    }
}
