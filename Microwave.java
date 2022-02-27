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

class Microwave {

    /**
     * Declaring constant.
     */
    private static final int ONE_MIN = 60;
    /**
     * Declaring constant.
     */
    private static final int ONE_FOOD = 1;
    /**
     * Declaring constant.
     */
    private static final int TWO_FOODS = 2;
    /**
     * Declaring constant.
     */
    private static final int THREE_FOODS = 3;
    /**
     * Declaring constant.
     */
    private static final double ONE_PIZZA = 45;
    /**
     * Declaring constant.
     */
    private static final double ONE_SOUP = 105;
    /**
     * Declaring constant.
     */
    private static final double ONE_SUB = 60;
    /**
     * Declaring constant.
     */
    private static final double ONE_POINT_FIVE = 1.5;
    /**
     * Declaring constant.
     */
    private static final String SUB_STRING = "SUB";
    /**
     * Declaring constant.
     */
    private static final String SOUP_STRING = "SOUP";
    /**
     * Declaring constant.
     */
    private static final String PIZZA_STRING = "PIZZA";

    /**
     * Main entry point into program.
     *
     * @param args nothing passed in
     */
    public static void main(String[] args) {
        // declaring variable
        double time = 0;

        // displays opening message
        System.out.println("Today you will find out the amount"
                           + " of time it takes to heat a certain"
                           + " amount of food(s).");
        // blank line
        System.out.println();
        // creates scanner
        final Scanner sc = new Scanner(System.in);
        // gets input from user
        System.out.println("Are you heating sub, pizza, or soup?: ");
        final String foodLower = sc.nextLine();
        // converts string input to uppercase format
        final String foodUpper = foodLower.toUpperCase();

        // sets time to food
        if (SUB_STRING.equals(foodUpper)) {
            time = ONE_SUB;
        } else if (SOUP_STRING.equals(foodUpper)) {
            time = ONE_SOUP;
        } else if (PIZZA_STRING.equals(foodUpper)) {
            time = ONE_PIZZA;
        } else {
            // displays error message
            System.out.println("Invalid food option!");
        }

        if (SUB_STRING.equals(foodUpper) || PIZZA_STRING.equals(foodUpper)
            || SOUP_STRING.equals(foodUpper)) {
            // gets input from user
            System.out.println("How many " + foodUpper
                               + "(s) are you cooking (max 3)?: ");
            final String amountString = sc.nextLine();
            // displays a blank line
            System.out.println();

            try {
                // converts string input to an integer
                final int amountInt = Integer.parseInt(amountString);
                // calculates total time in seconds
                if (amountInt == ONE_FOOD) {
                    time = time;
                } else if (amountInt == TWO_FOODS) {
                    time = time * ONE_POINT_FIVE;
                } else if (amountInt == THREE_FOODS) {
                    time = time * 2;
                } else {
                    // displays error message
                    System.out.println("Quantity not in vaild range!");
                    // closes program
                    System.exit(0);
                }

                // calculates minutes
                final int minutes = (int) time / ONE_MIN;
                // calculates seconds
                final double seconds = time % ONE_MIN;

                // displays results to the user
                System.out.println("The total cook time is "
                                 + minutes + " minutes and "
                                 + seconds + " seconds.");
            } catch (IllegalArgumentException exception) {
                // catches invalid strings
                System.out.println("Invalid entry!");
            }
        }
    }
}
