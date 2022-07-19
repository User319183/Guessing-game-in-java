
public class guessing_game { //the class (or whatever your project is called) name (must be the same as the file name)

    public static void main(String[] args) {

        System.out.println("Hey! Welcome to the guessing game. Enter a number between 1 and 10 to guess the number I'm thinking of: ");

        int computerguess = (int)(Math.random() * 10) + 1;
        String userguess = System.console().readLine();

        if (Integer.parseInt(userguess) < 1 || Integer.parseInt(userguess) > 10) {
            System.out.println("You entered a number outside of the range you were given. Please try again by restarting the console.");
        } else if (Integer.parseInt(userguess) == computerguess) {
            System.out.println("You guessed correctly!");
            System.out.println("Would you like to play again? (y/n)");

            String playagain = System.console().readLine();

            if (playagain.equals("y")) {
                main(args);
            } else {
                System.out.println("Thanks for playing!");
            }


        } else {
            System.out.println("You guessed incorrectly! I guessed " + computerguess);
            System.out.println("Would you like to play again? (y/n)");
            
            String playagain = System.console().readLine();

            if (playagain.equals("y")) {
                main(args);
            } else {
                System.out.println("Thanks for playing!");
            }


        }
    }
}
