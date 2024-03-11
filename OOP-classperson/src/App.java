class Person {
    
    String name;
    int age;

    static int personCount = 0;

    public Person() {
        personCount++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        personCount++;
    }

    public void speak() {
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }

    public static void displayCount() {
        System.out.println("Total number of persons: " + personCount);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Charlie", 25);

        person1.speak();
        person2.speak();
        person3.speak();

        Person.displayCount();
    }
}
