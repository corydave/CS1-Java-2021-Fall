import java.util.*;

public class WhileLoopDemo {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // whileLoopWithNoInteraction();
        // whileTimerDemo();
        // whileLoopWithInput(scanner);
        // whilePlayAgain(scanner);
        whileLoopPassword(scanner);
        
        
        System.out.println("\n\nGAME OVER MAN!!!");
        
    }
    
    public static void whileLoopPassword(Scanner scanner) {
        
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        int attempts = 1;

        while ((!password.equals("horseBatteryStaple")) && (attempts <= 3)) {
            
            System.out.println("\nWRONG. Try again.");
            System.out.println("Enter password:");
            password = scanner.nextLine();
            attempts++;
            
        }
        
        if (attempts > 3) {
            System.out.println("\nACCESS DENIED!");
            return;
        } else {
            System.out.println("\nACCESS GRANTED!");
        }
        
    }
    
    public static void whilePlayAgain(Scanner scanner) {
        
        System.out.println("COMPLIMENT MACHINE!\n");
        System.out.println("You are sooooooo good looking.");
        System.out.println("\nPlay again (y/n)?");
        
        char choice = scanner.nextLine().toLowerCase().charAt(0);
        // System.out.println("DEBUG: " + choice);
        
        while (choice == 'y') {
            
            System.out.println("Seriously, you are SOOOOOO good looking 😉.");
            System.out.println("\nPlay again (y/n?");
            choice = scanner.nextLine().toLowerCase().charAt(0);
        }
        
        System.out.println("Thank you for playing.");
        
        
    }
    
    public static void whileLoopWithInput(Scanner scanner) {
        
        System.out.println("Enter a number:");
        int guess = scanner.nextInt();
        
        while (guess != 33) {
            
            System.out.println("\nYou did not guess right.");
            System.out.println("Enter a number:");
            guess = scanner.nextInt();
            
        }
        
        System.out.println("YOU GUESSED RIGHT!");
        
    }
    
    public static void whileTimerDemo() {
        
        System.out.println("START");
        long begin = java.lang.System.currentTimeMillis();
        
        while (true) {
            // System.out.println("HI!");
            long now = java.lang.System.currentTimeMillis();
            
            if (now - begin > 1000) {
                break;
            }
            
            
        }
        
        
        System.out.println("STOP");
        
    }
    
    public static void whileLoopWithNoInteraction() {
        
        int counter = 0;
        
        while (counter < 10) {
            System.out.println(counter);
            // break;
            // A break will kick out of the loop
            counter++;
        }
        
        System.out.println(counter);

        
    }
    
    
    
}











