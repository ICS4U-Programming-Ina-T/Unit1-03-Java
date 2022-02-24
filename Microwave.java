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
    private static final int PIZZA_TIME = 45;
    /**
     * Declaring constant.
     */
    private static final int SOUP_TIME = 105;
    /**
     * Declaring constant.
     */
    private static final int SUB_TIME = 60;

    /**
     * Main entry point into program
     *
     * @param args nothing passed in
     */
    public static void main(String[] args) {
        // displays opening message
        System.out.println("Today you will find out the amount of time it takes to heat x amount of food.");
        // blank line
        System.out.println();
        // creates scanner
        final Scanner sc = new Scanner(System.in);
        // gets input from user
        System.out.println("Are you heating sub, pizza, or soup?: ");
        final foodLower = sc.nextLine();
        // converts string input to uppercase format
        final foodUpper = foodLower.toUpperCase();
        
        // checks which food is chosen
        if (foodUpper == "SUB" || foodUpper == "PIZZA" || foodUpper == "SOUP") {
            // gets input from user
            final amountString = sc.nextLine();
            try {
                // converts string input to an integer
                final amountInt = Integer.parseInt(amountString);
                if (amountInt > 0 && amountInt < 4) {
                    if (foodUpper == "SUB") {
                        for (int counter = 0; counter < 4; counter++) {
                                final double multiplier = 1;
                                if (counter == amountInt) {
                                    SUB_TIME = SUB_TIME * multiplier;
                                    final double seconds  
                } else {
                    // display error message
                    System.out.println("Quantity not in range.");
                }
            } catch (IllegalArgumentException exception) {
                // catches invalid strings
                System.out.println("Invalid option!");
        } else {
            // displays error message
            System.out.println("Invalid option!");
        }
        
    }
}
