import java.util.*;
import java.util.Scanner;

public class MoreMethods {
    
    // Global variables
    // (not a super good idea)
    static Scanner scanner = new Scanner(System.in);
    static Random random;
    static String name = "Dave";
    
    
    // Global constants
    // (actually a pretty good idea)
    static final double SALES_TAX = 0.08;
    
    public static void main (String[] args) {
        
        System.out.println("Enter seed:");
        int seed = scanner.nextInt();
        random = new Random(seed);
        
        // System.out.println("MAIN: " + name);
        // System.out.print("A: ");
        // a();
        
        // primitiveDataTypesDemo();
        
        objectMethodsDemo();
        
    }
    
    public static void objectMethodsDemo() {
        
        String lastName = "Ghidiu";
        System.out.println(lastName);
        changeString(lastName);
        System.out.println(lastName);
          // should be "Whaaaaaaa...????"; but because
          // Strings are an exception to the rule, this
          // will still output "Ghidiu"
        
        
    }
    
    public static void changeString(String ln) {
        ln = "Whaaaaaaaa...????";
    }
    
    
    public static void primitiveDataTypesDemo() {

        int x = 33;
        System.out.println(x);
        change(x);
        System.out.println(x);
        x = change2(x);
        System.out.println(x);
        x += change3();
        System.out.println(x);                
        System.out.println(name);        
        
    }
    
    
    public static void change (int x) {
        x = 44;
        name = "Mike";
    }

    public static int change2 (int x) {
        
        int y = x + 2;
        return y;
        
    }    
    
    public static int change3 () {
        
        return 10;
        
    }        
    
    public static void a() {
        
        System.out.println(name);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        
    }
    
    public static void b() {
        
        name = "John";
        System.out.println("Enter middle name:");
        String middleName = scanner.nextLine();
        
    }
    
}
