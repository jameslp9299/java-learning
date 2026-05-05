
public class DayTwoPractice {

    public static void main(String[] args) {
        // Intro Card
        String name = "James";
        int age = 34;
        String city = "Denver";
        String funFact = "I make fire beats.";

        System.out.println("Hi, I'm " + name + ", I'm " + age + " years old, I live in " + city + ", and a fun fact about me is " + funFact);

        System.out.println();// blank line between sections

        // Tip Calculator
        double meal = 45.50;
        int tipPercentage = 20;
        double tip = meal * tipPercentage / 100.0;
        double total = meal + tip;

        System.out.println("Meal: $" + meal);
        System.out.println("Tip Percentage: " + tipPercentage + "%");
        System.out.println("Tip Amount: $" + tip);
        System.out.println("Total Bill: $" + total);

        System.out.println(); //blank lines between sections 

        // Temp Converter
        double temperatureFahrenheit = 86.5;
        double celsius = (temperatureFahrenheit - 32) * 5 / 9.0;

        System.out.println("Fahrenheit: " + temperatureFahrenheit + "°F");
        System.out.println("Celsius: " + celsius + "°C");
    }
}
