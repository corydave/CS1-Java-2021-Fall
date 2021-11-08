import java.util.Scanner;
import java.util.Random;

public class IpsumMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seed = -1;
        
        String[] userWords = new String[0];

        char activateProgram = welcomeUser(sc);



        if (activateProgram == 'y') {

            seed = chooseSeed(sc);
            Random rand = new Random(seed);
            mainMenu();
            int choice = sc.nextInt();

            while (choice != 6) {

                if (choice == 1) {
                    
                    userWords = takeWords(sc);

                } else if (choice == 2) {
                    System.out.println("--2--");
                    wordList(userWords);
                    
                } else if (choice == 3) {
                    System.out.println("--3--");
                    numberOfParagraphs();
                    
                } else if (choice == 4) {
                    System.out.println("--4--");
                    generateText();
                    
                } else {
                    System.out.println("Please enter a valid response.");
                    

                }
                System.out.println("\nDEBUG: Return to main menu\n");
                
                mainMenu();
                choice = sc.nextInt();      

            }

            System.out.println("Have a nice day!");
        } else {
            System.out.println("Have a nice day!");
        }


    }

    public static char welcomeUser(Scanner sc) {

        System.out.println("\nWelcome to Custom Ipsum!\n\nThis program will help you generate you own custom Lorem Ipsum" +
                           " text.\nIf you would like to proceed, please type yes. Otherwise, the program will termin" +
                           "ate");
        return sc.nextLine().toLowerCase().charAt(0);
    }

    public static int chooseSeed(Scanner sc) {
        Random tempRand = new Random();
        System.out.println("\nwould you like to enter a seed?\nIf no, a seed will be randomly generated for you");
            if (sc.nextLine().toLowerCase().charAt(0) == 'y') {
                System.out.println("Enter seed:");
                return sc.nextInt();
            } else {
                int seed = tempRand.nextInt();
                System.out.println("your seed is " + seed);
                System.out.println();
                return seed;
            }

    }

    public static void mainMenu() {

        System.out.println("\nDEBUG: mainMenu()\n");
        System.out.println("Please make a selection:");
        System.out.println("1.) Enter your words\n2.) See your current word list.\n3.) Generate your text" +
                           "\n4.) Exit program");
        
    }


    public static String[] takeWords(Scanner sc) {
        // System.out.println("DEBUG: takeWords()");
        System.out.println("How many custom words would you like to include?");
        int numOfWords = sc.nextInt();

        String[] uw = new String[numOfWords];

        int currentWords = 0;
        int length = uw.length;
        sc.nextLine();
        for (int i = 0; i < uw.length; i++) {
            System.out.println("\nWord(s) left: " + (uw.length - i));
            System.out.println("Enter a word:");
            uw[i] = sc.nextLine();
        }
        
        return uw;
       
    }

    public static void wordList(String[] userWords) {
        System.out.println("DEBUG: wordList()");
        System.out.println("Here is a list of your current words:");
            for (int i = 0; i < userWords.length; i++) {
                System.out.println(i + 1 + ".) " + userWords[i]);


            }

    }

    public static void numberOfParagraphs() {
    System.out.println("DEBUG: numberOfParagraphs()");
    }

    public static void generateText() {
        System.out.println("DEBUG: generateText()");

    }

}

