import java.util.Random;
import java.util.Scanner;

public class GAN03 {
    
    public static boolean DEBUG = false;
    
    public static void main (String[] args) {
        
        game();
        
        System.out.println("GAME OVER MAN!!!!!");
        
        
    }
    
    public static void game() {
        
        /* TODO
        1. Generate seeded RNG
        2. Get a random between 1-100
        3. User guesses and I give feedback (big/small)
        4. Keep track of how many guesses
        5. Ask to play again
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a seed:");
        int seed = scanner.nextInt();
        
        Random random = makeRNG(seed);

        char playAgain = 'y';
        
        while (playAgain == 'y') {
            int randomNumber = getRandomNumber(random);
            if (DEBUG == true) {
                System.out.println("DEBUG: randomNumber = " + randomNumber);
                randomNumber = getRandomNumber(random);
                System.out.println("DEBUG: randomNumber = " + randomNumber);
            }

            haveUserGuess(randomNumber, scanner);
            System.out.println("Would you like to play again (yes/no)?");
            scanner.nextLine();
            playAgain = scanner.nextLine().toLowerCase().charAt(0);
        }        
        
    }
    
    public static void haveUserGuess(int randomNumber, Scanner scanner) {
        
        System.out.println("RANDOM NUMBER = " + randomNumber);
        
        System.out.println("Guess a number:");
        int choice = scanner.nextInt();
        int counter = 1;
        
        while (choice != randomNumber) {
            
            if (choice > randomNumber) {
                System.out.println("Too high. Guess again:");
            } else if (choice < randomNumber) {
                System.out.println("Too low. Guess again:");
            }
            
            counter++;
            choice = scanner.nextInt();
            
        }
        
        System.out.println("Good job!");
        
        if (counter == 1) {
            System.out.println("This took you one guess!");
        } else {
            System.out.println("This took you " + counter + " times.");
        }
        
    }
    
    public static int getRandomNumber(Random random) {
        
        return random.nextInt(100) + 1;
        
    }
    
    public static Random makeRNG(int seed) {
        
        Random rng = new Random(seed);
        return rng;
        
    }
    
    
    
    
}


























