import java.util.*;

public class ForLoopDemo {
    
    public static void main (String[] args) {
        
        // forLoop01();
        spongeBobMeme();
        
        System.out.println("\n\nGAME OVER MAN!!!");
        
    }
    
    public static void spongeBobMeme() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();
        
        System.out.println("ECHO: " + sentence);
        
        for (int i = 0; i < sentence.length(); i++) {
            
            char temp = sentence.charAt(i);
            
            if (i % 2 == 1) {
                
                if (temp >= 97 && temp <= 122) {
                
                    System.out.print((char)(temp - 32));
                
                } else {
                
                    System.out.print(temp);
                    
                }
            
            } else {
                
                System.out.print(temp);
                
            }
            
        }
        
        
        scanner.close();
        
    }
    
    public static void forLoop01() {
        
        int counter = 0;

        // BEGINNER ; TERMINATOR ; UPDATER
        for (int i = 0; i < 10; i++) {
            
            System.out.println(i);
            
        }
        
        // System.out.println(i);
        
    }
    
    
    
}





















