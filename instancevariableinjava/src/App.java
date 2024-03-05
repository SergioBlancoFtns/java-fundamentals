public class App {
    public static void main(String[] args) throws Exception {
        Cat mirringo = new Cat("mirringo", 4);

        mirringo.displayInfo();

        mirringo.setAge(2);

        mirringo.displayInfo();
    }
}
