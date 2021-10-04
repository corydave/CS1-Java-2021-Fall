import java.util.Scanner;

public class StringDemo01 {
    
    public static void main (String[] args) {

        // SomeMethods();
        SubstringMethods();
        
        System.out.println("\n\nGAME OVER MAN!!!");
    
    }
    
    public static void SomeMethods() {
        int age = 43;
        String city = "Canandaigua";
        
        // Every method needs ()
        
        // charAt(int) returns the character at the int-index
        // remember that Strings are zero-indexed
        System.out.println(city.charAt(1)); // 'a'
        
        // Always get the FIRST character
        System.out.println(city.charAt(0)); // 'C'
        
        System.out.println("" + city.charAt(0) + 1); // 'c1'
        
        // length()
        System.out.println("The length of \"Canandaigua\" is " + city.length()); // 11
        System.out.println(city.length());
        System.out.println(city.trim().length());
        System.out.println(city.length());
        
        city = "   Honeoye Falls   ";
        System.out.println("The length of \"" + city + "\" is " + city.length()); //
        city = city.trim();
        System.out.println("The length of \"" + city + "\" is " + city.length()); //
        
        // Always get the LAST character
        System.out.println(city.charAt(city.length()-1));
        
        
        // equals(String)
        // Tests to see if two Strings are the same (equal)
        String name1 = "Dave";
        String name2 = "Dave";
        
        if (name1.equals(name2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
        
        // indexOf(char)
        // Returns the index of the first occurance of the character
        System.out.println("The letter 'e' appears at " + city.indexOf('e'));
        
    }
        
        
    public static void SubstringMethods() {
    
        //                01234567890123456789012
        String newCity = "Jacksadsfasdfasdfn Hole";
        System.out.println(newCity);
        System.out.println(newCity.substring(8)); // Hole
        System.out.println(newCity.substring(0, 7)); // Jackson
        
        System.out.println(newCity.substring(0, newCity.indexOf(' ')));
        System.out.println(newCity.substring(newCity.indexOf('c')));
    }
    
}


















