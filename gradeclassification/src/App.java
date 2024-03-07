import java.util.Scanner;

public class App {

    class car {
        String color;

        void drive(){
            System.out.println("Car is driving");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student score (0-100)");
        int score = scanner.nextInt();

        if(score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } else if (score >=80 && score < 90) {
            System.out.println("Grade B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade D");
        } else if (score >= 0 && score < 60) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid score entered.");
        }

        scanner.close();
    }
}
