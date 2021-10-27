import java.util.Scanner;

public class Circle03 {
    
    
    
    public static void main (String[] args) {
        
        circle();
        
        System.out.println("\n\nGAME OVER MAN!!!");    
        
    }
    
    
    
    
    
    public static void circle() {
        
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Radius:");
        
        // double radius = scanner.nextDouble();
        
        // System.out.println("CIRCUMFERENCE = " + circumference(radius));
        // System.out.println("AREA = " + area(radius));
        
        //////////////////////////////////
        
        String name = getName(scanner);
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
    
    public static String getName(Scanner scanner) {
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        return name;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static double circumference(double r) {
    
        return Math.PI * 2 * r;

    }
    
    public static double area(double r) {
    
        return Math.PI * Math.pow(r, 2);

    }    
    
    
    
    
    
    
    
    
    
}
