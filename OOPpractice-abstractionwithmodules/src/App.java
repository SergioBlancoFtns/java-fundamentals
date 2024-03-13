abstract class Module {
    public abstract void perfomAction();
}

class LoginModule extends Module {
    @Override
    public void perfomAction() {
        System.out.println("LoginModule: User logged in succesfully.");
    }
}

class PaymentModule extends Module {
    @Override
    public void perfomAction() {
        System.out.println("PaymentModule: Payment processed");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Module loginModule = new LoginModule();
        Module paymentModule = new PaymentModule();

        loginModule.perfomAction();
        paymentModule.perfomAction();
    }
}
