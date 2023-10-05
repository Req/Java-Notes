public class Recap {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);

        int myNumber = 43; // Declare the variable myNumber as an integer and assign it the value 43

        myNumber = myNumber + 7; // Give myNumber a new value that is the old value + 7
        myNumber = myNumber - 2; // Give myNumber a new value that is the old value - 2

        myNumber += 7; // Increment by seven   (myNumber has 7 added to it)
        myNumber -= 2; // Decrement by 2; the same as myNumber = myNumber - 2

        myNumber++; // Increment by one, the same as myNumber = myNumber + 1
        myNumber--; // Decrement; This removes 1 from the value

        // Reassign myNumber to a specific number
        myNumber = 123456;

        System.out.println(myNumber);
    }
}