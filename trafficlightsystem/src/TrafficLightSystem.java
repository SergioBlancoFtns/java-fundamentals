import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter traffic light color(Red, Yellow, Green)");
        String color = scanner.nextLine().trim().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
        
            case "yellow":
                System.out.println("Prepare to stop");
                break;

            case "gree":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color entered");
                break;
        }

        scanner.close();
    }
}
