import java.util.Scanner;

/**
 * The Microwave program implements an application that
 * asks the user which item they would like to eat and
 * tells them the amount of time it will take to heat up.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-2-23
 */

class Main {

    /**
     * Main entry point into program
     *
     * @param args nothing passed in
     */
    public static void main(String[] args) {
        // declaring variable
        double time = 0;
      
        // displays opening message
        System.out.println("Today you will find out the amount of time it takes to heat a certain amount of food(s).");
        // blank line
        System.out.println();
        // creates scanner
        final Scanner sc = new Scanner(System.in);
        // gets input from user
        System.out.println("Are you heating sub, pizza, or soup?: ");
        final String foodLower = sc.nextLine();
        // converts string input to uppercase format
        String foodUpper = foodLower.toUpperCase();

        // sets time to food
        if (foodUpper.equals("SUB")) {
            time = 60;
        } else if (foodUpper.equals("SOUP")) {
            time = 105;
        } else if (foodUpper.equals("PIZZA")) {
            time = 45;
        } else {
            System.out.println("Invalid food option!");
        }

        if (foodUpper.equals("SUB") || foodUpper.equals("PIZZA") || foodUpper.equals("SOUP")) {
            // gets input from user
            System.out.println("How many " + foodUpper +"(s) are you cooking (max 3)?: ");
            final String amountString = sc.nextLine();

            // displays a blank line
            System.out.println();
            try {
                // converts string input to an integer
                final int amountInt = Integer.parseInt(amountString);
                // calculates total time in seconds
                if (amountInt == 1) {
                    time = time;
                } else if (amountInt == 2) {
                    time = time * 1.5;
                } else if (amountInt == 3) {
                    time = time * 2;
                } else {
                    // displays error message
                    System.out.println("Quantity not in vaild range!");
                }

                // calculates minutes
                final int minutes = (int)time / 60;
                // calculates seconds
                final double seconds = (time % 60);

                // displays results to the user
                System.out.print("The total cook time is " + minutes + " minutes and " + seconds + " seconds.");
            } catch (IllegalArgumentException exception) {
                // catches invalid strings
                System.out.println("Invalid entry!");
            }
        }
    }
}
