public class TipCalculator {
     public static void main(String[] args) {

        // Variables
        double meal = 45.50;
       int tipPercentage = 20;
       double tip = meal * tipPercentage / 100.0;
       double total = meal + tip;

        System.out.println("Meal: $" + meal);
        System.out.println("Tip Percentage: " + tipPercentage + "%");
        System.out.println("Tip Amount: $" + tip);
        System.out.println("Total Bill: $" + total);
    }
    
}
