import java.util.Scanner;

public class DoWhile {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);    
        // whileLoop(scanner);
        doWhileLoop(scanner);
        
    }
    
    public static void whileLoop(Scanner scanner) {
        
        int choice = 0;
        
        while (choice != 0) {
            System.out.println("Enter a number:");
            choice = scanner.nextInt();
        }
        
    }

    public static void doWhileLoop(Scanner scanner) {

        int choice;
        
        do {
            
            System.out.println("Enter a number:");
            choice = scanner.nextInt();
            
        } while (choice != 0);

        
    }
    
}
















