import java.util.Random;

public class NumberChecker {
    public static void main(String[] args) {
        Random rng = new Random();
        int n = rng.nextInt(100);

        System.out.println("N is " + n);

        // If you only have one statement inside the if, you can "omit" (leave out) the curly braces
        // You can even put the statement in the same line as the "if"
        if (n == 25) System.out.println("N is the lucky number 25");
        if (n != 25) System.out.println("N is NOT the lucky number 25"); // the ! is a "negation"
        if (n > 25) System.out.println("N is bigger than 25");
        if (n < 25) System.out.println("N is smaller than 25");
        if (n >= 25) System.out.println("N is bigger than or equal to 25");
        if (n <= 25) System.out.println("N is smaller than or equal to 25");

        System.out.println("******************************************");
        System.out.println();

        // Does anyone know what I might mean when I say "if statements can be nested"
        // Inside an if statement, you can write another if statement

        // Nested if statements, the inner "if" is checked only if the outer is true
        if (n > 10) {
            System.out.println("N is not small");
            if (n > 33) {
                System.out.println("N is fairly big");
                if (n > 50) {
                    System.out.println("N is above average");
                    if (n > 75) {
                        System.out.println("N is big!");
                        if (n > 90) {
                            System.out.println("N is HUEG");
                        }
                    }
                }
            }
        }
    }
}
