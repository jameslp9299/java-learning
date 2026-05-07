public class Loops {
    public static void main(String[] args) {

        // For loop — when you know how many times
        System.out.println("--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Rep " + i);
        }

        // While loop — when you loop until a condition is met
        System.out.println("--- While Loop ---");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
        System.out.println("Blast off!");

        // Loop with if inside — combining what you've learned
        System.out.println("--- Even or Odd ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
