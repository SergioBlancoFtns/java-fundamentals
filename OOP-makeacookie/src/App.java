class CookieCutter {
    String shape;

    public CookieCutter(String shape) {
        this.shape = shape;
    }

    public Cookie makeCookie(String flavor) {
        return new Cookie (this.shape, flavor);
    }
}

class Cookie {
    String shape;
    String flavor;

    public Cookie(String shape, String flavor) {
        this.shape = shape;
        this.flavor = flavor;
    }

    public void describe() {
        System.out.println("This is a " + flavor + " flavored " + shape + " cookie.");
    } 
}

public class App {
    

    public static void main(String[] args) throws Exception {
        
        CookieCutter heartShapedCutter = new CookieCutter("heart");

        Cookie chocoHeartCookie = heartShapedCutter.makeCookie("chocolate");
        Cookie vanillaHeartCookie = heartShapedCutter.makeCookie("vanilla");

        chocoHeartCookie.describe();
        vanillaHeartCookie.describe();

    }
}
