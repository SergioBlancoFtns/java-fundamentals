abstract class PaymentMethod {
    abstract void pay(double amount);
}

class CreditCard extends PaymentMethod {

    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

class PayPal extends PaymentMethod {

    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        CreditCard p1 = new CreditCard();
        p1.pay(23.5);

        PayPal p2 = new PayPal();
        p2.pay(14.99);

        //parecido al downcasting
        PaymentMethod p3;

        p3 = new CreditCard();
        p3.pay(11.2);

        p3 = new PayPal();
        p3.pay(9.99);
    }
}
