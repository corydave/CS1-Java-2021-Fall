import java.util.Scanner;

public class Latin {
    
    public static void main (String[] args) throws Exception {
        
        java.io.File file = new java.io.File("latin.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        String[] latinWords = new String[3];

        // Read data from a file
        int i = 0;
        while (input.hasNext()) {
          
          latinWords[i] = input.next();
          i++;

        }
    
        // Close the file
        input.close();
        
        for (i = 0; i < latinWords.length; i++) {
            System.out.println(latinWords[i]);
        }

        
    }
}
