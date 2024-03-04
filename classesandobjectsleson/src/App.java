public class App {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("black", "sleepy");

        System.out.println("The cat is " + myCat.getColor() + " and feels " + myCat.getMood());
        myCat.makeHappy();
    }
}
