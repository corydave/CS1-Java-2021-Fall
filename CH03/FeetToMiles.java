import java.util.Scanner;
 
public class FeetToMiles {
    public static void main(String[] args) {
 
        // All the dirty work happens in the 'convert()' method; let's call it here from the main method!
        convert();      
             
    }
   
    // this method asks the user for total inches and outputs the conversion to feet and inches
    public static void convert() {
 
       // Create a new Scanner to read in input from user
       Scanner scanner = new Scanner(System.in);
      
       // Prompt the user and then store their input in 'totalInches'
       System.out.println("Enter the number of feet:");
       int totalFeet = scanner.nextInt();
 
       // Output the total miles and leftover feet
       System.out.println();
       System.out.println("There are " + (totalFeet / 5280) + " miles and " + (totalFeet % 5280) + " feet.");
 
       // Close the scanner :)
       scanner.close();   
 
   }
 
}
 

