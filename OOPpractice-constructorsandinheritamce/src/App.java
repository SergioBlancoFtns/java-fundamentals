//no se pueden sobreescribir constructores, solo se pueden sobrecargar

class Grandparent {
    Grandparent() {
        System.out.println("Grandparent's constructor called.");
    }
}

class Parent extends Grandparent {

    Parent() {
        System.out.println("Parent's constructor called.");
    }
}

class Child extends Parent {
    

    Child() {
        System.out.println("Child's constructor called.");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        new Child();
    }
}
