import java.util.*;

public class ComplexSelections {
    
    public static void main (String[] args) {
        
        // complexSelection();
        // switchExample();
        // divideZero();
        
        deMorgans();
        
        
        System.out.println("\n\nGAME OVER MAN!!!");
        
    }
    
    
    public static void deMorgans() {
        
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        
        if ((b > a)  && (d > c)) {
            System.out.println("Victory!");
        }
        
        if ((a > b) || (c > b)) {
            System.out.println("Second Victory!");
        }
        
        // These two are the same:
        if ( ! ((a > b) || (c > b)) ) {           //  !(a > b) && ! (c > b)
            System.out.println("Third Victory!");
        }
        
        if ( !(a > b) ) {
            System.out.println("Fourth MEAL!");
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
    public static void divideZero() {
        double a = 10;
        System.out.println(a/0);
    }
    
    
    public static void switchExample() {
        
        displayMenu();
        
        System.out.println("\nEnter your selection:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        // System.out.println(choice);
        
        double amt = -1;
        double balance = 1000;
        
        switch(choice) {
            
            case 1:  System.out.println("Enter amount");
                     amt = scanner.nextDouble();
                     System.out.println("You have deposited " + amt);
                     System.out.println("New balance: " + (balance + amt));
                     break;
                     
            case 2:  System.out.println("Enter amount");
                     amt = scanner.nextDouble();
                     
                     if ( (amt <= balance) && (amt > 0) ) {
                         System.out.println("You have withdrawn " + amt);
                         System.out.println("New balance: " + (balance - amt));
                     } else {
                         System.out.println("Cannot process now");
                     }
                     
                     break;
                     
            case 3:  System.out.println("Your balance is " + balance);
                     break;
                     
            case 4:  System.out.println("Call the bank at 1-800-get-help");
                     break;
                     
            case 5:  System.out.println(" 😊  Have a great day!");
                     break;
                     
            default: System.out.println("Please enter a valid choice.");
        }
        
        
        
        
        
    }
    
    
    
    public static void displayMenu() {
        
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Display balance");
        System.out.println("4. Help");
        System.out.println("5. Quit");
        
    }
    
    
    
    
    
    
    public static void complexSelection() {
        
        final boolean DEBUG = true;
        int grade;
        
        if (DEBUG) {
        
            grade = 75;
    
        } else {
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a grade:");
            grade = scanner.nextInt();
        
        }        
        
        
        // PARADIGM 1
        
        // if (grade >= 90) {
        //     System.out.println("A");
        // } else if (grade >= 80) {
        //     System.out.println("B");
        // } else if (grade >= 70) {
        //     System.out.println("C");
        // } else if (grade >= 65) {
        //     System.out.println("D");
        // } else {
        //     System.out.println("F");
        // }
        
        
        // PARADIGM 2
        
        // if (grade >= 65) {
        //     System.out.println("F");
        // } else if (grade >= 70) {
        //     System.out.println("D");
        // } else if (grade >= 80) {
        //     System.out.println("C");
        // } else if (grade >= 90) {
        //     System.out.println("B");
        // } else {
        //     System.out.println("A");
        // }   
        
        
       
        // PARADIGM 3 
        
        // if (grade >= 65) {
        //     System.out.println("D");
        // }
        
        // if (grade >= 70) {
        //     System.out.println("C");
        // }
        
        // if (grade >= 80) {
        //     System.out.println("B");
        // }
        
        // if (grade >= 90) {
        //     System.out.println("A");
        // }
        
        
        
         // PARADIGM 4 
        
        if (grade < 0) {
            System.out.println("Please enter a valid grade");
        }
        
        if ((grade < 65) && (grade >= 0)) {
            System.out.println("F");
        }
        
        if ((grade >= 65) && (grade < 70)) {
            System.out.println("D");
        }
        
        if ((grade >= 70) && (grade < 80)) {
            System.out.println("C");
        }
        
        if ((grade >= 80) && (grade < 90)) {
            System.out.println("B");
        }
        
        if (grade >= 90) {
            System.out.println("A");
        }        
        
        
        
        
        
    }
    
}

























