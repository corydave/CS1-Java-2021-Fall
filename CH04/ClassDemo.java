import java.util.Random;
import java.util.Scanner;

public class ClassDemo {
    public static void main (String[] args) {
        
        // MathDemo();
        // RandomDemo();
        ScannerDemo();
        // StringDemo();
        
        System.out.println("\n\nGAME OVER MAN!!!");
        
    }
    
    
    
    
    
    public static void MathDemo() {
        // "Math" is a class in Java
        // It does NOT need to be instantiated
        
        System.out.println("Pi is " + Math.PI);
        System.out.println("e is " + Math.E);
        
        System.out.println("The cube root of 27 is " + Math.cbrt(27.0));
        
        System.out.println(Math.max(42, Math.max(21, 100))); // 100
        System.out.println(Math.min(42, Math.max(21, 100))); // 42
        
        System.out.println(Math.pow(3, 4)); // 81.0
        System.out.println((int)(Math.pow(2, 5))); // 32
        
        System.out.println(Math.random()); // ?
        
        System.out.println( (int)(Math.random() * 6) + 1 ); // 1-6
        
        System.out.println(Math.round(0.4));  // 0
        System.out.println(Math.round(0.49)); // 0
        System.out.println(Math.round(0.5));  // 1
        System.out.println(Math.round(6.1));  // 6
        System.out.println(Math.round(6.6));  // 7
        
        double decimal = 6.16;
        
        System.out.println((Math.round(decimal * 10)) / 10.0); // 6.2
        
        
        
        
        
    }
    
     public static void StringDemo() {
        
    }
    
    public static void ScannerDemo() {
        
        // Instantiate this, too
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input:
        System.out.println("How old are you in years?");
        int age = sc.nextInt(); // Gets input from user and assigns it to 'age'
        
        // System.out.println("How many siblings do you have?");
        // int siblings = sc.nextInt();
        
        // Prompt user for input again:
        System.out.println("What is your GPA?");
        double gpa = sc.nextDouble();

        // IF YOU HAVE SCANNED IN AN INT OR DOUBLE
        // PRIOR TO SCANNING IN A STRING, YOU NEED TO
        // SEND THE SCANNER TO THE NEXT LINE
        sc.nextLine();

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("\n\nHi, " + name + ". Your age is " + age + " and you have a " + gpa + " gpa.");
        
    }
    
    
    
    
    
    
    
    public static void RandomDemo() {
        
        // You need to INSTANTIATE this class
        
        // Random rand = new Random(); // creating a RNG
        Random rand = new Random(33); // creating a "seeded" RNG 
        
        System.out.println(rand.nextInt()); // -2.5B - +2.5B
        System.out.println(rand.nextInt()); // -2.5B - +2.5B
        
        System.out.println(rand.nextInt(6) + 1); // 1-6
        
        
        
        
        
        
    }    
    
    
    
    
    
    
    
    
}
