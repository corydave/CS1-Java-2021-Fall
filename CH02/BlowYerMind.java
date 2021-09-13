public class BlowYerMind {
    public static void main(String[] args) {

        System.out.print("My name is Dave.-----");
        System.out.println("My name is Dave.");

        System.out.println("2"); // 2
        System.out.println(2); // 2
        System.out.println(2.0); // 2.0
        System.out.println('2'); // 2
        //     System.out.println('2.0');   // ERROR
        //     System.out.println(a);       // ERROR 
        System.out.println(2 + 3); // 5 or 23 or 2+3
        System.out.println("2 + 3"); // String literal

        System.out.println(2 - 3); // -1
        System.out.println(2 * 3); // 6

        System.out.println();

        System.out.println(3 / 2); // 1.5 :) But really it is 1
        System.out.println(3.0 / 2);
        System.out.println(3.0 / 2.0);
        System.out.println(3 / 2.0);
        System.out.println(1.0 * 3 / 2); // implicit cast
        System.out.println((double) 3 / 2); // "Casting" 1.5
        System.out.println((double)(3 / 2)); // 1.0

        System.out.println();


        System.out.println();

        System.out.println('A'); // A
        System.out.println(1.0 * 'A'); // 65, 1.0 * A, ERROR, 65.0
        System.out.println(650 / 'A');

        System.out.println(2 + 3 + " = 5");
        // 5 = 5

        System.out.println(2 + 3 + " = " + 2 + 3);
        System.out.println(2 + 3 + " = " + "2" + "3");
        // 5 = 23

        System.out.println(2 + 3 + " = " + (2 + 3));
        // 5 = 5

        System.out.println(2 + 3 + '=' + 2 + 3);
        // 5=5, 71, 5=23    

        System.out.println("Dave " + "Ghidiu"); // Concatenation

        System.out.println(2 + 3 + " = " + 2 * 3);
        // 5 = 6


        System.out.println(2 + 3 + " = " + 2 * 3 + 5);
        // 5 = 65, 5 = 11

        System.out.println(2 + 3 + " = " + (2 * 3 + 5));
        // 5 = 11

        //     System.out.print(2 - 3 + " = " + 2 - 3);  // ERROR
        System.out.println(2 - 3 + " = " + 2 / 3); // -1 = 0

        int numerator = 9;
        int denominator = 10;

        System.out.println(numerator / denominator); // 0
        System.out.println(1.0 * numerator / denominator); // 1.0
        System.out.println((double) numerator / denominator); // 1.0

        System.out.println();

        System.out.println(0.6 + 0.3); // 0.9, 0, 1, ERROR, 
        // 0.899999999

        System.out.println(0.6 F + 0.3 F);
        // 0.90000004

        double a = 0.6;
        double b = 0.3;
        System.out.println(a + b);
        // 0.899999999

        System.out.println(0.6 F + 0.3);
        // 0.900000023841858

        System.out.println((6 + 3) / 10.0);
        // 0.9

        System.out.println();
        System.out.println();
        System.out.println();

        /*
         "Escape Character"
           \
           \n = new line
           \t = tab
           \" = "
           \\ = \
           
        */

        System.out.println("Da\tve\nGhi\ndi\nu");
        System.out.println("Sharks with \"laser beams\"");
        System.out.println("Dave is 'awesome'.");
        System.out.println("This is an escape character \\n");
        System.out.println("\\\\\\\\\\\\");

        System.out.println();

        System.out.println("======================");
        System.out.println("\n\nGAME OVER MAN!!!!");


    }
}
