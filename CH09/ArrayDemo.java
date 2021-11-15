import java.util.Scanner;
import java.util.Random;

public class ArrayDemo {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);            
        
        // arrayDemo();
        // arrayDemo02(scanner);
        arrayDemo03(scanner);
        
        System.out.println("\n\nGAME OVER MAN!!!!");
        
    }
    
    public static void arrayDemo03(Scanner scanner) {
        
        System.out.println("How many names?");
    
        // Get the size of the array from the user
        int size = scanner.nextInt();
        
        // Ensure that the array has a size of 1 or more
        while (size < 1) {
            System.out.println("Please enter a valid number:");
            size = scanner.nextInt();
        }

        // Create the array called 'names' with the size the user wants
        String[] names = new String[size];
        
        // Send scanner to the next line since we just
        // took in an int and will next take in some
        // Strings
        scanner.nextLine();
        
        // Walk through the array and LOAD/POPULATE it with
        // different names (Strings)
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }
        
        // Output the array of names for funsies
        System.out.println();
        outputArray(names);
        System.out.println();
        
        // Create a RNG
        Random random = new Random();
        
        // Generate a random number
        // Output that element from the array
        System.out.println(names[random.nextInt(names.length)]);
        
        /*
        int randomNumber = random.nextInt(names.length);
        System.out.println(names[randomNumber]);
        */
        
       
        
    }
    
    
    public static void arrayDemo02(Scanner scanner) {
        
        int[] grades = new int[6];
        
        // LOADING an array
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            grades[i] = scanner.nextInt();
        }
        
        outputArray(grades);
        
    }
    
    public static void outputArray(String[] arr) {
         for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
         System.out.print(arr[arr.length-1]);        
    }
    
    public static void outputArray(int[] arr) {
         for (int i = 0; i < arr.length-1; i++) {
             System.out.print(arr[i] + ", ");
         }
         System.out.print(arr[arr.length-1]);
 
 
 
 
        
        // arr[0]; // always the first element
        // arr[arr.length-1]; // always the last element;
        
        // String name = "David";
        // char first = name.charAt(0);
        // char last = name.charAt(name.length()-1);
        
        
    }
    
    public static void arrayDemo() {
        
        int[] grades = {100, 95, 79, 97, 66};
        
        System.out.println(grades[3]); // 97
    
    }
}









