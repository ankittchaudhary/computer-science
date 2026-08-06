//READING FROM KEYBOARD

/*
- Java provides a class called Scanner which is used to read input from the keyboard.
- To use the Scanner class, we need to import it from the java.util package.
*/

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Name: " + name);

        sc.close(); // Good Practice to close the scanner after use to free up resources.
    }
}

/*
Other methods of Scanner class:
- nextInt(): Reads an integer from the keyboard.
- nextDouble(): Reads a double from the keyboard.
- next(): Reads a single word from the keyboard.

*/