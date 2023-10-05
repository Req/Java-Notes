import java.util.Random;

public class Rando {
    public static void main(String[] args) {
        Random rand = new Random(); // Random Number Generator

        int n = rand.nextInt(5);
        System.out.println(n);

        if (n == 2) { // n==2 will be true or false
            System.out.println("You got the lucky number!");
        } else {
            System.out.println("Not the lucky number, try again!");
        }
    }

}
