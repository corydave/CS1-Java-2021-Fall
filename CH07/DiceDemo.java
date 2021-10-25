import java.util.Random;
import java.util.Scanner;

public class DiceDemo {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice = displayMenu(scanner);

        switch (choice) {
            case 1:  System.out.println(rollDie(6));
                     break;
            case 2:  rollOneDieTwice();
                     break;
            case 3:  rollDieBasedOnUserInput(scanner);
                     break;
            case 4:  rollOneHundredSidedDie();
                     break;
            default: System.out.println("INVALID OPTION");
                     break;
        }

        // rollOneDieTwice();
        // rollTwoDiceBasedOnSides();
        // 
        // rollTwoDieOfDifferentSizes();
        // rollDieBasedOnUserInput(scanner);

        System.out.println("\n\nGAME OVER MAN!!!!!");
        
    }
    
    public static int displayMenu(Scanner scanner) {
        
        System.out.println("===============================");
        System.out.println("Hi! Welcome to Dice Roller 2000");
        System.out.println("===============================");
        System.out.println();
        System.out.println("\t1. Roll a die (1-6)");
        System.out.println("\t2. Roll two dice (1-6)");
        System.out.println("\t3. Roll a die (1-?)");
        System.out.println("\t4. Roll a die (1-100)");
        System.out.println();
        System.out.println("ENTER SELECTION:");
        
        int choice = scanner.nextInt();
        return choice;
        
    }
   
    
    public static int rollDie() {
        
        // System.out.println("STUB: rollDie()");

        Random random = new Random();
        return random.nextInt(6) + 1;
        
    }

    public static void rollOneDieTwice() {
        
        int die01 = rollDie();
        int die02 = rollDie();
        
        System.out.println("Die #1 = " + die01);
        System.out.println("Die #2 = " + die02);
        
        System.out.println("For a grand total of " + (die01 + die02));        
        
    }    
   
    public static int rollDie(int sides) {
    //                            parameter
    //                            or argument
    
        Random random = new Random();
        return random.nextInt(sides) + 1;
        
    }   

    public static void rollTwoDiceBasedOnSides() {
        
        int die01 = rollDie(10);
        int die02 = rollDie(6);
        
        System.out.println("Die #1 = " + die01);
        System.out.println("Die #2 = " + die02);
        
        System.out.println("For a grand total of " + (die01 + die02));                
        
    }
    
    public static void rollOneHundredSidedDie() {
        
        int die01 = rollDie(100);
        
        System.out.println("Die #1 = " + die01);
        
    }

    public static int rollDice(int die1, int die2) {
        
        Random random = new Random();
        int sum = 0;
        
        sum += (random.nextInt(die1) + 1) * 10;
        System.out.println("DEBUG: sum = " + sum);
        
        sum += (random.nextInt(die2) + 1);
        System.out.println("DEBUG: sum = " + sum);
        
        return sum;
        
        // Unreachable statement
        // System.out.println(":)");
        
    }
    
    public static void rollTwoDieOfDifferentSizes() {
        
        int value = rollDice(6, 10); // #warhammer(ish)
        System.out.println("VALUE = " + value);
        
    }
    
    public static void rollDieBasedOnUserInput(Scanner scanner) {
        
        System.out.println("Enter the number of sides:");
        
        int userSides = scanner.nextInt();
        
        System.out.print("Your roll is: " + rollDie(userSides));
        
        {
        
        // int result = rollDie(userSides);
        
        // System.out.println(result);
        
        }
    }
    

    

    
    
    
}


    


























