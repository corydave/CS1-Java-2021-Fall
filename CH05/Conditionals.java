import java.util.*;

public class Conditionals {
    
    public static void main (String[] args) {

        ifDemo();

    }
    
    public static void ifDemo() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Guess a number:");
        int number = scanner.nextInt();
        
        // if (number == 33); { will always run!!!!!
        // }
        
        if (number == 33) {
            System.out.println("YOU GUESSED RIGHT!");
        } else {
            System.out.println("You were wrong");    
        }
        
        
        System.out.println();
        
        if (number > 10) 
            System.out.println("YAY! Bigger than 10!");
            System.out.println("Yippie!!!!");
        
        
        // scanner.nextLine();
        
        // System.out.println("\nWhat is your name?");
        // String name = scanner.nextLine();
        
        
        
        // if (name.equals("Larry Bird")) {
        //     System.out.println("You are an MVP");
        //     System.out.println("You grew up in Indiana");
        // } else {
        //     System.out.println("You stink at 3 pointers");
        // }
        
        // if (number % 2 != 0) {
        //     System.out.println(number + " is odd");
        // }
        
        
        
        System.out.println("\n\nGAME OVER MAN!!!");
        
    }
    
}



















