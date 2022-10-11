import java.util.Scanner;

/**
 * This program receives two numbers through the standard input and prints their product
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce a number: ");
        double x = s.nextFloat();
        System.out.print("Please introduce another number: ");
        double y = s.nextFloat();
        System.out.print(x + " * " + y + " = " + x * y);
    }
}
