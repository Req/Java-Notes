public class MonthChecker {
    public static void main(String[] args) {
        String month = args[0];

        // Sometimes you have to change the type of a variable
        // This is sometimes called "type casting"
        //int month = Integer.parseInt(firstArg);

        // Not fun!
        // if (month == 1) {
        //     System.out.println("31 days");
        // }
        // if (month == 2) {
        //     System.out.println("28/29 days");
        // }
        // if (month == 3) {
        //     System.out.println("31 days");
        // }

        // the switch parentheses contain the thing we are checking
        switch (month) {
            // The conditions go inside, here!
            // All matching cases can go in one line
            case "1": case "3": case "5": case "8": case "12": case "7": case "10": case "January":
                System.out.println("31 days");
                break;
            case "2": case "February":
                System.out.println("28/29 days");
                break;
            case "4":
            case "6":
            case "9":
            case "11":
                System.out.println("30 days");
                break;
            default:
                System.out.println("ERROR: unknown month " + month);
        }
    }
}

















