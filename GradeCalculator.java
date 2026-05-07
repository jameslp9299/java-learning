
import java.util.Scanner;  // ← tells Java to load the Scanner tool

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // ← create the scanner

        System.out.print("Enter your score: ");     // ← prompt the user
        int score = scanner.nextInt();          // ← capture what they type
        if (score >= 90) {
            System.out.println("Your Grade is: A");
        } else if (score >= 80) {
            System.out.println("Your Grade is: B");
        } else if (score >= 70) {
            System.out.println("Your Grade is: C");
        } else if (score >= 60) {
            System.out.println("Your Grade is: D");
        }
        else {
            System.out.println("Your Grade is: F");
        }
        scanner.close();  // ← always close when done
    }
}
