
import java.util.Scanner;  // ← tells Java to load the Scanner tool

public class UserInput {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {  // ← create the scanner

            System.out.print("Enter your name: ");     // ← prompt the user
            String name = scanner.nextLine();          // ← capture what they type

            System.out.println("Hello, " + name + "!");

           
        }
         //scanner.close();  // ← always close when done
    }
}
