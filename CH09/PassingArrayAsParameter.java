import java.util.Scanner;
import java.util.Random;

public class PassingArrayAsParameter {
    
    public static void main (String[] args) {
    
        int[] tempArray = {1, 2, 3, 4, 5};
        
        displayArray(tempArray);
        
        changeArray(tempArray);
        
        displayArray(tempArray);
        
        System.out.println("\n\nGAME OVER MAN!!!");    
        
    }
    
    public static void changeArray(int[] arr) {
        
        arr[2] = 100;
        
    }
    
    public static void displayArray(int[] arr) {
        
        System.out.println();
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i] + " ");
            
        }
        
        
    }
    
}
