public class PetGreeter {
    public static void main(String[] args) {
        String pet = args[0];
        System.out.println(pet);
        // The variable "pet" is coming from a String array
        // We can't compare it with ==
        // the "pet" String has .equals for comparison

        // if is a keyword, so is else
        boolean isRauli = pet.equals("Rauli"); // Expression saved as a separate variable
        if (isRauli) {
            System.out.println("Hi Rauli, you are orange");
        } else if (pet == "Veera") { // Inside the if parentheses, we have an expression that gives us a boolean
            System.out.println("Hi Veera, you are black and white");
        } else {
            System.out.println("Hello " + pet);
            System.out.println("What color are you?");
        }
    }
}
