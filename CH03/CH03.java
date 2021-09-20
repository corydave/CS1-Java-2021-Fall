public class CH03 {
    public static void main (String[] args) {
 
        // CONSTANTS (FINAL)
        final double SALES_TAX = .08;
        // int SALES_TAX = .08; // TypeMismatch
 
        int dozen = 12;
 
        // MOD - remainder
        int numberOfDonuts = 100;
        int dozensOfDonuts = numberOfDonuts / dozen;
        int leftOverDonuts = numberOfDonuts % dozen; // % is "mod"
 
        System.out.println("There are " + dozensOfDonuts + " dozens of donuts.");
        System.out.println("And there are " + leftOverDonuts + " donuts left.");
 
        System.out.println();
 
        // dozen = 13;
        dozen++;
 
        /*
        
        dozen = dozen + 2;
        dozen += 2;
        
        dozen = dozen * 10; 
        dozen *= 10;
 
        */
 
        dozensOfDonuts = numberOfDonuts / dozen;
        leftOverDonuts = numberOfDonuts % dozen; // % is "mod"
 
        System.out.println("There are " + dozensOfDonuts + " baker dozens of donuts.");
        System.out.println("And there are " + leftOverDonuts + " donuts left.");
 
 
        System.out.println("\n\nGAME OVER MAN!!!!");
 
 
 
    }
}

