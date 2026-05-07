public class Decisions {
    public static void main(String[] args) {

        int score = 91;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Boolean check
        boolean isRaining = false;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("Enjoy the sunshine!");
        }
    }
}
